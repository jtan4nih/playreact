
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Index Page")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""

	"""),format.raw/*5.2*/("""<div class="container">
		<div class="demo-headline">
			"""),format.raw/*7.30*/("""
				"""),format.raw/*8.33*/("""
				"""),format.raw/*9.31*/("""
				"""),format.raw/*10.107*/("""

			"""),format.raw/*12.13*/("""
			"""),format.raw/*13.72*/("""

			"""),format.raw/*15.4*/("""<h3><a href=""""),_display_(/*15.18*/routes/*15.24*/.Signup.signup),format.raw/*15.38*/("""" ><h1>Sign Up</h1></a></h3>
			<h3><a href=""""),_display_(/*16.18*/routes/*16.24*/.Authentication.login),format.raw/*16.45*/("""" ><h1>Login</h1></a></h3>
			<h3><a href=""""),_display_(/*17.18*/routes/*17.24*/.Application.dashboard),format.raw/*17.46*/(""""><h1>Blogging Messages</h1></a></h3>
		</div>
	</div>
""")))}),format.raw/*20.2*/("""


"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Feb 16 10:41:47 SGT 2017
                  SOURCE: C:/Users/Asus/lightbend/playreact/app/views/index.scala.html
                  HASH: ac74ab9c08d972ae1837c733d5455501708c0be3
                  MATRIX: 527->1|639->18|669->23|706->52|745->54|776->59|862->144|895->178|928->210|963->318|998->334|1031->407|1065->414|1106->428|1121->434|1156->448|1230->495|1245->501|1287->522|1359->567|1374->573|1417->595|1506->654
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|31->7|32->8|33->9|34->10|36->12|37->13|39->15|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|44->20
                  -- GENERATED --
              */
          