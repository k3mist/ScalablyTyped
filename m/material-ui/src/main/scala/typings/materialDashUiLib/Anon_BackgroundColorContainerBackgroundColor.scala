package typings
package materialDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColorContainerBackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var containerBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BackgroundColorContainerBackgroundColor {
  @scala.inline
  def apply(backgroundColor: java.lang.String = null, containerBackgroundColor: java.lang.String = null): Anon_BackgroundColorContainerBackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (containerBackgroundColor != null) __obj.updateDynamic("containerBackgroundColor")(containerBackgroundColor)
    __obj.asInstanceOf[Anon_BackgroundColorContainerBackgroundColor]
  }
}

