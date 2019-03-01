package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuSettings extends js.Object {
  /** Gets or sets a value that indicates whether to add custom contextMenu items.
    * @Default {Array}
    */
  var customMenuItems: js.UndefOr[js.Array[ContextMenuSettingsCustomMenuItem]] = js.undefined
  /** Gets or sets a value that indicates the list of items needs to be disable from default context menu items.
    * @Default {Array}
    */
  var disableDefaultItems: js.UndefOr[js.Array[_]] = js.undefined
  /** To enable context menu.All default context menu will show.
    * @Default {false}
    */
  var enable: js.UndefOr[scala.Boolean] = js.undefined
  /** Its used to add specific default context menu items.
    * @Default {Array}
    */
  var menuItems: js.UndefOr[js.Array[_]] = js.undefined
}

object ContextMenuSettings {
  @scala.inline
  def apply(
    customMenuItems: js.Array[ContextMenuSettingsCustomMenuItem] = null,
    disableDefaultItems: js.Array[_] = null,
    enable: js.UndefOr[scala.Boolean] = js.undefined,
    menuItems: js.Array[_] = null
  ): ContextMenuSettings = {
    val __obj = js.Dynamic.literal()
    if (customMenuItems != null) __obj.updateDynamic("customMenuItems")(customMenuItems)
    if (disableDefaultItems != null) __obj.updateDynamic("disableDefaultItems")(disableDefaultItems)
    if (!js.isUndefined(enable)) __obj.updateDynamic("enable")(enable)
    if (menuItems != null) __obj.updateDynamic("menuItems")(menuItems)
    __obj.asInstanceOf[ContextMenuSettings]
  }
}

