package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLeadsResponse extends js.Object {
  /** The list of leads. */
  var leads: js.UndefOr[js.Array[Lead]] = js.undefined
  /**
    * A token to retrieve next page of results.
    * Pass this value in the `ListLeadsRequest.page_token` field in the
    * subsequent call to
    * ListLeads to retrieve the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Current response metadata. */
  var responseMetadata: js.UndefOr[ResponseMetadata] = js.undefined
  /** The total count of leads for the given company. */
  var totalSize: js.UndefOr[scala.Double] = js.undefined
}

object ListLeadsResponse {
  @scala.inline
  def apply(
    leads: js.Array[Lead] = null,
    nextPageToken: java.lang.String = null,
    responseMetadata: ResponseMetadata = null,
    totalSize: scala.Int | scala.Double = null
  ): ListLeadsResponse = {
    val __obj = js.Dynamic.literal()
    if (leads != null) __obj.updateDynamic("leads")(leads)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (responseMetadata != null) __obj.updateDynamic("responseMetadata")(responseMetadata)
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLeadsResponse]
  }
}

