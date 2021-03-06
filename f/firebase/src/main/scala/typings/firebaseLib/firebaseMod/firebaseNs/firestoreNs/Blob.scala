package typings
package firebaseLib.firebaseMod.firebaseNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Blob extends js.Object {
  /**
    * Returns true if this `Blob` is equal to the provided one.
    *
    * @param other The `Blob` to compare against.
    * @return true if this `Blob` is equal to the provided one.
    */
  def isEqual(other: Blob): scala.Boolean
  /**
    * Returns the bytes of a Blob as a Base64-encoded string.
    *
    * @return {string}
    *   The Base64-encoded string created from the Blob object.
    */
  def toBase64(): java.lang.String
  /**
    * Returns the bytes of a Blob in a new Uint8Array.
    *
    * @return {!Uint8Array}
    *   The Uint8Array created from the Blob object.
    */
  def toUint8Array(): stdLib.Uint8Array
}

object Blob {
  @scala.inline
  def apply(
    isEqual: Blob => scala.Boolean,
    toBase64: () => java.lang.String,
    toUint8Array: () => stdLib.Uint8Array
  ): Blob = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual), toBase64 = js.Any.fromFunction0(toBase64), toUint8Array = js.Any.fromFunction0(toUint8Array))
  
    __obj.asInstanceOf[Blob]
  }
}

