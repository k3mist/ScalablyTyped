package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveProperties extends js.Object {
  /** The position to move the window to. -1 will place the tab at the end of the window. */
  var index: scala.Double
  /** Optional. Defaults to the window the tab is currently in. */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

object MoveProperties {
  @scala.inline
  def apply(index: scala.Double, windowId: scala.Int | scala.Double = null): MoveProperties = {
    val __obj = js.Dynamic.literal(index = index)
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveProperties]
  }
}

