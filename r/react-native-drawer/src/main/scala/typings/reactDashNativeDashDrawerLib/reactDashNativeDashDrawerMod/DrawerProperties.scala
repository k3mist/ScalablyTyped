package typings
package reactDashNativeDashDrawerLib.reactDashNativeDashDrawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerProperties extends js.Object {
  /**
    * Toggle drawer when double tap occurs within pan mask?
    */
  var acceptDoubleTap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allow for drawer pan (on touch drag). Set to false to effectively
    * disable the drawer while still allowing programmatic control
    */
  var acceptPan: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allow Pan when drawer is 'open'
    */
  var acceptPanOnDrawer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Toggle drawer when any tap occurs within pan mask?
    */
  var acceptTap: js.UndefOr[scala.Boolean] = js.undefined
  // Gestures
  /**
    * If true, will capture all gestures inside of the pan mask. If 'open' will
    * only capture when drawer is open
    */
  var captureGestures: js.UndefOr[
    scala.Boolean | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.open | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.closed
  ] = js.undefined
  /**
    * Same as openDrawerOffset, except defines left hand margin when drawer is closed
    */
  var closedDrawerOffset: js.UndefOr[js.Function0[scala.Double] | scala.Double] = js.undefined
  // Important
  /**
    * Menu component
    */
  var content: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * If true the drawer can not be opened and will not respond to pans
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * (Android-only) Sets the elevation of the drawer using Android's underlying elevation API
    */
  var elevation: js.UndefOr[scala.Double] = js.undefined
  /**
    * Initialize with drawer open
    */
  var initializeOpen: js.UndefOr[scala.Double] = js.undefined
  /**
    * If true, attempts to handle only horizontal swipes, making it play well with a child ScrollView
    */
  var negotiatePan: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Will be called immediately after the drawer has entered the closed state
    */
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Ccallback fired at the start of a close animation
    */
  var onCloseStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback fired when a drag gesture starts.
    */
  var onDragStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  // Event Handlers
  /**
    * Will be called immediately after the drawer has entered the open state
    */
  var onOpen: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Callback fired at the start of an open animation
    */
  var onOpenStart: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * If true will trigger drawer open, if false will trigger close.
    */
  var open: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Can either be a integer (pixel value) or decimal (ratio of screen width). Defines the right hand margin when
    * the drawer is open. Or, can be function which returns offset
    */
  var openDrawerOffset: js.UndefOr[
    (js.Function1[/* viewport */ reactDashNativeLib.reactDashNativeMod.ScaledSize, scala.Double]) | scala.Double
  ] = js.undefined
  /**
    * Ratio of screen width that is valid for the start of a pan close action. If null -> defaults to max(.05, openDrawerOffset)
    */
  var panCloseMask: js.UndefOr[scala.Double] = js.undefined
  /**
    * Ratio of screen width that is valid for the start of a pan open action. If null -> defaults to max(.05, closedDrawerOffset)
    */
  var panOpenMask: js.UndefOr[scala.Double] = js.undefined
  // Additional Configurations
  /**
    * Ratio of screen width that must be travelled to trigger a drawer open/close
    */
  var panThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * which side the drawer should be on.
    */
  var side: js.UndefOr[
    reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.left | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.right | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.top | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.bottom
  ] = js.undefined
  /**
    * Styles for the drawer, main, drawerOverlay and mainOverlay container Views
    */
  var styles: js.UndefOr[DrawerStyles] = js.undefined
  /**
    * Same as acceptTap, except only for close
    */
  var tapToClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The duration of the open/close animation
    */
  var tweenDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    *  A easing type supported by tween-functions
    */
  var tweenEasing: js.UndefOr[TweenFunctions] = js.undefined
  // Animation / Tween
  /**
    * Takes in the pan ratio (decimal 0 to 1) that represents the tween percent. Returns an object of
    * native props to be set on the constituent views
    */
  var tweenHandler: js.UndefOr[js.Function1[/* ratio */ scala.Double, NestedViewStyles]] = js.undefined
  /**
    * Type of drawer
    */
  var `type`: js.UndefOr[
    reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.displace | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.overlay | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.static
  ] = js.undefined
  /**
    * if true will run InteractionManager for open/close animations.
    */
  var useInteractionManager: js.UndefOr[scala.Boolean] = js.undefined
}

