package typings
package delayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ValueAny extends js.Object {
  /** Value to reject in the returned promise. */
  var value: js.UndefOr[js.Any] = js.undefined
}

object Anon_ValueAny {
  @scala.inline
  def apply(value: js.Any = null): Anon_ValueAny = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ValueAny]
  }
}

