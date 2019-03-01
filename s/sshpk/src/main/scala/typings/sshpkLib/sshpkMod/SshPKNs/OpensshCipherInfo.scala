package typings
package sshpkLib.sshpkMod.SshPKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpensshCipherInfo extends js.Object {
  var blockSize: scala.Double
  var keySize: scala.Double
  var opensslName: java.lang.String
}

object OpensshCipherInfo {
  @scala.inline
  def apply(blockSize: scala.Double, keySize: scala.Double, opensslName: java.lang.String): OpensshCipherInfo = {
    val __obj = js.Dynamic.literal(blockSize = blockSize, keySize = keySize, opensslName = opensslName)
  
    __obj.asInstanceOf[OpensshCipherInfo]
  }
}

