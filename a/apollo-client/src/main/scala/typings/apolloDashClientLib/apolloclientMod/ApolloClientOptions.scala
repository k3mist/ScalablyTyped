package typings
package apolloDashClientLib.apolloclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloClientOptions[TCacheShape] extends js.Object {
  var cache: apolloDashCacheLib.apolloDashCacheMod.ApolloCache[TCacheShape]
  var connectToDevTools: js.UndefOr[scala.Boolean] = js.undefined
  var defaultOptions: js.UndefOr[DefaultOptions] = js.undefined
  var link: apolloDashLinkLib.apolloDashLinkMod.ApolloLink
  var name: js.UndefOr[java.lang.String] = js.undefined
  var queryDeduplication: js.UndefOr[scala.Boolean] = js.undefined
  var ssrForceFetchDelay: js.UndefOr[scala.Double] = js.undefined
  var ssrMode: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ApolloClientOptions {
  @scala.inline
  def apply[TCacheShape](
    cache: apolloDashCacheLib.apolloDashCacheMod.ApolloCache[TCacheShape],
    link: apolloDashLinkLib.apolloDashLinkMod.ApolloLink,
    connectToDevTools: js.UndefOr[scala.Boolean] = js.undefined,
    defaultOptions: DefaultOptions = null,
    name: java.lang.String = null,
    queryDeduplication: js.UndefOr[scala.Boolean] = js.undefined,
    ssrForceFetchDelay: scala.Int | scala.Double = null,
    ssrMode: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null
  ): ApolloClientOptions[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache, link = link)
    if (!js.isUndefined(connectToDevTools)) __obj.updateDynamic("connectToDevTools")(connectToDevTools)
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(queryDeduplication)) __obj.updateDynamic("queryDeduplication")(queryDeduplication)
    if (ssrForceFetchDelay != null) __obj.updateDynamic("ssrForceFetchDelay")(ssrForceFetchDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(ssrMode)) __obj.updateDynamic("ssrMode")(ssrMode)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ApolloClientOptions[TCacheShape]]
  }
}

