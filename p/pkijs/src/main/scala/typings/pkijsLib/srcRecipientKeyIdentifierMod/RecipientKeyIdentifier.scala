package typings
package pkijsLib.srcRecipientKeyIdentifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientKeyIdentifier extends js.Object {
  var date: js.UndefOr[asn1jsLib.asn1jsMod.GeneralizedTime] = js.undefined
  var other: js.UndefOr[pkijsLib.srcOtherKeyAttributeMod.default] = js.undefined
  var subjectKeyIdentifier: asn1jsLib.asn1jsMod.OctetString
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RecipientKeyIdentifier {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    subjectKeyIdentifier: asn1jsLib.asn1jsMod.OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    date: asn1jsLib.asn1jsMod.GeneralizedTime = null,
    other: pkijsLib.srcOtherKeyAttributeMod.default = null
  ): RecipientKeyIdentifier = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), subjectKeyIdentifier = subjectKeyIdentifier, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (date != null) __obj.updateDynamic("date")(date)
    if (other != null) __obj.updateDynamic("other")(other)
    __obj.asInstanceOf[RecipientKeyIdentifier]
  }
}

