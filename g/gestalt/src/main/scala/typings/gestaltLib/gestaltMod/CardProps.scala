package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var image: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventHTMLDivElement, scala.Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* args */ gestaltLib.Anon_EventHTMLDivElement, scala.Unit]] = js.undefined
}

object CardProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    image: reactLib.reactMod.ReactNs.ReactNode = null,
    onMouseEnter: js.Function1[/* args */ gestaltLib.Anon_EventHTMLDivElement, scala.Unit] = null,
    onMouseLeave: js.Function1[/* args */ gestaltLib.Anon_EventHTMLDivElement, scala.Unit] = null
  ): CardProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    __obj.asInstanceOf[CardProps]
  }
}

