package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodLimit extends js.Object {
  var period_in_days: scala.Double
  var remaining: MoneyHash
  var total: MoneyHash
}

object PaymentMethodLimit {
  @scala.inline
  def apply(period_in_days: scala.Double, remaining: MoneyHash, total: MoneyHash): PaymentMethodLimit = {
    val __obj = js.Dynamic.literal(period_in_days = period_in_days, remaining = remaining, total = total)
  
    __obj.asInstanceOf[PaymentMethodLimit]
  }
}

