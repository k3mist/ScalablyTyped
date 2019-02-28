package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- leafletLib.leafletMod.WMSOptions because var conflicts: attribution, bounds, className, keepBuffer, maxZoom, minZoom, noWrap, opacity, pane, tileSize, updateInterval, updateWhenIdle, updateWhenZooming, zIndex. Inlined crs, format, layers, styles, transparent, uppercase, version */ trait WMSTileLayerProps
  extends GridLayerProps
     with TileLayerEvents {
  var crs: js.UndefOr[leafletLib.leafletMod.CRS] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var layers: js.UndefOr[java.lang.String] = js.undefined
  var styles: js.UndefOr[java.lang.String] = js.undefined
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
  var uppercase: js.UndefOr[scala.Boolean] = js.undefined
  var url: java.lang.String
  var version: js.UndefOr[java.lang.String] = js.undefined
}

