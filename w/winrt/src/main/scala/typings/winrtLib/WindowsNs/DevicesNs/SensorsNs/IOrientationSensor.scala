package typings
package winrtLib.WindowsNs.DevicesNs.SensorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrientationSensor extends js.Object {
  var minimumReportInterval: scala.Double
  var onreadingchanged: js.Any
  var reportInterval: scala.Double
  def getCurrentReading(): OrientationSensorReading
}

object IOrientationSensor {
  @scala.inline
  def apply(
    getCurrentReading: js.Function0[OrientationSensorReading],
    minimumReportInterval: scala.Double,
    onreadingchanged: js.Any,
    reportInterval: scala.Double
  ): IOrientationSensor = {
    val __obj = js.Dynamic.literal(getCurrentReading = getCurrentReading, minimumReportInterval = minimumReportInterval, onreadingchanged = onreadingchanged, reportInterval = reportInterval)
  
    __obj.asInstanceOf[IOrientationSensor]
  }
}

