package typings
package googlemapsLib.googleNs.mapsNs.placesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpeningPeriod extends js.Object {
  var close: js.UndefOr[OpeningHoursTime] = js.undefined
  var open: OpeningHoursTime
}

object OpeningPeriod {
  @scala.inline
  def apply(open: OpeningHoursTime, close: OpeningHoursTime = null): OpeningPeriod = {
    val __obj = js.Dynamic.literal(open = open)
    if (close != null) __obj.updateDynamic("close")(close)
    __obj.asInstanceOf[OpeningPeriod]
  }
}

