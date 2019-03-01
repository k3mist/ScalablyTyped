package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartHoverOptions extends js.Object {
  var animationDuration: js.UndefOr[scala.Double] = js.undefined
  var intersect: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[InteractionMode] = js.undefined
  var onHover: js.UndefOr[
    js.ThisFunction2[
      /* this */ chartDotJsLib.chartDotJsMod.Chart, 
      /* event */ stdLib.MouseEvent, 
      /* activeElements */ js.Array[js.Object], 
      _
    ]
  ] = js.undefined
}

object ChartHoverOptions {
  @scala.inline
  def apply(
    animationDuration: scala.Int | scala.Double = null,
    intersect: js.UndefOr[scala.Boolean] = js.undefined,
    mode: InteractionMode = null,
    onHover: js.ThisFunction2[
      /* this */ chartDotJsLib.chartDotJsMod.Chart, 
      /* event */ stdLib.MouseEvent, 
      /* activeElements */ js.Array[js.Object], 
      _
    ] = null
  ): ChartHoverOptions = {
    val __obj = js.Dynamic.literal()
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(intersect)) __obj.updateDynamic("intersect")(intersect)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (onHover != null) __obj.updateDynamic("onHover")(onHover)
    __obj.asInstanceOf[ChartHoverOptions]
  }
}

