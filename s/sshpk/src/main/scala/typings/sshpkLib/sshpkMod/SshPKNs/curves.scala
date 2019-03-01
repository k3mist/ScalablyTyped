package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait curves extends js.Object {
  var nistp256: Curve
  var nistp384: Curve
  var nistp512: Curve
}

object curves {
  @scala.inline
  def apply(nistp256: Curve, nistp384: Curve, nistp512: Curve): curves = {
    val __obj = js.Dynamic.literal(nistp256 = nistp256, nistp384 = nistp384, nistp512 = nistp512)
  
    __obj.asInstanceOf[curves]
  }
}

