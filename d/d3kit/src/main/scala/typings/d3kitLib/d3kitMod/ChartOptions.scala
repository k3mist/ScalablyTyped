package typings
package d3kitLib.d3kitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOptions extends js.Object {
  var initialHeight: js.UndefOr[scala.Double] = js.undefined
  var initialWidth: js.UndefOr[scala.Double] = js.undefined
  var margin: js.UndefOr[ChartMargin] = js.undefined
  var offset: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
}

object ChartOptions {
  @scala.inline
  def apply(
    initialHeight: scala.Int | scala.Double = null,
    initialWidth: scala.Int | scala.Double = null,
    margin: ChartMargin = null,
    offset: js.Tuple2[scala.Double, scala.Double] = null,
    pixelRatio: scala.Int | scala.Double = null
  ): ChartOptions = {
    val __obj = js.Dynamic.literal()
    if (initialHeight != null) __obj.updateDynamic("initialHeight")(initialHeight.asInstanceOf[js.Any])
    if (initialWidth != null) __obj.updateDynamic("initialWidth")(initialWidth.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (offset != null) __obj.updateDynamic("offset")(offset)
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOptions]
  }
}

