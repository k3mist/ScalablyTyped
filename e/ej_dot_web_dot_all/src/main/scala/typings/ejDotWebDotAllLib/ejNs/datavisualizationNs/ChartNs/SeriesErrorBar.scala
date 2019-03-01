package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesErrorBar extends js.Object {
  /** Options for customizing the error bar cap.
    */
  var cap: js.UndefOr[SeriesErrorBarCap] = js.undefined
  /** Specifies the direction of error bar.
    * @Default {both}
    */
  var direction: js.UndefOr[ErrorBarDirection | java.lang.String] = js.undefined
  /** Fill color of the error bar.
    * @Default {#000000}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Value of horizontal  error bar.
    * @Default {1}
    */
  var horizontalErrorValue: js.UndefOr[scala.Double] = js.undefined
  /** Value of negative horizontal error bar.
    * @Default {1}
    */
  var horizontalNegativeErrorValue: js.UndefOr[scala.Double] = js.undefined
  /** Value of positive horizontal error bar.
    * @Default {1}
    */
  var horizontalPositiveErrorValue: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the mode of error bar.
    * @Default {vertical}
    */
  var mode: js.UndefOr[ErrorBarMode | java.lang.String] = js.undefined
  /** Specifies the type of error bar.
    * @Default {FixedValue}
    */
  var `type`: js.UndefOr[ErrorBarType | java.lang.String] = js.undefined
  /** Value of vertical error bar.
    * @Default {3}
    */
  var verticalErrorValue: js.UndefOr[scala.Double] = js.undefined
  /** Value of negative vertical error bar.
    * @Default {5}
    */
  var verticalNegativeErrorValue: js.UndefOr[scala.Double] = js.undefined
  /** Value of positive vertical error bar.
    * @Default {5}
    */
  var verticalPositiveErrorValue: js.UndefOr[scala.Double] = js.undefined
  /** Show/hides the error bar
    * @Default {visible}
    */
  var visibility: js.UndefOr[scala.Boolean] = js.undefined
  /** Width of the error bar.
    * @Default {1}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object SeriesErrorBar {
  @scala.inline
  def apply(
    cap: SeriesErrorBarCap = null,
    direction: ErrorBarDirection | java.lang.String = null,
    fill: java.lang.String = null,
    horizontalErrorValue: scala.Int | scala.Double = null,
    horizontalNegativeErrorValue: scala.Int | scala.Double = null,
    horizontalPositiveErrorValue: scala.Int | scala.Double = null,
    mode: ErrorBarMode | java.lang.String = null,
    `type`: ErrorBarType | java.lang.String = null,
    verticalErrorValue: scala.Int | scala.Double = null,
    verticalNegativeErrorValue: scala.Int | scala.Double = null,
    verticalPositiveErrorValue: scala.Int | scala.Double = null,
    visibility: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): SeriesErrorBar = {
    val __obj = js.Dynamic.literal()
    if (cap != null) __obj.updateDynamic("cap")(cap)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (horizontalErrorValue != null) __obj.updateDynamic("horizontalErrorValue")(horizontalErrorValue.asInstanceOf[js.Any])
    if (horizontalNegativeErrorValue != null) __obj.updateDynamic("horizontalNegativeErrorValue")(horizontalNegativeErrorValue.asInstanceOf[js.Any])
    if (horizontalPositiveErrorValue != null) __obj.updateDynamic("horizontalPositiveErrorValue")(horizontalPositiveErrorValue.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verticalErrorValue != null) __obj.updateDynamic("verticalErrorValue")(verticalErrorValue.asInstanceOf[js.Any])
    if (verticalNegativeErrorValue != null) __obj.updateDynamic("verticalNegativeErrorValue")(verticalNegativeErrorValue.asInstanceOf[js.Any])
    if (verticalPositiveErrorValue != null) __obj.updateDynamic("verticalPositiveErrorValue")(verticalPositiveErrorValue.asInstanceOf[js.Any])
    if (!js.isUndefined(visibility)) __obj.updateDynamic("visibility")(visibility)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesErrorBar]
  }
}

