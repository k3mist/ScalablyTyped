package typings
package reactDashToolboxLib.libDialogDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogProps
  extends reactDashToolboxLib.libMod.ReactToolboxNs.Props {
  /**
    * A array of objects representing the buttons for the dialog navigation area. The properties will be transferred to the buttons.
    */
  var actions: js.UndefOr[coreDashJsLib.Array[DialogActionProps]] = js.undefined
  /**
    * If true, the dialog will be active.
    * @default false
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Callback called when the ESC key is pressed with the overlay active.
    */
  var onEscKeyDown: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Callback to be invoked when the dialog overlay is clicked.
    */
  var onOverlayClick: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Callback called when the mouse button is pressed on the overlay.
    */
  var onOverlayMouseDown: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Callback called when the mouse is moving over the overlay.
    */
  var onOverlayMouseMove: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Callback called when the mouse button is released over the overlay.
    */
  var onOverlayMouseUp: js.UndefOr[coreDashJsLib.Function] = js.undefined
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[DialogTheme] = js.undefined
  /**
    * The text string to use as standar title of the dialog.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to determine the size of the dialog. It can be small, normal or large.
    * @default "normal"
    */
  var `type`: js.UndefOr[
    reactDashToolboxLib.reactDashToolboxLibStrings.small | reactDashToolboxLib.reactDashToolboxLibStrings.normal | reactDashToolboxLib.reactDashToolboxLibStrings.large | java.lang.String
  ] = js.undefined
}

object DialogProps {
  @scala.inline
  def apply(
    actions: coreDashJsLib.Array[DialogActionProps] = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    key: reactLib.reactMod.ReactNs.Key = null,
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
    onEscKeyDown: coreDashJsLib.Function = null,
    onMouseDown: coreDashJsLib.Function = null,
    onMouseEnter: coreDashJsLib.Function = null,
    onMouseLeave: coreDashJsLib.Function = null,
    onMouseMove: coreDashJsLib.Function = null,
    onMouseOut: coreDashJsLib.Function = null,
    onMouseOver: coreDashJsLib.Function = null,
    onMouseUp: coreDashJsLib.Function = null,
    onOverlayClick: coreDashJsLib.Function = null,
    onOverlayMouseDown: coreDashJsLib.Function = null,
    onOverlayMouseMove: coreDashJsLib.Function = null,
    onOverlayMouseUp: coreDashJsLib.Function = null,
    onTouchCancel: coreDashJsLib.Function = null,
    onTouchEnd: coreDashJsLib.Function = null,
    onTouchMove: coreDashJsLib.Function = null,
    onTouchStart: coreDashJsLib.Function = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    theme: DialogTheme = null,
    title: java.lang.String = null,
    `type`: reactDashToolboxLib.reactDashToolboxLibStrings.small | reactDashToolboxLib.reactDashToolboxLibStrings.normal | reactDashToolboxLib.reactDashToolboxLibStrings.large | java.lang.String = null
  ): DialogProps = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
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
    if (onEscKeyDown != null) __obj.updateDynamic("onEscKeyDown")(onEscKeyDown)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onOverlayClick != null) __obj.updateDynamic("onOverlayClick")(onOverlayClick)
    if (onOverlayMouseDown != null) __obj.updateDynamic("onOverlayMouseDown")(onOverlayMouseDown)
    if (onOverlayMouseMove != null) __obj.updateDynamic("onOverlayMouseMove")(onOverlayMouseMove)
    if (onOverlayMouseUp != null) __obj.updateDynamic("onOverlayMouseUp")(onOverlayMouseUp)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogProps]
  }
}

