package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MechanismInfo extends js.Object {
  var flags: scala.Double
  var maxKeySize: scala.Double
  var minKeySize: scala.Double
}

object MechanismInfo {
  @scala.inline
  def apply(flags: scala.Double, maxKeySize: scala.Double, minKeySize: scala.Double): MechanismInfo = {
    val __obj = js.Dynamic.literal(flags = flags, maxKeySize = maxKeySize, minKeySize = minKeySize)
  
    __obj.asInstanceOf[MechanismInfo]
  }
}

