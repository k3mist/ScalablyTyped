package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
trait DocumentListResponse[D] extends js.Object {
  // Offset where the document list started.
  var offset: scala.Double
  // Array of view row objects. By default the information returned contains only the document ID and revision.
  var rows: js.Array[DocumentResponseRow[D]]
  // Number of documents in the database/view. Note that this is not the number of rows returned in the actual
  // query.
  var total_rows: scala.Double
  // Current update sequence for the database.
  var update_seq: js.UndefOr[scala.Double] = js.undefined
}

object DocumentListResponse {
  @scala.inline
  def apply[D](
    offset: scala.Double,
    rows: js.Array[DocumentResponseRow[D]],
    total_rows: scala.Double,
    update_seq: scala.Int | scala.Double = null
  ): DocumentListResponse[D] = {
    val __obj = js.Dynamic.literal(offset = offset, rows = rows, total_rows = total_rows)
    if (update_seq != null) __obj.updateDynamic("update_seq")(update_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentListResponse[D]]
  }
}

