package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationSwitchRouterConfig extends js.Object {
  var backBehavior: js.UndefOr[
    reactDashNavigationLib.reactDashNavigationLibStrings.none | reactDashNavigationLib.reactDashNavigationLibStrings.initialRoute
  ] = js.undefined
  var defaultNavigationOptions: js.UndefOr[NavigationScreenConfig[NavigationScreenOptions]] = js.undefined
  var initialRouteName: js.UndefOr[java.lang.String] = js.undefined
  var initialRouteParams: js.UndefOr[NavigationParams] = js.undefined
  var order: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
   // defaults to `'none'`
  var resetOnBlur: js.UndefOr[scala.Boolean] = js.undefined
}

object NavigationSwitchRouterConfig {
  @scala.inline
  def apply(
    backBehavior: reactDashNavigationLib.reactDashNavigationLibStrings.none | reactDashNavigationLib.reactDashNavigationLibStrings.initialRoute = null,
    defaultNavigationOptions: NavigationScreenConfig[NavigationScreenOptions] = null,
    initialRouteName: java.lang.String = null,
    initialRouteParams: NavigationParams = null,
    order: js.Array[java.lang.String] = null,
    paths: NavigationPathsConfig = null,
    resetOnBlur: js.UndefOr[scala.Boolean] = js.undefined
  ): NavigationSwitchRouterConfig = {
    val __obj = js.Dynamic.literal()
    if (backBehavior != null) __obj.updateDynamic("backBehavior")(backBehavior.asInstanceOf[js.Any])
    if (defaultNavigationOptions != null) __obj.updateDynamic("defaultNavigationOptions")(defaultNavigationOptions.asInstanceOf[js.Any])
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName)
    if (initialRouteParams != null) __obj.updateDynamic("initialRouteParams")(initialRouteParams)
    if (order != null) __obj.updateDynamic("order")(order)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (!js.isUndefined(resetOnBlur)) __obj.updateDynamic("resetOnBlur")(resetOnBlur)
    __obj.asInstanceOf[NavigationSwitchRouterConfig]
  }
}

