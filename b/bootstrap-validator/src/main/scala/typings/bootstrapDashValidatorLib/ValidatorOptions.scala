package typings
package bootstrapDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorOptions extends js.Object {
  var custom: js.UndefOr[js.Any] = js.undefined
  var delay: js.UndefOr[scala.Double] = js.undefined
  var disable: js.UndefOr[scala.Boolean] = js.undefined
  var feedback: js.UndefOr[js.Any] = js.undefined
  var focus: js.UndefOr[scala.Boolean] = js.undefined
  var html: js.UndefOr[scala.Boolean] = js.undefined
}

object ValidatorOptions {
  @scala.inline
  def apply(
    custom: js.Any = null,
    delay: scala.Int | scala.Double = null,
    disable: js.UndefOr[scala.Boolean] = js.undefined,
    feedback: js.Any = null,
    focus: js.UndefOr[scala.Boolean] = js.undefined,
    html: js.UndefOr[scala.Boolean] = js.undefined
  ): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(custom)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(disable)) __obj.updateDynamic("disable")(disable)
    if (feedback != null) __obj.updateDynamic("feedback")(feedback)
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus)
    if (!js.isUndefined(html)) __obj.updateDynamic("html")(html)
    __obj.asInstanceOf[ValidatorOptions]
  }
}

