package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Decode extends js.Object {
  val ucs2Ns: Anon_Array
  val version: java.lang.String
  def decode(input: java.lang.String): java.lang.String
  def encode(input: java.lang.String): java.lang.String
  def toASCII(input: java.lang.String): java.lang.String
  def toUnicode(input: java.lang.String): java.lang.String
}

object Anon_Decode {
  @scala.inline
  def apply(
    decode: js.Function1[java.lang.String, java.lang.String],
    encode: js.Function1[java.lang.String, java.lang.String],
    toASCII: js.Function1[java.lang.String, java.lang.String],
    toUnicode: js.Function1[java.lang.String, java.lang.String],
    ucs2Ns: Anon_Array,
    version: java.lang.String
  ): Anon_Decode = {
    val __obj = js.Dynamic.literal(decode = decode, encode = encode, toASCII = toASCII, toUnicode = toUnicode, ucs2Ns = ucs2Ns, version = version)
  
    __obj.asInstanceOf[Anon_Decode]
  }
}

