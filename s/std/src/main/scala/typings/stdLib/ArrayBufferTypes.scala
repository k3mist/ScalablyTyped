package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allowed ArrayBuffer types for the buffer of an ArrayBufferView and related Typed Arrays.
  */
trait ArrayBufferTypes extends js.Object {
  var ArrayBuffer: stdLib.ArrayBuffer
  var SharedArrayBuffer: stdLib.SharedArrayBuffer
}

object ArrayBufferTypes {
  @scala.inline
  def apply(ArrayBuffer: stdLib.ArrayBuffer, SharedArrayBuffer: stdLib.SharedArrayBuffer): ArrayBufferTypes = {
    val __obj = js.Dynamic.literal(ArrayBuffer = ArrayBuffer, SharedArrayBuffer = SharedArrayBuffer)
  
    __obj.asInstanceOf[ArrayBufferTypes]
  }
}

