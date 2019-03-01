package typings
package cryptojsLib.CryptoJSNs.formatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatStatic extends js.Object {
  var Hex: IFormatter
  var OpenSSL: IFormatter
}

object FormatStatic {
  @scala.inline
  def apply(Hex: IFormatter, OpenSSL: IFormatter): FormatStatic = {
    val __obj = js.Dynamic.literal(Hex = Hex, OpenSSL = OpenSSL)
  
    __obj.asInstanceOf[FormatStatic]
  }
}

