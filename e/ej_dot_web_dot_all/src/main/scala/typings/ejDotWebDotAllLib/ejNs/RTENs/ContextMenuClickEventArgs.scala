package typings
package ejDotWebDotAllLib.ejNs.RTENs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuClickEventArgs extends js.Object {
  /** returns clicked menu item element.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the selected item.
    */
  var selectedItem: js.UndefOr[scala.Double] = js.undefined
  /** returns clicked menu item text.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object ContextMenuClickEventArgs {
  @scala.inline
  def apply(
    element: js.Any = null,
    selectedItem: scala.Int | scala.Double = null,
    text: java.lang.String = null
  ): ContextMenuClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element)
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ContextMenuClickEventArgs]
  }
}

