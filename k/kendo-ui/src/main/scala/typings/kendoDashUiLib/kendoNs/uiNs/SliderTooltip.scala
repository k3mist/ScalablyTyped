package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderTooltip extends js.Object {
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

object SliderTooltip {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    template: java.lang.String | js.Function = null
  ): SliderTooltip = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (format != null) __obj.updateDynamic("format")(format)
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderTooltip]
  }
}

