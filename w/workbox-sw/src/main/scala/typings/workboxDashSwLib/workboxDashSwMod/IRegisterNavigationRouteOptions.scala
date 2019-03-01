package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ===== RoutingNamespace =====
  */
trait IRegisterNavigationRouteOptions extends INavigationRouteOptions {
  var cacheName: java.lang.String
}

object IRegisterNavigationRouteOptions {
  @scala.inline
  def apply(
    blacklist: js.Array[stdLib.RegExp],
    cacheName: java.lang.String,
    whitelist: js.Array[stdLib.RegExp]
  ): IRegisterNavigationRouteOptions = {
    val __obj = js.Dynamic.literal(blacklist = blacklist, cacheName = cacheName, whitelist = whitelist)
  
    __obj.asInstanceOf[IRegisterNavigationRouteOptions]
  }
}

