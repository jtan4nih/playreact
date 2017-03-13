package models

import play.api.db._
import play.api.Play.current

import anorm._
import anorm.SqlParser._

case class User(email: String, name: String, password: String)

object User {

  
   // Parse a User from a ResultSet
  val parser= {
    get[String]("user.email") ~
    get[String]("user.name") ~
    get[String]("user.password") map {
      case email ~ name ~ password => User(email, name, password)
    }
  }

   //Authenticate a User.
   def authenticate(email: String, password: String) = {
    DB.withConnection { implicit connection =>
      SQL(
        """
         select * from user where 
         email = {email} and password = {password}
        """).on(
          'email -> email,
          'password -> password).as(User.parser.singleOpt)
    }
  }

  //Create a User.
   def save(user: User): User = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          insert into user values (
            {email}, {name}, {password}
          )
        """).on(
          'email -> user.email,
          'name -> user.name,
          'password -> user.password).executeUpdate()

     user

    }
    
  }
}
