package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point
  extends GeoJsonObject
     with Geometry {
  var coordinates: Position
  @JSName("type")
  var type_Point: geojsonLib.geojsonLibStrings.Point
}

