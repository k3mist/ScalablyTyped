package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClustererOptions extends js.Object {
  var gridSize: js.UndefOr[scala.Double] = js.undefined
  var groupByCoordinates: js.UndefOr[scala.Boolean] = js.undefined
  var hasBalloon: js.UndefOr[scala.Boolean] = js.undefined
  var hasHint: js.UndefOr[scala.Boolean] = js.undefined
  var margin: js.UndefOr[js.Array[js.Array[scala.Double]] | js.Array[scala.Double] | scala.Double] = js.undefined
  var maxZoom: js.UndefOr[js.Array[scala.Double] | scala.Double] = js.undefined
  var minClusterSize: js.UndefOr[scala.Double] = js.undefined
  var preset: js.UndefOr[PresetKey] = js.undefined
  var showInAlphabeticalOrder: js.UndefOr[scala.Boolean] = js.undefined
  var useMapMargin: js.UndefOr[scala.Boolean] = js.undefined
  var viewportMargin: js.UndefOr[js.Array[js.Array[scala.Double]] | js.Array[scala.Double] | scala.Double] = js.undefined
  var zoomMargin: js.UndefOr[js.Array[js.Array[scala.Double]] | js.Array[scala.Double] | scala.Double] = js.undefined
}

object IClustererOptions {
  @scala.inline
  def apply(
    gridSize: scala.Int | scala.Double = null,
    groupByCoordinates: js.UndefOr[scala.Boolean] = js.undefined,
    hasBalloon: js.UndefOr[scala.Boolean] = js.undefined,
    hasHint: js.UndefOr[scala.Boolean] = js.undefined,
    margin: js.Array[js.Array[scala.Double]] | js.Array[scala.Double] | scala.Double = null,
    maxZoom: js.Array[scala.Double] | scala.Double = null,
    minClusterSize: scala.Int | scala.Double = null,
    preset: PresetKey = null,
    showInAlphabeticalOrder: js.UndefOr[scala.Boolean] = js.undefined,
    useMapMargin: js.UndefOr[scala.Boolean] = js.undefined,
    viewportMargin: js.Array[js.Array[scala.Double]] | js.Array[scala.Double] | scala.Double = null,
    zoomMargin: js.Array[js.Array[scala.Double]] | js.Array[scala.Double] | scala.Double = null
  ): IClustererOptions = {
    val __obj = js.Dynamic.literal()
    if (gridSize != null) __obj.updateDynamic("gridSize")(gridSize.asInstanceOf[js.Any])
    if (!js.isUndefined(groupByCoordinates)) __obj.updateDynamic("groupByCoordinates")(groupByCoordinates)
    if (!js.isUndefined(hasBalloon)) __obj.updateDynamic("hasBalloon")(hasBalloon)
    if (!js.isUndefined(hasHint)) __obj.updateDynamic("hasHint")(hasHint)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (minClusterSize != null) __obj.updateDynamic("minClusterSize")(minClusterSize.asInstanceOf[js.Any])
    if (preset != null) __obj.updateDynamic("preset")(preset)
    if (!js.isUndefined(showInAlphabeticalOrder)) __obj.updateDynamic("showInAlphabeticalOrder")(showInAlphabeticalOrder)
    if (!js.isUndefined(useMapMargin)) __obj.updateDynamic("useMapMargin")(useMapMargin)
    if (viewportMargin != null) __obj.updateDynamic("viewportMargin")(viewportMargin.asInstanceOf[js.Any])
    if (zoomMargin != null) __obj.updateDynamic("zoomMargin")(zoomMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClustererOptions]
  }
}

