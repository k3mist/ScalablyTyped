package typings
package workboxDashSwLib.workboxDashSwMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheDidUpdatePluginContext extends js.Object {
  val cacheName: java.lang.String
  val newResponse: stdLib.Response
  val oldResponse: stdLib.Response
  val request: stdLib.Request
}

object CacheDidUpdatePluginContext {
  @scala.inline
  def apply(
    cacheName: java.lang.String,
    newResponse: stdLib.Response,
    oldResponse: stdLib.Response,
    request: stdLib.Request
  ): CacheDidUpdatePluginContext = {
    val __obj = js.Dynamic.literal(cacheName = cacheName, newResponse = newResponse, oldResponse = oldResponse, request = request)
  
    __obj.asInstanceOf[CacheDidUpdatePluginContext]
  }
}

