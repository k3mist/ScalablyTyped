package typings
package ejDotWebDotAllLib.ejNs.SplitButtonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemSelectedEventArgs extends js.Object {
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the clicked menu item element
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** return the menu id
    */
  var menuId: js.UndefOr[java.lang.String] = js.undefined
  /** return the clicked menu item text
    */
  var menuText: js.UndefOr[java.lang.String] = js.undefined
  /** returns the split button model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the selected item
    */
  var selectedItem: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ItemSelectedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    element: js.Any = null,
    menuId: java.lang.String = null,
    menuText: java.lang.String = null,
    model: Model = null,
    selectedItem: js.Any = null,
    `type`: java.lang.String = null
  ): ItemSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (element != null) __obj.updateDynamic("element")(element)
    if (menuId != null) __obj.updateDynamic("menuId")(menuId)
    if (menuText != null) __obj.updateDynamic("menuText")(menuText)
    if (model != null) __obj.updateDynamic("model")(model)
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ItemSelectedEventArgs]
  }
}

