package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FusionTablesStyle extends js.Object {
  var markerOptions: js.UndefOr[FusionTablesMarkerOptions] = js.undefined
  var polygonOptions: js.UndefOr[FusionTablesPolygonOptions] = js.undefined
  var polylineOptions: js.UndefOr[FusionTablesPolylineOptions] = js.undefined
  var where: js.UndefOr[java.lang.String] = js.undefined
}

object FusionTablesStyle {
  @scala.inline
  def apply(
    markerOptions: FusionTablesMarkerOptions = null,
    polygonOptions: FusionTablesPolygonOptions = null,
    polylineOptions: FusionTablesPolylineOptions = null,
    where: java.lang.String = null
  ): FusionTablesStyle = {
    val __obj = js.Dynamic.literal()
    if (markerOptions != null) __obj.updateDynamic("markerOptions")(markerOptions)
    if (polygonOptions != null) __obj.updateDynamic("polygonOptions")(polygonOptions)
    if (polylineOptions != null) __obj.updateDynamic("polylineOptions")(polylineOptions)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[FusionTablesStyle]
  }
}

