package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableServiceRequest extends js.Object {
  /**
    * The identity of consumer resource which service enablement will be
    * applied to.
    *
    * The Google Service Management implementation accepts the following
    * forms:
    * - "project:<project_id>"
    *
    * Note: this is made compatible with
    * google.api.servicecontrol.v1.Operation.consumer_id.
    */
  var consumerId: js.UndefOr[java.lang.String] = js.undefined
}

object EnableServiceRequest {
  @scala.inline
  def apply(consumerId: java.lang.String = null): EnableServiceRequest = {
    val __obj = js.Dynamic.literal()
    if (consumerId != null) __obj.updateDynamic("consumerId")(consumerId)
    __obj.asInstanceOf[EnableServiceRequest]
  }
}

