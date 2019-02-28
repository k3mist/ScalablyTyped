package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPoint
  extends GeoJsonObject
     with Geometry {
  var coordinates: js.Array[Position]
  @JSName("type")
  var type_MultiPoint: geojsonLib.geojsonLibStrings.MultiPoint
}

