package typings
package gapiDotClientDotSpannerLib.gapiNs.clientNs.spannerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInstancesResponse extends js.Object {
  /** The list of requested instances. */
  var instances: js.UndefOr[js.Array[Instance]] = js.undefined
  /**
    * `next_page_token` can be sent in a subsequent
    * ListInstances call to fetch more
    * of the matching instances.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListInstancesResponse {
  @scala.inline
  def apply(instances: js.Array[Instance] = null, nextPageToken: java.lang.String = null): ListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListInstancesResponse]
  }
}

