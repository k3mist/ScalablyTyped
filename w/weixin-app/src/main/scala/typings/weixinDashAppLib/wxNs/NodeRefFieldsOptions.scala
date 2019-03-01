package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeRefFieldsOptions extends js.Object {
  /** 是否返回节点dataset */
  var dataset: js.UndefOr[scala.Boolean] = js.undefined
  /** 是否返回节点id */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * 指定属性名列表
  		 * 返回节点对应属性名的当前属性值（只能获得组件文档中标注的常规属性值， id class style 和事件绑定的属性值不可获取
  		 */
  var properties: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** 是否返回节点布局位置（left right top bottom */
  var rect: js.UndefOr[scala.Boolean] = js.undefined
  /** 是否返回节点的 scrollLeft scrollTop ，节点必须是scroll-view或者viewport */
  var scrollOffset: js.UndefOr[scala.Boolean] = js.undefined
  /** 是否返回节点尺寸（width height） */
  var size: js.UndefOr[scala.Boolean] = js.undefined
}

object NodeRefFieldsOptions {
  @scala.inline
  def apply(
    dataset: js.UndefOr[scala.Boolean] = js.undefined,
    id: js.UndefOr[scala.Boolean] = js.undefined,
    properties: js.Array[java.lang.String] = null,
    rect: js.UndefOr[scala.Boolean] = js.undefined,
    scrollOffset: js.UndefOr[scala.Boolean] = js.undefined,
    size: js.UndefOr[scala.Boolean] = js.undefined
  ): NodeRefFieldsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dataset)) __obj.updateDynamic("dataset")(dataset)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (!js.isUndefined(rect)) __obj.updateDynamic("rect")(rect)
    if (!js.isUndefined(scrollOffset)) __obj.updateDynamic("scrollOffset")(scrollOffset)
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[NodeRefFieldsOptions]
  }
}

