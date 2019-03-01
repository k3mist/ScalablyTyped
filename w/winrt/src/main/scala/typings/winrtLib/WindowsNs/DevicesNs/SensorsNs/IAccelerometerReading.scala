package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccelerometerReading extends js.Object {
  var accelerationX: scala.Double
  var accelerationY: scala.Double
  var accelerationZ: scala.Double
  var timestamp: stdLib.Date
}

object IAccelerometerReading {
  @scala.inline
  def apply(
    accelerationX: scala.Double,
    accelerationY: scala.Double,
    accelerationZ: scala.Double,
    timestamp: stdLib.Date
  ): IAccelerometerReading = {
    val __obj = js.Dynamic.literal(accelerationX = accelerationX, accelerationY = accelerationY, accelerationZ = accelerationZ, timestamp = timestamp)
  
    __obj.asInstanceOf[IAccelerometerReading]
  }
}

