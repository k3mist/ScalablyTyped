package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- leafletLib.leafletMod.TileLayerOptions because var conflicts: attribution, bounds, className, keepBuffer, maxZoom, minZoom, noWrap, opacity, pane, tileSize, updateInterval, updateWhenIdle, updateWhenZooming, zIndex. Inlined crossOrigin, detectRetina, errorTileUrl, maxNativeZoom, minNativeZoom, subdomains, tms, zoomOffset, zoomReverse */ trait TileLayerProps
  extends GridLayerProps
     with TileLayerEvents {
  var crossOrigin: js.UndefOr[leafletLib.leafletMod.CrossOrigin] = js.undefined
  var detectRetina: js.UndefOr[scala.Boolean] = js.undefined
  var errorTileUrl: js.UndefOr[java.lang.String] = js.undefined
  var maxNativeZoom: js.UndefOr[scala.Double] = js.undefined
  var minNativeZoom: js.UndefOr[scala.Double] = js.undefined
  var subdomains: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var tms: js.UndefOr[scala.Boolean] = js.undefined
  var url: java.lang.String
  var zoomOffset: js.UndefOr[scala.Double] = js.undefined
  var zoomReverse: js.UndefOr[scala.Boolean] = js.undefined
}

