package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: gapiDotClientDotServicemanagementLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Lists service operations that match the specified filter in the request. */
  def list(request: gapiDotClientDotServicemanagementLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotServicemanagementLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    list: gapiDotClientDotServicemanagementLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[ListOperationsResponse]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[OperationsResource]
  }
}

