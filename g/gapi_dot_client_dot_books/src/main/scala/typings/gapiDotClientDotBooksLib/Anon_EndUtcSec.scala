package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndUtcSec extends js.Object {
  var endUtcSec: js.UndefOr[java.lang.String] = js.undefined
  var startUtcSec: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EndUtcSec {
  @scala.inline
  def apply(endUtcSec: java.lang.String = null, startUtcSec: java.lang.String = null): Anon_EndUtcSec = {
    val __obj = js.Dynamic.literal()
    if (endUtcSec != null) __obj.updateDynamic("endUtcSec")(endUtcSec)
    if (startUtcSec != null) __obj.updateDynamic("startUtcSec")(startUtcSec)
    __obj.asInstanceOf[Anon_EndUtcSec]
  }
}

