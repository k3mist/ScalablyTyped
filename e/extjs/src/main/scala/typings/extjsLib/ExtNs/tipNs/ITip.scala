package typings
package extjsLib.ExtNs.tipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITip
  extends extjsLib.ExtNs.panelNs.IPanel {
  /** [Config Option] (Boolean) */
  var constrainPosition: js.UndefOr[scala.Boolean] = js.undefined
}

object ITip {
  @scala.inline
  def apply(
    IPanel: extjsLib.ExtNs.panelNs.IPanel = null,
    autoRender: js.Any = null,
    baseCls: java.lang.String = null,
    closable: js.UndefOr[scala.Boolean] = js.undefined,
    closeAction: java.lang.String = null,
    constrainPosition: js.UndefOr[scala.Boolean] = js.undefined,
    defaultAlign: java.lang.String = null,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    focusOnToFront: js.UndefOr[scala.Boolean] = js.undefined,
    frameHeader: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    maxWidth: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    shadow: js.Any = null,
    width: scala.Int | scala.Double = null
  ): ITip = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPanel)
    if (autoRender != null) __obj.updateDynamic("autoRender")(autoRender)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (closeAction != null) __obj.updateDynamic("closeAction")(closeAction)
    if (!js.isUndefined(constrainPosition)) __obj.updateDynamic("constrainPosition")(constrainPosition)
    if (defaultAlign != null) __obj.updateDynamic("defaultAlign")(defaultAlign)
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (!js.isUndefined(focusOnToFront)) __obj.updateDynamic("focusOnToFront")(focusOnToFront)
    if (!js.isUndefined(frameHeader)) __obj.updateDynamic("frameHeader")(frameHeader)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITip]
  }
}

