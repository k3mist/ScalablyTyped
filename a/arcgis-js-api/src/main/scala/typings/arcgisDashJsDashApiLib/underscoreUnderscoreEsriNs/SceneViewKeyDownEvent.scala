package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewKeyDownEvent extends js.Object {
  var key: java.lang.String
  var native: js.Any
  var repeat: scala.Boolean
  var stopPropagation: js.Function
  var timestamp: scala.Double
  var `type`: java.lang.String
}

object SceneViewKeyDownEvent {
  @scala.inline
  def apply(
    key: java.lang.String,
    native: js.Any,
    repeat: scala.Boolean,
    stopPropagation: js.Function,
    timestamp: scala.Double,
    `type`: java.lang.String
  ): SceneViewKeyDownEvent = {
    val __obj = js.Dynamic.literal(key = key, native = native, repeat = repeat, stopPropagation = stopPropagation, timestamp = timestamp, `type` = `type`)
  
    __obj.asInstanceOf[SceneViewKeyDownEvent]
  }
}

