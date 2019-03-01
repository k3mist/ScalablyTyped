package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderProps[TLength] extends js.Object {
  /**
    * The border CSS property sets an element's border. It's a shorthand for border-width, border-style,
    * and border-color.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/border)
    */
  var border: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.BorderProperty[TLength]]] = js.undefined
}

object BorderProps {
  @scala.inline
  def apply[TLength](border: ResponsiveValue[csstypeLib.csstypeMod.BorderProperty[TLength]] = null): BorderProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderProps[TLength]]
  }
}

