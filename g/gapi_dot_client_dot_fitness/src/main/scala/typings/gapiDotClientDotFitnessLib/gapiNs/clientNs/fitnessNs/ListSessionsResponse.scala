package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSessionsResponse extends js.Object {
  /**
    * If includeDeleted is set to true in the request, this list will contain sessions deleted with original end times that are within the startTime and
    * endTime frame.
    */
  var deletedSession: js.UndefOr[js.Array[Session]] = js.undefined
  /** Flag to indicate server has more data to transfer */
  var hasMoreData: js.UndefOr[scala.Boolean] = js.undefined
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Sessions with an end time that is between startTime and endTime of the request. */
  var session: js.UndefOr[js.Array[Session]] = js.undefined
}

object ListSessionsResponse {
  @scala.inline
  def apply(
    deletedSession: js.Array[Session] = null,
    hasMoreData: js.UndefOr[scala.Boolean] = js.undefined,
    nextPageToken: java.lang.String = null,
    session: js.Array[Session] = null
  ): ListSessionsResponse = {
    val __obj = js.Dynamic.literal()
    if (deletedSession != null) __obj.updateDynamic("deletedSession")(deletedSession)
    if (!js.isUndefined(hasMoreData)) __obj.updateDynamic("hasMoreData")(hasMoreData)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[ListSessionsResponse]
  }
}

