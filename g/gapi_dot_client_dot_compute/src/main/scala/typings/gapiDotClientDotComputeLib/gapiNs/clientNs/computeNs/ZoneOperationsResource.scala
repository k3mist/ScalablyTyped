package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoneOperationsResource extends js.Object {
  /** Deletes the specified zone-specific Operations resource. */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenOperationPrettyPrintProject): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves the specified zone-specific Operations resource. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenOperationPrettyPrintProject): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of Operation resources contained within the specified zone. */
  def list(request: gapiDotClientDotComputeLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[OperationList]
}

object ZoneOperationsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenOperationPrettyPrintProject => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenOperationPrettyPrintProject => gapiDotClientLib.gapiNs.clientNs.Request[Operation],
    list: gapiDotClientDotComputeLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[OperationList]
  ): ZoneOperationsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ZoneOperationsResource]
  }
}

