package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatedAction extends Action {
  var id: js.Object
  var `type`: ActionTypes
}

object CreatedAction {
  @scala.inline
  def apply(id: js.Object, `type`: ActionTypes): CreatedAction = {
    val __obj = js.Dynamic.literal(id = id, `type` = `type`)
  
    __obj.asInstanceOf[CreatedAction]
  }
}

