package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationRequest extends js.Object {
  /** The carrier name. */
  var carrier: js.UndefOr[java.lang.String] = js.undefined
  /** An array of cell tower objects. */
  var cellTowers: js.UndefOr[js.Array[CellTower]] = js.undefined
  /**
    * Specifies whether to fall back to IP geolocation if wifi and cell tower signals are not available.
    * Defaults to `true`. Set `considerIp` to `false` to disable fall back.
    */
  var considerIp: js.UndefOr[scala.Boolean] = js.undefined
  /** The mobile country code (MCC) for the device's home network. */
  var homeMobileCountryCode: js.UndefOr[scala.Double] = js.undefined
  /** The mobile network code (MNC) for the device's home network. */
  var homeMobileNetworkCode: js.UndefOr[scala.Double] = js.undefined
  /** The mobile radio type. While this field is optional, it should be included if a value is available, for more accurate results. */
  var radioType: js.UndefOr[RadioType] = js.undefined
  /** An array of WiFi access point objects. */
  var wifiAccessPoints: js.UndefOr[js.Array[WifiAccessPoint]] = js.undefined
}

object GeolocationRequest {
  @scala.inline
  def apply(
    carrier: java.lang.String = null,
    cellTowers: js.Array[CellTower] = null,
    considerIp: js.UndefOr[scala.Boolean] = js.undefined,
    homeMobileCountryCode: scala.Int | scala.Double = null,
    homeMobileNetworkCode: scala.Int | scala.Double = null,
    radioType: RadioType = null,
    wifiAccessPoints: js.Array[WifiAccessPoint] = null
  ): GeolocationRequest = {
    val __obj = js.Dynamic.literal()
    if (carrier != null) __obj.updateDynamic("carrier")(carrier)
    if (cellTowers != null) __obj.updateDynamic("cellTowers")(cellTowers)
    if (!js.isUndefined(considerIp)) __obj.updateDynamic("considerIp")(considerIp)
    if (homeMobileCountryCode != null) __obj.updateDynamic("homeMobileCountryCode")(homeMobileCountryCode.asInstanceOf[js.Any])
    if (homeMobileNetworkCode != null) __obj.updateDynamic("homeMobileNetworkCode")(homeMobileNetworkCode.asInstanceOf[js.Any])
    if (radioType != null) __obj.updateDynamic("radioType")(radioType)
    if (wifiAccessPoints != null) __obj.updateDynamic("wifiAccessPoints")(wifiAccessPoints)
    __obj.asInstanceOf[GeolocationRequest]
  }
}

