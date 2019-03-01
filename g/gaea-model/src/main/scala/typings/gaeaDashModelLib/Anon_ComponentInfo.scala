package typings
package gaeaDashModelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ComponentInfo extends js.Object {
  // 组合的完整信息（不是 copy 的, 是真正对应的 mapUniqueKey）
  var componentInfo: gaeaDashModelLib.FitGaeaNs.ViewportComponentFullInfo
  // 父级的 index
  var index: scala.Double
  // 父级 mapKey
  var parentMapUniqueKey: java.lang.String
}

object Anon_ComponentInfo {
  @scala.inline
  def apply(
    componentInfo: gaeaDashModelLib.FitGaeaNs.ViewportComponentFullInfo,
    index: scala.Double,
    parentMapUniqueKey: java.lang.String
  ): Anon_ComponentInfo = {
    val __obj = js.Dynamic.literal(componentInfo = componentInfo, index = index, parentMapUniqueKey = parentMapUniqueKey)
  
    __obj.asInstanceOf[Anon_ComponentInfo]
  }
}

