package typings
package adoneLib.adoneNs.INs.datetimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatetimeCreationData extends js.Object {
  var format: js.UndefOr[DatetimeFormatSpecification] = js.undefined
  var input: DatetimeInput
  var isUTC: scala.Boolean
  var locale: Locale
  var strict: js.UndefOr[scala.Boolean] = js.undefined
}

object DatetimeCreationData {
  @scala.inline
  def apply(
    input: DatetimeInput,
    isUTC: scala.Boolean,
    locale: Locale,
    format: DatetimeFormatSpecification = null,
    strict: js.UndefOr[scala.Boolean] = js.undefined
  ): DatetimeCreationData = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], isUTC = isUTC, locale = locale)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[DatetimeCreationData]
  }
}

