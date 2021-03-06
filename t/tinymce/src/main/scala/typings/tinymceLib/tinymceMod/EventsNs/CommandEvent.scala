package typings
package tinymceLib.tinymceMod.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandEvent extends Event {
  var command: java.lang.String
  var ui: scala.Boolean
  var value: java.lang.String
}

object CommandEvent {
  @scala.inline
  def apply(
    command: java.lang.String,
    isDefaultPrevented: () => scala.Boolean,
    isImmediatePropagationStopped: () => scala.Boolean,
    isPropagationStopped: () => scala.Boolean,
    preventDefault: () => scala.Unit,
    stopImmediatePropagation: () => scala.Unit,
    stopPropagation: () => scala.Unit,
    target: java.lang.String,
    `type`: java.lang.String,
    ui: scala.Boolean,
    value: java.lang.String
  ): CommandEvent = {
    val __obj = js.Dynamic.literal(command = command, isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target, ui = ui, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CommandEvent]
  }
}

