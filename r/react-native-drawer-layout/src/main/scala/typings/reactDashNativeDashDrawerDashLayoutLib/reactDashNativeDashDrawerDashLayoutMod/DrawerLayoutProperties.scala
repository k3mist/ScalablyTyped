package typings
package reactDashNativeDashDrawerDashLayoutLib.reactDashNativeDashDrawerDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerLayoutProperties
  extends reactDashNativeLib.reactDashNativeMod.ViewProps {
  /**
    * Child content.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Specifies the background color of the drawer. The default value is white. If you want to set
    * the opacity of the drawer, use rgba.
    */
  var drawerBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the lock mode of the drawer. The drawer can be locked in 3 states:
    *
    * - unlocked (default), meaning that the drawer will respond (open/close) to touch gestures.
    * - locked-closed, meaning that the drawer will stay closed and not respond to gestures.
    * - locked-open, meaning that the drawer will stay opened and not respond to gestures.
    *
    * The drawer may still be opened and closed programmatically (`openDrawer`/`closeDrawer`).
    */
  var drawerLockMode: js.UndefOr[
    reactDashNativeDashDrawerDashLayoutLib.reactDashNativeDashDrawerDashLayoutLibStrings.unlocked | reactDashNativeDashDrawerDashLayoutLib.reactDashNativeDashDrawerDashLayoutLibStrings.`locked-closed` | reactDashNativeDashDrawerDashLayoutLib.reactDashNativeDashDrawerDashLayoutLibStrings.`locked-open`
  ] = js.undefined
  /**
    * Specifies the side of the screen from which the drawer will slide in.
    */
  var drawerPosition: reactDashNativeDashDrawerDashLayoutLib.reactDashNativeDashDrawerDashLayoutLibStrings.left | reactDashNativeDashDrawerDashLayoutLib.reactDashNativeDashDrawerDashLayoutLibStrings.right
  /**
    * Specifies the width of the drawer, more precisely the width of the view that be pulled in from
    * the edge of the window.
    */
  var drawerWidth: scala.Double
  /**
    * Determines whether the keyboard gets dismissed in response to a drag.
    *
    * - 'none' (the default), drags do not dismiss the keyboard.
    * - 'on-drag', the keyboard is dismissed when a drag begins.
    */
  var keyboardDismissMode: js.UndefOr[
    reactDashNativeDashDrawerDashLayoutLib.reactDashNativeDashDrawerDashLayoutLibStrings.none | reactDashNativeDashDrawerDashLayoutLib.reactDashNativeDashDrawerDashLayoutLibStrings.`on-drag`
  ] = js.undefined
  /**
    * Function called whenever the navigation view has been closed.
    */
  var onDrawerClose: js.UndefOr[DrawerLayoutCloseEventHandler] = js.undefined
  /**
    * Function called whenever the navigation view has been opened.
    */
  var onDrawerOpen: js.UndefOr[DrawerLayoutOpenEventHandler] = js.undefined
  /**
    * Function called whenever there is an interaction with the navigation view.
    */
  var onDrawerSlide: js.UndefOr[DrawerLayoutSlideEventHandler] = js.undefined
  /**
    * Function called when the drawer state has changed. The drawer can be in 3 states:
    *
    * - idle, meaning there is no interaction with the navigation view happening at the time
    * - dragging, meaning there is currently an interaction with the navigation view
    * - settling, meaning that there was an interaction with the navigation view, and the navigation
    *   view is now finishing its closing or opening animation
    */
  var onDrawerStateChanged: js.UndefOr[DrawerLayoutStateChangeEventHandler] = js.undefined
  /**
    * The navigation view that will be rendered to the side of the screen and can be pulled in.
    */
  var renderNavigationView: reactLib.reactMod.ReactNs.ReactNode
  /**
    * Make the drawer take the entire screen and draw the background of the status bar to allow it
    * to open over the status bar. It will only have an effect on API 21+.
    */
  var statusBarBackgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use native driver animations.
    */
  var useNativeAnimations: js.UndefOr[scala.Boolean] = js.undefined
}

