package typings
package ejDotWebDotAllLib.ejNs.PivotGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrillSuccessEventArgs extends js.Object {
  /** returns the HTML element of the control.
    */
  var args: js.UndefOr[js.Any] = js.undefined
}

object DrillSuccessEventArgs {
  @scala.inline
  def apply(args: js.Any = null): DrillSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    if (args != null) __obj.updateDynamic("args")(args)
    __obj.asInstanceOf[DrillSuccessEventArgs]
  }
}

