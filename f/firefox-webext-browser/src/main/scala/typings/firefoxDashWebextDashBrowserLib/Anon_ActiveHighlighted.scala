package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveHighlighted extends js.Object {
  /**
    * Whether the tab should be active. Does not affect whether the window is focused (see `windows.update`).
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Adds or removes the tab from the current selection. */
  var highlighted: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the load should replace the current history entry for the tab. */
  var loadReplace: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the tab should be muted. */
  var muted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as this tab.
    */
  var openerTabId: js.UndefOr[scala.Double] = js.undefined
  /** Whether the tab should be pinned. */
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the tab should be selected.
    * @deprecated Please use _highlighted_.
    */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The ID of this tab's successor. If specified, the successor tab must be in the same window as this tab.
    */
  var successorTabId: js.UndefOr[scala.Double] = js.undefined
  /** A URL to navigate the tab to. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ActiveHighlighted {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    highlighted: js.UndefOr[scala.Boolean] = js.undefined,
    loadReplace: js.UndefOr[scala.Boolean] = js.undefined,
    muted: js.UndefOr[scala.Boolean] = js.undefined,
    openerTabId: scala.Int | scala.Double = null,
    pinned: js.UndefOr[scala.Boolean] = js.undefined,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    successorTabId: scala.Int | scala.Double = null,
    url: java.lang.String = null
  ): Anon_ActiveHighlighted = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (!js.isUndefined(highlighted)) __obj.updateDynamic("highlighted")(highlighted)
    if (!js.isUndefined(loadReplace)) __obj.updateDynamic("loadReplace")(loadReplace)
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (openerTabId != null) __obj.updateDynamic("openerTabId")(openerTabId.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (successorTabId != null) __obj.updateDynamic("successorTabId")(successorTabId.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_ActiveHighlighted]
  }
}

