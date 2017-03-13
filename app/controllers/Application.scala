package controllers

import play.api._
import play.api.mvc._
import play.api.libs.json.JsArray
import java.util.UUID
import play.api.libs.json.Json

import scala.concurrent.Future
import scala.concurrent.duration._

import anorm._
import models._
import play.api.data._
import play.api.data.Forms._
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import views._
import java.util.concurrent.TimeoutException
import play.api.libs.concurrent.Promise

class Application extends Controller {

  implicit val timeout = 10.seconds
  implicit val msgJsonFormat = Json.format[BloggerMessage]

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def dashboard = Action {
    Ok(views.html.dashboard("Your new application is ready."))
  }

//  def index = Action {
//    Ok(views.html.index("Login page"))
//  }

  def logged = Action{
    Ok(views.html.logout("You have logged in"))
  }

  def home=Action{
    Ok(views.html.home("This is home"))
  }


  /**
   * Describe the bloggermessage form (used in both edit and create screens).
   */
  val BloggermessageForm = Form(
    mapping(
      "id" -> ignored(0: Long),
      "title" -> nonEmptyText,
      "text" -> nonEmptyText,
      "datetime" -> nonEmptyText)(BloggerMessage.apply)(BloggerMessage.unapply))

//  def apply (id: BloggerMessage = new BloggerMessage (id, title, text, datetime)
  /**
   * This result directly redirect to the application home.
   */
  val Home = Redirect(routes.Application.list())

  /**
   * Display the list of BloggerMessages.
   *
   */
  def list = Action.async { implicit request =>
    val futurePage: Future[List[BloggerMessage]] = TimeoutFuture(BloggerMessage.findAll)
    futurePage.map(bloggermessages => Ok(Json.toJson(bloggermessages))).recover {
      case t: TimeoutException =>
        Logger.error("Problem found in bloggermessage list process")
        InternalServerError(t.getMessage)
    }
  }

  /**
   * Display the 'edit form' of a existing BloggerMessage.
   *
   * @param id Id of the BloggerMessage to edit
   */
  def edit(id: Long) = Action.async {
    val futureMsg: Future[Option[models.BloggerMessage]] = TimeoutFuture(BloggerMessage.findById(id))
    futureMsg.map {
      case Some(bloggermessage) => Ok("")
      case None           => NotFound
    }.recover {
      case t: TimeoutException =>
        Logger.error("Problem found in bloggermessage edit process")
        InternalServerError(t.getMessage)
    }
  }

  /**
   * Handle the 'edit form' submission
   *
   * @param id Id of the bloggermessage to edit
   */
  def update(id: Long) = Action.async { implicit request =>
    BloggermessageForm.bindFromRequest.fold(
      formWithErrors => Future.successful(BadRequest("")),
      bloggermessage => {
        val futureUpdateMsg: Future[Int] = TimeoutFuture(BloggerMessage.update(id, bloggermessage))
        futureUpdateMsg.map { empId =>
          Home.flashing("success" -> s"BloggerMessage ${bloggermessage.title} has been updated")
        }.recover {
          case t: TimeoutException =>
            Logger.error("Problem found in bloggermessage update process")
            InternalServerError(t.getMessage)
        }
      })
  }

  /**
   * Handle the 'new bloggermessage form' submission.
   */
  def save = Action.async { implicit request =>
    BloggermessageForm.bindFromRequest.fold(
      formWithErrors => Future.successful(BadRequest("")),
      bloggermessage => {
        val futureUpdateMsg: Future[Option[Long]] = TimeoutFuture(BloggerMessage.insert(bloggermessage))
        futureUpdateMsg.map {
          case Some(empId) =>
            val msg = s"BloggerMessage ${bloggermessage.title} has been created"
            Logger.info(msg)
            Home.flashing("success" -> msg)
          case None =>
            val msg = s"BloggerMessage ${bloggermessage.title} has not created"
            Logger.info(msg)
            Home.flashing("error" -> msg)
        }.recover {
          case t: TimeoutException =>
            Logger.error("Problem found in bloggermessage update process")
            InternalServerError(t.getMessage)
        }
      })
  }

  /**
   * Handle bloggermessage deletion.
   */
  def delete(id: Long) = Action.async {
    val futureInt = TimeoutFuture(BloggerMessage.delete(id))
    futureInt.map(i => Home.flashing("success" -> "BloggerMessage has been deleted")).recover {
      case t: TimeoutException =>
        Logger.error("Problem deleting bloggermessage")
        InternalServerError(t.getMessage)
    }
  }

  object TimeoutFuture {

    def apply[A](block: => A)(implicit timeout: FiniteDuration): Future[A] = {

      val promise = scala.concurrent.Promise[A]()

      // if the promise doesn't have a value yet then this completes the future with a failure
      Promise.timeout(Nil, timeout).map(_ => promise.tryFailure(new TimeoutException("This operation timed out")))

      // this tries to complete the future with the value from block
      Future(promise.success(block))

      promise.future
    }

  }

}
