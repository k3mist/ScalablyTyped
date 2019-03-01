package typings
package leafletDotPolylinemeasureLib.leafletMod.ControlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineMeasureOptions extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var clearControlClasses: js.UndefOr[js.Array[_]] = js.undefined
  var clearControlLabel: js.UndefOr[java.lang.String] = js.undefined
  var clearControlTitle: js.UndefOr[java.lang.String] = js.undefined
  var clearMeasurementsOnStop: js.UndefOr[scala.Boolean] = js.undefined
  var currentCircle: js.UndefOr[js.Any] = js.undefined
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var endCircle: js.UndefOr[js.Any] = js.undefined
  var fixedLine: js.UndefOr[js.Any] = js.undefined
  var intermedCircle: js.UndefOr[js.Any] = js.undefined
  var measureControlClasses: js.UndefOr[js.Array[_]] = js.undefined
  var measureControlLabel: js.UndefOr[java.lang.String] = js.undefined
  var measureControlTitleOff: js.UndefOr[java.lang.String] = js.undefined
  var measureControlTitleOn: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var showMeasurementsClearControl: js.UndefOr[scala.Boolean] = js.undefined
  var showUnitControl: js.UndefOr[scala.Boolean] = js.undefined
  var startCircle: js.UndefOr[js.Any] = js.undefined
  var tempLine: js.UndefOr[js.Any] = js.undefined
  var unit: js.UndefOr[java.lang.String] = js.undefined
}

object PolylineMeasureOptions {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String = null,
    clearControlClasses: js.Array[_] = null,
    clearControlLabel: java.lang.String = null,
    clearControlTitle: java.lang.String = null,
    clearMeasurementsOnStop: js.UndefOr[scala.Boolean] = js.undefined,
    currentCircle: js.Any = null,
    cursor: java.lang.String = null,
    endCircle: js.Any = null,
    fixedLine: js.Any = null,
    intermedCircle: js.Any = null,
    measureControlClasses: js.Array[_] = null,
    measureControlLabel: java.lang.String = null,
    measureControlTitleOff: java.lang.String = null,
    measureControlTitleOn: java.lang.String = null,
    position: java.lang.String = null,
    showMeasurementsClearControl: js.UndefOr[scala.Boolean] = js.undefined,
    showUnitControl: js.UndefOr[scala.Boolean] = js.undefined,
    startCircle: js.Any = null,
    tempLine: js.Any = null,
    unit: java.lang.String = null
  ): PolylineMeasureOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (clearControlClasses != null) __obj.updateDynamic("clearControlClasses")(clearControlClasses)
    if (clearControlLabel != null) __obj.updateDynamic("clearControlLabel")(clearControlLabel)
    if (clearControlTitle != null) __obj.updateDynamic("clearControlTitle")(clearControlTitle)
    if (!js.isUndefined(clearMeasurementsOnStop)) __obj.updateDynamic("clearMeasurementsOnStop")(clearMeasurementsOnStop)
    if (currentCircle != null) __obj.updateDynamic("currentCircle")(currentCircle)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (endCircle != null) __obj.updateDynamic("endCircle")(endCircle)
    if (fixedLine != null) __obj.updateDynamic("fixedLine")(fixedLine)
    if (intermedCircle != null) __obj.updateDynamic("intermedCircle")(intermedCircle)
    if (measureControlClasses != null) __obj.updateDynamic("measureControlClasses")(measureControlClasses)
    if (measureControlLabel != null) __obj.updateDynamic("measureControlLabel")(measureControlLabel)
    if (measureControlTitleOff != null) __obj.updateDynamic("measureControlTitleOff")(measureControlTitleOff)
    if (measureControlTitleOn != null) __obj.updateDynamic("measureControlTitleOn")(measureControlTitleOn)
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(showMeasurementsClearControl)) __obj.updateDynamic("showMeasurementsClearControl")(showMeasurementsClearControl)
    if (!js.isUndefined(showUnitControl)) __obj.updateDynamic("showUnitControl")(showUnitControl)
    if (startCircle != null) __obj.updateDynamic("startCircle")(startCircle)
    if (tempLine != null) __obj.updateDynamic("tempLine")(tempLine)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[PolylineMeasureOptions]
  }
}

