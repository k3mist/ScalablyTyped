package typings
package jsoneditorLib.jsoneditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeName extends js.Object {
  var path: java.lang.String
  var size: scala.Double
  var `type`: jsoneditorLib.jsoneditorLibStrings.`object` | jsoneditorLib.jsoneditorLibStrings.array
}

object NodeName {
  @scala.inline
  def apply(
    path: java.lang.String,
    size: scala.Double,
    `type`: jsoneditorLib.jsoneditorLibStrings.`object` | jsoneditorLib.jsoneditorLibStrings.array
  ): NodeName = {
    val __obj = js.Dynamic.literal(path = path, size = size, `type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeName]
  }
}

