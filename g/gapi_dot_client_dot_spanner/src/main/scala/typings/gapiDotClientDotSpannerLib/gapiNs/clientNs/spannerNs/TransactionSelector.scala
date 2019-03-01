package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionSelector extends js.Object {
  /**
    * Begin a new transaction and execute this read or SQL query in
    * it. The transaction ID of the new transaction is returned in
    * ResultSetMetadata.transaction, which is a Transaction.
    */
  var begin: js.UndefOr[TransactionOptions] = js.undefined
  /** Execute the read or SQL query in a previously-started transaction. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Execute the read or SQL query in a temporary transaction.
    * This is the most efficient way to execute a transaction that
    * consists of a single SQL query.
    */
  var singleUse: js.UndefOr[TransactionOptions] = js.undefined
}

object TransactionSelector {
  @scala.inline
  def apply(
    begin: TransactionOptions = null,
    id: java.lang.String = null,
    singleUse: TransactionOptions = null
  ): TransactionSelector = {
    val __obj = js.Dynamic.literal()
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (id != null) __obj.updateDynamic("id")(id)
    if (singleUse != null) __obj.updateDynamic("singleUse")(singleUse)
    __obj.asInstanceOf[TransactionSelector]
  }
}

