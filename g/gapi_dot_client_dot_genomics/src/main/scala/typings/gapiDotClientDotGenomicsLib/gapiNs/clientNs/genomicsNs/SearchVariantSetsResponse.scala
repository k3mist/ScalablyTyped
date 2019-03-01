package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchVariantSetsResponse extends js.Object {
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results. This field will be empty if there aren't any additional results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The variant sets belonging to the requested dataset. */
  var variantSets: js.UndefOr[js.Array[VariantSet]] = js.undefined
}

object SearchVariantSetsResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, variantSets: js.Array[VariantSet] = null): SearchVariantSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (variantSets != null) __obj.updateDynamic("variantSets")(variantSets)
    __obj.asInstanceOf[SearchVariantSetsResponse]
  }
}

