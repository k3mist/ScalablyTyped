package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalPropsAndroid extends js.Object {
  /**
    *  Controls whether to force hardware acceleration for the underlying window.
    */
  var hardwareAccelerated: js.UndefOr[scala.Boolean] = js.undefined
}

object ModalPropsAndroid {
  @scala.inline
  def apply(hardwareAccelerated: js.UndefOr[scala.Boolean] = js.undefined): ModalPropsAndroid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hardwareAccelerated)) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated)
    __obj.asInstanceOf[ModalPropsAndroid]
  }
}

