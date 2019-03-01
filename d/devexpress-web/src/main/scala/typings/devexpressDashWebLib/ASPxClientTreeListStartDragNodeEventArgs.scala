package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the StartDragNode event.
  */
trait ASPxClientTreeListStartDragNodeEventArgs extends ASPxClientTreeListNodeEventArgs {
  /**
    * Gets an array of targets where a node can be dragged.
    * Value: An array of objects that represent targets for the dragged node.
    */
  var targets: js.Array[js.Object]
}

object ASPxClientTreeListStartDragNodeEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    htmlEvent: js.Object,
    nodeKey: java.lang.String,
    targets: js.Array[js.Object]
  ): ASPxClientTreeListStartDragNodeEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, htmlEvent = htmlEvent, nodeKey = nodeKey, targets = targets)
  
    __obj.asInstanceOf[ASPxClientTreeListStartDragNodeEventArgs]
  }
}

