package typings
package reactDashToolboxLib.libAppUnderscoreBarAppBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppBarProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Determine if the bar should have position fixed or relative.
    * @default false
    */
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the AppBar doesn't show a shadow.
    * @default false
    */
  var flat: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If it exists it is used as the AppBar left icon
    */
  var leftIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Called when the left icon is clicked
    */
  var onLeftIconClick: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Called when the righticon is clicked
    */
  var onRightIconClick: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * If it exists it is used as the AppBar right icon
    */
  var rightIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Whether AppBar should be hidden during scroll.
    * @default false
    */
  var scrollHide: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[AppBarTheme] = js.undefined
  /**
    * If it exists it is used as the AppBar title
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object AppBarProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    fixed: js.UndefOr[scala.Boolean] = js.undefined,
    flat: js.UndefOr[scala.Boolean] = js.undefined,
    key: reactLib.reactMod.ReactNs.Key = null,
    leftIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    onClick: coreDashJsLib.Function = null,
    onContextMenu: coreDashJsLib.Function = null,
    onDoubleClick: coreDashJsLib.Function = null,
    onDrag: coreDashJsLib.Function = null,
    onDragEnd: coreDashJsLib.Function = null,
    onDragEnter: coreDashJsLib.Function = null,
    onDragExit: coreDashJsLib.Function = null,
    onDragLeave: coreDashJsLib.Function = null,
    onDragOver: coreDashJsLib.Function = null,
    onDragStart: coreDashJsLib.Function = null,
    onDrop: coreDashJsLib.Function = null,
    onLeftIconClick: coreDashJsLib.Function = null,
    onMouseDown: coreDashJsLib.Function = null,
    onMouseEnter: coreDashJsLib.Function = null,
    onMouseLeave: coreDashJsLib.Function = null,
    onMouseMove: coreDashJsLib.Function = null,
    onMouseOut: coreDashJsLib.Function = null,
    onMouseOver: coreDashJsLib.Function = null,
    onMouseUp: coreDashJsLib.Function = null,
    onRightIconClick: coreDashJsLib.Function = null,
    onTouchCancel: coreDashJsLib.Function = null,
    onTouchEnd: coreDashJsLib.Function = null,
    onTouchMove: coreDashJsLib.Function = null,
    onTouchStart: coreDashJsLib.Function = null,
    rightIcon: reactLib.reactMod.ReactNs.ReactNode = null,
    scrollHide: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    theme: AppBarTheme = null,
    title: java.lang.String = null
  ): AppBarProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (leftIcon != null) __obj.updateDynamic("leftIcon")(leftIcon.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onLeftIconClick != null) __obj.updateDynamic("onLeftIconClick")(onLeftIconClick)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onRightIconClick != null) __obj.updateDynamic("onRightIconClick")(onRightIconClick)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (rightIcon != null) __obj.updateDynamic("rightIcon")(rightIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollHide)) __obj.updateDynamic("scrollHide")(scrollHide)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[AppBarProps]
  }
}

