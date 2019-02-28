package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapSourceDataEvent
  extends MapboxEvent[js.UndefOr[scala.Nothing]]
     with MapDataEvent {
  var coord: Coordinate
  var dataType: mapboxDashGlLib.mapboxDashGlLibStrings.source
  var isSourceLoaded: scala.Boolean
  var source: Source
  var sourceDataType: mapboxDashGlLib.mapboxDashGlLibStrings.metadata | mapboxDashGlLib.mapboxDashGlLibStrings.content
  var sourceId: java.lang.String
  var tile: js.Any
}

