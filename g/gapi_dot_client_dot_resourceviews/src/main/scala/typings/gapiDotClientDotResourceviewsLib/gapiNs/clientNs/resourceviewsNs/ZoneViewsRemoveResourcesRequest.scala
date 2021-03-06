package typings
package gapiDotClientDotResourceviewsLib.gapiNs.clientNs.resourceviewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneViewsRemoveResourcesRequest extends js.Object {
  /** The list of resources to be removed. */
  var resources: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ZoneViewsRemoveResourcesRequest {
  @scala.inline
  def apply(resources: js.Array[java.lang.String] = null): ZoneViewsRemoveResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (resources != null) __obj.updateDynamic("resources")(resources)
    __obj.asInstanceOf[ZoneViewsRemoveResourcesRequest]
  }
}

