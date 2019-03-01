package typings
package osmtogeojsonLib.osmtogeojsonMod.GeoJSONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryCollection extends GeoJSONObject {
  var geometries: js.Array[Geometry]
}

object GeometryCollection {
  @scala.inline
  def apply(geometries: js.Array[Geometry], `type`: java.lang.String): GeometryCollection = {
    val __obj = js.Dynamic.literal(geometries = geometries, `type` = `type`)
  
    __obj.asInstanceOf[GeometryCollection]
  }
}

