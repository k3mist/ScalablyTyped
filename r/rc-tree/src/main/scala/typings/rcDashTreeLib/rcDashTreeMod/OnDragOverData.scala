package typings
package rcDashTreeLib.rcDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragOverData extends js.Object {
  var event: reactLib.Event
  var node: InternalTreeNode
}

object OnDragOverData {
  @scala.inline
  def apply(event: reactLib.Event, node: InternalTreeNode): OnDragOverData = {
    val __obj = js.Dynamic.literal(event = event, node = node)
  
    __obj.asInstanceOf[OnDragOverData]
  }
}

