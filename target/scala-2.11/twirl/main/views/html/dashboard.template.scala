
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dashboard_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* dashboard Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.14*/("""

"""),_display_(/*4.2*/main("Dashboard Page")/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
	
	"""),format.raw/*6.2*/("""<div class="row demo-row">
		<div id="content"></div>
	</div>
	
""")))}),format.raw/*10.2*/("""
"""))
      }
    }
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}


}

/* dashboard Template File */
object dashboard extends dashboard_Scope0.dashboard
              /*
                  -- GENERATED --
                  DATE: Wed Feb 15 17:37:51 SGT 2017
                  SOURCE: C:/Users/Asus/lightbend/playreact/app/views/dashboard.scala.html
                  HASH: 2aabf91943d3c51ece4414171d58735343c57d5d
                  MATRIX: 557->32|664->44|694->49|724->71|763->73|795->79|894->148
                  LINES: 20->2|25->2|27->4|27->4|27->4|29->6|33->10
                  -- GENERATED --
              */
          