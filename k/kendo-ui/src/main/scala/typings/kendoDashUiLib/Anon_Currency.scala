package typings
package kendoDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Currency extends js.Object {
  var `,`: java.lang.String
  var `.`: java.lang.String
  var currency: Anon_Decimals
  var decimals: scala.Double
  var groupSize: js.Array[scala.Double]
  var pattern: js.Array[java.lang.String]
  var percent: Anon_Decimals
}

object Anon_Currency {
  @scala.inline
  def apply(
    `,`: java.lang.String,
    `.`: java.lang.String,
    currency: Anon_Decimals,
    decimals: scala.Double,
    groupSize: js.Array[scala.Double],
    pattern: js.Array[java.lang.String],
    percent: Anon_Decimals
  ): Anon_Currency = {
    val __obj = js.Dynamic.literal(currency = currency, decimals = decimals, groupSize = groupSize, pattern = pattern, percent = percent)
    __obj.updateDynamic(",")(`,`)
    __obj.updateDynamic(".")(`.`)
    __obj.asInstanceOf[Anon_Currency]
  }
}

