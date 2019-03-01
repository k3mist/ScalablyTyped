package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object describing filters to apply to webRequest events. */
trait RequestFilter extends js.Object {
  /** Optional. */
  var tabId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /**
    * A list of request types. Requests that cannot match any of the types will be filtered out.
    */
  var types: js.UndefOr[js.Array[chromeDashAppsLib.chromeNs.webRequestNs.ResourceType]] = js.undefined
  /** A list of URLs or URL patterns. Requests that cannot match any of the URLs will be filtered out. */
  var urls: js.Array[java.lang.String]
  /** Optional. */
  var windowId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

object RequestFilter {
  @scala.inline
  def apply(
    urls: js.Array[java.lang.String],
    tabId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined,
    types: js.Array[chromeDashAppsLib.chromeNs.webRequestNs.ResourceType] = null,
    windowId: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  ): RequestFilter = {
    val __obj = js.Dynamic.literal(urls = urls)
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId)
    if (types != null) __obj.updateDynamic("types")(types)
    if (!js.isUndefined(windowId)) __obj.updateDynamic("windowId")(windowId)
    __obj.asInstanceOf[RequestFilter]
  }
}

