package typings
package meteorDashAstronomyLib.MeteorAstronomyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveAndValidateOptions[K] extends js.Object {
  var cast: js.UndefOr[scala.Boolean] = js.undefined
  var fields: js.UndefOr[js.Array[K]] = js.undefined
  var simulation: js.UndefOr[scala.Boolean] = js.undefined
  var stopOnFirstError: js.UndefOr[scala.Boolean] = js.undefined
}

object SaveAndValidateOptions {
  @scala.inline
  def apply[K](
    cast: js.UndefOr[scala.Boolean] = js.undefined,
    fields: js.Array[K] = null,
    simulation: js.UndefOr[scala.Boolean] = js.undefined,
    stopOnFirstError: js.UndefOr[scala.Boolean] = js.undefined
  ): SaveAndValidateOptions[K] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cast)) __obj.updateDynamic("cast")(cast)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(simulation)) __obj.updateDynamic("simulation")(simulation)
    if (!js.isUndefined(stopOnFirstError)) __obj.updateDynamic("stopOnFirstError")(stopOnFirstError)
    __obj.asInstanceOf[SaveAndValidateOptions[K]]
  }
}

