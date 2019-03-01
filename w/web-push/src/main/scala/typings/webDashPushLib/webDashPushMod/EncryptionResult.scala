package typings
package webDashPushLib.webDashPushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionResult extends js.Object {
  var cipherText: nodeLib.Buffer
  var localPublicKey: java.lang.String
  var salt: java.lang.String
}

object EncryptionResult {
  @scala.inline
  def apply(cipherText: nodeLib.Buffer, localPublicKey: java.lang.String, salt: java.lang.String): EncryptionResult = {
    val __obj = js.Dynamic.literal(cipherText = cipherText, localPublicKey = localPublicKey, salt = salt)
  
    __obj.asInstanceOf[EncryptionResult]
  }
}

