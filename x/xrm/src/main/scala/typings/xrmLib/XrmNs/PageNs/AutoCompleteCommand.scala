package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for command of AutoCompleteResultSet.  This is displayed at the bottom of the auto complete view
  * @deprecated Use {@link Xrm.Controls.AutoCompleteCommand} instead.
  */
trait AutoCompleteCommand
  extends xrmLib.XrmNs.ControlsNs.AutoCompleteCommand

object AutoCompleteCommand {
  @scala.inline
  def apply(
    action: js.Function0[scala.Unit],
    id: java.lang.String,
    label: java.lang.String,
    icon: java.lang.String = null
  ): AutoCompleteCommand = {
    val __obj = js.Dynamic.literal(action = action, id = id, label = label)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    __obj.asInstanceOf[AutoCompleteCommand]
  }
}

