package typings
package antdLib.libTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipAlignConfig extends js.Object {
  var offset: js.UndefOr[js.Tuple2[scala.Double | java.lang.String, scala.Double | java.lang.String]] = js.undefined
  var overflow: js.UndefOr[antdLib.Anon_AdjustX] = js.undefined
  var points: js.UndefOr[js.Tuple2[java.lang.String, java.lang.String]] = js.undefined
  var targetOffset: js.UndefOr[js.Tuple2[scala.Double | java.lang.String, scala.Double | java.lang.String]] = js.undefined
  var useCssBottom: js.UndefOr[scala.Boolean] = js.undefined
  var useCssRight: js.UndefOr[scala.Boolean] = js.undefined
  var useCssTransform: js.UndefOr[scala.Boolean] = js.undefined
}

object TooltipAlignConfig {
  @scala.inline
  def apply(
    offset: js.Tuple2[scala.Double | java.lang.String, scala.Double | java.lang.String] = null,
    overflow: antdLib.Anon_AdjustX = null,
    points: js.Tuple2[java.lang.String, java.lang.String] = null,
    targetOffset: js.Tuple2[scala.Double | java.lang.String, scala.Double | java.lang.String] = null,
    useCssBottom: js.UndefOr[scala.Boolean] = js.undefined,
    useCssRight: js.UndefOr[scala.Boolean] = js.undefined,
    useCssTransform: js.UndefOr[scala.Boolean] = js.undefined
  ): TooltipAlignConfig = {
    val __obj = js.Dynamic.literal()
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (overflow != null) __obj.updateDynamic("overflow")(overflow)
    if (points != null) __obj.updateDynamic("points")(points)
    if (targetOffset != null) __obj.updateDynamic("targetOffset")(targetOffset)
    if (!js.isUndefined(useCssBottom)) __obj.updateDynamic("useCssBottom")(useCssBottom)
    if (!js.isUndefined(useCssRight)) __obj.updateDynamic("useCssRight")(useCssRight)
    if (!js.isUndefined(useCssTransform)) __obj.updateDynamic("useCssTransform")(useCssTransform)
    __obj.asInstanceOf[TooltipAlignConfig]
  }
}

