package typings
package argon2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var raw: js.UndefOr[argon2Lib.argon2LibNumbers.`false`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(raw: argon2Lib.argon2LibNumbers.`false` = null): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (raw != null) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[Anon_False]
  }
}

