package typings
package meteorDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnResultReceived extends js.Object {
  var onResultReceived: js.UndefOr[js.Function] = js.undefined
  @JSName("wait")
  var wait_FAnon_OnResultReceived: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_OnResultReceived {
  @scala.inline
  def apply(onResultReceived: js.Function = null, wait: js.UndefOr[scala.Boolean] = js.undefined): Anon_OnResultReceived = {
    val __obj = js.Dynamic.literal()
    if (onResultReceived != null) __obj.updateDynamic("onResultReceived")(onResultReceived)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    __obj.asInstanceOf[Anon_OnResultReceived]
  }
}

