package typings
package signalrLib.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxDefaults extends js.Object {
  var async: scala.Boolean
  var cache: scala.Boolean
  var global: scala.Boolean
  var processData: scala.Boolean
  var timeout: scala.Double
}

object AjaxDefaults {
  @scala.inline
  def apply(
    async: scala.Boolean,
    cache: scala.Boolean,
    global: scala.Boolean,
    processData: scala.Boolean,
    timeout: scala.Double
  ): AjaxDefaults = {
    val __obj = js.Dynamic.literal(async = async, cache = cache, global = global, processData = processData, timeout = timeout)
  
    __obj.asInstanceOf[AjaxDefaults]
  }
}

