package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductstatusesCustomBatchResponse extends js.Object {
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[ProductstatusesCustomBatchResponseEntry]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#productstatusesCustomBatchResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object ProductstatusesCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[ProductstatusesCustomBatchResponseEntry] = null, kind: java.lang.String = null): ProductstatusesCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[ProductstatusesCustomBatchResponse]
  }
}

