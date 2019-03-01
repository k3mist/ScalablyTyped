package typings
package smartDashFoxDashServerLib.SFS2XNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconfigObj extends js.Object {
  /** @type {boolean} Indicates whether the client-server messages console debug should be enabled or not. */
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  /** @type {string} The IP address or host name of the SmartFoxServer 2X instance to connect to. */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** @type {number} The TCP port of the SmartFoxServer 2X instance to connect to. */
  var port: js.UndefOr[scala.Double] = js.undefined
  /** @type {boolean} Use an encrypted SSL connection. */
  var useSSL: js.UndefOr[scala.Boolean] = js.undefined
  /** @type {string} The Zone of the SmartFoxServer 2X instance to join during the login process. */
  var zone: js.UndefOr[java.lang.String] = js.undefined
}

object IconfigObj {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    useSSL: js.UndefOr[scala.Boolean] = js.undefined,
    zone: java.lang.String = null
  ): IconfigObj = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(useSSL)) __obj.updateDynamic("useSSL")(useSSL)
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[IconfigObj]
  }
}

