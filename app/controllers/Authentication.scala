package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import views._
import models.User

class Authentication extends Controller {

  val loginForm = Form(
    tuple(
      "email" -> text,
      "password" -> text
    ) verifying  (result => result match {
        case (email, password) => User.authenticate(email, password).isDefined
    })
  )

  //Login page.
  def login = Action { implicit request =>
    Ok(html.login(loginForm))
  }

  //Logout and clean the session.
  def logout = Action {
    Redirect(routes.Application.index) //.withNewSession.flashing(
      //"success" -> "You've been logged out"
   // )
  }

  //Handle login form submission.
  def authenticate = Action { implicit request =>
    loginForm.bindFromRequest.fold(
      formWithErrors => BadRequest(html.login(formWithErrors)),
      user => Redirect(routes.Application.logged)   
    )
  }

}
