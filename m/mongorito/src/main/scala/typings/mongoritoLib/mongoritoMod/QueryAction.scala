package typings
package mongoritoLib.mongoritoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryAction extends Action {
  var method: java.lang.String
  var query: js.Array[mongoritoLib.Anon_Args]
  var `type`: ActionTypes
}

object QueryAction {
  @scala.inline
  def apply(method: java.lang.String, query: js.Array[mongoritoLib.Anon_Args], `type`: ActionTypes): QueryAction = {
    val __obj = js.Dynamic.literal(method = method, query = query, `type` = `type`)
  
    __obj.asInstanceOf[QueryAction]
  }
}

