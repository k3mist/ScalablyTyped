package typings
package gapiDotClientDotDoubleclicksearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ByteCount extends js.Object {
  /** The size of this report file in bytes. */
  var byteCount: js.UndefOr[java.lang.String] = js.undefined
  /** Use this url to download the report file. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ByteCount {
  @scala.inline
  def apply(byteCount: java.lang.String = null, url: java.lang.String = null): Anon_ByteCount = {
    val __obj = js.Dynamic.literal()
    if (byteCount != null) __obj.updateDynamic("byteCount")(byteCount)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_ByteCount]
  }
}

