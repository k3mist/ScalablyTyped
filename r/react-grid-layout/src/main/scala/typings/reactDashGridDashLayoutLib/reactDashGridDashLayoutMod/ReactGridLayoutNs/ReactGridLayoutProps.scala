package typings
package reactDashGridDashLayoutLib.reactDashGridDashLayoutMod.ReactGridLayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactGridLayoutProps extends CoreProps {
  /**
    * Number of columns in this layout.
    */
  var cols: js.UndefOr[scala.Double] = js.undefined
  /**
    * Layout is an array of object with the format:
    *
    * `{x: number, y: number, w: number, h: number}`
    *
    * The index into the layout must match the key used on each item component.
    * If you choose to use custom keys, you can specify that key in the layout
    * array objects like so:
    *
    * `{i: string, x: number, y: number, w: number, h: number}`
    *
    * If not provided, use data-grid props on children.
    */
  var layout: js.UndefOr[js.Array[Layout]] = js.undefined
  /**
    * Callback so you can save the layout.
    * Calls back with (currentLayout) after every drag or resize stop.
    */
  var onLayoutChange: js.UndefOr[js.Function1[/* layout */ js.Array[Layout], scala.Unit]] = js.undefined
}

object ReactGridLayoutProps {
  @scala.inline
  def apply(
    autoSize: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    cols: scala.Int | scala.Double = null,
    compactType: reactDashGridDashLayoutLib.reactDashGridDashLayoutLibStrings.vertical | reactDashGridDashLayoutLib.reactDashGridDashLayoutLibStrings.horizontal = null,
    containerPadding: js.Tuple2[scala.Double, scala.Double] = null,
    draggableCancel: java.lang.String = null,
    draggableHandle: java.lang.String = null,
    isDraggable: js.UndefOr[scala.Boolean] = js.undefined,
    isRearrangeable: js.UndefOr[scala.Boolean] = js.undefined,
    isResizable: js.UndefOr[scala.Boolean] = js.undefined,
    layout: js.Array[Layout] = null,
    margin: js.Tuple2[scala.Double, scala.Double] = null,
    maxRows: scala.Int | scala.Double = null,
    onDrag: ItemCallback = null,
    onDragStart: ItemCallback = null,
    onDragStop: ItemCallback = null,
    onLayoutChange: js.Function1[/* layout */ js.Array[Layout], scala.Unit] = null,
    onResize: ItemCallback = null,
    onResizeStart: ItemCallback = null,
    onResizeStop: ItemCallback = null,
    preventCollision: js.UndefOr[scala.Boolean] = js.undefined,
    rowHeight: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    useCSSTransforms: js.UndefOr[scala.Boolean] = js.undefined,
    verticalCompact: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): ReactGridLayoutProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize)
    if (className != null) __obj.updateDynamic("className")(className)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (compactType != null) __obj.updateDynamic("compactType")(compactType.asInstanceOf[js.Any])
    if (containerPadding != null) __obj.updateDynamic("containerPadding")(containerPadding)
    if (draggableCancel != null) __obj.updateDynamic("draggableCancel")(draggableCancel)
    if (draggableHandle != null) __obj.updateDynamic("draggableHandle")(draggableHandle)
    if (!js.isUndefined(isDraggable)) __obj.updateDynamic("isDraggable")(isDraggable)
    if (!js.isUndefined(isRearrangeable)) __obj.updateDynamic("isRearrangeable")(isRearrangeable)
    if (!js.isUndefined(isResizable)) __obj.updateDynamic("isResizable")(isResizable)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (maxRows != null) __obj.updateDynamic("maxRows")(maxRows.asInstanceOf[js.Any])
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(onDragStop)
    if (onLayoutChange != null) __obj.updateDynamic("onLayoutChange")(onLayoutChange)
    if (onResize != null) __obj.updateDynamic("onResize")(onResize)
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(onResizeStart)
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(onResizeStop)
    if (!js.isUndefined(preventCollision)) __obj.updateDynamic("preventCollision")(preventCollision)
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(useCSSTransforms)) __obj.updateDynamic("useCSSTransforms")(useCSSTransforms)
    if (!js.isUndefined(verticalCompact)) __obj.updateDynamic("verticalCompact")(verticalCompact)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactGridLayoutProps]
  }
}

