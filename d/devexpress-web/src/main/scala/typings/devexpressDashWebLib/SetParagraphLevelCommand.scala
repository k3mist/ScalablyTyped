package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to apply a paragraph level to the selected text
  */
trait SetParagraphLevelCommand extends CommandBase {
  /**
    * Executes the SetParagraphLevelCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param level An integer value specifying the applied style. The value should be in the range from 0 to 9.
    */
  def execute(level: scala.Double): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object SetParagraphLevelCommand {
  @scala.inline
  def apply(execute: js.Function1[scala.Double, scala.Boolean], getState: js.Function0[js.Any]): SetParagraphLevelCommand = {
    val __obj = js.Dynamic.literal(execute = execute, getState = getState)
  
    __obj.asInstanceOf[SetParagraphLevelCommand]
  }
}

