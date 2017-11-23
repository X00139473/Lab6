
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/play/lab6/conf/routes
// @DATE:Thu Nov 23 21:02:33 GMT 2017


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
