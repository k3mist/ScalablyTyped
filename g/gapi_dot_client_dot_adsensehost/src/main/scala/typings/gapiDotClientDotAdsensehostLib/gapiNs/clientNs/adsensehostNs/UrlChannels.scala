package typings
package gapiDotClientDotAdsensehostLib.gapiNs.clientNs.adsensehostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlChannels extends js.Object {
  /** ETag of this response for caching purposes. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** The URL channels returned in this list response. */
  var items: js.UndefOr[js.Array[UrlChannel]] = js.undefined
  /** Kind of list this is, in this case adsensehost#urlChannels. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Continuation token used to page through URL channels. To retrieve the next page of results, set the next request's "pageToken" value to this. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object UrlChannels {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    items: js.Array[UrlChannel] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): UrlChannels = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[UrlChannels]
  }
}

