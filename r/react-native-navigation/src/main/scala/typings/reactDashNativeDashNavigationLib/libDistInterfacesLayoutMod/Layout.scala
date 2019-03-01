package typings
package reactDashNativeDashNavigationLib.libDistInterfacesLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Layout[P] extends js.Object {
  /**
    * Set the bottom tabs
    */
  var bottomTabs: js.UndefOr[LayoutBottomTabs] = js.undefined
  /**
    * Set the component
    */
  var component: js.UndefOr[LayoutComponent[P]] = js.undefined
  /**
    * Set the external component
    */
  var externalComponent: js.UndefOr[ExternalComponent] = js.undefined
  /**
    * Set the side menu
    */
  var sideMenu: js.UndefOr[LayoutSideMenu] = js.undefined
  /**
    * Set the split view
    */
  var splitView: js.UndefOr[LayoutSplitView] = js.undefined
  /**
    * Set the stack
    */
  var stack: js.UndefOr[LayoutStack] = js.undefined
  /**
    * Set the top tabs
    */
  var topTabs: js.UndefOr[TopTabs] = js.undefined
}

object Layout {
  @scala.inline
  def apply[P](
    bottomTabs: LayoutBottomTabs = null,
    component: LayoutComponent[P] = null,
    externalComponent: ExternalComponent = null,
    sideMenu: LayoutSideMenu = null,
    splitView: LayoutSplitView = null,
    stack: LayoutStack = null,
    topTabs: TopTabs = null
  ): Layout[P] = {
    val __obj = js.Dynamic.literal()
    if (bottomTabs != null) __obj.updateDynamic("bottomTabs")(bottomTabs)
    if (component != null) __obj.updateDynamic("component")(component)
    if (externalComponent != null) __obj.updateDynamic("externalComponent")(externalComponent)
    if (sideMenu != null) __obj.updateDynamic("sideMenu")(sideMenu)
    if (splitView != null) __obj.updateDynamic("splitView")(splitView)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (topTabs != null) __obj.updateDynamic("topTabs")(topTabs)
    __obj.asInstanceOf[Layout[P]]
  }
}

