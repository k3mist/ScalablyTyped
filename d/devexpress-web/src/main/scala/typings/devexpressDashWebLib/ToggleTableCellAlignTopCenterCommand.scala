package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to apply top-center alignment for the selected table cells.
  */
trait ToggleTableCellAlignTopCenterCommand extends CommandWithBooleanStateBase {
  /**
    * Executes the ToggleTableCellAlignTopCenterCommand command by imitating the corresponding end-user action made in the RichEdit's UI.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    */
  def execute(): scala.Boolean
}

object ToggleTableCellAlignTopCenterCommand {
  @scala.inline
  def apply(execute: js.Function0[scala.Boolean], getState: js.Function0[js.Any]): ToggleTableCellAlignTopCenterCommand = {
    val __obj = js.Dynamic.literal(execute = execute, getState = getState)
  
    __obj.asInstanceOf[ToggleTableCellAlignTopCenterCommand]
  }
}

