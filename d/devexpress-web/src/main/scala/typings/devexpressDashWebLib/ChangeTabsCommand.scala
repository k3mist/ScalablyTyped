package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to change paragraph tab stops.
  */
trait ChangeTabsCommand extends CommandBase {
  /**
    * Executes the ChangeTabsCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param settings A TabsSettings object maintaining the information about tab stops.
    */
  def execute(settings: TabsSettings): scala.Boolean
  /**
    * Gets information about the command state.
    */
  def getState(): js.Any
}

object ChangeTabsCommand {
  @scala.inline
  def apply(execute: js.Function1[TabsSettings, scala.Boolean], getState: js.Function0[js.Any]): ChangeTabsCommand = {
    val __obj = js.Dynamic.literal(execute = execute, getState = getState)
  
    __obj.asInstanceOf[ChangeTabsCommand]
  }
}

