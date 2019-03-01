package typings
package reactDashBootstrapLib.libTabPaneMod.TabPaneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabPaneProps
  extends reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libTabPaneMod.TabPane]
     with reactDashBootstrapLib.reactDashBootstrapMod.TransitionCallbacks {
  var animation: js.UndefOr[
    scala.Boolean | (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState])
  ] = js.undefined
  var bsClass: js.UndefOr[java.lang.String] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var mountOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  var unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
}

object TabPaneProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.ReactNs.HTMLProps[reactDashBootstrapLib.libTabPaneMod.TabPane] = null,
    TransitionCallbacks: reactDashBootstrapLib.reactDashBootstrapMod.TransitionCallbacks = null,
    animation: scala.Boolean | (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) = null,
    `aria-labelledby`: java.lang.String = null,
    bsClass: java.lang.String = null,
    eventKey: js.Any = null,
    mountOnEnter: js.UndefOr[scala.Boolean] = js.undefined,
    unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
  ): TabPaneProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    js.Dynamic.global.Object.assign(__obj, TransitionCallbacks)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`)
    if (bsClass != null) __obj.updateDynamic("bsClass")(bsClass)
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey)
    if (!js.isUndefined(mountOnEnter)) __obj.updateDynamic("mountOnEnter")(mountOnEnter)
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit)
    __obj.asInstanceOf[TabPaneProps]
  }
}

