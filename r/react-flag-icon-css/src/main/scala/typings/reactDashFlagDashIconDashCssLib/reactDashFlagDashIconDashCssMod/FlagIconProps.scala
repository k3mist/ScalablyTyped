package typings
package reactDashFlagDashIconDashCssLib.reactDashFlagDashIconDashCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagIconProps extends js.Object {
  var Component: js.UndefOr[java.lang.String] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * This is always appended as-is to class in the HTML.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * ISO 3166-1-alpha-2 code.
    */
  var code: java.lang.String
  var flip: js.UndefOr[FlagIconFlip] = js.undefined
  var rotate: js.UndefOr[FlagIconRotate] = js.undefined
  var size: js.UndefOr[FlagIconSize] = js.undefined
  /**
    * 	Uses the 1x1 image if true.
    */
  var squared: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This is mapped to a CSS module and appended to class in the HTML.
    */
  var styleName: js.UndefOr[java.lang.String] = js.undefined
}

object FlagIconProps {
  @scala.inline
  def apply(
    code: java.lang.String,
    Component: java.lang.String = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    flip: FlagIconFlip = null,
    rotate: FlagIconRotate = null,
    size: FlagIconSize = null,
    squared: js.UndefOr[scala.Boolean] = js.undefined,
    styleName: java.lang.String = null
  ): FlagIconProps = {
    val __obj = js.Dynamic.literal(code = code)
    if (Component != null) __obj.updateDynamic("Component")(Component)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (flip != null) __obj.updateDynamic("flip")(flip)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(squared)) __obj.updateDynamic("squared")(squared)
    if (styleName != null) __obj.updateDynamic("styleName")(styleName)
    __obj.asInstanceOf[FlagIconProps]
  }
}

