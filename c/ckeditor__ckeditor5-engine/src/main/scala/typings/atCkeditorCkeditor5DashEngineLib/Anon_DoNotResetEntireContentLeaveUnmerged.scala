package typings
package atCkeditorCkeditor5DashEngineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DoNotResetEntireContentLeaveUnmerged extends js.Object {
  var doNotResetEntireContent: js.UndefOr[scala.Boolean] = js.undefined
  var leaveUnmerged: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DoNotResetEntireContentLeaveUnmerged {
  @scala.inline
  def apply(
    doNotResetEntireContent: js.UndefOr[scala.Boolean] = js.undefined,
    leaveUnmerged: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DoNotResetEntireContentLeaveUnmerged = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doNotResetEntireContent)) __obj.updateDynamic("doNotResetEntireContent")(doNotResetEntireContent)
    if (!js.isUndefined(leaveUnmerged)) __obj.updateDynamic("leaveUnmerged")(leaveUnmerged)
    __obj.asInstanceOf[Anon_DoNotResetEntireContentLeaveUnmerged]
  }
}

