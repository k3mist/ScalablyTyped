package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDatasetsResponse extends js.Object {
  /** The list of matching Datasets. */
  var datasets: js.UndefOr[js.Array[Dataset]] = js.undefined
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results. This field will be empty if there aren't any additional results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListDatasetsResponse {
  @scala.inline
  def apply(datasets: js.Array[Dataset] = null, nextPageToken: java.lang.String = null): ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    if (datasets != null) __obj.updateDynamic("datasets")(datasets)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListDatasetsResponse]
  }
}

