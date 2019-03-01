package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationsResource extends js.Object {
  /**
    * Starts asynchronous cancellation on a long-running operation.  The server
    * makes a best effort to cancel the operation, but success is not
    * guaranteed.  If the server doesn't support this method, it returns
    * `google.rpc.Code.UNIMPLEMENTED`.  Clients can use
    * Operations.GetOperation or
    * other methods to check whether the cancellation succeeded or whether the
    * operation completed despite cancellation. On successful cancellation,
    * the operation is not deleted; instead, it becomes an operation with
    * an Operation.error value with a google.rpc.Status.code of 1,
    * corresponding to `Code.CANCELLED`.
    */
  def cancel(request: gapiDotClientDotMlLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Deletes a long-running operation. This method indicates that the client is
    * no longer interested in the operation result. It does not cancel the
    * operation. If the server doesn't support this method, it returns
    * `google.rpc.Code.UNIMPLEMENTED`.
    */
  def delete(request: gapiDotClientDotMlLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Gets the latest state of a long-running operation.  Clients can use this
    * method to poll the operation result at intervals as recommended by the API
    * service.
    */
  def get(request: gapiDotClientDotMlLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunning__Operation]
  /**
    * Lists operations that match the specified filter in the request. If the
    * server doesn't support this method, it returns `UNIMPLEMENTED`.
    *
    * NOTE: the `name` binding allows API services to override the binding
    * to use different resource name schemes, such as `users/&#42;/operations`. To
    * override the binding, API services can add a binding such as
    * `"/v1/{name=users/&#42;}/operations"` to their service configuration.
    * For backwards compatibility, the default name includes the operations
    * collection id, however overriding users must ensure the name binding
    * is the parent resource, without the operations collection id.
    */
  def list(request: gapiDotClientDotMlLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunning__ListOperationsResponse]
}

object OperationsResource {
  @scala.inline
  def apply(
    cancel: js.Function1[
      gapiDotClientDotMlLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    delete: js.Function1[
      gapiDotClientDotMlLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
    ],
    get: js.Function1[
      gapiDotClientDotMlLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunning__Operation]
    ],
    list: js.Function1[
      gapiDotClientDotMlLib.Anon_AccesstokenAltBearertokenCallbackFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[GoogleLongrunning__ListOperationsResponse]
    ]
  ): OperationsResource = {
    val __obj = js.Dynamic.literal(cancel = cancel, delete = delete, get = get, list = list)
  
    __obj.asInstanceOf[OperationsResource]
  }
}

