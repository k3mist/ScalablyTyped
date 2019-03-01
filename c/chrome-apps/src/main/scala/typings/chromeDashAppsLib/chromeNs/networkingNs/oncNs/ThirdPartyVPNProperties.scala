package typings
package chromeDashAppsLib.chromeNs.networkingNs.oncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThirdPartyVPNProperties extends js.Object {
  /** ID of the third-party VPN provider extension. */
  var ExtensionID: java.lang.String
  /** The VPN provider name. */
  var ProviderName: js.UndefOr[java.lang.String] = js.undefined
}

object ThirdPartyVPNProperties {
  @scala.inline
  def apply(ExtensionID: java.lang.String, ProviderName: java.lang.String = null): ThirdPartyVPNProperties = {
    val __obj = js.Dynamic.literal(ExtensionID = ExtensionID)
    if (ProviderName != null) __obj.updateDynamic("ProviderName")(ProviderName)
    __obj.asInstanceOf[ThirdPartyVPNProperties]
  }
}

