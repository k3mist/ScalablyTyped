package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawerItem extends js.Object {
  var focused: scala.Boolean
  var route: NavigationRoute[NavigationParams]
}

object DrawerItem {
  @scala.inline
  def apply(focused: scala.Boolean, route: NavigationRoute[NavigationParams]): DrawerItem = {
    val __obj = js.Dynamic.literal(focused = focused, route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DrawerItem]
  }
}

