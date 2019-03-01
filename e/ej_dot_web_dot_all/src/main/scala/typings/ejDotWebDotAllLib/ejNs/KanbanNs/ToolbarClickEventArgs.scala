package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolbarClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the current item.
    */
  var currentTarget: js.UndefOr[js.Any] = js.undefined
  /** Returns the item id of that current element.
    */
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the item index of that current element.
    */
  var itemIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns the item name of that current element.
    */
  var itemName: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the item text of that current element.
    */
  var itemText: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the Kanban model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the toolbar object of the Kanban.
    */
  var toolbarData: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ToolbarClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    currentTarget: js.Any = null,
    itemId: java.lang.String = null,
    itemIndex: scala.Int | scala.Double = null,
    itemName: java.lang.String = null,
    itemText: java.lang.String = null,
    model: js.Any = null,
    toolbarData: js.Any = null,
    `type`: java.lang.String = null
  ): ToolbarClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget)
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (itemIndex != null) __obj.updateDynamic("itemIndex")(itemIndex.asInstanceOf[js.Any])
    if (itemName != null) __obj.updateDynamic("itemName")(itemName)
    if (itemText != null) __obj.updateDynamic("itemText")(itemText)
    if (model != null) __obj.updateDynamic("model")(model)
    if (toolbarData != null) __obj.updateDynamic("toolbarData")(toolbarData)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ToolbarClickEventArgs]
  }
}

