package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/transaction
  /**
    * The error code if an error occurred while processing the transaction.
    */
  var errorCode: scala.Double
  /**
    * The error message if an error occurred while processing the transaction.
    */
  var errorMessage: java.lang.String
  /**
    * The identifier of the restored transaction by the App Store.
    */
  var originalTransactionIdentifier: java.lang.String
  var payment: Payment
  /**
    * The date the transaction was added to the App Store’s payment queue.
    */
  var transactionDate: java.lang.String
  /**
    * A string that uniquely identifies a successful payment transaction.
    */
  var transactionIdentifier: java.lang.String
  /**
    * The transaction state, can be purchasing, purchased, failed, restored or
    * deferred.
    */
  var transactionState: electronLib.electronLibStrings.purchasing | electronLib.electronLibStrings.purchased | electronLib.electronLibStrings.failed | electronLib.electronLibStrings.restored | electronLib.electronLibStrings.deferred
}

object Transaction {
  @scala.inline
  def apply(
    errorCode: scala.Double,
    errorMessage: java.lang.String,
    originalTransactionIdentifier: java.lang.String,
    payment: Payment,
    transactionDate: java.lang.String,
    transactionIdentifier: java.lang.String,
    transactionState: electronLib.electronLibStrings.purchasing | electronLib.electronLibStrings.purchased | electronLib.electronLibStrings.failed | electronLib.electronLibStrings.restored | electronLib.electronLibStrings.deferred
  ): Transaction = {
    val __obj = js.Dynamic.literal(errorCode = errorCode, errorMessage = errorMessage, originalTransactionIdentifier = originalTransactionIdentifier, payment = payment, transactionDate = transactionDate, transactionIdentifier = transactionIdentifier, transactionState = transactionState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Transaction]
  }
}

