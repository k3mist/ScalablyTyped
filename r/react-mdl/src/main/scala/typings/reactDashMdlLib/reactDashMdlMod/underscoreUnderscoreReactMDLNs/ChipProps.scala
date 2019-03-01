package typings
package reactDashMdlLib.reactDashMdlMod.underscoreUnderscoreReactMDLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChipProps
  extends reactLib.reactMod.ReactNs.HTMLProps[js.Any] {
  @JSName("onClick")
  var onClick_ChipProps: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[Chip]] = js.undefined
  var onClose: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[Chip]] = js.undefined
}

object ChipProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[js.Any] = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[Chip] = null,
    onClose: reactLib.reactMod.ReactNs.MouseEventHandler[Chip] = null
  ): ChipProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    __obj.asInstanceOf[ChipProps]
  }
}

