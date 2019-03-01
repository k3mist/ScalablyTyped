package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaKeyGenParams extends Algorithm {
  var modulusLength: scala.Double
  var publicExponent: BigInteger
}

object RsaKeyGenParams {
  @scala.inline
  def apply(modulusLength: scala.Double, name: java.lang.String, publicExponent: BigInteger): RsaKeyGenParams = {
    val __obj = js.Dynamic.literal(modulusLength = modulusLength, name = name, publicExponent = publicExponent)
  
    __obj.asInstanceOf[RsaKeyGenParams]
  }
}

