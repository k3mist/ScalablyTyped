package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to toggle between the bulleted paragraph and normal text.
  */
trait ToggleBulletedListCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleBulletedListCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean
}

object ToggleBulletedListCommand {
  @scala.inline
  def apply(execute: () => scala.Boolean, getState: () => js.Any): ToggleBulletedListCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ToggleBulletedListCommand]
  }
}

