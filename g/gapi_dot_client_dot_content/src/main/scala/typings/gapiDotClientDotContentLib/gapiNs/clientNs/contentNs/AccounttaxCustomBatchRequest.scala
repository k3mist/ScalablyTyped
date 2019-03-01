package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxCustomBatchRequest extends js.Object {
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[AccounttaxCustomBatchRequestEntry]] = js.undefined
}

object AccounttaxCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[AccounttaxCustomBatchRequestEntry] = null): AccounttaxCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    __obj.asInstanceOf[AccounttaxCustomBatchRequest]
  }
}

