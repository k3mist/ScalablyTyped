package typings
package reactDashRelayLib.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentRef extends js.Object {
  var componentRef: js.UndefOr[js.Function1[/* ref */ js.Any, scala.Unit]] = js.undefined
}

object ComponentRef {
  @scala.inline
  def apply(componentRef: js.Function1[/* ref */ js.Any, scala.Unit] = null): ComponentRef = {
    val __obj = js.Dynamic.literal()
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef)
    __obj.asInstanceOf[ComponentRef]
  }
}

