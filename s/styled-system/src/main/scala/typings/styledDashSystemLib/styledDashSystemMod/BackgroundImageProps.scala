package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundImageProps extends js.Object {
  /**
    * The background-image CSS property sets one or more background images on an element.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/background-image)
    */
  var backgroundImage: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.BackgroundImageProperty]] = js.undefined
}

object BackgroundImageProps {
  @scala.inline
  def apply(backgroundImage: ResponsiveValue[csstypeLib.csstypeMod.BackgroundImageProperty] = null): BackgroundImageProps = {
    val __obj = js.Dynamic.literal()
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundImageProps]
  }
}

