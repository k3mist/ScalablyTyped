package typings
package reactDashSortableDashPaneLib.reactDashSortableDashPaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortablePaneProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var direction: js.UndefOr[
    reactDashSortableDashPaneLib.reactDashSortableDashPaneLibStrings.horizontal | reactDashSortableDashPaneLib.reactDashSortableDashPaneLibStrings.vertical
  ] = js.undefined
  var disableEffect: js.UndefOr[scala.Boolean] = js.undefined
  var dragHandleClassName: js.UndefOr[java.lang.String] = js.undefined
  var grid: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var isSortable: js.UndefOr[scala.Boolean] = js.undefined
  var margin: js.UndefOr[scala.Double] = js.undefined
  var onDragStart: js.UndefOr[
    js.Function3[
      /* e */ (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      scala.Unit
    ]
  ] = js.undefined
  var onDragStop: js.UndefOr[
    js.Function3[
      /* e */ (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      scala.Unit
    ]
  ] = js.undefined
  var onOrderChange: js.UndefOr[
    js.Function2[
      /* oldPanes */ js.Array[PaneProperty], 
      /* newPanes */ js.Array[PaneProperty], 
      scala.Unit
    ]
  ] = js.undefined
  var onResize: js.UndefOr[
    js.Function4[
      /* e */ (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      /* data */ PaneResizeData, 
      scala.Unit
    ]
  ] = js.undefined
  var onResizeStart: js.UndefOr[
    js.Function3[
      /* e */ (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      scala.Unit
    ]
  ] = js.undefined
  var onResizeStop: js.UndefOr[
    js.Function4[
      /* e */ (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      /* data */ PaneResizeData, 
      scala.Unit
    ]
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement]] = js.undefined
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

object SortablePaneProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    direction: reactDashSortableDashPaneLib.reactDashSortableDashPaneLibStrings.horizontal | reactDashSortableDashPaneLib.reactDashSortableDashPaneLibStrings.vertical = null,
    disableEffect: js.UndefOr[scala.Boolean] = js.undefined,
    dragHandleClassName: java.lang.String = null,
    grid: js.Tuple2[scala.Double, scala.Double] = null,
    isSortable: js.UndefOr[scala.Boolean] = js.undefined,
    margin: scala.Int | scala.Double = null,
    onDragStart: js.Function3[
      /* e */ (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      scala.Unit
    ] = null,
    onDragStop: js.Function3[
      /* e */ (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      scala.Unit
    ] = null,
    onOrderChange: js.Function2[
      /* oldPanes */ js.Array[PaneProperty], 
      /* newPanes */ js.Array[PaneProperty], 
      scala.Unit
    ] = null,
    onResize: js.Function4[
      /* e */ (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      /* data */ PaneResizeData, 
      scala.Unit
    ] = null,
    onResizeStart: js.Function3[
      /* e */ (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      scala.Unit
    ] = null,
    onResizeStop: js.Function4[
      /* e */ (reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]) | reactLib.reactMod.ReactNs.TouchEvent[reactLib.HTMLElement], 
      /* id */ PaneId, 
      /* panes */ js.Array[PaneProperty], 
      /* data */ PaneResizeData, 
      scala.Unit
    ] = null,
    style: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] = null,
    zIndex: scala.Int | scala.Double = null
  ): SortablePaneProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(disableEffect)) __obj.updateDynamic("disableEffect")(disableEffect)
    if (dragHandleClassName != null) __obj.updateDynamic("dragHandleClassName")(dragHandleClassName)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (!js.isUndefined(isSortable)) __obj.updateDynamic("isSortable")(isSortable)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(onDragStop)
    if (onOrderChange != null) __obj.updateDynamic("onOrderChange")(onOrderChange)
    if (onResize != null) __obj.updateDynamic("onResize")(onResize)
    if (onResizeStart != null) __obj.updateDynamic("onResizeStart")(onResizeStart)
    if (onResizeStop != null) __obj.updateDynamic("onResizeStop")(onResizeStop)
    if (style != null) __obj.updateDynamic("style")(style)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortablePaneProps]
  }
}

