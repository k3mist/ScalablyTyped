package typings
package reactDashSplitDashPaneLib.reactDashSplitDashPaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var allowResize: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var defaultSize: js.UndefOr[Size] = js.undefined
  var maxSize: js.UndefOr[Size] = js.undefined
  var minSize: js.UndefOr[Size] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* newSize */ scala.Double, scala.Unit]] = js.undefined
  var onDragFinished: js.UndefOr[js.Function1[/* newSize */ scala.Double, scala.Unit]] = js.undefined
  var onDragStarted: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onResizerClick: js.UndefOr[js.Function1[/* event */ reactLib.MouseEvent, scala.Unit]] = js.undefined
  var onResizerDoubleClick: js.UndefOr[js.Function1[/* event */ reactLib.MouseEvent, scala.Unit]] = js.undefined
  var pane1Style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var pane2Style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var paneStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var primary: js.UndefOr[
    reactDashSplitDashPaneLib.reactDashSplitDashPaneLibStrings.first | reactDashSplitDashPaneLib.reactDashSplitDashPaneLibStrings.second
  ] = js.undefined
  var resizerClassName: js.UndefOr[java.lang.String] = js.undefined
  var resizerStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
  var split: js.UndefOr[
    reactDashSplitDashPaneLib.reactDashSplitDashPaneLibStrings.vertical | reactDashSplitDashPaneLib.reactDashSplitDashPaneLibStrings.horizontal
  ] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    allowResize: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    defaultSize: Size = null,
    maxSize: Size = null,
    minSize: Size = null,
    onChange: js.Function1[/* newSize */ scala.Double, scala.Unit] = null,
    onDragFinished: js.Function1[/* newSize */ scala.Double, scala.Unit] = null,
    onDragStarted: js.Function0[scala.Unit] = null,
    onResizerClick: js.Function1[/* event */ reactLib.MouseEvent, scala.Unit] = null,
    onResizerDoubleClick: js.Function1[/* event */ reactLib.MouseEvent, scala.Unit] = null,
    pane1Style: reactLib.reactMod.ReactNs.CSSProperties = null,
    pane2Style: reactLib.reactMod.ReactNs.CSSProperties = null,
    paneStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    primary: reactDashSplitDashPaneLib.reactDashSplitDashPaneLibStrings.first | reactDashSplitDashPaneLib.reactDashSplitDashPaneLibStrings.second = null,
    resizerClassName: java.lang.String = null,
    resizerStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    size: Size = null,
    split: reactDashSplitDashPaneLib.reactDashSplitDashPaneLibStrings.vertical | reactDashSplitDashPaneLib.reactDashSplitDashPaneLibStrings.horizontal = null,
    step: scala.Int | scala.Double = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowResize)) __obj.updateDynamic("allowResize")(allowResize)
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultSize != null) __obj.updateDynamic("defaultSize")(defaultSize.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onDragFinished != null) __obj.updateDynamic("onDragFinished")(onDragFinished)
    if (onDragStarted != null) __obj.updateDynamic("onDragStarted")(onDragStarted)
    if (onResizerClick != null) __obj.updateDynamic("onResizerClick")(onResizerClick)
    if (onResizerDoubleClick != null) __obj.updateDynamic("onResizerDoubleClick")(onResizerDoubleClick)
    if (pane1Style != null) __obj.updateDynamic("pane1Style")(pane1Style)
    if (pane2Style != null) __obj.updateDynamic("pane2Style")(pane2Style)
    if (paneStyle != null) __obj.updateDynamic("paneStyle")(paneStyle)
    if (primary != null) __obj.updateDynamic("primary")(primary.asInstanceOf[js.Any])
    if (resizerClassName != null) __obj.updateDynamic("resizerClassName")(resizerClassName)
    if (resizerStyle != null) __obj.updateDynamic("resizerStyle")(resizerStyle)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (split != null) __obj.updateDynamic("split")(split.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Props]
  }
}

