package typings
package koDotPlusLib.KoPlusNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandOptions extends js.Object {
  // [required] sets the command action method
  var action: js.Function
  // [optional] function to determine if command can be executed
  var canExecute: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  // [optional] context to use in the command
  var context: js.UndefOr[js.Any] = js.undefined
}

object CommandOptions {
  @scala.inline
  def apply(action: js.Function, canExecute: js.Function0[scala.Boolean] = null, context: js.Any = null): CommandOptions = {
    val __obj = js.Dynamic.literal(action = action)
    if (canExecute != null) __obj.updateDynamic("canExecute")(canExecute)
    if (context != null) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[CommandOptions]
  }
}

