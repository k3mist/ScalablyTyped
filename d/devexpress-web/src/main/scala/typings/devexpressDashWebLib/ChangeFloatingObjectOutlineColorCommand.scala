package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to modify a floating object's outline color.
  */
trait ChangeFloatingObjectOutlineColorCommand extends CommandBase {
  /**
    * Executes the ChangeFloatingObjectOutlineColorCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param color A string value specifying the color.
    */
  def execute(color: java.lang.String): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeFloatingObjectOutlineColorCommand {
  @scala.inline
  def apply(execute: java.lang.String => scala.Boolean, getState: () => js.Any): ChangeFloatingObjectOutlineColorCommand = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), getState = js.Any.fromFunction0(getState))
  
    __obj.asInstanceOf[ChangeFloatingObjectOutlineColorCommand]
  }
}

