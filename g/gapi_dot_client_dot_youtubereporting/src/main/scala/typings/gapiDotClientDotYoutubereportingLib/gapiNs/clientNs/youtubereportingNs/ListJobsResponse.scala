package typings
package gapiDotClientDotYoutubereportingLib.gapiNs.clientNs.youtubereportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsResponse extends js.Object {
  /** The list of jobs. */
  var jobs: js.UndefOr[js.Array[Job]] = js.undefined
  /**
    * A token to retrieve next page of results.
    * Pass this value in the
    * ListJobsRequest.page_token
    * field in the subsequent call to `ListJobs` method to retrieve the next
    * page of results.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListJobsResponse {
  @scala.inline
  def apply(jobs: js.Array[Job] = null, nextPageToken: java.lang.String = null): ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListJobsResponse]
  }
}

