package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickEventArgs extends js.Object {
  /** Returns clicked shape object.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object ClickEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): ClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[ClickEventArgs]
  }
}

