package typings
package protonDashNativeLib.protonDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowProps extends js.Object {
  /**
    * Whether the window will have a border on the inside.
    */
  var borderless: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Window can only have one child. To have more than one child, use boxes.
    */
  var children: js.UndefOr[reactLib.reactMod.Global.JSXNs.Element] = js.undefined
  /**
    * Whether the window is closed. If set to closed, then the window will be closed.
    */
  var closed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the window will be fullscreen on start.
    */
  var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the window is the last window. If set to `true`, then the program will quit once the window is closed.
    */
  var lastWindow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether all children will have a margin around them and the outer edge of the window.
    */
  var margined: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether a menubar will be shown on the top of the window.
    */
  var menuBar: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Called when the window is closed.
    */
  var onClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Called when the window size is changed by the user. The new size is passed as an argument, in an object.
    */
  var onContentSizeChange: js.UndefOr[js.Function1[/* size */ protonDashNativeLib.Anon_HY, scala.Unit]] = js.undefined
  /**
    * How big the window is when the application is first started.
    */
  var size: js.UndefOr[protonDashNativeLib.Anon_HW] = js.undefined
  /**
    * The title of the window. Will be shown at the top left ribbon.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object WindowProps {
  @scala.inline
  def apply(
    borderless: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.Global.JSXNs.Element = null,
    closed: js.UndefOr[scala.Boolean] = js.undefined,
    fullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    lastWindow: js.UndefOr[scala.Boolean] = js.undefined,
    margined: js.UndefOr[scala.Boolean] = js.undefined,
    menuBar: js.UndefOr[scala.Boolean] = js.undefined,
    onClose: js.Function0[scala.Unit] = null,
    onContentSizeChange: js.Function1[/* size */ protonDashNativeLib.Anon_HY, scala.Unit] = null,
    size: protonDashNativeLib.Anon_HW = null,
    title: java.lang.String = null
  ): WindowProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(borderless)) __obj.updateDynamic("borderless")(borderless)
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (!js.isUndefined(lastWindow)) __obj.updateDynamic("lastWindow")(lastWindow)
    if (!js.isUndefined(margined)) __obj.updateDynamic("margined")(margined)
    if (!js.isUndefined(menuBar)) __obj.updateDynamic("menuBar")(menuBar)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onContentSizeChange != null) __obj.updateDynamic("onContentSizeChange")(onContentSizeChange)
    if (size != null) __obj.updateDynamic("size")(size)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[WindowProps]
  }
}

