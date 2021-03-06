package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemOutliers extends js.Object {
  var background: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var border: js.UndefOr[js.Function | ChartSeriesItemOutliersBorder] = js.undefined
  var rotation: js.UndefOr[scala.Double | js.Function] = js.undefined
  var size: js.UndefOr[scala.Double | js.Function] = js.undefined
  var `type`: js.UndefOr[java.lang.String | js.Function] = js.undefined
}

object ChartSeriesItemOutliers {
  @scala.inline
  def apply(
    background: java.lang.String | js.Function = null,
    border: js.Function | ChartSeriesItemOutliersBorder = null,
    rotation: scala.Double | js.Function = null,
    size: scala.Double | js.Function = null,
    `type`: java.lang.String | js.Function = null
  ): ChartSeriesItemOutliers = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesItemOutliers]
  }
}

