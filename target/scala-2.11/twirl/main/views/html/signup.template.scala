
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(myForm : Form[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import models.User

Seq[Any](format.raw/*1.23*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Sign Up Page")/*6.22*/{_display_(Seq[Any](format.raw/*6.23*/("""
"""),format.raw/*7.1*/("""<h1>SIGN UP</h1>

<p>Sign Up to be a member</p>
	"""),_display_(/*10.3*/form(routes.Signup.save())/*10.29*/ {_display_(Seq[Any](format.raw/*10.31*/("""
        """),format.raw/*11.9*/("""<p>
            <input type="email" name="email" placeholder="Email" id="email" value=""""),_display_(/*12.85*/myForm("email")/*12.100*/.value),format.raw/*12.106*/("""">
        </p>
		    <p>
            <input type="text" name="name" id="name" placeholder="Name" value=""""),_display_(/*15.81*/myForm("name")/*15.95*/.value),format.raw/*15.101*/("""">
        </p>
		    <p>
            <input type="password" name="password" id="password" placeholder="Password">
        </p>
	    
	    	<p>
		    <button  type="submit">Sign Up</button>
		    </p>
      """)))}),format.raw/*24.8*/("""
""")))}),format.raw/*25.2*/("""

"""))
      }
    }
  }

  def render(myForm:Form[User]): play.twirl.api.HtmlFormat.Appendable = apply(myForm)

  def f:((Form[User]) => play.twirl.api.HtmlFormat.Appendable) = (myForm) => apply(myForm)

  def ref: this.type = this

}


}

/**/
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Wed Feb 15 17:37:51 SGT 2017
                  SOURCE: C:/Users/Asus/lightbend/playreact/app/views/signup.scala.html
                  HASH: 8ab8bcba481ca9663cc2d384941299eb77163624
                  MATRIX: 533->1|683->22|713->65|741->68|769->88|807->89|835->91|914->144|949->170|989->172|1026->182|1142->271|1167->286|1195->292|1331->401|1354->415|1382->421|1629->638|1662->641
                  LINES: 20->1|26->1|28->5|29->6|29->6|29->6|30->7|33->10|33->10|33->10|34->11|35->12|35->12|35->12|38->15|38->15|38->15|47->24|48->25
                  -- GENERATED --
              */
          