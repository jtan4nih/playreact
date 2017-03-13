
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        
        <link rel='stylesheet' href='"""),_display_(/*9.39*/routes/*9.45*/.WebJarAssets.at(WebJarAssets.locate("css/bootstrap.min.css"))),format.raw/*9.107*/("""'>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*10.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.59*/routes/*11.65*/.Assets.versioned("images/favicon.png")),format.raw/*11.104*/("""">
        
        <!-- Loading Bootstrap -->
	    <link href=""""),_display_(/*14.19*/routes/*14.25*/.Assets.versioned("lib/bootstrap/css/bootstrap.min.css")),format.raw/*14.81*/("""" rel="stylesheet">
	
	    <!-- Loading Flat UI -->
	    <link href=""""),_display_(/*17.19*/routes/*17.25*/.Assets.versioned("lib/flat-ui/css/flat-ui.css")),format.raw/*17.73*/("""" rel="stylesheet">

        <link rel="stylesheet" type="text/css" media="screen" href='"""),_display_(/*19.70*/routes/*19.76*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*19.122*/("""'>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*20.54*/routes/*20.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*20.101*/("""">
	
	    <!-- HTML5 shim, for IE6-8 support of HTML5 elements. All other JS at the end of file. -->
	    <!--[if lt IE 9]>
	      	<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
	        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
	    <![endif]-->
    </head>
    <body>
    	<div class="container">
        	"""),_display_(/*30.11*/content),format.raw/*30.18*/("""
        """),format.raw/*31.9*/("""</div>
        
        <script type='text/javascript' src='"""),_display_(/*33.46*/routes/*33.52*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*33.106*/("""'></script>
        <script type='text/javascript' src='"""),_display_(/*34.46*/routes/*34.52*/.WebJarAssets.at(WebJarAssets.locate("bootstrap.min.js"))),format.raw/*34.109*/("""'></script>
        <script type='text/javascript' src='"""),_display_(/*35.46*/routes/*35.52*/.Assets.versioned("javascripts/flat-ui.min.js")),format.raw/*35.99*/("""'></script>
        <script type='text/javascript' src='"""),_display_(/*36.46*/routes/*36.52*/.WebJarAssets.at(WebJarAssets.fullPath("react", "react.js"))),format.raw/*36.112*/("""'></script>
    	<script type='text/javascript' src='"""),_display_(/*37.43*/routes/*37.49*/.WebJarAssets.at(WebJarAssets.locate("JSXTransformer.js"))),format.raw/*37.107*/("""'></script>
        <script type='text/javascript' src='"""),_display_(/*38.46*/routes/*38.52*/.WebJarAssets.at(WebJarAssets.locate("marked.js"))),format.raw/*38.102*/("""'></script>
        
        
        <script type='text/javascript' src='"""),_display_(/*41.46*/routes/*41.52*/.Assets.versioned("javascripts/app.js")),format.raw/*41.91*/("""'></script>
        <script src=""""),_display_(/*42.23*/routes/*42.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*42.70*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Feb 15 17:37:51 SGT 2017
                  SOURCE: C:/Users/Asus/lightbend/playreact/app/views/main.scala.html
                  HASH: 91c59b8c20de91803668a4db4b328f360788b4d2
                  MATRIX: 530->1|655->31|685->35|776->100|801->105|885->163|899->169|982->231|1066->288|1081->294|1144->335|1233->397|1248->403|1309->442|1404->510|1419->516|1496->572|1596->645|1611->651|1680->699|1799->791|1814->797|1882->843|1966->900|1981->906|2044->947|2467->1343|2495->1350|2532->1360|2622->1423|2637->1429|2713->1483|2798->1541|2813->1547|2892->1604|2977->1662|2992->1668|3060->1715|3145->1773|3160->1779|3242->1839|3324->1894|3339->1900|3419->1958|3504->2016|3519->2022|3591->2072|3696->2150|3711->2156|3771->2195|3833->2230|3848->2236|3910->2277
                  LINES: 20->1|25->1|27->3|31->7|31->7|33->9|33->9|33->9|34->10|34->10|34->10|35->11|35->11|35->11|38->14|38->14|38->14|41->17|41->17|41->17|43->19|43->19|43->19|44->20|44->20|44->20|54->30|54->30|55->31|57->33|57->33|57->33|58->34|58->34|58->34|59->35|59->35|59->35|60->36|60->36|60->36|61->37|61->37|61->37|62->38|62->38|62->38|65->41|65->41|65->41|66->42|66->42|66->42
                  -- GENERATED --
              */
          