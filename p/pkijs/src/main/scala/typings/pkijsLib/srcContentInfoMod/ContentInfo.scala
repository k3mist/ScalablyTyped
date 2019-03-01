package typings
package pkijsLib.srcContentInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentInfo extends js.Object {
  var content: js.Any
  var contentType: java.lang.String
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object ContentInfo {
  @scala.inline
  def apply(
    content: js.Any,
    contentType: java.lang.String,
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): ContentInfo = {
    val __obj = js.Dynamic.literal(content = content, contentType = contentType, fromSchema = fromSchema, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[ContentInfo]
  }
}

