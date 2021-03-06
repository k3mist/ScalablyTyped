package typings
package validatorLib.ValidatorJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// options for IsByteLength
trait IsByteLengthOptions extends js.Object {
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
}

object IsByteLengthOptions {
  @scala.inline
  def apply(max: scala.Int | scala.Double = null, min: scala.Int | scala.Double = null): IsByteLengthOptions = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsByteLengthOptions]
  }
}

