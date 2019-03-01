package typings
package nodeDashSsdpLib.nodeDashSsdpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends ClientOptions {
  /**
  	 * Interval at which to send out advertisement (ms)
  	 * @default 10000
  	 */
  var adInterval: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Allow wildcards in M-SEARCH packets (non-standard)
  	 * @default false
  	 */
  var allowWildcards: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * URL pointing to description of your service, or a function that returns that URL.
  	 * For cases where there are multiple network interfaces or the IP of the host isn't known in advance,
  	 * it's possible to specify location as an object. Host will be set to the IP of the responding interface.
  	 */
  var location: js.UndefOr[java.lang.String | ServiceDescriptionLocation] = js.undefined
  /**
  	 * When true the SSDP server will not advertise the root device (i.e. the bare UDN). In some scenarios, this advertisement is not needed.
  	 * @default false
  	 */
  var suppressRootDeviceAdvertisements: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Packet TTL
  	 * @default 1800
  	 */
  var ttl: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * SSDP Unique Device Name
  	 * @default 'uuid:f40c2981-7329-40b7-8b04-27f187aecfb5'
  	 */
  var udn: js.UndefOr[java.lang.String] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    adInterval: scala.Int | scala.Double = null,
    allowWildcards: js.UndefOr[scala.Boolean] = js.undefined,
    customLogger: js.Function2[/* format */ java.lang.String, /* repeated */ js.Any, scala.Unit] = null,
    description: java.lang.String = null,
    explicitSocketBind: js.UndefOr[scala.Boolean] = js.undefined,
    headers: SsdpHeaders = null,
    interfaces: js.Array[java.lang.String] = null,
    location: java.lang.String | ServiceDescriptionLocation = null,
    reuseAddr: js.UndefOr[scala.Boolean] = js.undefined,
    ssdpIp: java.lang.String = null,
    ssdpPort: scala.Int | scala.Double = null,
    ssdpSig: java.lang.String = null,
    ssdpTtl: scala.Int | scala.Double = null,
    suppressRootDeviceAdvertisements: js.UndefOr[scala.Boolean] = js.undefined,
    ttl: scala.Int | scala.Double = null,
    udn: java.lang.String = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (adInterval != null) __obj.updateDynamic("adInterval")(adInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(allowWildcards)) __obj.updateDynamic("allowWildcards")(allowWildcards)
    if (customLogger != null) __obj.updateDynamic("customLogger")(customLogger)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(explicitSocketBind)) __obj.updateDynamic("explicitSocketBind")(explicitSocketBind)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (interfaces != null) __obj.updateDynamic("interfaces")(interfaces)
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (!js.isUndefined(reuseAddr)) __obj.updateDynamic("reuseAddr")(reuseAddr)
    if (ssdpIp != null) __obj.updateDynamic("ssdpIp")(ssdpIp)
    if (ssdpPort != null) __obj.updateDynamic("ssdpPort")(ssdpPort.asInstanceOf[js.Any])
    if (ssdpSig != null) __obj.updateDynamic("ssdpSig")(ssdpSig)
    if (ssdpTtl != null) __obj.updateDynamic("ssdpTtl")(ssdpTtl.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressRootDeviceAdvertisements)) __obj.updateDynamic("suppressRootDeviceAdvertisements")(suppressRootDeviceAdvertisements)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (udn != null) __obj.updateDynamic("udn")(udn)
    __obj.asInstanceOf[ServerOptions]
  }
}

