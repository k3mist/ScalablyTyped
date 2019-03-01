package typings
package semanticDashUiDashReactLib.distCommonjsAddonsPortalPortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalProps
  extends StrictPortalProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object PortalProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    closeOnDocumentClick: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnPortalMouseLeave: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnTriggerBlur: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnTriggerClick: js.UndefOr[scala.Boolean] = js.undefined,
    closeOnTriggerMouseLeave: js.UndefOr[scala.Boolean] = js.undefined,
    defaultOpen: js.UndefOr[scala.Boolean] = js.undefined,
    eventPool: java.lang.String = null,
    mountNode: js.Any = null,
    mouseEnterDelay: scala.Int | scala.Double = null,
    mouseLeaveDelay: scala.Int | scala.Double = null,
    onClose: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ PortalProps, 
      scala.Unit
    ] = null,
    onMount: js.Function2[/* nothing */ scala.Null, /* data */ PortalProps, scala.Unit] = null,
    onOpen: js.Function2[
      /* event */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent], 
      /* data */ PortalProps, 
      scala.Unit
    ] = null,
    onUnmount: js.Function2[/* nothing */ scala.Null, /* data */ PortalProps, scala.Unit] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    openOnTriggerClick: js.UndefOr[scala.Boolean] = js.undefined,
    openOnTriggerFocus: js.UndefOr[scala.Boolean] = js.undefined,
    openOnTriggerMouseEnter: js.UndefOr[scala.Boolean] = js.undefined,
    trigger: reactLib.reactMod.ReactNs.ReactNode = null,
    triggerRef: js.Function1[/* node */ reactLib.HTMLElement, scala.Unit] = null
  ): PortalProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnDocumentClick)) __obj.updateDynamic("closeOnDocumentClick")(closeOnDocumentClick)
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape)
    if (!js.isUndefined(closeOnPortalMouseLeave)) __obj.updateDynamic("closeOnPortalMouseLeave")(closeOnPortalMouseLeave)
    if (!js.isUndefined(closeOnTriggerBlur)) __obj.updateDynamic("closeOnTriggerBlur")(closeOnTriggerBlur)
    if (!js.isUndefined(closeOnTriggerClick)) __obj.updateDynamic("closeOnTriggerClick")(closeOnTriggerClick)
    if (!js.isUndefined(closeOnTriggerMouseLeave)) __obj.updateDynamic("closeOnTriggerMouseLeave")(closeOnTriggerMouseLeave)
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen)
    if (eventPool != null) __obj.updateDynamic("eventPool")(eventPool)
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode)
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onMount != null) __obj.updateDynamic("onMount")(onMount)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(onUnmount)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (!js.isUndefined(openOnTriggerClick)) __obj.updateDynamic("openOnTriggerClick")(openOnTriggerClick)
    if (!js.isUndefined(openOnTriggerFocus)) __obj.updateDynamic("openOnTriggerFocus")(openOnTriggerFocus)
    if (!js.isUndefined(openOnTriggerMouseEnter)) __obj.updateDynamic("openOnTriggerMouseEnter")(openOnTriggerMouseEnter)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (triggerRef != null) __obj.updateDynamic("triggerRef")(triggerRef)
    __obj.asInstanceOf[PortalProps]
  }
}

