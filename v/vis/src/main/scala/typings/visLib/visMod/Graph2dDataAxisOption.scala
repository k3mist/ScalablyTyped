package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Graph2dDataAxisOption extends js.Object {
  var alignZeros: js.UndefOr[scala.Boolean] = js.undefined
  var iconWidth: js.UndefOr[scala.Double] = js.undefined
  var icons: js.UndefOr[scala.Boolean] = js.undefined
  var labelOffsetX: js.UndefOr[scala.Double] = js.undefined
  var labelOffsetY: js.UndefOr[scala.Double] = js.undefined
  var left: js.UndefOr[DataAxisSideOption] = js.undefined
  var majorLinesOffset: js.UndefOr[scala.Double] = js.undefined
  var minorLinesOffset: js.UndefOr[scala.Double] = js.undefined
  var orientation: js.UndefOr[TimelineOptionsOrientationType] = js.undefined
  var right: js.UndefOr[DataAxisSideOption] = js.undefined
  var showMajorLabels: js.UndefOr[scala.Boolean] = js.undefined
  var showMinorLabels: js.UndefOr[scala.Boolean] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object Graph2dDataAxisOption {
  @scala.inline
  def apply(
    alignZeros: js.UndefOr[scala.Boolean] = js.undefined,
    iconWidth: scala.Int | scala.Double = null,
    icons: js.UndefOr[scala.Boolean] = js.undefined,
    labelOffsetX: scala.Int | scala.Double = null,
    labelOffsetY: scala.Int | scala.Double = null,
    left: DataAxisSideOption = null,
    majorLinesOffset: scala.Int | scala.Double = null,
    minorLinesOffset: scala.Int | scala.Double = null,
    orientation: TimelineOptionsOrientationType = null,
    right: DataAxisSideOption = null,
    showMajorLabels: js.UndefOr[scala.Boolean] = js.undefined,
    showMinorLabels: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    width: java.lang.String = null
  ): Graph2dDataAxisOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignZeros)) __obj.updateDynamic("alignZeros")(alignZeros)
    if (iconWidth != null) __obj.updateDynamic("iconWidth")(iconWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(icons)) __obj.updateDynamic("icons")(icons)
    if (labelOffsetX != null) __obj.updateDynamic("labelOffsetX")(labelOffsetX.asInstanceOf[js.Any])
    if (labelOffsetY != null) __obj.updateDynamic("labelOffsetY")(labelOffsetY.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left)
    if (majorLinesOffset != null) __obj.updateDynamic("majorLinesOffset")(majorLinesOffset.asInstanceOf[js.Any])
    if (minorLinesOffset != null) __obj.updateDynamic("minorLinesOffset")(minorLinesOffset.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right)
    if (!js.isUndefined(showMajorLabels)) __obj.updateDynamic("showMajorLabels")(showMajorLabels)
    if (!js.isUndefined(showMinorLabels)) __obj.updateDynamic("showMinorLabels")(showMinorLabels)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Graph2dDataAxisOption]
  }
}

