package typings
package ejDotWebDotAllLib.ejNs.PivotGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeServiceInvokeEventArgs extends js.Object {
  /** returns the current action of PivotGrid control.
    */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /** returns the custom object bound with PivotGrid control.
    */
  var customObject: js.UndefOr[js.Any] = js.undefined
  /** returns the HTML element of PivotGrid control.
    */
  var element: js.UndefOr[js.Any] = js.undefined
}

object BeforeServiceInvokeEventArgs {
  @scala.inline
  def apply(action: java.lang.String = null, customObject: js.Any = null, element: js.Any = null): BeforeServiceInvokeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (customObject != null) __obj.updateDynamic("customObject")(customObject)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[BeforeServiceInvokeEventArgs]
  }
}

