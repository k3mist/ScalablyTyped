package typings
package semanticDashUiDashReactLib.srcGenericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictHtmlSpanProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object StrictHtmlSpanProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNs.ReactNode = null): StrictHtmlSpanProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictHtmlSpanProps]
  }
}

