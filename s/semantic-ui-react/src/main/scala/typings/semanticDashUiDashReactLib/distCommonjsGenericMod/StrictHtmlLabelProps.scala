package typings
package semanticDashUiDashReactLib.distCommonjsGenericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictHtmlLabelProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object StrictHtmlLabelProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNs.ReactNode = null): StrictHtmlLabelProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictHtmlLabelProps]
  }
}

