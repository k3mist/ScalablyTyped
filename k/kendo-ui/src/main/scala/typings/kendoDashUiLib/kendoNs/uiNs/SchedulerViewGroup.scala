package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerViewGroup extends js.Object {
  var date: js.UndefOr[scala.Boolean] = js.undefined
  var orientation: js.UndefOr[java.lang.String] = js.undefined
}

object SchedulerViewGroup {
  @scala.inline
  def apply(date: js.UndefOr[scala.Boolean] = js.undefined, orientation: java.lang.String = null): SchedulerViewGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    __obj.asInstanceOf[SchedulerViewGroup]
  }
}

