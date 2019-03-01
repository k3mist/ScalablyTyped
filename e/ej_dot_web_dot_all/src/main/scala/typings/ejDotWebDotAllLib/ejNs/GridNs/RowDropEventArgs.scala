package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDropEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the JSON data of dragged rows.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns draggable element type.
    */
  var draggableType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the JSON data of dragged rows.
    */
  var droppedRecords: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the draggable row object.
    */
  var rows: js.UndefOr[js.Any] = js.undefined
  /** Returns the current mouse position cell element.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object RowDropEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    draggableType: java.lang.String = null,
    droppedRecords: js.Any = null,
    model: js.Any = null,
    rows: js.Any = null,
    target: js.Any = null,
    `type`: java.lang.String = null
  ): RowDropEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (draggableType != null) __obj.updateDynamic("draggableType")(draggableType)
    if (droppedRecords != null) __obj.updateDynamic("droppedRecords")(droppedRecords)
    if (model != null) __obj.updateDynamic("model")(model)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RowDropEventArgs]
  }
}

