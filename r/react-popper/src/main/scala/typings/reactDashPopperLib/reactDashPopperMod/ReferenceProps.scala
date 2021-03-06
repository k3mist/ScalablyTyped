package typings
package reactDashPopperLib.reactDashPopperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceProps extends js.Object {
  var innerRef: js.UndefOr[reactDashPopperLib.RefHandler] = js.undefined
  def children(props: ReferenceChildrenProps): reactLib.reactMod.ReactNs.ReactNode
}

object ReferenceProps {
  @scala.inline
  def apply(
    children: ReferenceChildrenProps => reactLib.reactMod.ReactNs.ReactNode,
    innerRef: reactDashPopperLib.RefHandler = null
  ): ReferenceProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef)
    __obj.asInstanceOf[ReferenceProps]
  }
}

