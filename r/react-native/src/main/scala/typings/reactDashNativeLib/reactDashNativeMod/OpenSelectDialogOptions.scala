package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenSelectDialogOptions extends js.Object {
  /** Defaults to true */
  var showImages: js.UndefOr[scala.Boolean] = js.undefined
  /** Defaults to false */
  var showVideos: js.UndefOr[scala.Boolean] = js.undefined
}

object OpenSelectDialogOptions {
  @scala.inline
  def apply(
    showImages: js.UndefOr[scala.Boolean] = js.undefined,
    showVideos: js.UndefOr[scala.Boolean] = js.undefined
  ): OpenSelectDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showImages)) __obj.updateDynamic("showImages")(showImages)
    if (!js.isUndefined(showVideos)) __obj.updateDynamic("showVideos")(showVideos)
    __obj.asInstanceOf[OpenSelectDialogOptions]
  }
}

