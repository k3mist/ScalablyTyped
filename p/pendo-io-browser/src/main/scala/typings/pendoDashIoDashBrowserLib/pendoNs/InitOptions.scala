package typings
package pendoDashIoDashBrowserLib.pendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends Identity {
  var apiKey: js.UndefOr[java.lang.String] = js.undefined
  var disablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  var events: js.UndefOr[EventCallbacks] = js.undefined
  var excludeAllText: js.UndefOr[scala.Boolean] = js.undefined
  var excludeTitle: js.UndefOr[scala.Boolean] = js.undefined
  var guides: js.UndefOr[pendoDashIoDashBrowserLib.Anon_Delay] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    visitor: Visitor,
    account: Account = null,
    apiKey: java.lang.String = null,
    disablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    events: EventCallbacks = null,
    excludeAllText: js.UndefOr[scala.Boolean] = js.undefined,
    excludeTitle: js.UndefOr[scala.Boolean] = js.undefined,
    guides: pendoDashIoDashBrowserLib.Anon_Delay = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal(visitor = visitor)
    if (account != null) __obj.updateDynamic("account")(account)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (!js.isUndefined(disablePersistence)) __obj.updateDynamic("disablePersistence")(disablePersistence)
    if (events != null) __obj.updateDynamic("events")(events)
    if (!js.isUndefined(excludeAllText)) __obj.updateDynamic("excludeAllText")(excludeAllText)
    if (!js.isUndefined(excludeTitle)) __obj.updateDynamic("excludeTitle")(excludeTitle)
    if (guides != null) __obj.updateDynamic("guides")(guides)
    __obj.asInstanceOf[InitOptions]
  }
}

