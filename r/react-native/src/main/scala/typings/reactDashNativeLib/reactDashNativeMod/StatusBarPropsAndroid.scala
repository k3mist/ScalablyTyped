package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBarPropsAndroid extends js.Object {
  /**
    * The background color of the status bar.
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If the status bar is translucent. When translucent is set to true,
    * the app will draw under the status bar. This is useful when using a
    * semi transparent status bar color.
    */
  var translucent: js.UndefOr[scala.Boolean] = js.undefined
}

object StatusBarPropsAndroid {
  @scala.inline
  def apply(backgroundColor: java.lang.String = null, translucent: js.UndefOr[scala.Boolean] = js.undefined): StatusBarPropsAndroid = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (!js.isUndefined(translucent)) __obj.updateDynamic("translucent")(translucent)
    __obj.asInstanceOf[StatusBarPropsAndroid]
  }
}

