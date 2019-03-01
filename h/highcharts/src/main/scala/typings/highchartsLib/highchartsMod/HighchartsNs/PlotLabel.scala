package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Text labels for the plot bands
  */
trait PlotLabel extends js.Object {
  /**
    * Horizontal alignment of the label. Can be one of 'left', 'center' or 'right'.
    * @default 'center'
    * @since 2.1
    */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Rotation of the text label in degrees.
    * @default 0
    * @since 2.1
    */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /**
    * CSS styles for the text label.
    * @since 2.1
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * The string text itself. A subset of HTML is supported.
    * @since 2.1
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text alignment for the label. While align determines where the texts anchor point is placed within the plot
    * band, textAlign determines how the text is aligned against its anchor point. Possible values are 'left', 'center'
    * and 'right'. Defaults to the same as the align option.
    * @since 2.1
    */
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to {@link http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html|use HTML} to render the labels.
    * @default false
    * @since 3.0.3
    */
  var useHTML: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Vertical alignment of the label relative to the plot band. Can be one of 'top', 'middle' or 'bottom'.
    * @default 'top'
    * @since 2.1
    */
  var verticalAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Horizontal position relative the alignment. Default varies by orientation.
    * @since 2.1
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * Vertical position of the text baseline relative to the alignment. Default varies by orientation.
    * @since 2.1
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object PlotLabel {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    rotation: scala.Int | scala.Double = null,
    style: CSSObject = null,
    text: java.lang.String = null,
    textAlign: java.lang.String = null,
    useHTML: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlign: java.lang.String = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): PlotLabel = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (text != null) __obj.updateDynamic("text")(text)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotLabel]
  }
}

