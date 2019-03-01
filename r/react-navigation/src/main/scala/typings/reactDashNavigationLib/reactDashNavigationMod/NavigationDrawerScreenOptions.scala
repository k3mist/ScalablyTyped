package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationDrawerScreenOptions extends js.Object {
  var drawerIcon: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[_] | (js.Function1[
      /* options */ reactDashNavigationLib.Anon_Focused, 
      reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
    ])
  ] = js.undefined
  var drawerLabel: js.UndefOr[
    java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] | (js.Function1[
      /* options */ reactDashNavigationLib.Anon_Focused, 
      reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
    ])
  ] = js.undefined
  var drawerLockMode: js.UndefOr[DrawerLockMode] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object NavigationDrawerScreenOptions {
  @scala.inline
  def apply(
    drawerIcon: reactLib.reactMod.ReactNs.ReactElement[_] | (js.Function1[
      /* options */ reactDashNavigationLib.Anon_Focused, 
      reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
    ]) = null,
    drawerLabel: java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_] | (js.Function1[
      /* options */ reactDashNavigationLib.Anon_Focused, 
      reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null
    ]) = null,
    drawerLockMode: DrawerLockMode = null,
    title: java.lang.String = null
  ): NavigationDrawerScreenOptions = {
    val __obj = js.Dynamic.literal()
    if (drawerIcon != null) __obj.updateDynamic("drawerIcon")(drawerIcon.asInstanceOf[js.Any])
    if (drawerLabel != null) __obj.updateDynamic("drawerLabel")(drawerLabel.asInstanceOf[js.Any])
    if (drawerLockMode != null) __obj.updateDynamic("drawerLockMode")(drawerLockMode)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[NavigationDrawerScreenOptions]
  }
}

