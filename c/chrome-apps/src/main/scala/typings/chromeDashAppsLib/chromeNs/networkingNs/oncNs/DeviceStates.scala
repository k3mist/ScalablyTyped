package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of devices and their state. */
trait DeviceStates extends js.Object {
  /** The SIM lock status if Type = Cellular and SIMPresent = True. */
  var SIMLockStatus: js.UndefOr[SIMLockStatus] = js.undefined
  /** Set to the SIM present state if the device type is Cellular. */
  var SIMPresent: js.UndefOr[scala.Boolean] = js.undefined
  /** Set if the device is enabled. True if the device is currently scanning. */
  var Scanning: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The current state of the device.
    *
    * **Uninitialized**
    *  - Device is available but not initialized.
    * **Disabled**
    *  - Device is initialized but not enabled.
    * **Enabling**
    *  - Enabled state has been requested but has not completed.
    * **Enabled**
    *  - Device is enabled.
    * **Prohibited**
    *  - Device is prohibited.
    */
  var State: DeviceState
  /** The network type associated with the device (Cellular, Ethernet, WiFi, or WiMAX). */
  var Type: NetworkType
}

object DeviceStates {
  @scala.inline
  def apply(
    State: DeviceState,
    Type: NetworkType,
    SIMLockStatus: SIMLockStatus = null,
    SIMPresent: js.UndefOr[scala.Boolean] = js.undefined,
    Scanning: js.UndefOr[scala.Boolean] = js.undefined
  ): DeviceStates = {
    val __obj = js.Dynamic.literal(State = State, Type = Type)
    if (SIMLockStatus != null) __obj.updateDynamic("SIMLockStatus")(SIMLockStatus)
    if (!js.isUndefined(SIMPresent)) __obj.updateDynamic("SIMPresent")(SIMPresent)
    if (!js.isUndefined(Scanning)) __obj.updateDynamic("Scanning")(Scanning)
    __obj.asInstanceOf[DeviceStates]
  }
}

