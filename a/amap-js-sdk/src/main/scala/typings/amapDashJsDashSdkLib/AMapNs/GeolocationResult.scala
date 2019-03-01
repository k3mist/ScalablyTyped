package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationResult extends js.Object {
  var accuracy: scala.Double
  var info: java.lang.String
  var isConverted: scala.Boolean
  var position: LngLat
}

object GeolocationResult {
  @scala.inline
  def apply(accuracy: scala.Double, info: java.lang.String, isConverted: scala.Boolean, position: LngLat): GeolocationResult = {
    val __obj = js.Dynamic.literal(accuracy = accuracy, info = info, isConverted = isConverted, position = position)
  
    __obj.asInstanceOf[GeolocationResult]
  }
}

