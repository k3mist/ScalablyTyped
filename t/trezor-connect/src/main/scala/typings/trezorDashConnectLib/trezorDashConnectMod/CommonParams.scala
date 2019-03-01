package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonParams extends js.Object {
  var allowSeedlessDevice: js.UndefOr[scala.Boolean] = js.undefined
  var device: js.UndefOr[trezorDashConnectLib.Anon_Instance] = js.undefined
  var keepSession: js.UndefOr[scala.Boolean] = js.undefined
  var useEmptyPassphrase: js.UndefOr[scala.Boolean] = js.undefined
}

object CommonParams {
  @scala.inline
  def apply(
    allowSeedlessDevice: js.UndefOr[scala.Boolean] = js.undefined,
    device: trezorDashConnectLib.Anon_Instance = null,
    keepSession: js.UndefOr[scala.Boolean] = js.undefined,
    useEmptyPassphrase: js.UndefOr[scala.Boolean] = js.undefined
  ): CommonParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice)
    if (device != null) __obj.updateDynamic("device")(device)
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession)
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase)
    __obj.asInstanceOf[CommonParams]
  }
}

