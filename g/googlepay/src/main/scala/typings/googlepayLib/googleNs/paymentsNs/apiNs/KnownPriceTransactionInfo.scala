package typings
package googlepayLib.googleNs.paymentsNs.apiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnownPriceTransactionInfo
  extends BaseTransactionInfo
     with TransactionInfo {
  var totalPrice: java.lang.String
  @JSName("totalPriceStatus")
  var totalPriceStatus_KnownPriceTransactionInfo: googlepayLib.googlepayLibStrings.ESTIMATED | googlepayLib.googlepayLibStrings.FINAL
}

