package typings
package parseLib.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaitOption extends js.Object {
  /**
    * Set to true to wait for the server to confirm success
    * before triggering an event.
    */
  @JSName("wait")
  var wait_FWaitOption: js.UndefOr[scala.Boolean] = js.undefined
}

object WaitOption {
  @scala.inline
  def apply(wait: js.UndefOr[scala.Boolean] = js.undefined): WaitOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[WaitOption]
  }
}

