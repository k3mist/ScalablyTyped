package typings
package bootstrapDashSliderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderOptions extends js.Object {
  /**
    * Default: true
    * whether or not the slider is initially enabled
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    * Focus the appropriate slider handle after a value change.
    */
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: returns the plain value
    * formatter callback. Return the value wanted to be displayed in the tooltip
    * @param val the current value to display
    */
  var formatter: js.UndefOr[js.Function1[/* val */ scala.Double, java.lang.String]] = js.undefined
  /**
    * Default: 'round'
    * handle shape. Accepts: 'round', 'square', 'triangle' or 'custom'
    */
  var handle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: ''
    * set the id of the slider element when it's created
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: null
    * ARIA labels for the slider handle's, Use array for multiple values in a
    * range slider.
    */
  var labelledby: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * Default: 10
    * maximum possible value
    */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default: 0
    * minimum possible value
    */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default: false
    * The natural order is used for the arrow keys. Arrow up select the upper slider value for vertical sliders,
    * arrow right the righter slider value for a horizontal slider - no matter if the slider was reversed or not.
    * By default the arrow keys are oriented by arrow up/right to the higher slider value, arrow down/left to the lower slider value.
    */
  var natural_arrow_keys: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: 'horizontal'
    * set the orientation. Accepts 'vertical' or 'horizontal'
    */
  var orientation: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: number of digits after the decimal of step value
    * The number of digits shown after the decimal. Defaults to the number of digits after the decimal of step value.
    */
  var precision: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default: false
    * make range slider. Optional if initial value is an array. If initial value is scalar, max will be used for second value.
    */
  var range: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: []
    * Defines a range array that you want to highlight, for example:
    * [{'start':val1, 'end': val2, 'class': 'optionalAdditionalClassName'}].
    */
  var rangeHighlights: js.UndefOr[js.Array[RangeHighlight]] = js.undefined
  /**
    * Default: false
    * whether or not the slider should be reversed
    */
  var reversed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: 'auto'
    */
  var rtl: js.UndefOr[scala.Boolean | bootstrapDashSliderLib.bootstrapDashSliderLibStrings.auto] = js.undefined
  /**
    * Default: 'linear'
    * Set to 'logarithmic' to use a logarithmic scale.
    */
  var scale: js.UndefOr[
    bootstrapDashSliderLib.bootstrapDashSliderLibStrings.linear | bootstrapDashSliderLib.bootstrapDashSliderLibStrings.logarithmic
  ] = js.undefined
  /**
    * Default: 'before'
    * selection placement. Accepts: 'before', 'after' or 'none'. In case of a range slider, the selection will be placed between the handles
    */
  var selection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: 1
    * increment step
    */
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default: [ ]
    * Used to define the values of ticks. Tick marks are indicators to denote special values in the range. This option overwrites min and max options.
    */
  var ticks: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Default: [ ]
    * Defines the labels below the tick marks. Accepts HTML input.
    */
  var ticks_labels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Default: [ ]
    * Defines the positions of the tick values in percentages. The first value should alwasy be 0, the last value should always be 100 percent.
    */
  var ticks_positions: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * Default: 0
    * Used to define the snap bounds of a tick. Snaps to the tick if value is within these bounds.
    */
  var ticks_snap_bounds: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default: false
    * Used to allow for a user to hover over a given tick to see it's value.
    * Useful if custom formatter passed in
    */
  var ticks_tooltip: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: 'show'
    * whether to show the tooltip on drag, hide the tooltip, or always show the tooltip. Accepts: 'show', 'hide', or 'always'
    */
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default: null
    * Position of tooltip, relative to slider. Accepts 'top'/'bottom' for
    * horizontal sliders and 'left'/'right' for vertically orientated sliders.
    * Default positions are 'top' for horizontal and 'right' for vertical
    * slider.
    */
  var tooltip_position: js.UndefOr[
    bootstrapDashSliderLib.bootstrapDashSliderLibStrings.top | bootstrapDashSliderLib.bootstrapDashSliderLibStrings.bottom | bootstrapDashSliderLib.bootstrapDashSliderLibStrings.left | bootstrapDashSliderLib.bootstrapDashSliderLibStrings.right
  ] = js.undefined
  /**
    * Default: false
    * if false show one tootip if true show two tooltips one for each handler
    */
  var tooltip_split: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: 5
    * initial value. Use array to have a range slider.
    */
  var value: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
}

object SliderOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    formatter: js.Function1[/* val */ scala.Double, java.lang.String] = null,
    handle: java.lang.String = null,
    id: java.lang.String = null,
    labelledby: java.lang.String | js.Array[java.lang.String] = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    natural_arrow_keys: js.UndefOr[scala.Boolean] = js.undefined,
    orientation: java.lang.String = null,
    precision: scala.Int | scala.Double = null,
    range: js.UndefOr[scala.Boolean] = js.undefined,
    rangeHighlights: js.Array[RangeHighlight] = null,
    reversed: js.UndefOr[scala.Boolean] = js.undefined,
    rtl: scala.Boolean | bootstrapDashSliderLib.bootstrapDashSliderLibStrings.auto = null,
    scale: bootstrapDashSliderLib.bootstrapDashSliderLibStrings.linear | bootstrapDashSliderLib.bootstrapDashSliderLibStrings.logarithmic = null,
    selection: java.lang.String = null,
    step: scala.Int | scala.Double = null,
    ticks: js.Array[scala.Double] = null,
    ticks_labels: js.Array[java.lang.String] = null,
    ticks_positions: js.Array[scala.Double] = null,
    ticks_snap_bounds: scala.Int | scala.Double = null,
    ticks_tooltip: js.UndefOr[scala.Boolean] = js.undefined,
    tooltip: java.lang.String = null,
    tooltip_position: bootstrapDashSliderLib.bootstrapDashSliderLibStrings.top | bootstrapDashSliderLib.bootstrapDashSliderLibStrings.bottom | bootstrapDashSliderLib.bootstrapDashSliderLibStrings.left | bootstrapDashSliderLib.bootstrapDashSliderLibStrings.right = null,
    tooltip_split: js.UndefOr[scala.Boolean] = js.undefined,
    value: scala.Double | js.Array[scala.Double] = null
  ): SliderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (id != null) __obj.updateDynamic("id")(id)
    if (labelledby != null) __obj.updateDynamic("labelledby")(labelledby.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(natural_arrow_keys)) __obj.updateDynamic("natural_arrow_keys")(natural_arrow_keys)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range)
    if (rangeHighlights != null) __obj.updateDynamic("rangeHighlights")(rangeHighlights)
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (rtl != null) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (ticks_labels != null) __obj.updateDynamic("ticks_labels")(ticks_labels)
    if (ticks_positions != null) __obj.updateDynamic("ticks_positions")(ticks_positions)
    if (ticks_snap_bounds != null) __obj.updateDynamic("ticks_snap_bounds")(ticks_snap_bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(ticks_tooltip)) __obj.updateDynamic("ticks_tooltip")(ticks_tooltip)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    if (tooltip_position != null) __obj.updateDynamic("tooltip_position")(tooltip_position.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip_split)) __obj.updateDynamic("tooltip_split")(tooltip_split)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderOptions]
  }
}

