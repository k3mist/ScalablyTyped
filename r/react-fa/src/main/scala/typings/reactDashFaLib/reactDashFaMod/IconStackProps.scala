package typings
package reactDashFaLib.reactDashFaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconStackProps extends SizeOverrideHTMLProps[IconStack] {
  @JSName("children")
  var children_IconStackProps: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[IconProps] | js.Array[reactLib.reactMod.ReactNs.ReactElement[IconProps]]
  ] = js.undefined
  @JSName("size")
  var size_IconStackProps: js.UndefOr[IconSize] = js.undefined
}

object IconStackProps {
  @scala.inline
  def apply(
    SizeOverrideHTMLProps: SizeOverrideHTMLProps[IconStack] = null,
    children: reactLib.reactMod.ReactNs.ReactElement[IconProps] | js.Array[reactLib.reactMod.ReactNs.ReactElement[IconProps]] = null,
    size: IconSize = null
  ): IconStackProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, SizeOverrideHTMLProps)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[IconStackProps]
  }
}

