package typings
package meteorLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Login **/
/** Event **/
trait Event extends js.Object {
  var currentTarget: reactLib.HTMLElement
  var target: reactLib.HTMLElement
  var `type`: java.lang.String
  var which: scala.Double
  def isDefaultPrevented(): scala.Boolean
  def isImmediatePropagationStopped(): scala.Boolean
  def isPropagationStopped(): scala.Boolean
  def preventDefault(): scala.Unit
  def stopImmediatePropagation(): scala.Unit
  def stopPropagation(): scala.Unit
}

object Event {
  @scala.inline
  def apply(
    currentTarget: reactLib.HTMLElement,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isImmediatePropagationStopped: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    preventDefault: js.Function0[scala.Unit],
    stopImmediatePropagation: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: reactLib.HTMLElement,
    `type`: java.lang.String,
    which: scala.Double
  ): Event = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget, isDefaultPrevented = isDefaultPrevented, isImmediatePropagationStopped = isImmediatePropagationStopped, isPropagationStopped = isPropagationStopped, preventDefault = preventDefault, stopImmediatePropagation = stopImmediatePropagation, stopPropagation = stopPropagation, target = target, `type` = `type`, which = which)
  
    __obj.asInstanceOf[Event]
  }
}

