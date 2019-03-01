package typings
package gapiDotClientDotResourceviewsLib.gapiNs.clientNs.resourceviewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneViewsSetServiceRequest extends js.Object {
  /** The service information to be updated. */
  var endpoints: js.UndefOr[js.Array[ServiceEndpoint]] = js.undefined
  /** Fingerprint of the service information; a hash of the contents. This field is used for optimistic locking when updating the service entries. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the resource if user wants to update the service information of the resource. */
  var resourceName: js.UndefOr[java.lang.String] = js.undefined
}

object ZoneViewsSetServiceRequest {
  @scala.inline
  def apply(
    endpoints: js.Array[ServiceEndpoint] = null,
    fingerprint: java.lang.String = null,
    resourceName: java.lang.String = null
  ): ZoneViewsSetServiceRequest = {
    val __obj = js.Dynamic.literal()
    if (endpoints != null) __obj.updateDynamic("endpoints")(endpoints)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    __obj.asInstanceOf[ZoneViewsSetServiceRequest]
  }
}

