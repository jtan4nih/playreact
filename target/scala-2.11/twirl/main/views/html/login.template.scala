
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[scala.Tuple2[String, String]],Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[(String,String)])(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.54*/("""

"""),_display_(/*3.2*/main("Welcome to Login Page")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""

    """),format.raw/*5.5*/("""<h1>Login Sample - Login</h1>
    <p>Please provide your credentials.</p>

    """),_display_(/*8.6*/helper/*8.12*/.form(routes.Authentication.authenticate)/*8.53*/ {_display_(Seq[Any](format.raw/*8.55*/("""
        """),format.raw/*9.9*/("""<p>
            <input type="email" name="email" placeholder="Email" id="email" value=""""),_display_(/*10.85*/form("email")/*10.98*/.value),format.raw/*10.104*/("""">
        </p>
        <p>
            <input type="password" name="password" id="password" placeholder="Password">
        </p>
        <p>
            <button type="submit" id="loginbutton">Login</button>
        </p> 
   """)))}),format.raw/*18.5*/("""
""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(form:Form[scala.Tuple2[String, String]],flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(form)(flash)

  def f:((Form[scala.Tuple2[String, String]]) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (form) => (flash) => apply(form)(flash)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Wed Feb 15 17:37:51 SGT 2017
                  SOURCE: C:/Users/Asus/lightbend/playreact/app/views/login.scala.html
                  HASH: e773c296246b06b733ed95c17dfa19418065ee0e
                  MATRIX: 561->1|708->53|738->58|775->87|814->89|848->97|956->180|970->186|1019->227|1058->229|1094->239|1210->328|1232->341|1260->347|1524->581|1557->584
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|32->8|32->8|32->8|32->8|33->9|34->10|34->10|34->10|42->18|43->19
                  -- GENERATED --
              */
          