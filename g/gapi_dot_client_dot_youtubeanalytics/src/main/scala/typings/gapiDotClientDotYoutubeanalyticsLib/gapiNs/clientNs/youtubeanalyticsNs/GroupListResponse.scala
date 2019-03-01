package typings
package gapiDotClientDotYoutubeanalyticsLib.gapiNs.clientNs.youtubeanalyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupListResponse extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[Group]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object GroupListResponse {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    items: js.Array[Group] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): GroupListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[GroupListResponse]
  }
}

