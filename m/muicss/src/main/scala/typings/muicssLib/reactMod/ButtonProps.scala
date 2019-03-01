package typings
package muicssLib.reactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps
  extends reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement] {
  var size: js.UndefOr[java.lang.String] = js.undefined
  var variant: js.UndefOr[java.lang.String] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    ButtonHTMLAttributes: reactLib.reactMod.ReactNs.ButtonHTMLAttributes[reactLib.HTMLButtonElement] = null,
    size: java.lang.String = null,
    variant: java.lang.String = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ButtonHTMLAttributes)
    if (size != null) __obj.updateDynamic("size")(size)
    if (variant != null) __obj.updateDynamic("variant")(variant)
    __obj.asInstanceOf[ButtonProps]
  }
}

