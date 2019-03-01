package typings
package pemLib.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pkcs12CreationOptions extends js.Object {
  var certFiles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var cipher: js.UndefOr[PrivateKeyCipher] = js.undefined
  var clientKeyPassword: js.UndefOr[java.lang.String] = js.undefined
}

object Pkcs12CreationOptions {
  @scala.inline
  def apply(
    certFiles: js.Array[java.lang.String] = null,
    cipher: PrivateKeyCipher = null,
    clientKeyPassword: java.lang.String = null
  ): Pkcs12CreationOptions = {
    val __obj = js.Dynamic.literal()
    if (certFiles != null) __obj.updateDynamic("certFiles")(certFiles)
    if (cipher != null) __obj.updateDynamic("cipher")(cipher.asInstanceOf[js.Any])
    if (clientKeyPassword != null) __obj.updateDynamic("clientKeyPassword")(clientKeyPassword)
    __obj.asInstanceOf[Pkcs12CreationOptions]
  }
}

