package typings
package dndDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandlerIds extends js.Object {
  var handlerIds: js.UndefOr[js.Array[java.lang.String]]
}

object Anon_HandlerIds {
  @scala.inline
  def apply(handlerIds: js.Array[java.lang.String] = null): Anon_HandlerIds = {
    val __obj = js.Dynamic.literal()
    if (handlerIds != null) __obj.updateDynamic("handlerIds")(handlerIds)
    __obj.asInstanceOf[Anon_HandlerIds]
  }
}

