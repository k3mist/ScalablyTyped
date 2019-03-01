package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeOptions extends js.Object {
  var allowPrototypes: js.UndefOr[scala.Boolean] = js.undefined
  var plainObjects: js.UndefOr[scala.Boolean] = js.undefined
}

object MergeOptions {
  @scala.inline
  def apply(
    allowPrototypes: js.UndefOr[scala.Boolean] = js.undefined,
    plainObjects: js.UndefOr[scala.Boolean] = js.undefined
  ): MergeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPrototypes)) __obj.updateDynamic("allowPrototypes")(allowPrototypes)
    if (!js.isUndefined(plainObjects)) __obj.updateDynamic("plainObjects")(plainObjects)
    __obj.asInstanceOf[MergeOptions]
  }
}

