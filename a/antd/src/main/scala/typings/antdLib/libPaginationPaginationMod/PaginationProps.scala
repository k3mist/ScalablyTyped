package typings
package antdLib.libPaginationPaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var current: js.UndefOr[scala.Double] = js.undefined
  var defaultCurrent: js.UndefOr[scala.Double] = js.undefined
  var defaultPageSize: js.UndefOr[scala.Double] = js.undefined
  var hideOnSinglePage: js.UndefOr[scala.Boolean] = js.undefined
  var itemRender: js.UndefOr[
    js.Function3[
      /* page */ scala.Double, 
      /* type */ antdLib.antdLibStrings.page | antdLib.antdLibStrings.prev | antdLib.antdLibStrings.next | antdLib.antdLibStrings.`jump-prev` | antdLib.antdLibStrings.`jump-next`, 
      /* originalElement */ reactLib.HTMLElement, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var locale: js.UndefOr[js.Object] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* page */ scala.Double, /* pageSize */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  var onShowSizeChange: js.UndefOr[js.Function2[/* current */ scala.Double, /* size */ scala.Double, scala.Unit]] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var pageSizeOptions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var selectPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var showQuickJumper: js.UndefOr[scala.Boolean] = js.undefined
  var showSizeChanger: js.UndefOr[scala.Boolean] = js.undefined
  var showTotal: js.UndefOr[
    js.Function2[
      /* total */ scala.Double, 
      /* range */ js.Tuple2[scala.Double, scala.Double], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var simple: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var total: js.UndefOr[scala.Double] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    current: scala.Int | scala.Double = null,
    defaultCurrent: scala.Int | scala.Double = null,
    defaultPageSize: scala.Int | scala.Double = null,
    hideOnSinglePage: js.UndefOr[scala.Boolean] = js.undefined,
    itemRender: js.Function3[
      /* page */ scala.Double, 
      /* type */ antdLib.antdLibStrings.page | antdLib.antdLibStrings.prev | antdLib.antdLibStrings.next | antdLib.antdLibStrings.`jump-prev` | antdLib.antdLibStrings.`jump-next`, 
      /* originalElement */ reactLib.HTMLElement, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    locale: js.Object = null,
    onChange: js.Function2[/* page */ scala.Double, /* pageSize */ js.UndefOr[scala.Double], scala.Unit] = null,
    onShowSizeChange: js.Function2[/* current */ scala.Double, /* size */ scala.Double, scala.Unit] = null,
    pageSize: scala.Int | scala.Double = null,
    pageSizeOptions: js.Array[java.lang.String] = null,
    prefixCls: java.lang.String = null,
    role: java.lang.String = null,
    selectPrefixCls: java.lang.String = null,
    showQuickJumper: js.UndefOr[scala.Boolean] = js.undefined,
    showSizeChanger: js.UndefOr[scala.Boolean] = js.undefined,
    showTotal: js.Function2[
      /* total */ scala.Double, 
      /* range */ js.Tuple2[scala.Double, scala.Double], 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    simple: js.UndefOr[scala.Boolean] = js.undefined,
    size: java.lang.String = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    total: scala.Int | scala.Double = null
  ): PaginationProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (defaultCurrent != null) __obj.updateDynamic("defaultCurrent")(defaultCurrent.asInstanceOf[js.Any])
    if (defaultPageSize != null) __obj.updateDynamic("defaultPageSize")(defaultPageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnSinglePage)) __obj.updateDynamic("hideOnSinglePage")(hideOnSinglePage)
    if (itemRender != null) __obj.updateDynamic("itemRender")(itemRender)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onShowSizeChange != null) __obj.updateDynamic("onShowSizeChange")(onShowSizeChange)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageSizeOptions != null) __obj.updateDynamic("pageSizeOptions")(pageSizeOptions)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (role != null) __obj.updateDynamic("role")(role)
    if (selectPrefixCls != null) __obj.updateDynamic("selectPrefixCls")(selectPrefixCls)
    if (!js.isUndefined(showQuickJumper)) __obj.updateDynamic("showQuickJumper")(showQuickJumper)
    if (!js.isUndefined(showSizeChanger)) __obj.updateDynamic("showSizeChanger")(showSizeChanger)
    if (showTotal != null) __obj.updateDynamic("showTotal")(showTotal)
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple)
    if (size != null) __obj.updateDynamic("size")(size)
    if (style != null) __obj.updateDynamic("style")(style)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
}

