package models

import java.util.{ Date }
import play.api.db._
import play.api.Play.current
import anorm._
import anorm.SqlParser._
import scala.language.postfixOps
import play.api.Logger

case class BloggerMessage(id: Long, title: String, text: String, datetime: String)

/**
 * Helper for pagination.
 */
case class Page[A](items: Seq[A], page: Int, offset: Long, total: Long) {
  lazy val prev = Option(page - 1).filter(_ >= 0)
  lazy val next = Option(page + 1).filter(_ => (offset + items.size) < total)
}

object BloggerMessage {

  // -- Parsers
  //BloggerMessage---bloggermessage

  /**
   * Parse a BloggerMessage from a ResultSet
    *
   */
  val bloggermessage = {
    get[Long]("bloggermessage.id") ~
      get[String]("bloggermessage.title") ~
      get[String]("bloggermessage.text") ~
      get[String]("bloggermessage.datetime") map {
        case id ~ title ~ text ~ datetime => BloggerMessage(id, title, text, datetime)
      }
  }

  // -- Queries
  BloggerMessage
  /**
   * Retrieve a bloggermessage from the id.
   */
  def findById(id: Long): Option[BloggerMessage] = {
    DB.withConnection { implicit connection =>
      SQL("select * from bloggermessage where id = {id}").on('id -> id).as(bloggermessage.singleOpt)
    }
  }

  /**
   * Return a page of (BloggerMessage).
   *
   * @param page Page to display
   * @param pageSize Number of bloggermessages per page
   * @param orderBy BloggerMessage property used for sorting
   * @param filter Filter applied on the title column
   */
  def list(page: Int = 0, pageSize: Int = 10, orderBy: Int = 1, filter: String = "%"): Page[BloggerMessage] = {

    val offest = pageSize * page

    DB.withConnection { implicit connection =>

      val bloggermessages = SQL(
        """
          select * from bloggermessage
          where bloggermessage.title like {filter}
          order by {orderBy} nulls last
          limit {pageSize} offset {offset}
        """).on(
          'pageSize -> pageSize,
          'offset -> offest,
          'filter -> filter,
          'orderBy -> orderBy).as(bloggermessage *)

      val totalRows = SQL(
        """
          select count(*) from bloggermessage
          where bloggermessage.title like {filter}
        """).on(
          'filter -> filter).as(scalar[Long].single)

      Page(bloggermessages, page, offest, totalRows)

    }

  }

  /**
   * Retrieve all bloggermessage.
   *
   * @return
   */
  def findAll(): List[BloggerMessage] = {
    DB.withConnection { implicit connection =>
      try {
        SQL("select * from bloggermessage order by title").as(bloggermessage *)
      } catch {
        case ex: Exception => Logger.info("ERROR", ex); Nil
      }
    }
  }

  /**
   * Update a bloggermessage.
   *
   * @param id The bloggermessage id
   * @param bloggermessage The bloggermessage values.
   */
  def update(id: Long, bloggermessage: BloggerMessage): Int = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          update bloggermessage
          set title = {title}, text = {text}, datetime = {datetime}
          where id = {id}
        """).on(
          'id -> id,
          'title -> bloggermessage.title,
          'text -> bloggermessage.text,
          'datetime -> bloggermessage.datetime).executeUpdate()
    }
  }

  /**
   * Insert a new bloggermessage.
   *
   * @param bloggermessage The bloggermessage values.
   */
  def insert(bloggermessage: BloggerMessage): Option[Long] = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          insert into bloggermessage values (
    		{id}, {title}, {text}, {datetime}
          )
        """).on(
          'id -> Option.empty[Long],
          'title -> bloggermessage.title,
          'text -> bloggermessage.text,
          'datetime -> bloggermessage.datetime).executeInsert()
    }
  }

  /**
   * Delete a bloggermessage.
   *
   * @param id Id of the bloggermessage to delete.
   */
  def delete(id: Long): Int = {
    DB.withConnection { implicit connection =>
      SQL("delete from bloggermessage where id = {id}").on('id -> id).executeUpdate()
    }
  }

}
