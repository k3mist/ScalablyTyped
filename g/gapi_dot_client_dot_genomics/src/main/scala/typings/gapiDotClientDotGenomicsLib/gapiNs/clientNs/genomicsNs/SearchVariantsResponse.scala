package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchVariantsResponse extends js.Object {
  /**
    * The continuation token, which is used to page through large result sets.
    * Provide this value in a subsequent request to return the next page of
    * results. This field will be empty if there aren't any additional results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The list of matching Variants. */
  var variants: js.UndefOr[js.Array[Variant]] = js.undefined
}

object SearchVariantsResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, variants: js.Array[Variant] = null): SearchVariantsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (variants != null) __obj.updateDynamic("variants")(variants)
    __obj.asInstanceOf[SearchVariantsResponse]
  }
}

