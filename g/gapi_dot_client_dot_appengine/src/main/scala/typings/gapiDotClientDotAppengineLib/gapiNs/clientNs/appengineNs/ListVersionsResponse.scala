package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVersionsResponse extends js.Object {
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The versions belonging to the requested service. */
  var versions: js.UndefOr[js.Array[Version]] = js.undefined
}

object ListVersionsResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, versions: js.Array[Version] = null): ListVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (versions != null) __obj.updateDynamic("versions")(versions)
    __obj.asInstanceOf[ListVersionsResponse]
  }
}

