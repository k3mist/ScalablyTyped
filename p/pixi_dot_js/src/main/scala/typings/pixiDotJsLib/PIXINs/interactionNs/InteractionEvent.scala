package typings
package pixiDotJsLib.PIXINs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractionEvent extends js.Object {
  var currentTarget: pixiDotJsLib.PIXINs.DisplayObject
  var data: InteractionData
  var stopped: scala.Boolean
  var target: pixiDotJsLib.PIXINs.DisplayObject
  var `type`: java.lang.String
  def reset(): scala.Unit
  def stopPropagation(): scala.Unit
}

object InteractionEvent {
  @scala.inline
  def apply(
    currentTarget: pixiDotJsLib.PIXINs.DisplayObject,
    data: InteractionData,
    reset: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    stopped: scala.Boolean,
    target: pixiDotJsLib.PIXINs.DisplayObject,
    `type`: java.lang.String
  ): InteractionEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget, data = data, reset = reset, stopPropagation = stopPropagation, stopped = stopped, target = target, `type` = `type`)
  
    __obj.asInstanceOf[InteractionEvent]
  }
}

