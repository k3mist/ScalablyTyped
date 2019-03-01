package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeTlsChannelIdToProxyScript extends js.Object {
  /**
    * Whether the TLS channel ID will be passed into onMessageExternal for processes that are listening for the
    * connection event.
    * @deprecated Unsupported on Firefox at this time.
    */
  var includeTlsChannelId: js.UndefOr[scala.Boolean] = js.undefined
  /** If true, the message will be directed to the extension's proxy sandbox. */
  var toProxyScript: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IncludeTlsChannelIdToProxyScript {
  @scala.inline
  def apply(
    includeTlsChannelId: js.UndefOr[scala.Boolean] = js.undefined,
    toProxyScript: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_IncludeTlsChannelIdToProxyScript = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeTlsChannelId)) __obj.updateDynamic("includeTlsChannelId")(includeTlsChannelId)
    if (!js.isUndefined(toProxyScript)) __obj.updateDynamic("toProxyScript")(toProxyScript)
    __obj.asInstanceOf[Anon_IncludeTlsChannelIdToProxyScript]
  }
}

