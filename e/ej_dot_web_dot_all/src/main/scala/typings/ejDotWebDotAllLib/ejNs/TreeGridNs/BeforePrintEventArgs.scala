package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforePrintEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the TreeGrid element which is going to be print
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** Returns request type.
    */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
}

object BeforePrintEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    element: js.Any = null,
    requestType: java.lang.String = null
  ): BeforePrintEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (element != null) __obj.updateDynamic("element")(element)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    __obj.asInstanceOf[BeforePrintEventArgs]
  }
}

