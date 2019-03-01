package typings
package gapiDotClientDotAndroidpublisherLib.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewsListResponse extends js.Object {
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  var reviews: js.UndefOr[js.Array[Review]] = js.undefined
  var tokenPagination: js.UndefOr[TokenPagination] = js.undefined
}

object ReviewsListResponse {
  @scala.inline
  def apply(
    pageInfo: PageInfo = null,
    reviews: js.Array[Review] = null,
    tokenPagination: TokenPagination = null
  ): ReviewsListResponse = {
    val __obj = js.Dynamic.literal()
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo)
    if (reviews != null) __obj.updateDynamic("reviews")(reviews)
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination)
    __obj.asInstanceOf[ReviewsListResponse]
  }
}

