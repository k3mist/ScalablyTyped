package typings
package pkijsLib.srcOtherRecipientInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OtherRecipientInfo extends js.Object {
  var oriType: java.lang.String
  var oriValue: js.Any
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OtherRecipientInfo {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    oriType: java.lang.String,
    oriValue: js.Any,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): OtherRecipientInfo = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, oriType = oriType, oriValue = oriValue, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[OtherRecipientInfo]
  }
}

