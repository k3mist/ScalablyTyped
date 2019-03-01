package typings
package d3DashFormatLib.d3DashFormatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatLocaleDefinition extends js.Object {
  /**
    * The currency prefix and suffix (e.g., ["$", ""]).
    */
  var currency: js.Tuple2[java.lang.String, java.lang.String]
  /**
    * The decimal point (e.g., ".")
    */
  var decimal: java.lang.String
  /**
    * The array of group sizes (e.g., [3]), cycled as needed.
    */
  var grouping: js.Array[scala.Double]
  /**
    * An optional array of ten strings to replace the numerals 0-9.
    */
  var numerals: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * An optional symbol to replace the `percent` suffix; the percent suffix (defaults to "%").
    */
  var percent: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The group separator (e.g., ","). Note that the thousands property is a misnomer, as\
    * the grouping definition allows groups other than thousands.
    */
  var thousands: java.lang.String
}

object FormatLocaleDefinition {
  @scala.inline
  def apply(
    currency: js.Tuple2[java.lang.String, java.lang.String],
    decimal: java.lang.String,
    grouping: js.Array[scala.Double],
    thousands: java.lang.String,
    numerals: js.Array[java.lang.String] = null,
    percent: java.lang.String = null
  ): FormatLocaleDefinition = {
    val __obj = js.Dynamic.literal(currency = currency, decimal = decimal, grouping = grouping, thousands = thousands)
    if (numerals != null) __obj.updateDynamic("numerals")(numerals)
    if (percent != null) __obj.updateDynamic("percent")(percent)
    __obj.asInstanceOf[FormatLocaleDefinition]
  }
}

