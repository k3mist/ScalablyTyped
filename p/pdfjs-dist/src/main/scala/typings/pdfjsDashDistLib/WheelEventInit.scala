package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WheelEventInit extends MouseEventInit {
  var deltaMode: js.UndefOr[scala.Double] = js.undefined
  var deltaX: js.UndefOr[scala.Double] = js.undefined
  var deltaY: js.UndefOr[scala.Double] = js.undefined
  var deltaZ: js.UndefOr[scala.Double] = js.undefined
}

object WheelEventInit {
  @scala.inline
  def apply(
    altKey: js.UndefOr[scala.Boolean] = js.undefined,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    button: scala.Int | scala.Double = null,
    buttons: scala.Int | scala.Double = null,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    clientX: scala.Int | scala.Double = null,
    clientY: scala.Int | scala.Double = null,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    ctrlKey: js.UndefOr[scala.Boolean] = js.undefined,
    deltaMode: scala.Int | scala.Double = null,
    deltaX: scala.Int | scala.Double = null,
    deltaY: scala.Int | scala.Double = null,
    deltaZ: scala.Int | scala.Double = null,
    detail: scala.Int | scala.Double = null,
    metaKey: js.UndefOr[scala.Boolean] = js.undefined,
    modifierAltGraph: js.UndefOr[scala.Boolean] = js.undefined,
    modifierCapsLock: js.UndefOr[scala.Boolean] = js.undefined,
    modifierFn: js.UndefOr[scala.Boolean] = js.undefined,
    modifierFnLock: js.UndefOr[scala.Boolean] = js.undefined,
    modifierHyper: js.UndefOr[scala.Boolean] = js.undefined,
    modifierNumLock: js.UndefOr[scala.Boolean] = js.undefined,
    modifierOS: js.UndefOr[scala.Boolean] = js.undefined,
    modifierScrollLock: js.UndefOr[scala.Boolean] = js.undefined,
    modifierSuper: js.UndefOr[scala.Boolean] = js.undefined,
    modifierSymbol: js.UndefOr[scala.Boolean] = js.undefined,
    modifierSymbolLock: js.UndefOr[scala.Boolean] = js.undefined,
    relatedTarget: EventTarget = null,
    screenX: scala.Int | scala.Double = null,
    screenY: scala.Int | scala.Double = null,
    shiftKey: js.UndefOr[scala.Boolean] = js.undefined,
    view: Window = null
  ): WheelEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (button != null) __obj.updateDynamic("button")(button.asInstanceOf[js.Any])
    if (buttons != null) __obj.updateDynamic("buttons")(buttons.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (clientX != null) __obj.updateDynamic("clientX")(clientX.asInstanceOf[js.Any])
    if (clientY != null) __obj.updateDynamic("clientY")(clientY.asInstanceOf[js.Any])
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey)
    if (deltaMode != null) __obj.updateDynamic("deltaMode")(deltaMode.asInstanceOf[js.Any])
    if (deltaX != null) __obj.updateDynamic("deltaX")(deltaX.asInstanceOf[js.Any])
    if (deltaY != null) __obj.updateDynamic("deltaY")(deltaY.asInstanceOf[js.Any])
    if (deltaZ != null) __obj.updateDynamic("deltaZ")(deltaZ.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (!js.isUndefined(metaKey)) __obj.updateDynamic("metaKey")(metaKey)
    if (!js.isUndefined(modifierAltGraph)) __obj.updateDynamic("modifierAltGraph")(modifierAltGraph)
    if (!js.isUndefined(modifierCapsLock)) __obj.updateDynamic("modifierCapsLock")(modifierCapsLock)
    if (!js.isUndefined(modifierFn)) __obj.updateDynamic("modifierFn")(modifierFn)
    if (!js.isUndefined(modifierFnLock)) __obj.updateDynamic("modifierFnLock")(modifierFnLock)
    if (!js.isUndefined(modifierHyper)) __obj.updateDynamic("modifierHyper")(modifierHyper)
    if (!js.isUndefined(modifierNumLock)) __obj.updateDynamic("modifierNumLock")(modifierNumLock)
    if (!js.isUndefined(modifierOS)) __obj.updateDynamic("modifierOS")(modifierOS)
    if (!js.isUndefined(modifierScrollLock)) __obj.updateDynamic("modifierScrollLock")(modifierScrollLock)
    if (!js.isUndefined(modifierSuper)) __obj.updateDynamic("modifierSuper")(modifierSuper)
    if (!js.isUndefined(modifierSymbol)) __obj.updateDynamic("modifierSymbol")(modifierSymbol)
    if (!js.isUndefined(modifierSymbolLock)) __obj.updateDynamic("modifierSymbolLock")(modifierSymbolLock)
    if (relatedTarget != null) __obj.updateDynamic("relatedTarget")(relatedTarget)
    if (screenX != null) __obj.updateDynamic("screenX")(screenX.asInstanceOf[js.Any])
    if (screenY != null) __obj.updateDynamic("screenY")(screenY.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[WheelEventInit]
  }
}

