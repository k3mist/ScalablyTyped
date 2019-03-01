package typings
package extjsLib.ExtNs.menuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenu
  extends extjsLib.ExtNs.panelNs.IPanel {
  /** [Method] Invoked after the Component is shown after onShow is called */
  @JSName("afterShow")
  var afterShow_IMenu: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var allowOtherMenus: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns whether a menu item can be activated or not
  		* @param item Object
  		* @returns Boolean
  		*/
  var canActivateItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Boolean]] = js.undefined
  /** [Method] Deactivates the current active item on the menu if one exists
  		* @param andBlurFocusedItem Object
  		*/
  var deactivateActiveItem: js.UndefOr[js.Function1[/* andBlurFocusedItem */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var enableKeyNav: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
  		* @returns Ext.Component this
  		*/
  @JSName("hide")
  var hide_IMenu: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Config Option] (Boolean) */
  var ignoreParentClicks: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var isMenu: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Menus are never contained and must not ascertain their visibility from the ancestor hierarchy
  		* @returns Boolean true if this component is visible, false otherwise.
  		*/
  @JSName("isVisible")
  var isVisible_IMenu: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Property] (Ext.menu.Menu) */
  var parentMenu: js.UndefOr[IMenu] = js.undefined
  /** [Config Option] (Boolean) */
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Shows this component by the specified Component or Element
  		* @param cmp Object
  		* @param pos Object
  		* @param off Object
  		* @returns Ext.Component this
  		*/
  @JSName("showBy")
  var showBy_IMenu: js.UndefOr[
    js.Function3[
      /* cmp */ js.UndefOr[js.Any], 
      /* pos */ js.UndefOr[js.Any], 
      /* off */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.IComponent
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var showSeparator: js.UndefOr[scala.Boolean] = js.undefined
}

object IMenu {
  @scala.inline
  def apply(
    IPanel: extjsLib.ExtNs.panelNs.IPanel = null,
    afterShow: js.Function0[scala.Unit] = null,
    allowOtherMenus: js.UndefOr[scala.Boolean] = js.undefined,
    beforeShow: js.Function0[scala.Unit] = null,
    canActivateItem: js.Function1[/* item */ js.UndefOr[js.Any], scala.Boolean] = null,
    deactivateActiveItem: js.Function1[/* andBlurFocusedItem */ js.UndefOr[js.Any], scala.Unit] = null,
    enableKeyNav: js.UndefOr[scala.Boolean] = js.undefined,
    floating: js.UndefOr[scala.Boolean] = js.undefined,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hide: js.Function0[extjsLib.ExtNs.IComponent] = null,
    hideMode: java.lang.String = null,
    ignoreParentClicks: js.UndefOr[scala.Boolean] = js.undefined,
    isMenu: js.UndefOr[scala.Boolean] = js.undefined,
    isVisible: js.Function0[scala.Boolean] = null,
    minWidth: scala.Int | scala.Double = null,
    onDestroy: js.Function0[scala.Unit] = null,
    parentMenu: IMenu = null,
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    showBy: js.Function3[
      /* cmp */ js.UndefOr[js.Any], 
      /* pos */ js.UndefOr[js.Any], 
      /* off */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.IComponent
    ] = null,
    showSeparator: js.UndefOr[scala.Boolean] = js.undefined
  ): IMenu = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IPanel)
    if (afterShow != null) __obj.updateDynamic("afterShow")(afterShow)
    if (!js.isUndefined(allowOtherMenus)) __obj.updateDynamic("allowOtherMenus")(allowOtherMenus)
    if (beforeShow != null) __obj.updateDynamic("beforeShow")(beforeShow)
    if (canActivateItem != null) __obj.updateDynamic("canActivateItem")(canActivateItem)
    if (deactivateActiveItem != null) __obj.updateDynamic("deactivateActiveItem")(deactivateActiveItem)
    if (!js.isUndefined(enableKeyNav)) __obj.updateDynamic("enableKeyNav")(enableKeyNav)
    if (!js.isUndefined(floating)) __obj.updateDynamic("floating")(floating)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hide != null) __obj.updateDynamic("hide")(hide)
    if (hideMode != null) __obj.updateDynamic("hideMode")(hideMode)
    if (!js.isUndefined(ignoreParentClicks)) __obj.updateDynamic("ignoreParentClicks")(ignoreParentClicks)
    if (!js.isUndefined(isMenu)) __obj.updateDynamic("isMenu")(isMenu)
    if (isVisible != null) __obj.updateDynamic("isVisible")(isVisible)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onDestroy != null) __obj.updateDynamic("onDestroy")(onDestroy)
    if (parentMenu != null) __obj.updateDynamic("parentMenu")(parentMenu)
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (showBy != null) __obj.updateDynamic("showBy")(showBy)
    if (!js.isUndefined(showSeparator)) __obj.updateDynamic("showSeparator")(showSeparator)
    __obj.asInstanceOf[IMenu]
  }
}

