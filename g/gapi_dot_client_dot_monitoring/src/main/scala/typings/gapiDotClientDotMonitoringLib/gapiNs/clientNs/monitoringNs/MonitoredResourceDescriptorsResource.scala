package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitoredResourceDescriptorsResource extends js.Object {
  /** Gets a single monitored resource descriptor. This method does not require a Stackdriver account. */
  def get(request: gapiDotClientDotMonitoringLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[MonitoredResourceDescriptor]
  /** Lists monitored resource descriptors that match a filter. This method does not require a Stackdriver account. */
  def list(request: gapiDotClientDotMonitoringLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[ListMonitoredResourceDescriptorsResponse]
}

object MonitoredResourceDescriptorsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotMonitoringLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[MonitoredResourceDescriptor]
    ],
    list: js.Function1[
      gapiDotClientDotMonitoringLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListMonitoredResourceDescriptorsResponse]
    ]
  ): MonitoredResourceDescriptorsResource = {
    val __obj = js.Dynamic.literal(get = get, list = list)
  
    __obj.asInstanceOf[MonitoredResourceDescriptorsResource]
  }
}

