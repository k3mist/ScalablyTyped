package typings
package cryptoDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CBC extends js.Object {
  var CBC: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Mode
  var CFB: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Mode
  var CTR: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Mode
  var CTRGladman: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Mode
  var ECB: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Mode
  var OFB: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Mode
}

object Anon_CBC {
  @scala.inline
  def apply(
    CBC: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Mode,
    CFB: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Mode,
    CTR: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Mode,
    CTRGladman: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Mode,
    ECB: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Mode,
    OFB: cryptoDashJsLib.cryptoDashJsMod.CryptoJSNs.Mode
  ): Anon_CBC = {
    val __obj = js.Dynamic.literal(CBC = CBC, CFB = CFB, CTR = CTR, CTRGladman = CTRGladman, ECB = ECB, OFB = OFB)
  
    __obj.asInstanceOf[Anon_CBC]
  }
}

