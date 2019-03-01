package typings
package firefoxDashWebextDashBrowserLib.browserNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tab extends js.Object {
  /** Whether the tab is active in its window. (Does not necessarily mean the window is focused.) */
  var active: scala.Boolean
  /** Whether the tab is drawing attention. */
  var attention: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the tab has produced sound over the past couple of seconds (but it might not be heard if also
    * muted). Equivalent to whether the speaker audio indicator is showing.
    */
  var audible: js.UndefOr[scala.Boolean] = js.undefined
  /** The CookieStoreId used for the tab. */
  var cookieStoreId: js.UndefOr[java.lang.String] = js.undefined
  /** True while the tab is not loaded with content. */
  var discarded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The URL of the tab's favicon. This property is only present if the extension's manifest includes the
    * `"tabs"` permission. It may also be an empty string if the tab is loading.
    */
  var favIconUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The height of the tab in pixels. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** True if the tab is hidden. */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the tab is highlighted. Works as an alias of active */
  var highlighted: scala.Boolean
  /**
    * The ID of the tab. Tab IDs are unique within a browser session. Under some circumstances a Tab may not be
    * assigned an ID, for example when querying foreign tabs using the `sessions` API, in which case a session ID
    * may be present. Tab ID can also be set to `tabs.TAB_ID_NONE` for apps and devtools windows.
    */
  var id: js.UndefOr[scala.Double] = js.undefined
  /** Whether the tab is in an incognito window. */
  var incognito: scala.Boolean
  /** The zero-based index of the tab within its window. */
  var index: scala.Double
  /** Whether the document in the tab can be rendered in reader mode. */
  var isArticle: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the document in the tab is being rendered in reader mode. */
  var isInReaderMode: js.UndefOr[scala.Boolean] = js.undefined
  /** The last time the tab was accessed as the number of milliseconds since epoch. */
  var lastAccessed: js.UndefOr[scala.Double] = js.undefined
  /** Current tab muted state and the reason for the last state change. */
  var mutedInfo: js.UndefOr[MutedInfo] = js.undefined
  /**
    * The ID of the tab that opened this tab, if any. This property is only present if the opener tab still exists.
    */
  var openerTabId: js.UndefOr[scala.Double] = js.undefined
  /** Whether the tab is pinned. */
  var pinned: scala.Boolean
  /**
    * Whether the tab is selected.
    * @deprecated Please use `tabs.Tab.highlighted`.
    */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /** The session ID used to uniquely identify a Tab obtained from the `sessions` API. */
  var sessionId: js.UndefOr[java.lang.String] = js.undefined
  /** Current tab sharing state for screen, microphone and camera. */
  var sharingState: js.UndefOr[SharingState] = js.undefined
  /** Either _loading_ or _complete_. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of this tab's successor, if any; `tabs.TAB_ID_NONE` otherwise. */
  var successorTabId: js.UndefOr[scala.Double] = js.undefined
  /**
    * The title of the tab. This property is only present if the extension's manifest includes the `"tabs"`
    * permission.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL the tab is displaying. This property is only present if the extension's manifest includes the
    * `"tabs"` permission.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** The width of the tab in pixels. */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the window the tab is contained within. */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

object Tab {
  @scala.inline
  def apply(
    active: scala.Boolean,
    highlighted: scala.Boolean,
    incognito: scala.Boolean,
    index: scala.Double,
    pinned: scala.Boolean,
    attention: js.UndefOr[scala.Boolean] = js.undefined,
    audible: js.UndefOr[scala.Boolean] = js.undefined,
    cookieStoreId: java.lang.String = null,
    discarded: js.UndefOr[scala.Boolean] = js.undefined,
    favIconUrl: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    id: scala.Int | scala.Double = null,
    isArticle: js.UndefOr[scala.Boolean] = js.undefined,
    isInReaderMode: js.UndefOr[scala.Boolean] = js.undefined,
    lastAccessed: scala.Int | scala.Double = null,
    mutedInfo: MutedInfo = null,
    openerTabId: scala.Int | scala.Double = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    sessionId: java.lang.String = null,
    sharingState: SharingState = null,
    status: java.lang.String = null,
    successorTabId: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    url: java.lang.String = null,
    width: scala.Int | scala.Double = null,
    windowId: scala.Int | scala.Double = null
  ): Tab = {
    val __obj = js.Dynamic.literal(active = active, highlighted = highlighted, incognito = incognito, index = index, pinned = pinned)
    if (!js.isUndefined(attention)) __obj.updateDynamic("attention")(attention)
    if (!js.isUndefined(audible)) __obj.updateDynamic("audible")(audible)
    if (cookieStoreId != null) __obj.updateDynamic("cookieStoreId")(cookieStoreId)
    if (!js.isUndefined(discarded)) __obj.updateDynamic("discarded")(discarded)
    if (favIconUrl != null) __obj.updateDynamic("favIconUrl")(favIconUrl)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isArticle)) __obj.updateDynamic("isArticle")(isArticle)
    if (!js.isUndefined(isInReaderMode)) __obj.updateDynamic("isInReaderMode")(isInReaderMode)
    if (lastAccessed != null) __obj.updateDynamic("lastAccessed")(lastAccessed.asInstanceOf[js.Any])
    if (mutedInfo != null) __obj.updateDynamic("mutedInfo")(mutedInfo)
    if (openerTabId != null) __obj.updateDynamic("openerTabId")(openerTabId.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId)
    if (sharingState != null) __obj.updateDynamic("sharingState")(sharingState)
    if (status != null) __obj.updateDynamic("status")(status)
    if (successorTabId != null) __obj.updateDynamic("successorTabId")(successorTabId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
}

