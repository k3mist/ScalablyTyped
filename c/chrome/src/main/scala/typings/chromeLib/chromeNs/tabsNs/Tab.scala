package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tab extends js.Object {
  /**
    * Whether the tab is active in its window. (Does not necessarily mean the window is focused.)
    * @since Chrome 16.
    */
  var active: scala.Boolean
  /**
    * Optional.
    * Whether the tab has produced sound over the past couple of seconds (but it might not be heard if also muted). Equivalent to whether the speaker audio indicator is showing.
    * @since Chrome 45.
    */
  var audible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the tab can be discarded automatically by the browser when resources are low.
    * @since Chrome 54.
    */
  var autoDiscardable: scala.Boolean
  /**
    * Whether the tab is discarded. A discarded tab is one whose content has been unloaded from memory, but is still visible in the tab strip. Its content gets reloaded the next time it's activated.
    * @since Chrome 54.
    */
  var discarded: scala.Boolean
  /**
    * Optional.
    * The URL of the tab's favicon. This property is only present if the extension's manifest includes the "tabs" permission. It may also be an empty string if the tab is loading.
    */
  var favIconUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. The height of the tab in pixels.
    * @since Chrome 31.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether the tab is highlighted.
    * @since Chrome 16.
    */
  var highlighted: scala.Boolean
  /**
    * Optional.
    * The ID of the tab. Tab IDs are unique within a browser session. Under some circumstances a Tab may not be assigned an ID, for example when querying foreign tabs using the sessions API, in which case a session ID may be present. Tab ID can also be set to chrome.tabs.TAB_ID_NONE for apps and devtools windows.
    */
  var id: js.UndefOr[scala.Double] = js.undefined
  /** Whether the tab is in an incognito window. */
  var incognito: scala.Boolean
  /** The zero-based index of the tab within its window. */
  var index: scala.Double
  /**
    * Optional.
    * Current tab muted state and the reason for the last state change.
    * @since Chrome 46. Warning: this is the current Beta channel.
    */
  var mutedInfo: js.UndefOr[MutedInfo] = js.undefined
  /**
    * Optional.
    * The ID of the tab that opened this tab, if any. This property is only present if the opener tab still exists.
    * @since Chrome 18.
    */
  var openerTabId: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether the tab is pinned.
    * @since Chrome 9.
    */
  var pinned: scala.Boolean
  /**
    * Whether the tab is selected.
    * @deprecated since Chrome 33. Please use tabs.Tab.highlighted.
    */
  var selected: scala.Boolean
  /**
    * Optional. The session ID used to uniquely identify a Tab obtained from the sessions API.
    * @since Chrome 31.
    */
  var sessionId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional.
    * Either loading or complete.
    */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional.
    * The title of the tab. This property is only present if the extension's manifest includes the "tabs" permission.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional.
    * The URL the tab is displaying. This property is only present if the extension's manifest includes the "tabs" permission.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. The width of the tab in pixels.
    * @since Chrome 31.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the window the tab is contained within. */
  var windowId: scala.Double
}

object Tab {
  @scala.inline
  def apply(
    active: scala.Boolean,
    autoDiscardable: scala.Boolean,
    discarded: scala.Boolean,
    highlighted: scala.Boolean,
    incognito: scala.Boolean,
    index: scala.Double,
    pinned: scala.Boolean,
    selected: scala.Boolean,
    windowId: scala.Double,
    audible: js.UndefOr[scala.Boolean] = js.undefined,
    favIconUrl: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    id: scala.Int | scala.Double = null,
    mutedInfo: MutedInfo = null,
    openerTabId: scala.Int | scala.Double = null,
    sessionId: java.lang.String = null,
    status: java.lang.String = null,
    title: java.lang.String = null,
    url: java.lang.String = null,
    width: scala.Int | scala.Double = null
  ): Tab = {
    val __obj = js.Dynamic.literal(active = active, autoDiscardable = autoDiscardable, discarded = discarded, highlighted = highlighted, incognito = incognito, index = index, pinned = pinned, selected = selected, windowId = windowId)
    if (!js.isUndefined(audible)) __obj.updateDynamic("audible")(audible)
    if (favIconUrl != null) __obj.updateDynamic("favIconUrl")(favIconUrl)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (mutedInfo != null) __obj.updateDynamic("mutedInfo")(mutedInfo)
    if (openerTabId != null) __obj.updateDynamic("openerTabId")(openerTabId.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId)
    if (status != null) __obj.updateDynamic("status")(status)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
}

