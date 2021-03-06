package typings
package backboneLib.backboneMod.BackboneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Router extends js.Object {
  /**
    * Routes hash or a method returning the routes hash that maps URLs with parameters to methods on your Router.
    * For assigning routes as object hash, do it like this: this.routes = <any>{ "route": callback, ... };
    * That works only if you set it in the constructor or the initialize method.
    **/
  var routes: RoutesHash | js.Any = js.native
  /* private */ def _bindRoutes(): scala.Unit = js.native
  /* private */ def _extractParameters(route: stdLib.RegExp, fragment: java.lang.String): js.Array[java.lang.String] = js.native
  /* private */ def _routeToRegExp(route: java.lang.String): stdLib.RegExp = js.native
  def execute(callback: js.Function, args: js.Array[_], name: java.lang.String): scala.Unit = js.native
  def initialize(): scala.Unit = js.native
  def initialize(options: RouterOptions): scala.Unit = js.native
  def navigate(fragment: java.lang.String): Router = js.native
  def navigate(fragment: java.lang.String, options: NavigateOptions): Router = js.native
  def navigate(fragment: java.lang.String, trigger: scala.Boolean): Router = js.native
  def route(route: java.lang.String, name: java.lang.String): Router = js.native
  def route(route: java.lang.String, name: java.lang.String, callback: js.Function): Router = js.native
  def route(route: stdLib.RegExp, name: java.lang.String): Router = js.native
  def route(route: stdLib.RegExp, name: java.lang.String, callback: js.Function): Router = js.native
}

