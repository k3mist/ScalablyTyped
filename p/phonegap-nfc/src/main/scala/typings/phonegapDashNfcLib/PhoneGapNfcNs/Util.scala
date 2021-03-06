package typings
package phonegapDashNfcLib.PhoneGapNfcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Util extends js.Object {
  /**
    * Convert bytes to hexadecimal string
    * @param bytes
    */
  def bytesToHexString(bytes: js.Array[scala.Double]): java.lang.String
  /**
    * Convert bytes to string
    * @param bytes
    */
  def bytesToString(bytes: js.Array[scala.Double]): java.lang.String
  /**
    * Convert string to bytes
    * @param string
    */
  def stringToBytes(string: java.lang.String): js.Array[scala.Double]
}

object Util {
  @scala.inline
  def apply(
    bytesToHexString: js.Array[scala.Double] => java.lang.String,
    bytesToString: js.Array[scala.Double] => java.lang.String,
    stringToBytes: java.lang.String => js.Array[scala.Double]
  ): Util = {
    val __obj = js.Dynamic.literal(bytesToHexString = js.Any.fromFunction1(bytesToHexString), bytesToString = js.Any.fromFunction1(bytesToString), stringToBytes = js.Any.fromFunction1(stringToBytes))
  
    __obj.asInstanceOf[Util]
  }
}

