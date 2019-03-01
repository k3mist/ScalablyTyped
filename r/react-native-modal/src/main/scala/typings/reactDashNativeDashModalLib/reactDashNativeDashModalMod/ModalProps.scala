package typings
package reactDashNativeDashModalLib.reactDashNativeDashModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalProps extends js.Object {
  var animationIn: js.UndefOr[AnimationConfig] = js.undefined
  var animationInTiming: js.UndefOr[scala.Double] = js.undefined
  var animationOut: js.UndefOr[AnimationConfig] = js.undefined
  var animationOutTiming: js.UndefOr[scala.Double] = js.undefined
  var avoidKeyboard: js.UndefOr[scala.Boolean] = js.undefined
  var backdropColor: js.UndefOr[java.lang.String] = js.undefined
  var backdropOpacity: js.UndefOr[scala.Double] = js.undefined
  var backdropTransitionInTiming: js.UndefOr[scala.Double] = js.undefined
  var backdropTransitionOutTiming: js.UndefOr[scala.Double] = js.undefined
  var children: reactLib.reactMod.ReactNs.ReactNode
  var deviceHeight: js.UndefOr[scala.Double] = js.undefined
  var deviceWidth: js.UndefOr[scala.Double] = js.undefined
  var hardwareAccelerated: js.UndefOr[scala.Boolean] = js.undefined
  var hideModalContentWhileAnimating: js.UndefOr[scala.Boolean] = js.undefined
  var isVisible: scala.Boolean
  var onBackButtonPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onBackdropPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onModalHide: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onModalShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onOrientationChange: js.UndefOr[
    js.Function1[
      /* orientation */ reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.portrait | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.landscape, 
      scala.Unit
    ]
  ] = js.undefined
  var onShow: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSwipe: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var presentationStyle: js.UndefOr[
    reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.fullScreen | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.pageSheet | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.formSheet | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.overFullScreen
  ] = js.undefined
  var scrollOffset: js.UndefOr[scala.Double] = js.undefined
  var scrollOffsetMax: js.UndefOr[scala.Double] = js.undefined
  var scrollTo: js.UndefOr[js.Function1[/* e */ js.Any, scala.Unit]] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.undefined
  var swipeDirection: js.UndefOr[
    reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.up | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.down | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.left | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.right
  ] = js.undefined
  var swipeThreshold: js.UndefOr[scala.Double] = js.undefined
  var useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
}

object ModalProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode,
    isVisible: scala.Boolean,
    animationIn: AnimationConfig = null,
    animationInTiming: scala.Int | scala.Double = null,
    animationOut: AnimationConfig = null,
    animationOutTiming: scala.Int | scala.Double = null,
    avoidKeyboard: js.UndefOr[scala.Boolean] = js.undefined,
    backdropColor: java.lang.String = null,
    backdropOpacity: scala.Int | scala.Double = null,
    backdropTransitionInTiming: scala.Int | scala.Double = null,
    backdropTransitionOutTiming: scala.Int | scala.Double = null,
    deviceHeight: scala.Int | scala.Double = null,
    deviceWidth: scala.Int | scala.Double = null,
    hardwareAccelerated: js.UndefOr[scala.Boolean] = js.undefined,
    hideModalContentWhileAnimating: js.UndefOr[scala.Boolean] = js.undefined,
    onBackButtonPress: js.Function0[scala.Unit] = null,
    onBackdropPress: js.Function0[scala.Unit] = null,
    onDismiss: js.Function0[scala.Unit] = null,
    onModalHide: js.Function0[scala.Unit] = null,
    onModalShow: js.Function0[scala.Unit] = null,
    onOrientationChange: js.Function1[
      /* orientation */ reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.portrait | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.landscape, 
      scala.Unit
    ] = null,
    onShow: js.Function0[scala.Unit] = null,
    onSwipe: js.Function0[scala.Unit] = null,
    presentationStyle: reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.fullScreen | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.pageSheet | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.formSheet | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.overFullScreen = null,
    scrollOffset: scala.Int | scala.Double = null,
    scrollOffsetMax: scala.Int | scala.Double = null,
    scrollTo: js.Function1[/* e */ js.Any, scala.Unit] = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    supportedOrientations: js.Array[Orientation] = null,
    swipeDirection: reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.up | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.down | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.left | reactDashNativeDashModalLib.reactDashNativeDashModalLibStrings.right = null,
    swipeThreshold: scala.Int | scala.Double = null,
    useNativeDriver: js.UndefOr[scala.Boolean] = js.undefined
  ): ModalProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isVisible = isVisible)
    if (animationIn != null) __obj.updateDynamic("animationIn")(animationIn.asInstanceOf[js.Any])
    if (animationInTiming != null) __obj.updateDynamic("animationInTiming")(animationInTiming.asInstanceOf[js.Any])
    if (animationOut != null) __obj.updateDynamic("animationOut")(animationOut.asInstanceOf[js.Any])
    if (animationOutTiming != null) __obj.updateDynamic("animationOutTiming")(animationOutTiming.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidKeyboard)) __obj.updateDynamic("avoidKeyboard")(avoidKeyboard)
    if (backdropColor != null) __obj.updateDynamic("backdropColor")(backdropColor)
    if (backdropOpacity != null) __obj.updateDynamic("backdropOpacity")(backdropOpacity.asInstanceOf[js.Any])
    if (backdropTransitionInTiming != null) __obj.updateDynamic("backdropTransitionInTiming")(backdropTransitionInTiming.asInstanceOf[js.Any])
    if (backdropTransitionOutTiming != null) __obj.updateDynamic("backdropTransitionOutTiming")(backdropTransitionOutTiming.asInstanceOf[js.Any])
    if (deviceHeight != null) __obj.updateDynamic("deviceHeight")(deviceHeight.asInstanceOf[js.Any])
    if (deviceWidth != null) __obj.updateDynamic("deviceWidth")(deviceWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareAccelerated)) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated)
    if (!js.isUndefined(hideModalContentWhileAnimating)) __obj.updateDynamic("hideModalContentWhileAnimating")(hideModalContentWhileAnimating)
    if (onBackButtonPress != null) __obj.updateDynamic("onBackButtonPress")(onBackButtonPress)
    if (onBackdropPress != null) __obj.updateDynamic("onBackdropPress")(onBackdropPress)
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(onDismiss)
    if (onModalHide != null) __obj.updateDynamic("onModalHide")(onModalHide)
    if (onModalShow != null) __obj.updateDynamic("onModalShow")(onModalShow)
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(onOrientationChange)
    if (onShow != null) __obj.updateDynamic("onShow")(onShow)
    if (onSwipe != null) __obj.updateDynamic("onSwipe")(onSwipe)
    if (presentationStyle != null) __obj.updateDynamic("presentationStyle")(presentationStyle.asInstanceOf[js.Any])
    if (scrollOffset != null) __obj.updateDynamic("scrollOffset")(scrollOffset.asInstanceOf[js.Any])
    if (scrollOffsetMax != null) __obj.updateDynamic("scrollOffsetMax")(scrollOffsetMax.asInstanceOf[js.Any])
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(scrollTo)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations)
    if (swipeDirection != null) __obj.updateDynamic("swipeDirection")(swipeDirection.asInstanceOf[js.Any])
    if (swipeThreshold != null) __obj.updateDynamic("swipeThreshold")(swipeThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver)
    __obj.asInstanceOf[ModalProps]
  }
}

