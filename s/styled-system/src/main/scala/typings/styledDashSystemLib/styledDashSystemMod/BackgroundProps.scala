package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundProps[TLength] extends js.Object {
  /**
    * The background shorthand CSS property sets all background style properties at once,
    * such as color, image, origin and size, repeat method, and others.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background)
    */
  var background: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.BackgroundProperty[TLength]]] = js.undefined
}

object BackgroundProps {
  @scala.inline
  def apply[TLength](background: ResponsiveValue[csstypeLib.csstypeMod.BackgroundProperty[TLength]] = null): BackgroundProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundProps[TLength]]
  }
}

