package typings
package gapiDotClientDotCloudtasksLib.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  var queues: QueuesResource
  /** Get information about a location. */
  def get(request: gapiDotClientDotCloudtasksLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: gapiDotClientDotCloudtasksLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilterKey): gapiDotClientLib.gapiNs.clientNs.Request[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotCloudtasksLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Location]
    ],
    list: js.Function1[
      gapiDotClientDotCloudtasksLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilterKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListLocationsResponse]
    ],
    queues: QueuesResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(get = get, list = list, queues = queues)
  
    __obj.asInstanceOf[LocationsResource]
  }
}

