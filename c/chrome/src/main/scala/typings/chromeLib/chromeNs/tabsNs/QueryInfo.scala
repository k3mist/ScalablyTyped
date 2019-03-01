package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryInfo extends js.Object {
  /** Optional. Whether the tabs are active in their windows. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. Whether the tabs are audible.
    * @since Chrome 45.
    */
  var audible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional.
    * Whether the tabs can be discarded automatically by the browser when resources are low.
    * @since Chrome 54.
    */
  var autoDiscardable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. Whether the tabs are in the current window.
    * @since Chrome 19.
    */
  var currentWindow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional.
    * Whether the tabs are discarded. A discarded tab is one whose content has been unloaded from memory, but is still visible in the tab strip. Its content gets reloaded the next time it's activated.
    * @since Chrome 54.
    */
  var discarded: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Whether the tabs are highlighted. */
  var highlighted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. The position of the tabs within their windows.
    * @since Chrome 18.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional. Whether the tabs are in the last focused window.
    * @since Chrome 19.
    */
  var lastFocusedWindow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. Whether the tabs are muted.
    * @since Chrome 45.
    */
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. Whether the tabs are pinned. */
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. Whether the tabs have completed loading.
    * One of: "loading", or "complete"
    */
  var status: js.UndefOr[chromeLib.chromeLibStrings.loading | chromeLib.chromeLibStrings.complete] = js.undefined
  /** Optional. Match page titles against a pattern. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** Optional. Match tabs against one or more URL patterns. Note that fragment identifiers are not matched. */
  var url: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /** Optional. The ID of the parent window, or windows.WINDOW_ID_CURRENT for the current window. */
  var windowId: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional. The type of window the tabs are in.
    * One of: "normal", "popup", "panel", "app", or "devtools"
    */
  var windowType: js.UndefOr[
    chromeLib.chromeLibStrings.normal | chromeLib.chromeLibStrings.popup | chromeLib.chromeLibStrings.panel | chromeLib.chromeLibStrings.app | chromeLib.chromeLibStrings.devtools
  ] = js.undefined
}

object QueryInfo {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    audible: js.UndefOr[scala.Boolean] = js.undefined,
    autoDiscardable: js.UndefOr[scala.Boolean] = js.undefined,
    currentWindow: js.UndefOr[scala.Boolean] = js.undefined,
    discarded: js.UndefOr[scala.Boolean] = js.undefined,
    highlighted: js.UndefOr[scala.Boolean] = js.undefined,
    index: scala.Int | scala.Double = null,
    lastFocusedWindow: js.UndefOr[scala.Boolean] = js.undefined,
    muted: js.UndefOr[scala.Boolean] = js.undefined,
    pinned: js.UndefOr[scala.Boolean] = js.undefined,
    status: chromeLib.chromeLibStrings.loading | chromeLib.chromeLibStrings.complete = null,
    title: java.lang.String = null,
    url: java.lang.String | js.Array[java.lang.String] = null,
    windowId: scala.Int | scala.Double = null,
    windowType: chromeLib.chromeLibStrings.normal | chromeLib.chromeLibStrings.popup | chromeLib.chromeLibStrings.panel | chromeLib.chromeLibStrings.app | chromeLib.chromeLibStrings.devtools = null
  ): QueryInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(audible)) __obj.updateDynamic("audible")(audible)
    if (!js.isUndefined(autoDiscardable)) __obj.updateDynamic("autoDiscardable")(autoDiscardable)
    if (!js.isUndefined(currentWindow)) __obj.updateDynamic("currentWindow")(currentWindow)
    if (!js.isUndefined(discarded)) __obj.updateDynamic("discarded")(discarded)
    if (!js.isUndefined(highlighted)) __obj.updateDynamic("highlighted")(highlighted)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(lastFocusedWindow)) __obj.updateDynamic("lastFocusedWindow")(lastFocusedWindow)
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    if (windowType != null) __obj.updateDynamic("windowType")(windowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInfo]
  }
}

