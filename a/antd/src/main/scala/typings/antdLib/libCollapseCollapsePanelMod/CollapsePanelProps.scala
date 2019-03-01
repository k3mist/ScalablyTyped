package typings
package antdLib.libCollapseCollapsePanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsePanelProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var forceRender: js.UndefOr[scala.Boolean] = js.undefined
  var header: reactLib.reactMod.ReactNs.ReactNode
  var id: js.UndefOr[java.lang.String] = js.undefined
  var key: java.lang.String
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var showArrow: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object CollapsePanelProps {
  @scala.inline
  def apply(
    header: reactLib.reactMod.ReactNs.ReactNode,
    key: java.lang.String,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    forceRender: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    prefixCls: java.lang.String = null,
    showArrow: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): CollapsePanelProps = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], key = key)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (id != null) __obj.updateDynamic("id")(id)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(showArrow)) __obj.updateDynamic("showArrow")(showArrow)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[CollapsePanelProps]
  }
}

