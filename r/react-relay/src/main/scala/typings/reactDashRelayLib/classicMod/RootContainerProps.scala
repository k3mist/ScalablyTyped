package typings
package reactDashRelayLib.classicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootContainerProps
  extends reactLib.reactMod.ReactNs.Props[RootContainer] {
  var Component: RelayContainerClass[_]
  var renderFailure: js.UndefOr[
    js.Function2[
      /* error */ stdLib.Error, 
      /* retry */ js.Function1[/* repeated */ js.Any, _], 
      reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
  var renderFetched: js.UndefOr[js.Function1[/* data */ js.Any, reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  var renderLoading: js.UndefOr[js.Function0[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  var route: Route
}

object RootContainerProps {
  @scala.inline
  def apply(
    Component: RelayContainerClass[_],
    route: Route,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[RootContainer] = null,
    renderFailure: js.Function2[
      /* error */ stdLib.Error, 
      /* retry */ js.Function1[/* repeated */ js.Any, _], 
      reactLib.reactMod.Global.JSXNs.Element
    ] = null,
    renderFetched: js.Function1[/* data */ js.Any, reactLib.reactMod.Global.JSXNs.Element] = null,
    renderLoading: js.Function0[reactLib.reactMod.Global.JSXNs.Element] = null
  ): RootContainerProps = {
    val __obj = js.Dynamic.literal(Component = Component, route = route)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (renderFailure != null) __obj.updateDynamic("renderFailure")(renderFailure)
    if (renderFetched != null) __obj.updateDynamic("renderFetched")(renderFetched)
    if (renderLoading != null) __obj.updateDynamic("renderLoading")(renderLoading)
    __obj.asInstanceOf[RootContainerProps]
  }
}

