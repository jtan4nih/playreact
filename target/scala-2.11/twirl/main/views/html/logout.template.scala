
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object logout_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class logout extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),_display_(/*3.2*/main("Log Out")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""

    """),format.raw/*5.5*/("""<h1>HURRAY!!! YOU HAVE NOW LOGGED IN</h1>
    <h2>Hit LogOut Button to log out</h2>
   
    """),_display_(/*8.6*/helper/*8.12*/.form(routes.Application.home)/*8.42*/{_display_(Seq[Any](format.raw/*8.43*/("""
        """),format.raw/*9.9*/("""<p>
            <button type="submit" id="logoutbutton">LogOut</button>
        </p>   
    """)))}),format.raw/*12.6*/("""
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object logout extends logout_Scope0.logout
              /*
                  -- GENERATED --
                  DATE: Wed Feb 15 17:37:51 SGT 2017
                  SOURCE: C:/Users/Asus/lightbend/playreact/app/views/logout.scala.html
                  HASH: 0559a42ca83293b2d3d147be21f9028f339e1dd7
                  MATRIX: 529->1|639->16|669->21|692->36|731->38|765->46|886->142|900->148|938->178|976->179|1012->189|1138->285|1171->288
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|32->8|32->8|32->8|32->8|33->9|36->12|37->13
                  -- GENERATED --
              */
          