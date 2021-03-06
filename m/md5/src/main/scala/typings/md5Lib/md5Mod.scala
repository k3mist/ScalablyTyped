package typings
package md5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("md5", JSImport.Namespace)
@js.native
object md5Mod extends js.Object {
  /**
    * js function for hashing messages with MD5
    *
    * @param {(string | Buffer)} message - a string or buffer to hash
    * @returns {string} the resultant MD5 hash of the given message
    */
  def apply(message: java.lang.String | nodeLib.Buffer | js.Array[scala.Double]): java.lang.String = js.native
}

