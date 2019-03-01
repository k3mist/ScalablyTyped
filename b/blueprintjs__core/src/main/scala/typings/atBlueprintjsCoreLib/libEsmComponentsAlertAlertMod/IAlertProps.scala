package typings
package atBlueprintjsCoreLib.libEsmComponentsAlertAlertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAlertProps
  extends atBlueprintjsCoreLib.libEsmComponentsOverlayOverlayMod.IOverlayLifecycleProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Whether pressing <kbd>escape</kbd> when focused on the Alert should cancel the alert.
    * If this prop is enabled, then either `onCancel` or `onClose` must also be defined.
    * @default false
    */
  var canEscapeKeyCancel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether clicking outside the Alert should cancel the alert.
    * If this prop is enabled, then either `onCancel` or `onClose` must also be defined.
    * @default false
    */
  var canOutsideClickCancel: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The text for the cancel button.
    * If this prop is defined, then either `onCancel` or `onClose` must also be defined.
    */
  var cancelButtonText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text for the confirm (right-most) button.
    * This button will always appear, and uses the value of the `intent` prop below.
    * @default "OK"
    */
  var confirmButtonText: js.UndefOr[java.lang.String] = js.undefined
  /** Name of a Blueprint UI icon (or an icon element) to display on the left side. */
  var icon: js.UndefOr[
    atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement
  ] = js.undefined
  /**
    * The intent to be applied to the confirm (right-most) button.
    */
  var intent: js.UndefOr[atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent] = js.undefined
  /**
    * Toggles the visibility of the alert.
    * This prop is required because the component is controlled.
    */
  var isOpen: scala.Boolean
  /**
    * Handler invoked when the alert is canceled. Alerts can be **canceled** in the following ways:
    * - clicking the cancel button (if `cancelButtonText` is defined)
    * - pressing the escape key (if `canEscapeKeyCancel` is enabled)
    * - clicking on the overlay backdrop (if `canOutsideClickCancel` is enabled)
    *
    * If any of the `cancel` props are defined, then either `onCancel` or `onClose` must be defined.
    */
  var onCancel: js.UndefOr[
    js.Function1[
      /* evt */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Handler invoked when the Alert is confirmed or canceled; see `onConfirm` and `onCancel` for more details.
    * First argument is `true` if confirmed, `false` otherwise.
    * This is an alternative to defining separate `onConfirm` and `onCancel` handlers.
    */
  var onClose: js.UndefOr[
    js.Function2[
      /* confirmed */ scala.Boolean, 
      /* evt */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Handler invoked when the confirm button is clicked. Alerts can be **confirmed** in the following ways:
    * - clicking the confirm button
    * - focusing on the confirm button and pressing `enter` or `space`
    */
  var onConfirm: js.UndefOr[
    js.Function1[
      /* evt */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event]], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * The container element into which the overlay renders its contents, when `usePortal` is `true`.
    * This prop is ignored if `usePortal` is `false`.
    * @default document.body
    */
  var portalContainer: js.UndefOr[reactLib.HTMLElement] = js.undefined
  /**
    * CSS styles to apply to the alert.
    */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * Indicates how long (in milliseconds) the overlay's enter/leave transition takes.
    * This is used by React `CSSTransition` to know when a transition completes and must match
    * the duration of the animation in CSS. Only set this prop if you override Blueprint's default
    * transitions with new transitions of a different length.
    * @default 300
    */
  var transitionDuration: js.UndefOr[scala.Double] = js.undefined
}

object IAlertProps {
  @scala.inline
  def apply(
    isOpen: scala.Boolean,
    canEscapeKeyCancel: js.UndefOr[scala.Boolean] = js.undefined,
    canOutsideClickCancel: js.UndefOr[scala.Boolean] = js.undefined,
    cancelButtonText: java.lang.String = null,
    className: java.lang.String = null,
    confirmButtonText: java.lang.String = null,
    icon: atBlueprintjsIconsLib.libEsmIconNameMod.IconName | atBlueprintjsCoreLib.libEsmCommonPropsMod.MaybeElement = null,
    intent: atBlueprintjsCoreLib.libEsmCommonIntentMod.Intent = null,
    onCancel: js.Function1[
      /* evt */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event]], 
      scala.Unit
    ] = null,
    onClose: js.Function2[
      /* confirmed */ scala.Boolean, 
      /* evt */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event]], 
      scala.Unit
    ] = null,
    onClosed: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    onClosing: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    onConfirm: js.Function1[
      /* evt */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event]], 
      scala.Unit
    ] = null,
    onOpened: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    onOpening: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    portalContainer: reactLib.HTMLElement = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    transitionDuration: scala.Int | scala.Double = null
  ): IAlertProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen)
    if (!js.isUndefined(canEscapeKeyCancel)) __obj.updateDynamic("canEscapeKeyCancel")(canEscapeKeyCancel)
    if (!js.isUndefined(canOutsideClickCancel)) __obj.updateDynamic("canOutsideClickCancel")(canOutsideClickCancel)
    if (cancelButtonText != null) __obj.updateDynamic("cancelButtonText")(cancelButtonText)
    if (className != null) __obj.updateDynamic("className")(className)
    if (confirmButtonText != null) __obj.updateDynamic("confirmButtonText")(confirmButtonText)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent)
    if (onCancel != null) __obj.updateDynamic("onCancel")(onCancel)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onClosed != null) __obj.updateDynamic("onClosed")(onClosed)
    if (onClosing != null) __obj.updateDynamic("onClosing")(onClosing)
    if (onConfirm != null) __obj.updateDynamic("onConfirm")(onConfirm)
    if (onOpened != null) __obj.updateDynamic("onOpened")(onOpened)
    if (onOpening != null) __obj.updateDynamic("onOpening")(onOpening)
    if (portalContainer != null) __obj.updateDynamic("portalContainer")(portalContainer)
    if (style != null) __obj.updateDynamic("style")(style)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlertProps]
  }
}

