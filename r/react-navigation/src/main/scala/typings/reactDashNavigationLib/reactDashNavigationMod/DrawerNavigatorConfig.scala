package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerNavigatorConfig
  extends NavigationTabRouterConfig
     with DrawerViewConfig {
  var containerConfig: js.UndefOr[js.Any] = js.undefined
  @JSName("contentOptions")
  var contentOptions_DrawerNavigatorConfig: js.UndefOr[reactDashNavigationLib.Anon_ActiveBackgroundColor] = js.undefined
  var drawerLockMode: js.UndefOr[DrawerLockMode] = js.undefined
}

object DrawerNavigatorConfig {
  @scala.inline
  def apply(
    backBehavior: reactDashNavigationLib.reactDashNavigationLibStrings.none | reactDashNavigationLib.reactDashNavigationLibStrings.initialRoute = null,
    containerConfig: js.Any = null,
    contentComponent: reactLib.reactMod.ReactNs.ComponentType[DrawerItemsProps] = null,
    contentOptions: reactDashNavigationLib.Anon_ActiveBackgroundColor = null,
    defaultNavigationOptions: NavigationScreenConfig[NavigationScreenOptions] = null,
    drawerBackgroundColor: java.lang.String = null,
    drawerLockMode: DrawerLockMode = null,
    drawerPosition: reactDashNavigationLib.reactDashNavigationLibStrings.left | reactDashNavigationLib.reactDashNavigationLibStrings.right = null,
    drawerWidth: scala.Int | scala.Double = null,
    initialRouteName: java.lang.String = null,
    initialRouteParams: NavigationParams = null,
    navigationOptions: NavigationTabRouterConfigBase = null,
    order: js.Array[java.lang.String] = null,
    paths: NavigationPathsConfig = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
  ): DrawerNavigatorConfig = {
    val __obj = js.Dynamic.literal()
    if (backBehavior != null) __obj.updateDynamic("backBehavior")(backBehavior.asInstanceOf[js.Any])
    if (containerConfig != null) __obj.updateDynamic("containerConfig")(containerConfig)
    if (contentComponent != null) __obj.updateDynamic("contentComponent")(contentComponent.asInstanceOf[js.Any])
    if (contentOptions != null) __obj.updateDynamic("contentOptions")(contentOptions)
    if (defaultNavigationOptions != null) __obj.updateDynamic("defaultNavigationOptions")(defaultNavigationOptions.asInstanceOf[js.Any])
    if (drawerBackgroundColor != null) __obj.updateDynamic("drawerBackgroundColor")(drawerBackgroundColor)
    if (drawerLockMode != null) __obj.updateDynamic("drawerLockMode")(drawerLockMode)
    if (drawerPosition != null) __obj.updateDynamic("drawerPosition")(drawerPosition.asInstanceOf[js.Any])
    if (drawerWidth != null) __obj.updateDynamic("drawerWidth")(drawerWidth.asInstanceOf[js.Any])
    if (initialRouteName != null) __obj.updateDynamic("initialRouteName")(initialRouteName)
    if (initialRouteParams != null) __obj.updateDynamic("initialRouteParams")(initialRouteParams)
    if (navigationOptions != null) __obj.updateDynamic("navigationOptions")(navigationOptions)
    if (order != null) __obj.updateDynamic("order")(order)
    if (paths != null) __obj.updateDynamic("paths")(paths)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerNavigatorConfig]
  }
}

