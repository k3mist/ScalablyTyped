package typings
package gapiDotClientDotContainerLib.gapiNs.clientNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetLocationsRequest extends js.Object {
  /**
    * The desired list of Google Compute Engine
    * [locations](/compute/docs/zones#available) in which the cluster's nodes
    * should be located. Changing the locations a cluster is in will result
    * in nodes being either created or removed from the cluster, depending on
    * whether locations are being added or removed.
    *
    * This list must always include the cluster's primary zone.
    */
  var locations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object SetLocationsRequest {
  @scala.inline
  def apply(locations: js.Array[java.lang.String] = null): SetLocationsRequest = {
    val __obj = js.Dynamic.literal()
    if (locations != null) __obj.updateDynamic("locations")(locations)
    __obj.asInstanceOf[SetLocationsRequest]
  }
}

