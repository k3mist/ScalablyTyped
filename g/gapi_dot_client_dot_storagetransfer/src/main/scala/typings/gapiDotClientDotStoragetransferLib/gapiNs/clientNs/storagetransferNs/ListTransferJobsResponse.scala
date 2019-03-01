package typings
package gapiDotClientDotStoragetransferLib.gapiNs.clientNs.storagetransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTransferJobsResponse extends js.Object {
  /** The list next page token. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** A list of transfer jobs. */
  var transferJobs: js.UndefOr[js.Array[TransferJob]] = js.undefined
}

object ListTransferJobsResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, transferJobs: js.Array[TransferJob] = null): ListTransferJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (transferJobs != null) __obj.updateDynamic("transferJobs")(transferJobs)
    __obj.asInstanceOf[ListTransferJobsResponse]
  }
}

