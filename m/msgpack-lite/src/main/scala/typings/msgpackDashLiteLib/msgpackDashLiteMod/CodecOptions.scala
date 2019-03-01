package typings
package msgpackDashLiteLib.msgpackDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodecOptions extends js.Object {
  /**
    * It ties msgpack's bin format with ArrayBuffer object, instead of Buffer object.
    * @default false
    */
  var binarraybuffer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * It decodes msgpack's int64/uint64 formats with int64-buffer object.
    * int64-buffer is a cutom integer type with 64 bits of precision instead
    * of the built-in IEEE-754 53 bits. See https://github.com/kawanet/int64-buffer
    * @default false
    */
  var int64: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * It includes the preset extensions for JavaScript native objects.
    * @see https://github.com/kawanet/msgpack-lite#extension-types
    * @default false
    */
  var preset: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * It runs a validation of the value before writing it into buffer.
    * This is the default behavior for some old browsers which do not support ArrayBuffer object.
    * @default varies
    */
  var safe: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * It returns Uint8Array object when encoding, instead of Buffer object.
    * @default false
    */
  var uint8array: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * It uses the global JavaScript Map type, if available, to unpack MessagePack map elements.
    * @default false
    */
  var usemap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * It uses raw formats instead of bin and str.
    * Set true for compatibility with msgpack's old spec.
    * @see https://github.com/kawanet/msgpack-lite#compatibility-mode
    * @default false
    */
  var useraw: js.UndefOr[scala.Boolean] = js.undefined
}

object CodecOptions {
  @scala.inline
  def apply(
    binarraybuffer: js.UndefOr[scala.Boolean] = js.undefined,
    int64: js.UndefOr[scala.Boolean] = js.undefined,
    preset: js.UndefOr[scala.Boolean] = js.undefined,
    safe: js.UndefOr[scala.Boolean] = js.undefined,
    uint8array: js.UndefOr[scala.Boolean] = js.undefined,
    usemap: js.UndefOr[scala.Boolean] = js.undefined,
    useraw: js.UndefOr[scala.Boolean] = js.undefined
  ): CodecOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(binarraybuffer)) __obj.updateDynamic("binarraybuffer")(binarraybuffer)
    if (!js.isUndefined(int64)) __obj.updateDynamic("int64")(int64)
    if (!js.isUndefined(preset)) __obj.updateDynamic("preset")(preset)
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe)
    if (!js.isUndefined(uint8array)) __obj.updateDynamic("uint8array")(uint8array)
    if (!js.isUndefined(usemap)) __obj.updateDynamic("usemap")(usemap)
    if (!js.isUndefined(useraw)) __obj.updateDynamic("useraw")(useraw)
    __obj.asInstanceOf[CodecOptions]
  }
}

