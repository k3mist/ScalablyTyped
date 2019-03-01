package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleClickEventArgs extends js.Object {
  /** Returns double clicked shape object.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object DoubleClickEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): DoubleClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[DoubleClickEventArgs]
  }
}

