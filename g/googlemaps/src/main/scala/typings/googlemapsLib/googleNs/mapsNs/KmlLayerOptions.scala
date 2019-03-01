package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmlLayerOptions extends js.Object {
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  var map: js.UndefOr[Map] = js.undefined
  var preserveViewport: js.UndefOr[scala.Boolean] = js.undefined
  var screenOverlays: js.UndefOr[scala.Boolean] = js.undefined
  var suppressInfoWindows: js.UndefOr[scala.Boolean] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object KmlLayerOptions {
  @scala.inline
  def apply(
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    map: Map = null,
    preserveViewport: js.UndefOr[scala.Boolean] = js.undefined,
    screenOverlays: js.UndefOr[scala.Boolean] = js.undefined,
    suppressInfoWindows: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null,
    zIndex: scala.Int | scala.Double = null
  ): KmlLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (map != null) __obj.updateDynamic("map")(map)
    if (!js.isUndefined(preserveViewport)) __obj.updateDynamic("preserveViewport")(preserveViewport)
    if (!js.isUndefined(screenOverlays)) __obj.updateDynamic("screenOverlays")(screenOverlays)
    if (!js.isUndefined(suppressInfoWindows)) __obj.updateDynamic("suppressInfoWindows")(suppressInfoWindows)
    if (url != null) __obj.updateDynamic("url")(url)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[KmlLayerOptions]
  }
}

