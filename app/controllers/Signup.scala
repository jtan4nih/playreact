package controllers

import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.data.validation._
import anorm._
import models.User
import scala.collection.mutable.HashMap
import play.api.mvc._

class Signup extends Controller {
  val signupForm = Form(
      mapping(
          "email" -> email,
          "name" ->text,
          "password" -> text)
          (User.apply)(User.unapply))
          
   def signup=Action{
	  Ok(views.html.signup(signupForm))
  }   
  
  def save = Action{ implicit request =>
	signupForm.bindFromRequest.fold(formWithErrors => BadRequest(views.html.signup(formWithErrors)),
		user => {
		     User.save(user)
		     Redirect(routes.Authentication.login)
		    })
  }
}
