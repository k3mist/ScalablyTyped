package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dklen extends js.Object {
  var dklen: scala.Double
  var n: scala.Double
  var p: scala.Double
  var r: scala.Double
  var salt: java.lang.String
}

object Anon_Dklen {
  @scala.inline
  def apply(dklen: scala.Double, n: scala.Double, p: scala.Double, r: scala.Double, salt: java.lang.String): Anon_Dklen = {
    val __obj = js.Dynamic.literal(dklen = dklen, n = n, p = p, r = r, salt = salt)
  
    __obj.asInstanceOf[Anon_Dklen]
  }
}

