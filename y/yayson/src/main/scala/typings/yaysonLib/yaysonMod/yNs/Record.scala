package typings
package yaysonLib.yaysonMod.yNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Record extends js.Object {
  var attributes: js.Any
  var id: js.Any
  var relationships: js.Any
  var `type`: java.lang.String
}

object Record {
  @scala.inline
  def apply(attributes: js.Any, id: js.Any, relationships: js.Any, `type`: java.lang.String): Record = {
    val __obj = js.Dynamic.literal(attributes = attributes, id = id, relationships = relationships, `type` = `type`)
  
    __obj.asInstanceOf[Record]
  }
}

