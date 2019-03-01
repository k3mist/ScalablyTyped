package typings
package reactDashBootstrapLib.libCollapseMod.CollapseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapseProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[reactDashBootstrapLib.libCollapseMod.Collapse]
     with reactDashBootstrapLib.reactDashBootstrapMod.TransitionCallbacks {
  var dimension: js.UndefOr[
    reactDashBootstrapLib.reactDashBootstrapLibStrings.height | reactDashBootstrapLib.reactDashBootstrapLibStrings.width | reactDashBootstrapLib.Anon_String
  ] = js.undefined
  var getDimensionValue: js.UndefOr[
    js.Function2[
      /* dimension */ scala.Double, 
      /* element */ reactLib.reactMod.ReactNs.ReactElement[_], 
      scala.Double
    ]
  ] = js.undefined
  var in: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var transitionAppear: js.UndefOr[scala.Boolean] = js.undefined
  var unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
}

object CollapseProps {
  @scala.inline
  def apply(
    dimension: reactDashBootstrapLib.reactDashBootstrapLibStrings.height | reactDashBootstrapLib.reactDashBootstrapLibStrings.width | reactDashBootstrapLib.Anon_String = null,
    getDimensionValue: js.Function2[
      /* dimension */ scala.Double, 
      /* element */ reactLib.reactMod.ReactNs.ReactElement[_], 
      scala.Double
    ] = null,
    in: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.ReactNs.Key = null,
    onEnter: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onEntered: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onEntering: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onExit: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onExited: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onExiting: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[reactDashBootstrapLib.libCollapseMod.Collapse] = null,
    timeout: scala.Int | scala.Double = null,
    transitionAppear: js.UndefOr[scala.Boolean] = js.undefined,
    unmountOnExit: js.UndefOr[scala.Boolean] = js.undefined
  ): CollapseProps = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (getDimensionValue != null) __obj.updateDynamic("getDimensionValue")(getDimensionValue)
    if (!js.isUndefined(in)) __obj.updateDynamic("in")(in)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered)
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering)
    if (onExit != null) __obj.updateDynamic("onExit")(onExit)
    if (onExited != null) __obj.updateDynamic("onExited")(onExited)
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionAppear)) __obj.updateDynamic("transitionAppear")(transitionAppear)
    if (!js.isUndefined(unmountOnExit)) __obj.updateDynamic("unmountOnExit")(unmountOnExit)
    __obj.asInstanceOf[CollapseProps]
  }
}

