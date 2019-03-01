package typings
package reactDashToolboxLib.libListListItemActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemActionsTheme extends js.Object {
  /**
    * Added for the element that wraps left actions.
    */
  var left: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Added for the element that wraps right actions.
    */
  var right: js.UndefOr[java.lang.String] = js.undefined
}

object ListItemActionsTheme {
  @scala.inline
  def apply(left: java.lang.String = null, right: java.lang.String = null): ListItemActionsTheme = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[ListItemActionsTheme]
  }
}

