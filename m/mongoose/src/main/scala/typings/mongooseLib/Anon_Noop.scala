package typings
package mongooseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Noop extends js.Object {
  var noop: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Noop {
  @scala.inline
  def apply(noop: js.UndefOr[scala.Boolean] = js.undefined): Anon_Noop = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noop)) __obj.updateDynamic("noop")(noop)
    __obj.asInstanceOf[Anon_Noop]
  }
}

