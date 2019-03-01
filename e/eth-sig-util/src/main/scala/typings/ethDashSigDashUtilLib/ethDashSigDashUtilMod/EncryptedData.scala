package typings
package ethDashSigDashUtilLib.ethDashSigDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptedData extends js.Object {
  var ciphertext: java.lang.String
  var ephemPublicKey: java.lang.String
  var nonce: java.lang.String
  var version: EncryptionType
}

object EncryptedData {
  @scala.inline
  def apply(
    ciphertext: java.lang.String,
    ephemPublicKey: java.lang.String,
    nonce: java.lang.String,
    version: EncryptionType
  ): EncryptedData = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext, ephemPublicKey = ephemPublicKey, nonce = nonce, version = version)
  
    __obj.asInstanceOf[EncryptedData]
  }
}

