package typings
package xmldsigjsLib.xmldsigjsMod.XmlDSigJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RsaKeyValue extends KeyInfoClause {
  /**
    * Gets the Exponent of the public key
    */
  var Exponent: stdLib.Uint8Array | scala.Null = js.native
  /**
    * Gets the Modulus of the public key
    */
  var Modulus: stdLib.Uint8Array | scala.Null = js.native
  var jwk: stdLib.JsonWebKey | scala.Null = js.native
  var key: stdLib.CryptoKey | scala.Null = js.native
  var keyUsage: js.Array[java.lang.String] = js.native
}

