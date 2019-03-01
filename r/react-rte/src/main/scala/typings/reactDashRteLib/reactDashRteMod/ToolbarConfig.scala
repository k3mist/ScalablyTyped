package typings
package reactDashRteLib.reactDashRteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarConfig extends js.Object {
  var BLOCK_TYPE_BUTTONS: reactDashRteLib.StyleConfigList
  var BLOCK_TYPE_DROPDOWN: reactDashRteLib.StyleConfigList
  var INLINE_STYLE_BUTTONS: reactDashRteLib.StyleConfigList
  var display: js.Array[reactDashRteLib.GroupName]
  var extraProps: js.UndefOr[js.Object] = js.undefined
}

object ToolbarConfig {
  @scala.inline
  def apply(
    BLOCK_TYPE_BUTTONS: reactDashRteLib.StyleConfigList,
    BLOCK_TYPE_DROPDOWN: reactDashRteLib.StyleConfigList,
    INLINE_STYLE_BUTTONS: reactDashRteLib.StyleConfigList,
    display: js.Array[reactDashRteLib.GroupName],
    extraProps: js.Object = null
  ): ToolbarConfig = {
    val __obj = js.Dynamic.literal(BLOCK_TYPE_BUTTONS = BLOCK_TYPE_BUTTONS, BLOCK_TYPE_DROPDOWN = BLOCK_TYPE_DROPDOWN, INLINE_STYLE_BUTTONS = INLINE_STYLE_BUTTONS, display = display)
    if (extraProps != null) __obj.updateDynamic("extraProps")(extraProps)
    __obj.asInstanceOf[ToolbarConfig]
  }
}

