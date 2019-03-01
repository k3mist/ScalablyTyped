package typings
package gulpDashJsonDashValidatorLib.gulpDashJsonDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GulpJsonValidatorOptions extends js.Object {
  var allowDuplicatedKeys: js.UndefOr[scala.Boolean] = js.undefined
}

object GulpJsonValidatorOptions {
  @scala.inline
  def apply(allowDuplicatedKeys: js.UndefOr[scala.Boolean] = js.undefined): GulpJsonValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDuplicatedKeys)) __obj.updateDynamic("allowDuplicatedKeys")(allowDuplicatedKeys)
    __obj.asInstanceOf[GulpJsonValidatorOptions]
  }
}

