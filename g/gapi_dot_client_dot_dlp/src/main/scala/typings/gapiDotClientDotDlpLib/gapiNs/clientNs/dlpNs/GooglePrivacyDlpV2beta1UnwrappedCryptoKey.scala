package typings
package gapiDotClientDotDlpLib.gapiNs.clientNs.dlpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePrivacyDlpV2beta1UnwrappedCryptoKey extends js.Object {
  /** The AES 128/192/256 bit key. [required] */
  var key: js.UndefOr[java.lang.String] = js.undefined
}

object GooglePrivacyDlpV2beta1UnwrappedCryptoKey {
  @scala.inline
  def apply(key: java.lang.String = null): GooglePrivacyDlpV2beta1UnwrappedCryptoKey = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1UnwrappedCryptoKey]
  }
}

