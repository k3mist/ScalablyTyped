package typings
package chromeLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageSender extends js.Object {
  /**
    * The frame that opened the connection. 0 for top-level frames, positive for child frames. This will only be set when tab is set.
    * @since Chrome 41.
    */
  var frameId: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the extension or app that opened the connection, if any. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The tabs.Tab which opened the connection, if any. This property will only be present when the connection was opened from a tab (including content scripts), and only if the receiver is an extension, not an app. */
  var tab: js.UndefOr[chromeLib.chromeNs.tabsNs.Tab] = js.undefined
  /**
    * The TLS channel ID of the page or frame that opened the connection, if requested by the extension or app, and if available.
    * @since Chrome 32.
    */
  var tlsChannelId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL of the page or frame that opened the connection. If the sender is in an iframe, it will be iframe's URL not the URL of the page which hosts it.
    * @since Chrome 28.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object MessageSender {
  @scala.inline
  def apply(
    frameId: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    tab: chromeLib.chromeNs.tabsNs.Tab = null,
    tlsChannelId: java.lang.String = null,
    url: java.lang.String = null
  ): MessageSender = {
    val __obj = js.Dynamic.literal()
    if (frameId != null) __obj.updateDynamic("frameId")(frameId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (tab != null) __obj.updateDynamic("tab")(tab)
    if (tlsChannelId != null) __obj.updateDynamic("tlsChannelId")(tlsChannelId)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[MessageSender]
  }
}

