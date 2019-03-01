package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitOptions extends js.Object {
  var arrivalTime: js.UndefOr[stdLib.Date] = js.undefined
  var departureTime: js.UndefOr[stdLib.Date] = js.undefined
  var modes: js.UndefOr[js.Array[TransitMode]] = js.undefined
  var routingPreference: js.UndefOr[TransitRoutePreference] = js.undefined
}

object TransitOptions {
  @scala.inline
  def apply(
    arrivalTime: stdLib.Date = null,
    departureTime: stdLib.Date = null,
    modes: js.Array[TransitMode] = null,
    routingPreference: TransitRoutePreference = null
  ): TransitOptions = {
    val __obj = js.Dynamic.literal()
    if (arrivalTime != null) __obj.updateDynamic("arrivalTime")(arrivalTime)
    if (departureTime != null) __obj.updateDynamic("departureTime")(departureTime)
    if (modes != null) __obj.updateDynamic("modes")(modes)
    if (routingPreference != null) __obj.updateDynamic("routingPreference")(routingPreference)
    __obj.asInstanceOf[TransitOptions]
  }
}

