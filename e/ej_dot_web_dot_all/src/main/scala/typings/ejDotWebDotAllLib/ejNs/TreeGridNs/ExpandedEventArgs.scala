package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandedEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the data of expanded record..
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Returns state of a record whether it is in expanded or expanded state.
    */
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the row index of expanded record.
    */
  var recordIndex: js.UndefOr[scala.Double] = js.undefined
  /** Returns Request Type.
    */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the event type.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ExpandedEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    recordIndex: scala.Int | scala.Double = null,
    requestType: java.lang.String = null,
    `type`: java.lang.String = null
  ): ExpandedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (recordIndex != null) __obj.updateDynamic("recordIndex")(recordIndex.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExpandedEventArgs]
  }
}

