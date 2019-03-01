package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservableObjectEvent extends js.Object {
  var field: js.UndefOr[java.lang.String] = js.undefined
  var sender: js.UndefOr[ObservableObject] = js.undefined
}

object ObservableObjectEvent {
  @scala.inline
  def apply(field: java.lang.String = null, sender: ObservableObject = null): ObservableObjectEvent = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[ObservableObjectEvent]
  }
}

