package typings
package pkijsLib.srcKeyTransRecipientInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyTransRecipientInfo extends js.Object {
  var encryptedKey: asn1jsLib.asn1jsMod.OctetString
  var keyEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default
  /**
    * For some reasons we need to store recipient's certificate here
    * 
    * @type {Certificate}
    * @memberOf KeyTransRecipientInfo
    */
  var recipientCertificate: pkijsLib.srcCertificateMod.default
  var rid: pkijsLib.srcRecipientIdentifierMod.default
  var version: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object KeyTransRecipientInfo {
  @scala.inline
  def apply(
    encryptedKey: asn1jsLib.asn1jsMod.OctetString,
    fromSchema: js.Function1[js.Any, scala.Unit],
    keyEncryptionAlgorithm: pkijsLib.srcAlgorithmIdentifierMod.default,
    recipientCertificate: pkijsLib.srcCertificateMod.default,
    rid: pkijsLib.srcRecipientIdentifierMod.default,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    version: scala.Double
  ): KeyTransRecipientInfo = {
    val __obj = js.Dynamic.literal(encryptedKey = encryptedKey, fromSchema = fromSchema, keyEncryptionAlgorithm = keyEncryptionAlgorithm, recipientCertificate = recipientCertificate, rid = rid, toJSON = toJSON, toSchema = toSchema, version = version)
  
    __obj.asInstanceOf[KeyTransRecipientInfo]
  }
}

