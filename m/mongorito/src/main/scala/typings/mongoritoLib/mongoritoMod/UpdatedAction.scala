package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatedAction extends Action {
  var fields: js.Object
  var `type`: ActionTypes
}

object UpdatedAction {
  @scala.inline
  def apply(fields: js.Object, `type`: ActionTypes): UpdatedAction = {
    val __obj = js.Dynamic.literal(fields = fields, `type` = `type`)
  
    __obj.asInstanceOf[UpdatedAction]
  }
}

