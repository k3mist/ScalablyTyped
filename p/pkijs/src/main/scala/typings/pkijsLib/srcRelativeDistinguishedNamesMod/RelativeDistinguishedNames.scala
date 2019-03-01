package typings
package pkijsLib.srcRelativeDistinguishedNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelativeDistinguishedNames extends js.Object {
  var typesAndValues: js.Array[pkijsLib.srcAttributeTypeAndValueMod.default]
  var valueBeforeDecode: stdLib.ArrayBuffer
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RelativeDistinguishedNames {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    typesAndValues: js.Array[pkijsLib.srcAttributeTypeAndValueMod.default],
    valueBeforeDecode: stdLib.ArrayBuffer
  ): RelativeDistinguishedNames = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, toJSON = toJSON, toSchema = toSchema, typesAndValues = typesAndValues, valueBeforeDecode = valueBeforeDecode)
  
    __obj.asInstanceOf[RelativeDistinguishedNames]
  }
}