object DrawerProperties {
  @scala.inline
  def apply(
    acceptDoubleTap: js.UndefOr[scala.Boolean] = js.undefined,
    acceptPan: js.UndefOr[scala.Boolean] = js.undefined,
    acceptPanOnDrawer: js.UndefOr[scala.Boolean] = js.undefined,
    acceptTap: js.UndefOr[scala.Boolean] = js.undefined,
    captureGestures: scala.Boolean | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.open | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.closed = null,
    closedDrawerOffset: js.Function0[scala.Double] | scala.Double = null,
    content: reactLib.reactMod.ReactNs.ReactNode = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    elevation: scala.Int | scala.Double = null,
    initializeOpen: scala.Int | scala.Double = null,
    negotiatePan: js.UndefOr[scala.Boolean] = js.undefined,
    onClose: js.Function0[scala.Unit] = null,
    onCloseStart: js.Function0[scala.Unit] = null,
    onDragStart: js.Function0[scala.Unit] = null,
    onOpen: js.Function0[scala.Unit] = null,
    onOpenStart: js.Function0[scala.Unit] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    openDrawerOffset: (js.Function1[/* viewport */ reactDashNativeLib.reactDashNativeMod.ScaledSize, scala.Double]) | scala.Double = null,
    panCloseMask: scala.Int | scala.Double = null,
    panOpenMask: scala.Int | scala.Double = null,
    panThreshold: scala.Int | scala.Double = null,
    side: reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.left | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.right | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.top | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.bottom = null,
    styles: DrawerStyles = null,
    tapToClose: js.UndefOr[scala.Boolean] = js.undefined,
    tweenDuration: scala.Int | scala.Double = null,
    tweenEasing: TweenFunctions = null,
    tweenHandler: js.Function1[/* ratio */ scala.Double, NestedViewStyles] = null,
    `type`: reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.displace | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.overlay | reactDashNativeDashDrawerLib.reactDashNativeDashDrawerLibStrings.static = null,
    useInteractionManager: js.UndefOr[scala.Boolean] = js.undefined
  ): DrawerProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptDoubleTap)) __obj.updateDynamic("acceptDoubleTap")(acceptDoubleTap)
    if (!js.isUndefined(acceptPan)) __obj.updateDynamic("acceptPan")(acceptPan)
    if (!js.isUndefined(acceptPanOnDrawer)) __obj.updateDynamic("acceptPanOnDrawer")(acceptPanOnDrawer)
    if (!js.isUndefined(acceptTap)) __obj.updateDynamic("acceptTap")(acceptTap)
    if (captureGestures != null) __obj.updateDynamic("captureGestures")(captureGestures.asInstanceOf[js.Any])
    if (closedDrawerOffset != null) __obj.updateDynamic("closedDrawerOffset")(closedDrawerOffset.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    if (initializeOpen != null) __obj.updateDynamic("initializeOpen")(initializeOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(negotiatePan)) __obj.updateDynamic("negotiatePan")(negotiatePan)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onCloseStart != null) __obj.updateDynamic("onCloseStart")(onCloseStart)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (onOpenStart != null) __obj.updateDynamic("onOpenStart")(onOpenStart)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (openDrawerOffset != null) __obj.updateDynamic("openDrawerOffset")(openDrawerOffset.asInstanceOf[js.Any])
    if (panCloseMask != null) __obj.updateDynamic("panCloseMask")(panCloseMask.asInstanceOf[js.Any])
    if (panOpenMask != null) __obj.updateDynamic("panOpenMask")(panOpenMask.asInstanceOf[js.Any])
    if (panThreshold != null) __obj.updateDynamic("panThreshold")(panThreshold.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (!js.isUndefined(tapToClose)) __obj.updateDynamic("tapToClose")(tapToClose)
    if (tweenDuration != null) __obj.updateDynamic("tweenDuration")(tweenDuration.asInstanceOf[js.Any])
    if (tweenEasing != null) __obj.updateDynamic("tweenEasing")(tweenEasing)
    if (tweenHandler != null) __obj.updateDynamic("tweenHandler")(tweenHandler)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useInteractionManager)) __obj.updateDynamic("useInteractionManager")(useInteractionManager)
    __obj.asInstanceOf[DrawerProperties]
  }
}

