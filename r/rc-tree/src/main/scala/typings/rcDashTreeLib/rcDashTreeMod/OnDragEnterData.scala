package typings
package rcDashTreeLib.rcDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragEnterData extends js.Object {
  var event: reactLib.Event
  var expandedKeys: js.Array[java.lang.String]
  var node: InternalTreeNode
}

object OnDragEnterData {
  @scala.inline
  def apply(event: reactLib.Event, expandedKeys: js.Array[java.lang.String], node: InternalTreeNode): OnDragEnterData = {
    val __obj = js.Dynamic.literal(event = event, expandedKeys = expandedKeys, node = node)
  
    __obj.asInstanceOf[OnDragEnterData]
  }
}

