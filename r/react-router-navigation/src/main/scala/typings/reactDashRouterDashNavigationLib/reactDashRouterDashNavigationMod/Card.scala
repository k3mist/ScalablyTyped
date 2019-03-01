package typings
package reactDashRouterDashNavigationLib.reactDashRouterDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card
  extends reactDashRouterDashNavigationDashCoreLib.reactDashRouterDashNavigationDashCoreMod.RouteProps
     with NavBarProps {
  var key: java.lang.String
}

object Card {
  @scala.inline
  def apply(
    key: java.lang.String,
    backButtonTintColor: java.lang.String = null,
    backButtonTitle: java.lang.String = null,
    children: (js.Function1[
      /* props */ reactDashRouterLib.reactDashRouterMod.RouterProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ]) | reactLib.reactMod.ReactNs.ReactNode = null,
    component: reactLib.reactMod.ReactNs.ComponentClass[
      reactDashRouterLib.reactDashRouterMod.RouterProps, 
      reactLib.reactMod.ReactNs.ComponentState
    ] = null,
    exact: js.UndefOr[scala.Boolean] = js.undefined,
    hideBackButton: js.UndefOr[scala.Boolean] = js.undefined,
    hideNavBar: js.UndefOr[scala.Boolean] = js.undefined,
    navBarStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    path: java.lang.String = null,
    render: js.Function1[
      /* props */ reactDashRouterLib.reactDashRouterMod.RouterProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    renderLeftButton: js.Function1[/* props */ CardSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    renderNavBar: js.Function1[/* props */ CardSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    renderRightButton: js.Function1[/* props */ CardSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    renderTitle: js.Function1[/* props */ CardSubViewProps, reactLib.reactMod.ReactNs.ReactNode] = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    titleStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null
  ): Card = {
    val __obj = js.Dynamic.literal(key = key)
    if (backButtonTintColor != null) __obj.updateDynamic("backButtonTintColor")(backButtonTintColor)
    if (backButtonTitle != null) __obj.updateDynamic("backButtonTitle")(backButtonTitle)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component)
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    if (!js.isUndefined(hideBackButton)) __obj.updateDynamic("hideBackButton")(hideBackButton)
    if (!js.isUndefined(hideNavBar)) __obj.updateDynamic("hideNavBar")(hideNavBar)
    if (navBarStyle != null) __obj.updateDynamic("navBarStyle")(navBarStyle.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (render != null) __obj.updateDynamic("render")(render)
    if (renderLeftButton != null) __obj.updateDynamic("renderLeftButton")(renderLeftButton)
    if (renderNavBar != null) __obj.updateDynamic("renderNavBar")(renderNavBar)
    if (renderRightButton != null) __obj.updateDynamic("renderRightButton")(renderRightButton)
    if (renderTitle != null) __obj.updateDynamic("renderTitle")(renderTitle)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (title != null) __obj.updateDynamic("title")(title)
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
}

