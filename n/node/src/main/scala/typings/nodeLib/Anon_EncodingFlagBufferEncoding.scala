package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFlagBufferEncoding extends js.Object {
  var encoding: BufferEncoding
  var flag: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Anon_EncodingFlagBufferEncoding {
  @scala.inline
  def apply(encoding: BufferEncoding, flag: java.lang.String | scala.Double = null): Anon_EncodingFlagBufferEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncodingFlagBufferEncoding]
  }
}

