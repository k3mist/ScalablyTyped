package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeAddEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the given new node data
    */
  var data: js.UndefOr[java.lang.String | js.Any] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the given parent node details
    */
  var parentDetails: js.UndefOr[js.Any] = js.undefined
  /** returns the parent element, the given new nodes to be appended to the given parent element
    */
  var targetParent: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BeforeAddEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    data: java.lang.String | js.Any = null,
    model: Model = null,
    parentDetails: js.Any = null,
    targetParent: js.Any = null,
    `type`: java.lang.String = null
  ): BeforeAddEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (parentDetails != null) __obj.updateDynamic("parentDetails")(parentDetails)
    if (targetParent != null) __obj.updateDynamic("targetParent")(targetParent)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeAddEventArgs]
  }
}

