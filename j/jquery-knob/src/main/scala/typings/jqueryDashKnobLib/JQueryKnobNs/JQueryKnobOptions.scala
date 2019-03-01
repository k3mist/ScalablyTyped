package typings
package jqueryDashKnobLib.JQueryKnobNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryKnobOptions extends js.Object {
  /**
  		 * arc size in degrees | default=360
  		 */
  var angleArc: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * starting angle in degrees | default=0
  		 */
  var angleOffset: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * background color
  		 */
  var bgColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * triggered on [esc] keydown
  		 */
  var cancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  		 * executed at each change of the value
  		 */
  var change: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
  		 * display mode "cursor", cursor size could be changed passing a
  		 * numeric value to the option, default width is used when passing
  		 * boolean value "true" | default=gauge
  		 */
  var cursor: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
  		 * default=true | false=hide input
  		 */
  var displayInput: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * default=false | true=displays the previous value with transparency
  		 */
  var displayPrevious: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * when drawing the canvas
  		 */
  var draw: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  		 * foreground color
  		 */
  var fgColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * font family
  		 */
  var font: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * font weight
  		 */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * allows to format output (add unit %, ms...)
  		 */
  var format: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
  		 * dial height
  		 */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * input value (number) color
  		 */
  var inputColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * gauge stroke endings | default=butt, round=rounded line endings
  		 */
  var lineCap: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * max value | default=100
  		 */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * min value | default=0
  		 */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * disable input and events | default=false
  		 */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * executed on release
  		 */
  var release: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
  		 * direction of progression | default=clockwise
  		 */
  var rotation: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * step size | default=1
  		 */
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * stop at min & max on keydown/mousewheel | default=true
  		 */
  var stopper: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * gauge thickness
  		 */
  var thickness: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * dial width
  		 */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object JQueryKnobOptions {
  @scala.inline
  def apply(
    angleArc: scala.Int | scala.Double = null,
    angleOffset: scala.Int | scala.Double = null,
    bgColor: java.lang.String = null,
    cancel: js.Function0[scala.Unit] = null,
    change: js.Function1[/* value */ scala.Double, scala.Unit] = null,
    cursor: java.lang.String | scala.Boolean = null,
    displayInput: js.UndefOr[scala.Boolean] = js.undefined,
    displayPrevious: js.UndefOr[scala.Boolean] = js.undefined,
    draw: js.Function0[scala.Unit] = null,
    fgColor: java.lang.String = null,
    font: java.lang.String = null,
    fontWeight: java.lang.String = null,
    format: js.Function1[/* value */ scala.Double, scala.Unit] = null,
    height: scala.Int | scala.Double = null,
    inputColor: java.lang.String = null,
    lineCap: java.lang.String = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    release: js.Function1[/* value */ scala.Double, scala.Unit] = null,
    rotation: java.lang.String = null,
    step: scala.Int | scala.Double = null,
    stopper: js.UndefOr[scala.Boolean] = js.undefined,
    thickness: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): JQueryKnobOptions = {
    val __obj = js.Dynamic.literal()
    if (angleArc != null) __obj.updateDynamic("angleArc")(angleArc.asInstanceOf[js.Any])
    if (angleOffset != null) __obj.updateDynamic("angleOffset")(angleOffset.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (change != null) __obj.updateDynamic("change")(change)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(displayInput)) __obj.updateDynamic("displayInput")(displayInput)
    if (!js.isUndefined(displayPrevious)) __obj.updateDynamic("displayPrevious")(displayPrevious)
    if (draw != null) __obj.updateDynamic("draw")(draw)
    if (fgColor != null) __obj.updateDynamic("fgColor")(fgColor)
    if (font != null) __obj.updateDynamic("font")(font)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (format != null) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (inputColor != null) __obj.updateDynamic("inputColor")(inputColor)
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (release != null) __obj.updateDynamic("release")(release)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(stopper)) __obj.updateDynamic("stopper")(stopper)
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryKnobOptions]
  }
}

