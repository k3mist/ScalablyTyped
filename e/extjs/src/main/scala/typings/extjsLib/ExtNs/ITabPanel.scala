package typings
package extjsLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabPanel
  extends extjsLib.ExtNs.panelNs.IPanel {
  /** [Config Option] (String/Number/Ext.Component) */
  var activeTab: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var deferredRender: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the item that is currently active inside this TabPanel
  		* @returns Ext.Component The currently active item.
  		*/
  var getActiveTab: js.UndefOr[js.Function0[IComponent]] = js.undefined
  /** [Method] Returns the Ext tab Bar currently used in this TabPanel
  		* @returns Ext.tab.Bar The TabBar
  		*/
  var getTabBar: js.UndefOr[js.Function0[extjsLib.ExtNs.tabNs.IBar]] = js.undefined
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var maxTabWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var minTabWidth: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Makes sure we have a Tab for each item added to the TabPanel
  		* @param item Object
  		* @param index Object
  		*/
  @JSName("onAdd")
  var onAdd_ITabPanel: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var removePanelHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Makes the given card active
  		* @param card String/Number/Ext.Component The card to make active. Either an ID, index or the component itself.
  		* @returns Ext.Component The resulting active child Component. The call may have been vetoed, or otherwise modified by an event listener.
  		*/
  var setActiveTab: js.UndefOr[js.Function1[/* card */ js.UndefOr[js.Any], IComponent]] = js.undefined
  /** [Config Option] (Object) */
  var tabBar: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] ("top"/"bottom"/"left"/"right") */
  var tabPosition: js.UndefOr[js.Any] = js.undefined
}

object ITabPanel {
  @scala.inline
  def apply(
    IPanel: extjsLib.ExtNs.panelNs.IPanel = null,
    activeItem: js.Any = null,
    activeTab: js.Any = null,
    deferredRender: js.UndefOr[scala.Boolean] = js.undefined,
    getActiveTab: js.Function0[IComponent] = null,
    getTabBar: js.Function0[extjsLib.ExtNs.tabNs.IBar] = null,
    itemCls: java.lang.String = null,
    layout: js.Any = null,
    maxTabWidth: scala.Int | scala.Double = null,
    minTabWidth: scala.Int | scala.Double = null,
    onAdd: js.Function2[/* item */ js.UndefOr[js.Any], /* index */ js.UndefOr[js.Any], scala.Unit] = null,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    removePanelHeader: js.UndefOr[scala.Boolean] = js.undefined,
    setActiveTab: js.Function1[/* card */ js.UndefOr[js.Any], IComponent] = null,
    tabBar: js.Any = null,
    tabPosition: js.Any = null
  ): ITabPanel = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPanel)
    if (activeItem != null) __obj.updateDynamic("activeItem")(activeItem)
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab)
    if (!js.isUndefined(deferredRender)) __obj.updateDynamic("deferredRender")(deferredRender)
    if (getActiveTab != null) __obj.updateDynamic("getActiveTab")(getActiveTab)
    if (getTabBar != null) __obj.updateDynamic("getTabBar")(getTabBar)
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (maxTabWidth != null) __obj.updateDynamic("maxTabWidth")(maxTabWidth.asInstanceOf[js.Any])
    if (minTabWidth != null) __obj.updateDynamic("minTabWidth")(minTabWidth.asInstanceOf[js.Any])
    if (onAdd != null) __obj.updateDynamic("onAdd")(onAdd)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (!js.isUndefined(removePanelHeader)) __obj.updateDynamic("removePanelHeader")(removePanelHeader)
    if (setActiveTab != null) __obj.updateDynamic("setActiveTab")(setActiveTab)
    if (tabBar != null) __obj.updateDynamic("tabBar")(tabBar)
    if (tabPosition != null) __obj.updateDynamic("tabPosition")(tabPosition)
    __obj.asInstanceOf[ITabPanel]
  }
}

