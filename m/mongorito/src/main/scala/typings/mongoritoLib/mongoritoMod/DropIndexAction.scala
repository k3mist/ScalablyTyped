package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropIndexAction extends Action {
  var args: js.Array[_]
  var `type`: ActionTypes
}

object DropIndexAction {
  @scala.inline
  def apply(args: js.Array[_], `type`: ActionTypes): DropIndexAction = {
    val __obj = js.Dynamic.literal(args = args, `type` = `type`)
  
    __obj.asInstanceOf[DropIndexAction]
  }
}

