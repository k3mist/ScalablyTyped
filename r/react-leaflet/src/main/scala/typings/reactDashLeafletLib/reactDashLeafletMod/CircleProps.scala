package typings
package reactDashLeafletLib.reactDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashLeafletLib.reactDashLeafletMod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ trait CircleProps
  extends leafletLib.leafletMod.CircleMarkerOptions
     with PathEvents {
  var center: leafletLib.leafletMod.LatLngExpression
  var children: js.UndefOr[Children] = js.undefined
  @JSName("radius")
  var radius_CircleProps: scala.Double
}

