package typings
package textDashBufferLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaintainHistory extends js.Object {
  var maintainHistory: js.UndefOr[scala.Boolean] = js.undefined
  var persistent: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_MaintainHistory {
  @scala.inline
  def apply(
    maintainHistory: js.UndefOr[scala.Boolean] = js.undefined,
    persistent: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_MaintainHistory = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maintainHistory)) __obj.updateDynamic("maintainHistory")(maintainHistory)
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    __obj.asInstanceOf[Anon_MaintainHistory]
  }
}

