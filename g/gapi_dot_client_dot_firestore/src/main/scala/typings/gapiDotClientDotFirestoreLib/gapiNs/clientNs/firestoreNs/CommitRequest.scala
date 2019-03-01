package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitRequest extends js.Object {
  /**
    * If non-empty, applies all writes in this transaction, and commits it.
    * Otherwise, applies the writes as if they were in their own transaction.
    */
  var transaction: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The writes to apply.
    *
    * Always executed atomically and in order.
    */
  var writes: js.UndefOr[js.Array[Write]] = js.undefined
}

object CommitRequest {
  @scala.inline
  def apply(transaction: java.lang.String = null, writes: js.Array[Write] = null): CommitRequest = {
    val __obj = js.Dynamic.literal()
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    if (writes != null) __obj.updateDynamic("writes")(writes)
    __obj.asInstanceOf[CommitRequest]
  }
}