object DrawerLayoutProperties {
  @scala.inline
  def apply(
    drawerPosition: reactDashNativeDashDrawerDashLayoutLib.reactDashNativeDashDrawerDashLayoutLibStrings.left | reactDashNativeDashDrawerDashLayoutLib.reactDashNativeDashDrawerDashLayoutLibStrings.right,
    drawerWidth: scala.Double,
    renderNavigationView: reactLib.reactMod.ReactNs.ReactNode,
    accessibilityActions: js.Array[java.lang.String] = null,
    accessibilityComponentType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.button | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_checked | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityHint: java.lang.String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityLabel: java.lang.String = null,
    accessibilityLiveRegion: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.polite | reactDashNativeLib.reactDashNativeLibStrings.assertive = null,
    accessibilityRole: reactDashNativeLib.reactDashNativeMod.AccessibilityRole = null,
    accessibilityStates: js.Array[reactDashNativeLib.reactDashNativeMod.AccessibilityState] = null,
    accessibilityTraits: reactDashNativeLib.AccessibilityTrait | js.Array[reactDashNativeLib.AccessibilityTrait] = null,
    accessibilityViewIsModal: js.UndefOr[scala.Boolean] = js.undefined,
    accessible: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    collapsable: js.UndefOr[scala.Boolean] = js.undefined,
    drawerBackgroundColor: java.lang.String = null,
    drawerLockMode: reactDashNativeDashDrawerDashLayoutLib.reactDashNativeDashDrawerDashLayoutLibStrings.unlocked | reactDashNativeDashDrawerDashLayoutLib.reactDashNativeDashDrawerDashLayoutLibStrings.`locked-closed` | reactDashNativeDashDrawerDashLayoutLib.reactDashNativeDashDrawerDashLayoutLibStrings.`locked-open` = null,
    hitSlop: reactDashNativeLib.reactDashNativeMod.Insets = null,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    keyboardDismissMode: reactDashNativeDashDrawerDashLayoutLib.reactDashNativeDashDrawerDashLayoutLibStrings.none | reactDashNativeDashDrawerDashLayoutLib.reactDashNativeDashDrawerDashLayoutLibStrings.`on-drag` = null,
    nativeID: java.lang.String = null,
    needsOffscreenAlphaCompositing: js.UndefOr[scala.Boolean] = js.undefined,
    onAccessibilityAction: js.Function0[scala.Unit] = null,
    onAccessibilityTap: js.Function0[scala.Unit] = null,
    onDrawerClose: DrawerLayoutCloseEventHandler = null,
    onDrawerOpen: DrawerLayoutOpenEventHandler = null,
    onDrawerSlide: DrawerLayoutSlideEventHandler = null,
    onDrawerStateChanged: DrawerLayoutStateChangeEventHandler = null,
    onLayout: js.Function1[/* event */ reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent, scala.Unit] = null,
    onMagicTap: js.Function0[scala.Unit] = null,
    onMoveShouldSetResponder: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onMoveShouldSetResponderCapture: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onResponderEnd: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderGrant: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderMove: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderReject: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderRelease: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderStart: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderTerminate: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onResponderTerminationRequest: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onStartShouldSetResponder: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onStartShouldSetResponderCapture: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Boolean
    ] = null,
    onTouchCancel: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onTouchEnd: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onTouchEndCapture: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onTouchMove: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onTouchStart: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    pointerEvents: reactDashNativeLib.reactDashNativeLibStrings.`box-none` | reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.`box-only` | reactDashNativeLib.reactDashNativeLibStrings.auto = null,
    removeClippedSubviews: js.UndefOr[scala.Boolean] = js.undefined,
    renderToHardwareTextureAndroid: js.UndefOr[scala.Boolean] = js.undefined,
    shouldRasterizeIOS: js.UndefOr[scala.Boolean] = js.undefined,
    statusBarBackgroundColor: java.lang.String = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    testID: java.lang.String = null,
    useNativeAnimations: js.UndefOr[scala.Boolean] = js.undefined
  ): DrawerLayoutProperties = {
    val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerWidth = drawerWidth, renderNavigationView = renderNavigationView.asInstanceOf[js.Any])
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions)
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden)
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint)
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole)
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates)
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal)
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsable)) __obj.updateDynamic("collapsable")(collapsable)
    if (drawerBackgroundColor != null) __obj.updateDynamic("drawerBackgroundColor")(drawerBackgroundColor)
    if (drawerLockMode != null) __obj.updateDynamic("drawerLockMode")(drawerLockMode.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (keyboardDismissMode != null) __obj.updateDynamic("keyboardDismissMode")(keyboardDismissMode.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (!js.isUndefined(needsOffscreenAlphaCompositing)) __obj.updateDynamic("needsOffscreenAlphaCompositing")(needsOffscreenAlphaCompositing)
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(onAccessibilityAction)
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(onAccessibilityTap)
    if (onDrawerClose != null) __obj.updateDynamic("onDrawerClose")(onDrawerClose)
    if (onDrawerOpen != null) __obj.updateDynamic("onDrawerOpen")(onDrawerOpen)
    if (onDrawerSlide != null) __obj.updateDynamic("onDrawerSlide")(onDrawerSlide)
    if (onDrawerStateChanged != null) __obj.updateDynamic("onDrawerStateChanged")(onDrawerStateChanged)
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout)
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(onMagicTap)
    if (onMoveShouldSetResponder != null) __obj.updateDynamic("onMoveShouldSetResponder")(onMoveShouldSetResponder)
    if (onMoveShouldSetResponderCapture != null) __obj.updateDynamic("onMoveShouldSetResponderCapture")(onMoveShouldSetResponderCapture)
    if (onResponderEnd != null) __obj.updateDynamic("onResponderEnd")(onResponderEnd)
    if (onResponderGrant != null) __obj.updateDynamic("onResponderGrant")(onResponderGrant)
    if (onResponderMove != null) __obj.updateDynamic("onResponderMove")(onResponderMove)
    if (onResponderReject != null) __obj.updateDynamic("onResponderReject")(onResponderReject)
    if (onResponderRelease != null) __obj.updateDynamic("onResponderRelease")(onResponderRelease)
    if (onResponderStart != null) __obj.updateDynamic("onResponderStart")(onResponderStart)
    if (onResponderTerminate != null) __obj.updateDynamic("onResponderTerminate")(onResponderTerminate)
    if (onResponderTerminationRequest != null) __obj.updateDynamic("onResponderTerminationRequest")(onResponderTerminationRequest)
    if (onStartShouldSetResponder != null) __obj.updateDynamic("onStartShouldSetResponder")(onStartShouldSetResponder)
    if (onStartShouldSetResponderCapture != null) __obj.updateDynamic("onStartShouldSetResponderCapture")(onStartShouldSetResponderCapture)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (pointerEvents != null) __obj.updateDynamic("pointerEvents")(pointerEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(removeClippedSubviews)) __obj.updateDynamic("removeClippedSubviews")(removeClippedSubviews)
    if (!js.isUndefined(renderToHardwareTextureAndroid)) __obj.updateDynamic("renderToHardwareTextureAndroid")(renderToHardwareTextureAndroid)
    if (!js.isUndefined(shouldRasterizeIOS)) __obj.updateDynamic("shouldRasterizeIOS")(shouldRasterizeIOS)
    if (statusBarBackgroundColor != null) __obj.updateDynamic("statusBarBackgroundColor")(statusBarBackgroundColor)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (!js.isUndefined(useNativeAnimations)) __obj.updateDynamic("useNativeAnimations")(useNativeAnimations)
    __obj.asInstanceOf[DrawerLayoutProperties]
  }
}

