package typings
package ejDotWebDotAllLib.ejNs.KanbanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwimlaneClickEventArgs extends js.Object {
  /** Current Action name while swim lane clicked. Actions are "expand" or "collapse"
    */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the swim lane group data's.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns the kanban model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns current swim lane row index.
    */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns current target element.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SwimlaneClickEventArgs {
  @scala.inline
  def apply(
    action: java.lang.String = null,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    model: js.Any = null,
    rowIndex: scala.Int | scala.Double = null,
    target: js.Any = null,
    `type`: java.lang.String = null
  ): SwimlaneClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (model != null) __obj.updateDynamic("model")(model)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SwimlaneClickEventArgs]
  }
}

