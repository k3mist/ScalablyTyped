package typings
package restifyDashPluginsLib.restifyDashPluginsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrottleOptions extends js.Object {
  var burst: js.UndefOr[scala.Double] = js.undefined
  var ip: js.UndefOr[scala.Boolean] = js.undefined
  var maxKeys: js.UndefOr[scala.Double] = js.undefined
  var overrides: js.UndefOr[js.Any] = js.undefined
  var rate: js.UndefOr[scala.Double] = js.undefined
  var tokensTable: js.UndefOr[js.Any] = js.undefined
  var username: js.UndefOr[scala.Boolean] = js.undefined
  var xff: js.UndefOr[scala.Boolean] = js.undefined
}

object ThrottleOptions {
  @scala.inline
  def apply(
    burst: scala.Int | scala.Double = null,
    ip: js.UndefOr[scala.Boolean] = js.undefined,
    maxKeys: scala.Int | scala.Double = null,
    overrides: js.Any = null,
    rate: scala.Int | scala.Double = null,
    tokensTable: js.Any = null,
    username: js.UndefOr[scala.Boolean] = js.undefined,
    xff: js.UndefOr[scala.Boolean] = js.undefined
  ): ThrottleOptions = {
    val __obj = js.Dynamic.literal()
    if (burst != null) __obj.updateDynamic("burst")(burst.asInstanceOf[js.Any])
    if (!js.isUndefined(ip)) __obj.updateDynamic("ip")(ip)
    if (maxKeys != null) __obj.updateDynamic("maxKeys")(maxKeys.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (rate != null) __obj.updateDynamic("rate")(rate.asInstanceOf[js.Any])
    if (tokensTable != null) __obj.updateDynamic("tokensTable")(tokensTable)
    if (!js.isUndefined(username)) __obj.updateDynamic("username")(username)
    if (!js.isUndefined(xff)) __obj.updateDynamic("xff")(xff)
    __obj.asInstanceOf[ThrottleOptions]
  }
}

