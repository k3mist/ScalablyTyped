package typings
package atBlueprintjsCoreLib.libEsmComponentsPopoverPopoverSharedPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPopoverSharedProps
  extends atBlueprintjsCoreLib.libEsmComponentsOverlayOverlayMod.IOverlayableProps
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Determines the boundary element used by Popper for its `flip` and
    * `preventOverflow` modifiers. Three shorthand keywords are supported;
    * Popper will find the correct DOM element itself.
    * @default "scrollParent"
    */
  var boundary: js.UndefOr[popperDotJsLib.popperDotJsMod.Boundary] = js.undefined
  /**
    * When enabled, `preventDefault()` is invoked on `click` events that close
    * this popover, which will prevent those clicks from closing outer
    * popovers. When disabled, clicking inside a `Classes.POPOVER_DISMISS`
    * element will close the parent popover.
    *
    * See http://blueprintjs.com/docs/#core/components/popover.closing-on-click
    * @default false
    */
  var captureDismiss: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Initial opened state when uncontrolled.
    * @default false
    */
  var defaultIsOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prevents the popover from appearing when `true`.
    * @default false
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The amount of time in milliseconds the popover should remain open after
    * the user hovers off the trigger. The timer is canceled if the user mouses
    * over the target before it expires.
    * @default 300
    */
  var hoverCloseDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * The amount of time in milliseconds the popover should wait before opening
    * after the user hovers over the trigger. The timer is canceled if the user
    * mouses away from the target before it expires.
    * @default 150
    */
  var hoverOpenDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether a popover that uses a `Portal` should automatically inherit the
    * dark theme from its parent.
    * @default true
    */
  var inheritDarkTheme: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the popover is visible. Passing this prop puts the popover in
    * controlled mode, where the only way to change visibility is by updating
    * this property. If `disabled={true}`, this prop will be ignored, and the
    * popover will remain closed.
    * @default undefined
    */
  var isOpen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Popper modifier options, passed directly to internal Popper instance. See
    * https://popper.js.org/popper-documentation.html#modifiers for complete
    * details.
    */
  var modifiers: js.UndefOr[popperDotJsLib.popperDotJsMod.Modifiers] = js.undefined
  /**
    * Callback invoked in controlled mode when the popover open state *would*
    * change due to user interaction.
    */
  var onInteraction: js.UndefOr[js.Function1[/* nextOpenState */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * Whether the popover should open when its target is focused. If `true`,
    * target will render with `tabindex="0"` to make it focusable via keyboard
    * navigation.
    * @default true
    */
  var openOnTargetFocus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A space-delimited string of class names applied to the popover element.
    */
  var popoverClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The position (relative to the target) at which the popover should appear.
    *
    * The default value of `"auto"` will choose the best position when opened
    * and will allow the popover to reposition itself to remain onscreen as the
    * user scrolls around.
    * @default "auto"
    */
  var position: js.UndefOr[PopoverPosition] = js.undefined
  /**
    * Space-delimited string of class names applied to the target element.
    */
  var targetClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * HTML props to spread to target element. Use `targetTagName` to change
    * the type of element rendered. Note that `ref` is not supported.
    */
  var targetProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement]] = js.undefined
  /**
    * HTML tag name for the target element. This must be an HTML element to
    * ensure that it supports the necessary DOM event handlers.
    *
    * By default, a `<span>` tag is used so popovers appear as inline-block
    * elements and can be nested in text. Use `<div>` tag for a block element.
    * @default "span"
    */
  var targetTagName: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any
  ] = js.undefined
  /**
    * HTML tag name for the wrapper element, which also receives the
    * `className` prop.
    * @default "span"
    */
  var wrapperTagName: js.UndefOr[
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any
  ] = js.undefined
}

object IPopoverSharedProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    boundary: popperDotJsLib.popperDotJsMod.Boundary = null,
    canEscapeKeyClose: js.UndefOr[scala.Boolean] = js.undefined,
    captureDismiss: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    defaultIsOpen: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    enforceFocus: js.UndefOr[scala.Boolean] = js.undefined,
    hoverCloseDelay: scala.Int | scala.Double = null,
    hoverOpenDelay: scala.Int | scala.Double = null,
    inheritDarkTheme: js.UndefOr[scala.Boolean] = js.undefined,
    isOpen: js.UndefOr[scala.Boolean] = js.undefined,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    modifiers: popperDotJsLib.popperDotJsMod.Modifiers = null,
    onClose: js.Function1[
      /* event */ js.UndefOr[reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event]], 
      scala.Unit
    ] = null,
    onClosed: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    onClosing: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    onInteraction: js.Function1[/* nextOpenState */ scala.Boolean, scala.Unit] = null,
    onOpened: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    onOpening: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null,
    openOnTargetFocus: js.UndefOr[scala.Boolean] = js.undefined,
    popoverClassName: java.lang.String = null,
    portalClassName: java.lang.String = null,
    portalContainer: reactLib.HTMLElement = null,
    position: PopoverPosition = null,
    targetClassName: java.lang.String = null,
    targetProps: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] = null,
    targetTagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any = null,
    transitionDuration: scala.Int | scala.Double = null,
    usePortal: js.UndefOr[scala.Boolean] = js.undefined,
    wrapperTagName: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 172 */ js.Any = null
  ): IPopoverSharedProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (boundary != null) __obj.updateDynamic("boundary")(boundary)
    if (!js.isUndefined(canEscapeKeyClose)) __obj.updateDynamic("canEscapeKeyClose")(canEscapeKeyClose)
    if (!js.isUndefined(captureDismiss)) __obj.updateDynamic("captureDismiss")(captureDismiss)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(defaultIsOpen)) __obj.updateDynamic("defaultIsOpen")(defaultIsOpen)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(enforceFocus)) __obj.updateDynamic("enforceFocus")(enforceFocus)
    if (hoverCloseDelay != null) __obj.updateDynamic("hoverCloseDelay")(hoverCloseDelay.asInstanceOf[js.Any])
    if (hoverOpenDelay != null) __obj.updateDynamic("hoverOpenDelay")(hoverOpenDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritDarkTheme)) __obj.updateDynamic("inheritDarkTheme")(inheritDarkTheme)
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onClosed != null) __obj.updateDynamic("onClosed")(onClosed)
    if (onClosing != null) __obj.updateDynamic("onClosing")(onClosing)
    if (onInteraction != null) __obj.updateDynamic("onInteraction")(onInteraction)
    if (onOpened != null) __obj.updateDynamic("onOpened")(onOpened)
    if (onOpening != null) __obj.updateDynamic("onOpening")(onOpening)
    if (!js.isUndefined(openOnTargetFocus)) __obj.updateDynamic("openOnTargetFocus")(openOnTargetFocus)
    if (popoverClassName != null) __obj.updateDynamic("popoverClassName")(popoverClassName)
    if (portalClassName != null) __obj.updateDynamic("portalClassName")(portalClassName)
    if (portalContainer != null) __obj.updateDynamic("portalContainer")(portalContainer)
    if (position != null) __obj.updateDynamic("position")(position)
    if (targetClassName != null) __obj.updateDynamic("targetClassName")(targetClassName)
    if (targetProps != null) __obj.updateDynamic("targetProps")(targetProps)
    if (targetTagName != null) __obj.updateDynamic("targetTagName")(targetTagName)
    if (transitionDuration != null) __obj.updateDynamic("transitionDuration")(transitionDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(usePortal)) __obj.updateDynamic("usePortal")(usePortal)
    if (wrapperTagName != null) __obj.updateDynamic("wrapperTagName")(wrapperTagName)
    __obj.asInstanceOf[IPopoverSharedProps]
  }
}

