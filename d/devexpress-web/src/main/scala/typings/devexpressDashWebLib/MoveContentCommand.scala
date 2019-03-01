package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to move the selected range to a specific position in the document.
  */
trait MoveContentCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the MoveContentCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param position An integer value specifying position to insert selected text.
    */
  def execute(position: scala.Double): scala.Boolean
}

object MoveContentCommand {
  @scala.inline
  def apply(execute: js.Function1[scala.Double, scala.Boolean], getState: js.Function0[SimpleCommandState]): MoveContentCommand = {
    val __obj = js.Dynamic.literal(execute = execute, getState = getState)
  
    __obj.asInstanceOf[MoveContentCommand]
  }
}

