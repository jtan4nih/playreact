
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Asus/lightbend/playreact/conf/routes
// @DATE:Wed Feb 15 17:37:50 SGT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
