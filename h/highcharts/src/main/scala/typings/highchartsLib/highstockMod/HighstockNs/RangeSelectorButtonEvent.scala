package typings
package highchartsLib.highstockMod.HighstockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectorButtonEvent extends js.Object {
  var click: js.UndefOr[js.Function1[/* event */ stdLib.Event, scala.Unit]] = js.undefined
}

object RangeSelectorButtonEvent {
  @scala.inline
  def apply(click: js.Function1[/* event */ stdLib.Event, scala.Unit] = null): RangeSelectorButtonEvent = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click)
    __obj.asInstanceOf[RangeSelectorButtonEvent]
  }
}

