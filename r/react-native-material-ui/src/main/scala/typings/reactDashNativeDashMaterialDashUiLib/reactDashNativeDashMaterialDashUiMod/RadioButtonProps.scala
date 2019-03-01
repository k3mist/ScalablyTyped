package typings
package reactDashNativeDashMaterialDashUiLib.reactDashNativeDashMaterialDashUiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioButtonProps extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var label: java.lang.String
  var theme: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String | scala.Double
  def onSelect(value: java.lang.String): scala.Unit
}

object RadioButtonProps {
  @scala.inline
  def apply(
    label: java.lang.String,
    onSelect: js.Function1[java.lang.String, scala.Unit],
    value: java.lang.String | scala.Double,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    theme: java.lang.String = null
  ): RadioButtonProps = {
    val __obj = js.Dynamic.literal(label = label, onSelect = onSelect, value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[RadioButtonProps]
  }
}

