package typings
package peerDashDialLib.peerDashDialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CorsOptions extends js.Object {
  var exposedHeaders: js.Array[java.lang.String]
  var methods: js.Array[java.lang.String]
  var origin: scala.Boolean
}

object CorsOptions {
  @scala.inline
  def apply(
    exposedHeaders: js.Array[java.lang.String],
    methods: js.Array[java.lang.String],
    origin: scala.Boolean
  ): CorsOptions = {
    val __obj = js.Dynamic.literal(exposedHeaders = exposedHeaders, methods = methods, origin = origin)
  
    __obj.asInstanceOf[CorsOptions]
  }
}

