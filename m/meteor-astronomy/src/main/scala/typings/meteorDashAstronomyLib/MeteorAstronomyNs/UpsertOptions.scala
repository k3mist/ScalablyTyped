package typings
package meteorDashAstronomyLib.MeteorAstronomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpsertOptions extends js.Object {
  var multi: js.UndefOr[scala.Boolean] = js.undefined
}

object UpsertOptions {
  @scala.inline
  def apply(multi: js.UndefOr[scala.Boolean] = js.undefined): UpsertOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    __obj.asInstanceOf[UpsertOptions]
  }
}

