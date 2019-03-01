package typings
package nouisliderLib.nouisliderMod.noUiSliderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PipsOptions extends js.Object {
  /**
    * Range Mode: percentage for range mode
    * Step Mode: step number for steps
    * Positions Mode: percentage-based positions on the slider
    * Count Mode: positions between pips
    */
  var density: js.UndefOr[scala.Double] = js.undefined
  /**
    * Step Mode: The filter option can be used to filter the generated pips.
    * The filter function must return 0 (no value), 1 (large value) or 2 (small value).
    */
  var filter: js.UndefOr[js.Function1[/* repeated */ js.Any, PipFilterResult]] = js.undefined
  /**
    * format for step mode
    * see noUiSlider format
    */
  var format: js.UndefOr[js.Object | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
  /**
    * The 'range' mode uses the slider range to determine where the pips should be. A pip is generated for every percentage specified.
    *
    * The 'steps', like 'range', uses the slider range. In steps mode, a pip is generated for every step.
    * The 'filter' option can be used to filter the generated pips from the 'steps' options'
    * The filter function must return 0 (no value), 1 (large value) or 2 (small value).
    *
    * In 'positions' mode, pips are generated at percentage-based positions on the slider.
    * Optionally, the stepped option can be set to true to match the pips to the slider steps.
    *
    * The 'count' mode can be used to generate a fixed number of pips. As with positions mode, the stepped option can be used.
    *
    * The 'values' mode is similar to positions, but it accepts values instead of percentages. The stepped option can be used for this mode.
    *
    */
  var mode: nouisliderLib.nouisliderLibStrings.range | nouisliderLib.nouisliderLibStrings.steps | nouisliderLib.nouisliderLibStrings.positions | nouisliderLib.nouisliderLibStrings.count | nouisliderLib.nouisliderLibStrings.values
  /**
    * stepped option for positions, values and count mode
    */
  var stepped: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * values for positions and values mode
    * number pips for count mode
    */
  var values: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
}

object PipsOptions {
  @scala.inline
  def apply(
    mode: nouisliderLib.nouisliderLibStrings.range | nouisliderLib.nouisliderLibStrings.steps | nouisliderLib.nouisliderLibStrings.positions | nouisliderLib.nouisliderLibStrings.count | nouisliderLib.nouisliderLibStrings.values,
    density: scala.Int | scala.Double = null,
    filter: js.Function1[/* repeated */ js.Any, PipFilterResult] = null,
    format: js.Object | (js.Function1[/* repeated */ js.Any, _]) = null,
    stepped: js.UndefOr[scala.Boolean] = js.undefined,
    values: scala.Double | js.Array[scala.Double] = null
  ): PipsOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    if (density != null) __obj.updateDynamic("density")(density.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(stepped)) __obj.updateDynamic("stepped")(stepped)
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipsOptions]
  }
}

