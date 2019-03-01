package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexProps[TLength] extends js.Object {
  /**
    * The flex CSS property specifies how a flex item will grow or shrink so as to fit the space available in
    * its flex container. This is a shorthand property that sets flex-grow, flex-shrink, and flex-basis.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/flex)
    */
  var flex: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.FlexProperty[TLength]]] = js.undefined
}

object FlexProps {
  @scala.inline
  def apply[TLength](flex: ResponsiveValue[csstypeLib.csstypeMod.FlexProperty[TLength]] = null): FlexProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexProps[TLength]]
  }
}

