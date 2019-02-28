package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- leafletLib.leafletMod.PolylineOptions because var conflicts: attribution, bubblingMouseEvents, className, color, dashArray, dashOffset, fill, fillColor, fillOpacity, fillRule, interactive, lineCap, lineJoin, opacity, pane, renderer, stroke, weight. Inlined noClip, smoothFactor */ trait PolygonProps extends PathProps {
  var noClip: js.UndefOr[scala.Boolean] = js.undefined
  var positions: js.Array[leafletLib.leafletMod.LatLngExpression] | js.Array[js.Array[leafletLib.leafletMod.LatLngExpression]] | js.Array[js.Array[js.Array[leafletLib.leafletMod.LatLngExpression]]]
  var smoothFactor: js.UndefOr[scala.Double] = js.undefined
}

