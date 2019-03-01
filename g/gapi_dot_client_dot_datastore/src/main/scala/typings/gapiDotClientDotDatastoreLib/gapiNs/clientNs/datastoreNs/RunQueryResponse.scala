package typings
package gapiDotClientDotDatastoreLib.gapiNs.clientNs.datastoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunQueryResponse extends js.Object {
  /** A batch of query results (always present). */
  var batch: js.UndefOr[QueryResultBatch] = js.undefined
  /** The parsed form of the `GqlQuery` from the request, if it was set. */
  var query: js.UndefOr[Query] = js.undefined
}

object RunQueryResponse {
  @scala.inline
  def apply(batch: QueryResultBatch = null, query: Query = null): RunQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (batch != null) __obj.updateDynamic("batch")(batch)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[RunQueryResponse]
  }
}

