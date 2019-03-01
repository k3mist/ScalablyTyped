package typings
package lowlightLib.lowlightNs.ASTNs.UnistNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parent extends Node {
  var children: js.Array[Node]
}

object Parent {
  @scala.inline
  def apply(children: js.Array[Node], `type`: java.lang.String, data: Data = null, position: Location = null): Parent = {
    val __obj = js.Dynamic.literal(children = children, `type` = `type`)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Parent]
  }
}

