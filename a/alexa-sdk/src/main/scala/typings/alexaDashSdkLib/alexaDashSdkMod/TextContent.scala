package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextContent extends js.Object {
  var primaryText: js.UndefOr[TextField] = js.undefined
  var secondaryText: js.UndefOr[TextField] = js.undefined
  var tertiaryText: js.UndefOr[TextField] = js.undefined
}

object TextContent {
  @scala.inline
  def apply(primaryText: TextField = null, secondaryText: TextField = null, tertiaryText: TextField = null): TextContent = {
    val __obj = js.Dynamic.literal()
    if (primaryText != null) __obj.updateDynamic("primaryText")(primaryText)
    if (secondaryText != null) __obj.updateDynamic("secondaryText")(secondaryText)
    if (tertiaryText != null) __obj.updateDynamic("tertiaryText")(tertiaryText)
    __obj.asInstanceOf[TextContent]
  }
}

