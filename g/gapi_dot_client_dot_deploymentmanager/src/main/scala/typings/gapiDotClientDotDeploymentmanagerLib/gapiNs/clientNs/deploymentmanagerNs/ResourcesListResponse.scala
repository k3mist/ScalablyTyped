package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcesListResponse extends js.Object {
  /** A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Resources contained in this list response. */
  var resources: js.UndefOr[js.Array[Resource]] = js.undefined
}

object ResourcesListResponse {
  @scala.inline
  def apply(nextPageToken: java.lang.String = null, resources: js.Array[Resource] = null): ResourcesListResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    __obj.asInstanceOf[ResourcesListResponse]
  }
}

