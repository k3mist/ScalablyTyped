package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentCurrencyAmount extends js.Object {
  var currency: java.lang.String
  var currencySystem: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String
}

object PaymentCurrencyAmount {
  @scala.inline
  def apply(currency: java.lang.String, value: java.lang.String, currencySystem: java.lang.String = null): PaymentCurrencyAmount = {
    val __obj = js.Dynamic.literal(currency = currency, value = value)
    if (currencySystem != null) __obj.updateDynamic("currencySystem")(currencySystem)
    __obj.asInstanceOf[PaymentCurrencyAmount]
  }
}

