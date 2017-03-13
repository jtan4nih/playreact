
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Asus/lightbend/playreact/conf/routes
// @DATE:Wed Feb 15 17:37:50 SGT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_4: controllers.Application,
  // @LINE:26
  Authentication_1: controllers.Authentication,
  // @LINE:28
  Signup_0: controllers.Signup,
  // @LINE:36
  Assets_2: controllers.Assets,
  // @LINE:38
  WebJarAssets_3: controllers.WebJarAssets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_4: controllers.Application,
    // @LINE:26
    Authentication_1: controllers.Authentication,
    // @LINE:28
    Signup_0: controllers.Signup,
    // @LINE:36
    Assets_2: controllers.Assets,
    // @LINE:38
    WebJarAssets_3: controllers.WebJarAssets
  ) = this(errorHandler, Application_4, Authentication_1, Signup_0, Assets_2, WebJarAssets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_4, Authentication_1, Signup_0, Assets_2, WebJarAssets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.Application.dashboard"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bloggermessages""", """controllers.Application.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bloggermessages/save""", """controllers.Application.save"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bloggermessages/$id<[^/]+>""", """controllers.Application.edit(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bloggermessages/$id<[^/]+>""", """controllers.Application.update(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bloggermessages/$id<[^/]+>/delete""", """controllers.Application.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Authentication.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Authentication.authenticate"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Signup.signup"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.Signup.save"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logged""", """controllers.Application.logged"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.Application.home"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """webjars/$file<.+>""", """controllers.WebJarAssets.at(file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_4.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_dashboard1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_Application_dashboard1_invoker = createInvoker(
    Application_4.dashboard,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "dashboard",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Application_list2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bloggermessages")))
  )
  private[this] lazy val controllers_Application_list2_invoker = createInvoker(
    Application_4.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "list",
      Nil,
      "GET",
      """ BloogerMessages list (look at the default values for pagination parameters)""",
      this.prefix + """bloggermessages"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_save3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bloggermessages/save")))
  )
  private[this] lazy val controllers_Application_save3_invoker = createInvoker(
    Application_4.save,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "save",
      Nil,
      "POST",
      """ Add bloggermessage""",
      this.prefix + """bloggermessages/save"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_edit4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bloggermessages/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_edit4_invoker = createInvoker(
    Application_4.edit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "edit",
      Seq(classOf[Long]),
      "GET",
      """GET    /bloggeruser              controllers.UserApplication.list
 Edit existing bloggermessage""",
      this.prefix + """bloggermessages/$id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_update5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bloggermessages/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_update5_invoker = createInvoker(
    Application_4.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "update",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """bloggermessages/$id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_delete6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bloggermessages/"), DynamicPart("id", """[^/]+""",true), StaticPart("/delete")))
  )
  private[this] lazy val controllers_Application_delete6_invoker = createInvoker(
    Application_4.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "delete",
      Seq(classOf[Long]),
      "POST",
      """ Delete a computer""",
      this.prefix + """bloggermessages/$id<[^/]+>/delete"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Authentication_login7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Authentication_login7_invoker = createInvoker(
    Authentication_1.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Authentication_authenticate8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Authentication_authenticate8_invoker = createInvoker(
    Authentication_1.authenticate,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Signup_signup9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Signup_signup9_invoker = createInvoker(
    Signup_0.signup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "signup",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Signup_save10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_Signup_save10_invoker = createInvoker(
    Signup_0.save,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """users"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_logged11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logged")))
  )
  private[this] lazy val controllers_Application_logged11_invoker = createInvoker(
    Application_4.logged,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logged",
      Nil,
      "GET",
      """""",
      this.prefix + """logged"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Application_home12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_Application_home12_invoker = createInvoker(
    Application_4.home,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "home",
      Nil,
      "GET",
      """""",
      this.prefix + """home"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_WebJarAssets_at14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("webjars/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_WebJarAssets_at14_invoker = createInvoker(
    WebJarAssets_3.at(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WebJarAssets",
      "at",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """webjars/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_4.index)
      }
  
    // @LINE:8
    case controllers_Application_dashboard1_route(params) =>
      call { 
        controllers_Application_dashboard1_invoker.call(Application_4.dashboard)
      }
  
    // @LINE:11
    case controllers_Application_list2_route(params) =>
      call { 
        controllers_Application_list2_invoker.call(Application_4.list)
      }
  
    // @LINE:14
    case controllers_Application_save3_route(params) =>
      call { 
        controllers_Application_save3_invoker.call(Application_4.save)
      }
  
    // @LINE:18
    case controllers_Application_edit4_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_edit4_invoker.call(Application_4.edit(id))
      }
  
    // @LINE:19
    case controllers_Application_update5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_update5_invoker.call(Application_4.update(id))
      }
  
    // @LINE:21
    case controllers_Application_delete6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_delete6_invoker.call(Application_4.delete(id))
      }
  
    // @LINE:26
    case controllers_Authentication_login7_route(params) =>
      call { 
        controllers_Authentication_login7_invoker.call(Authentication_1.login)
      }
  
    // @LINE:27
    case controllers_Authentication_authenticate8_route(params) =>
      call { 
        controllers_Authentication_authenticate8_invoker.call(Authentication_1.authenticate)
      }
  
    // @LINE:28
    case controllers_Signup_signup9_route(params) =>
      call { 
        controllers_Signup_signup9_invoker.call(Signup_0.signup)
      }
  
    // @LINE:29
    case controllers_Signup_save10_route(params) =>
      call { 
        controllers_Signup_save10_invoker.call(Signup_0.save)
      }
  
    // @LINE:30
    case controllers_Application_logged11_route(params) =>
      call { 
        controllers_Application_logged11_invoker.call(Application_4.logged)
      }
  
    // @LINE:31
    case controllers_Application_home12_route(params) =>
      call { 
        controllers_Application_home12_invoker.call(Application_4.home)
      }
  
    // @LINE:36
    case controllers_Assets_versioned13_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:38
    case controllers_WebJarAssets_at14_route(params) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_WebJarAssets_at14_invoker.call(WebJarAssets_3.at(file))
      }
  }
}