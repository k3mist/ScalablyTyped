package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetAction extends Action {
  var fields: js.Object
  var `type`: ActionTypes
}

object SetAction {
  @scala.inline
  def apply(fields: js.Object, `type`: ActionTypes): SetAction = {
    val __obj = js.Dynamic.literal(fields = fields, `type` = `type`)
  
    __obj.asInstanceOf[SetAction]
  }
}

