package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiViewCalendarRange extends js.Object {
  var end: js.UndefOr[stdLib.Date] = js.undefined
  var start: js.UndefOr[stdLib.Date] = js.undefined
}

object MultiViewCalendarRange {
  @scala.inline
  def apply(end: stdLib.Date = null, start: stdLib.Date = null): MultiViewCalendarRange = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[MultiViewCalendarRange]
  }
}

