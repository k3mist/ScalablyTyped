package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  /** An automatic google login account */
  var googleAuto: js.UndefOr[js.Any] = js.undefined
}

object Account {
  @scala.inline
  def apply(googleAuto: js.Any = null): Account = {
    val __obj = js.Dynamic.literal()
    if (googleAuto != null) __obj.updateDynamic("googleAuto")(googleAuto)
    __obj.asInstanceOf[Account]
  }
}

