package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthCra extends js.Object {
  def derive_key(secret: java.lang.String, salt: java.lang.String, iterations: scala.Double, keylen: scala.Double): java.lang.String
  def sign(key: java.lang.String, challenge: java.lang.String): java.lang.String
}

object IAuthCra {
  @scala.inline
  def apply(
    derive_key: js.Function4[java.lang.String, java.lang.String, scala.Double, scala.Double, java.lang.String],
    sign: js.Function2[java.lang.String, java.lang.String, java.lang.String]
  ): IAuthCra = {
    val __obj = js.Dynamic.literal(derive_key = derive_key, sign = sign)
  
    __obj.asInstanceOf[IAuthCra]
  }
}

