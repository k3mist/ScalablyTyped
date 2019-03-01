package typings
package googlemapsLib.googleNs.mapsNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapsEngineMouseEvent extends js.Object {
  var featureId: js.UndefOr[java.lang.String] = js.undefined
  var infoWindowHtml: js.UndefOr[java.lang.String] = js.undefined
  var latLng: js.UndefOr[googlemapsLib.googleNs.mapsNs.LatLng] = js.undefined
  var pixelOffset: js.UndefOr[googlemapsLib.googleNs.mapsNs.Size] = js.undefined
}

object MapsEngineMouseEvent {
  @scala.inline
  def apply(
    featureId: java.lang.String = null,
    infoWindowHtml: java.lang.String = null,
    latLng: googlemapsLib.googleNs.mapsNs.LatLng = null,
    pixelOffset: googlemapsLib.googleNs.mapsNs.Size = null
  ): MapsEngineMouseEvent = {
    val __obj = js.Dynamic.literal()
    if (featureId != null) __obj.updateDynamic("featureId")(featureId)
    if (infoWindowHtml != null) __obj.updateDynamic("infoWindowHtml")(infoWindowHtml)
    if (latLng != null) __obj.updateDynamic("latLng")(latLng)
    if (pixelOffset != null) __obj.updateDynamic("pixelOffset")(pixelOffset)
    __obj.asInstanceOf[MapsEngineMouseEvent]
  }
}

