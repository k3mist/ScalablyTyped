package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeedLimit extends js.Object {
  /** A unique identifier for a place. All place IDs returned by the Roads API will correspond to road segments. */
  var placeId: java.lang.String
  /** The speed limit for that road segment. */
  var speedLimit: scala.Double
  /** Returns either `KPH` or `MPH`. */
  var units: SpeedLimitUnit
}

object SpeedLimit {
  @scala.inline
  def apply(placeId: java.lang.String, speedLimit: scala.Double, units: SpeedLimitUnit): SpeedLimit = {
    val __obj = js.Dynamic.literal(placeId = placeId, speedLimit = speedLimit, units = units)
  
    __obj.asInstanceOf[SpeedLimit]
  }
}

