package typings
package gapiDotClientDotCloudiotLib.gapiNs.clientNs.cloudiotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceState extends js.Object {
  /** The device state data. */
  var binaryData: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] The time at which this state version was updated in Cloud
    * IoT Core.
    */
  var updateTime: js.UndefOr[java.lang.String] = js.undefined
}

object DeviceState {
  @scala.inline
  def apply(binaryData: java.lang.String = null, updateTime: java.lang.String = null): DeviceState = {
    val __obj = js.Dynamic.literal()
    if (binaryData != null) __obj.updateDynamic("binaryData")(binaryData)
    if (updateTime != null) __obj.updateDynamic("updateTime")(updateTime)
    __obj.asInstanceOf[DeviceState]
  }
}

