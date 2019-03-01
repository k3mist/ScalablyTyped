package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalBaseProps extends js.Object {
  // Only `animated` is documented. The JS code says `animated` is
  // deprecated and `animationType` is preferred.
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The `animationType` prop controls how the modal animates.
    *
    * - `slide` slides in from the bottom
    * - `fade` fades into view
    * - `none` appears without an animation
    */
  var animationType: js.UndefOr[
    reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.slide | reactDashNativeLib.reactDashNativeLibStrings.fade
  ] = js.undefined
  /**
    * The `onRequestClose` prop allows passing a function that will be called once the modal has been dismissed.
    * _On the Android platform, this is a required function._
    */
  var onRequestClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * The `onShow` prop allows passing a function that will be called once the modal has been shown.
    */
  var onShow: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[_], scala.Unit]] = js.undefined
  /**
    * The `transparent` prop determines whether your modal will fill the entire view.
    * Setting this to `true` will render the modal over a transparent background.
    */
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The `visible` prop determines whether your modal is visible.
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ModalBaseProps {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    animationType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.slide | reactDashNativeLib.reactDashNativeLibStrings.fade = null,
    onRequestClose: js.Function0[scala.Unit] = null,
    onShow: js.Function1[/* event */ NativeSyntheticEvent[_], scala.Unit] = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ModalBaseProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (animationType != null) __obj.updateDynamic("animationType")(animationType.asInstanceOf[js.Any])
    if (onRequestClose != null) __obj.updateDynamic("onRequestClose")(onRequestClose)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ModalBaseProps]
  }
}

