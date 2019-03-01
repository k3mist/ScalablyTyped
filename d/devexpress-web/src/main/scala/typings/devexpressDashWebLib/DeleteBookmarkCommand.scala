package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A command to delete a specific bookmark.
  */
trait DeleteBookmarkCommand extends CommandWithSimpleStateBase {
  /**
    * Executes the DeleteBookmarkCommand command by applying the specified setting.  May result in taking no action if the command's state does not allow command execution. Use the object's getState method to check the command state.
    * @param name A string value specifying a name of the deleted bookmark.
    */
  def execute(name: java.lang.String): scala.Boolean
}

object DeleteBookmarkCommand {
  @scala.inline
  def apply(execute: js.Function1[java.lang.String, scala.Boolean], getState: js.Function0[SimpleCommandState]): DeleteBookmarkCommand = {
    val __obj = js.Dynamic.literal(execute = execute, getState = getState)
  
    __obj.asInstanceOf[DeleteBookmarkCommand]
  }
}

