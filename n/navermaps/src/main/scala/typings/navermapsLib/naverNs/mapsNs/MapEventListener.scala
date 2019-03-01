package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interfaces
  */
trait MapEventListener extends js.Object {
  var eventName: java.lang.String
  var listenerId: java.lang.String
  var target: js.Any
  def listener(event: js.Any): js.Any
}

object MapEventListener {
  @scala.inline
  def apply(
    eventName: java.lang.String,
    listener: js.Function1[js.Any, js.Any],
    listenerId: java.lang.String,
    target: js.Any
  ): MapEventListener = {
    val __obj = js.Dynamic.literal(eventName = eventName, listener = listener, listenerId = listenerId, target = target)
  
    __obj.asInstanceOf[MapEventListener]
  }
}

