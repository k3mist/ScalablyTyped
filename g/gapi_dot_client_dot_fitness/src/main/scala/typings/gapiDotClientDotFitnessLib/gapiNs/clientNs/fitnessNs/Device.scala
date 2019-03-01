package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /** Manufacturer of the product/hardware. */
  var manufacturer: js.UndefOr[java.lang.String] = js.undefined
  /** End-user visible model name for the device. */
  var model: js.UndefOr[java.lang.String] = js.undefined
  /** A constant representing the type of the device. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The serial number or other unique ID for the hardware. This field is obfuscated when read by any REST or Android client that did not create the data
    * source. Only the data source creator will see the uid field in clear and normal form.
    */
  var uid: js.UndefOr[java.lang.String] = js.undefined
  /** Version string for the device hardware/software. */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Device {
  @scala.inline
  def apply(
    manufacturer: java.lang.String = null,
    model: java.lang.String = null,
    `type`: java.lang.String = null,
    uid: java.lang.String = null,
    version: java.lang.String = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uid != null) __obj.updateDynamic("uid")(uid)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Device]
  }
}

