package typings
package reactDashToolboxLib.libListListItemActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemActionProps extends js.Object {
  /**
    * List item action.
    */
  var action: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Object defining the component class name mappings.
    */
  var theme: js.UndefOr[ListItemActionTheme] = js.undefined
}

object ListItemActionProps {
  @scala.inline
  def apply(action: reactLib.reactMod.ReactNs.ReactNode = null, theme: ListItemActionTheme = null): ListItemActionProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ListItemActionProps]
  }
}

