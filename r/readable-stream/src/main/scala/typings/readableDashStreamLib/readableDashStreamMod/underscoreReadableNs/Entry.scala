package typings
package readableDashStreamLib.readableDashStreamMod.underscoreReadableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// ==== BufferList ====
trait Entry[D] extends js.Object {
  var data: D
  var next: Entry[D] | scala.Null
}

object Entry {
  @scala.inline
  def apply[D](data: D, next: Entry[D] = null): Entry[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[Entry[D]]
  }
}

