package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionOptions extends js.Object {
  /** The transaction can only be used for read operations. */
  var readOnly: js.UndefOr[ReadOnly] = js.undefined
  /** The transaction can be used for both read and write operations. */
  var readWrite: js.UndefOr[ReadWrite] = js.undefined
}

object TransactionOptions {
  @scala.inline
  def apply(readOnly: ReadOnly = null, readWrite: ReadWrite = null): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly)
    if (readWrite != null) __obj.updateDynamic("readWrite")(readWrite)
    __obj.asInstanceOf[TransactionOptions]
  }
}

