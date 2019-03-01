package typings
package antdLib.libMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultOpenKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var defaultSelectedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var focusable: js.UndefOr[scala.Boolean] = js.undefined
  var getPopupContainer: js.UndefOr[
    js.Function1[/* triggerNode */ js.UndefOr[reactLib.HTMLElement], reactLib.HTMLElement]
  ] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inlineCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  var inlineIndent: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[MenuMode] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* param */ ClickParam, scala.Unit]] = js.undefined
  var onDeselect: js.UndefOr[js.Function1[/* param */ SelectParam, scala.Unit]] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* e */ reactLib.MouseEvent, scala.Unit]] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[java.lang.String], scala.Unit]] = js.undefined
  var onSelect: js.UndefOr[js.Function1[/* param */ SelectParam, scala.Unit]] = js.undefined
  var openAnimation: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var openKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var openTransitionName: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var subMenuCloseDelay: js.UndefOr[scala.Double] = js.undefined
  var subMenuOpenDelay: js.UndefOr[scala.Double] = js.undefined
  var theme: js.UndefOr[MenuTheme] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    defaultOpenKeys: js.Array[java.lang.String] = null,
    defaultSelectedKeys: js.Array[java.lang.String] = null,
    focusable: js.UndefOr[scala.Boolean] = js.undefined,
    getPopupContainer: js.Function1[/* triggerNode */ js.UndefOr[reactLib.HTMLElement], reactLib.HTMLElement] = null,
    id: java.lang.String = null,
    inlineCollapsed: js.UndefOr[scala.Boolean] = js.undefined,
    inlineIndent: scala.Int | scala.Double = null,
    mode: MenuMode = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: js.Function1[/* param */ ClickParam, scala.Unit] = null,
    onDeselect: js.Function1[/* param */ SelectParam, scala.Unit] = null,
    onMouseEnter: js.Function1[/* e */ reactLib.MouseEvent, scala.Unit] = null,
    onOpenChange: js.Function1[/* openKeys */ js.Array[java.lang.String], scala.Unit] = null,
    onSelect: js.Function1[/* param */ SelectParam, scala.Unit] = null,
    openAnimation: java.lang.String | js.Object = null,
    openKeys: js.Array[java.lang.String] = null,
    openTransitionName: java.lang.String | js.Object = null,
    prefixCls: java.lang.String = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    selectedKeys: js.Array[java.lang.String] = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    subMenuCloseDelay: scala.Int | scala.Double = null,
    subMenuOpenDelay: scala.Int | scala.Double = null,
    theme: MenuTheme = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultOpenKeys != null) __obj.updateDynamic("defaultOpenKeys")(defaultOpenKeys)
    if (defaultSelectedKeys != null) __obj.updateDynamic("defaultSelectedKeys")(defaultSelectedKeys)
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(getPopupContainer)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(inlineCollapsed)) __obj.updateDynamic("inlineCollapsed")(inlineCollapsed)
    if (inlineIndent != null) __obj.updateDynamic("inlineIndent")(inlineIndent.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onDeselect != null) __obj.updateDynamic("onDeselect")(onDeselect)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(onOpenChange)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (openAnimation != null) __obj.updateDynamic("openAnimation")(openAnimation.asInstanceOf[js.Any])
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys)
    if (openTransitionName != null) __obj.updateDynamic("openTransitionName")(openTransitionName.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subMenuCloseDelay != null) __obj.updateDynamic("subMenuCloseDelay")(subMenuCloseDelay.asInstanceOf[js.Any])
    if (subMenuOpenDelay != null) __obj.updateDynamic("subMenuOpenDelay")(subMenuOpenDelay.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[MenuProps]
  }
}

