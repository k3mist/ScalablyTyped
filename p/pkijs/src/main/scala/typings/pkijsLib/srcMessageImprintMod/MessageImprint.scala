package typings
package pkijsLib.srcMessageImprintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageImprint extends js.Object {
  var hashAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  var hashedMessage: asn1jsLib.asn1jsMod.OctetString
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object MessageImprint {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    hashAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    hashedMessage: asn1jsLib.asn1jsMod.OctetString,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): MessageImprint = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, hashAlgorithm = hashAlgorithm, hashedMessage = hashedMessage, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[MessageImprint]
  }
}

