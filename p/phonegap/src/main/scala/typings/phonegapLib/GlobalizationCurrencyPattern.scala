package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalizationCurrencyPattern extends js.Object {
  var code: java.lang.String
  var decimal: java.lang.String
  var fraction: scala.Double
  var grouping: java.lang.String
  var pattern: java.lang.String
  var rounding: scala.Double
}

object GlobalizationCurrencyPattern {
  @scala.inline
  def apply(
    code: java.lang.String,
    decimal: java.lang.String,
    fraction: scala.Double,
    grouping: java.lang.String,
    pattern: java.lang.String,
    rounding: scala.Double
  ): GlobalizationCurrencyPattern = {
    val __obj = js.Dynamic.literal(code = code, decimal = decimal, fraction = fraction, grouping = grouping, pattern = pattern, rounding = rounding)
  
    __obj.asInstanceOf[GlobalizationCurrencyPattern]
  }
}

