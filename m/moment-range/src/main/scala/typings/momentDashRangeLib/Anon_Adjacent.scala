package typings
package momentDashRangeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Adjacent extends js.Object {
  var adjacent: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Adjacent {
  @scala.inline
  def apply(adjacent: js.UndefOr[scala.Boolean] = js.undefined): Anon_Adjacent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjacent)) __obj.updateDynamic("adjacent")(adjacent)
    __obj.asInstanceOf[Anon_Adjacent]
  }
}

