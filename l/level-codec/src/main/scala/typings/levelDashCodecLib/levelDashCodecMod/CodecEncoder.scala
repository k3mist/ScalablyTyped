package typings
package levelDashCodecLib.levelDashCodecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodecEncoder extends js.Object {
  var buffer: scala.Boolean
  var `type`: java.lang.String
  def decode(`val`: js.Any): js.Any
  def encode(`val`: js.Any): js.Any
}

object CodecEncoder {
  @scala.inline
  def apply(
    buffer: scala.Boolean,
    decode: js.Function1[js.Any, js.Any],
    encode: js.Function1[js.Any, js.Any],
    `type`: java.lang.String
  ): CodecEncoder = {
    val __obj = js.Dynamic.literal(buffer = buffer, decode = decode, encode = encode, `type` = `type`)
  
    __obj.asInstanceOf[CodecEncoder]
  }
}

