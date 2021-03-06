package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitoredResourceDescriptorsResource extends js.Object {
  /** Lists the descriptors for monitored resource types used by Stackdriver Logging. */
  def list(
    request: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPageSize
  ): gapiDotClientLib.gapiNs.clientNs.Request[ListMonitoredResourceDescriptorsResponse]
}

object MonitoredResourceDescriptorsResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotLoggingLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyOauthtokenPageSize => gapiDotClientLib.gapiNs.clientNs.Request[ListMonitoredResourceDescriptorsResponse]
  ): MonitoredResourceDescriptorsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MonitoredResourceDescriptorsResource]
  }
}

