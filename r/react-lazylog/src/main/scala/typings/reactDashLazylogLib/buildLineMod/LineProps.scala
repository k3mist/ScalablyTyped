package typings
package reactDashLazylogLib.buildLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProps extends js.Object {
  var data: js.Array[reactDashLazylogLib.Anon_Text]
  var formatPart: js.UndefOr[js.Function1[/* text */ java.lang.String, reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var highlight: js.UndefOr[scala.Boolean] = js.undefined
  var number: scala.Double
  var onLineNumberClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLAnchorElement]] = js.undefined
  /**
    * This is never called
    * https://github.com/mozilla-frontend-infra/react-lazylog/issues/18
    */
  var onRowClick: js.UndefOr[js.Function0[_]] = js.undefined
  var rowHeight: scala.Double
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object LineProps {
  @scala.inline
  def apply(
    data: js.Array[reactDashLazylogLib.Anon_Text],
    number: scala.Double,
    rowHeight: scala.Double,
    formatPart: js.Function1[/* text */ java.lang.String, reactLib.reactMod.ReactNs.ReactNode] = null,
    highlight: js.UndefOr[scala.Boolean] = js.undefined,
    onLineNumberClick: reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLAnchorElement] = null,
    onRowClick: js.Function0[_] = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): LineProps = {
    val __obj = js.Dynamic.literal(data = data, number = number, rowHeight = rowHeight)
    if (formatPart != null) __obj.updateDynamic("formatPart")(formatPart)
    if (!js.isUndefined(highlight)) __obj.updateDynamic("highlight")(highlight)
    if (onLineNumberClick != null) __obj.updateDynamic("onLineNumberClick")(onLineNumberClick)
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(onRowClick)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LineProps]
  }
}

