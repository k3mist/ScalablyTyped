package typings
package atBlueprintjsCoreLib.libEsmComponentsSliderMultiSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChildrenProps extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object IChildrenProps {
  @scala.inline
  def apply(children: reactLib.reactMod.ReactNs.ReactNode = null): IChildrenProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChildrenProps]
  }
}

