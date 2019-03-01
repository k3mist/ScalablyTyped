package typings
package nodeDashRedLib.nodeDashRedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeStatus extends js.Object {
  /** Selects the icon color. */
  var fill: StatusFill
  /** Selects either ring or dot shape. */
  var shape: StatusShape
  /** Status label. */
  var text: java.lang.String
}

object NodeStatus {
  @scala.inline
  def apply(fill: StatusFill, shape: StatusShape, text: java.lang.String): NodeStatus = {
    val __obj = js.Dynamic.literal(fill = fill, shape = shape, text = text)
  
    __obj.asInstanceOf[NodeStatus]
  }
}

