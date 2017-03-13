
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),_display_(/*3.2*/main("Home Page" )/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
			"""),format.raw/*4.4*/("""<h1>Hurray!!!You are in the home page</h1>
			<h2>Press the button to return to the index page</h2>

 		"""),_display_(/*7.5*/helper/*7.11*/.form(routes.Application.index)/*7.42*/{_display_(Seq[Any](format.raw/*7.43*/("""
        """),format.raw/*8.9*/("""<p>
            <button type="submit" id="index">INDEX</button>
        </p>   
    """)))}),format.raw/*11.6*/("""
""")))}),format.raw/*12.2*/("""
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
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Wed Feb 15 17:37:51 SGT 2017
                  SOURCE: C:/Users/Asus/lightbend/playreact/app/views/home.scala.html
                  HASH: dd18e94e684c1d7cc526f6933fe29af1983d1352
                  MATRIX: 525->1|634->15|664->20|690->38|728->39|759->44|892->152|906->158|945->189|983->190|1019->200|1137->288|1170->291
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|31->7|31->7|31->7|31->7|32->8|35->11|36->12
                  -- GENERATED --
              */
          