package typings
package atOracleOraclejetLib.ojtreemapMod.ojTreemapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait NodeContentContext[K, D] extends js.Object {
  var bounds: atOracleOraclejetLib.Anon_HeightWidth
  var componentElement: stdLib.Element
  var data: js.Object
  var id: K
  var itemData: D
}

object NodeContentContext {
  @scala.inline
  def apply[K, D](
    bounds: atOracleOraclejetLib.Anon_HeightWidth,
    componentElement: stdLib.Element,
    data: js.Object,
    id: K,
    itemData: D
  ): NodeContentContext[K, D] = {
    val __obj = js.Dynamic.literal(bounds = bounds, componentElement = componentElement, data = data, id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeContentContext[K, D]]
  }
}

