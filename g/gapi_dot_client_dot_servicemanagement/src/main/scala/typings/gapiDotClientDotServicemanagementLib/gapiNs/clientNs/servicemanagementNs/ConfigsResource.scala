package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigsResource extends js.Object {
  /**
    * Creates a new service configuration (version) for a managed service.
    * This method only stores the service configuration. To roll out the service
    * configuration to backend systems please call
    * CreateServiceRollout.
    */
  def create(request: gapiDotClientDotServicemanagementLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Service]
  /** Gets a service configuration (version) for a managed service. */
  def get(request: gapiDotClientDotServicemanagementLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[Service]
  /**
    * Lists the history of the service configuration for a managed service,
    * from the newest to the oldest.
    */
  def list(request: gapiDotClientDotServicemanagementLib.Anon_AccesstokenAltBearertokenCallbackFields): gapiDotClientLib.gapiNs.clientNs.Request[ListServiceConfigsResponse]
  /**
    * Creates a new service configuration (version) for a managed service based
    * on
    * user-supplied configuration source files (for example: OpenAPI
    * Specification). This method stores the source configurations as well as the
    * generated service configuration. To rollout the service configuration to
    * other services,
    * please call CreateServiceRollout.
    *
    * Operation<response: SubmitConfigSourceResponse>
    */
  def submit(request: gapiDotClientDotServicemanagementLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object ConfigsResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotServicemanagementLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[Service],
    get: gapiDotClientDotServicemanagementLib.Anon_AccesstokenAltBearertokenCallback => gapiDotClientLib.gapiNs.clientNs.Request[Service],
    list: gapiDotClientDotServicemanagementLib.Anon_AccesstokenAltBearertokenCallbackFields => gapiDotClientLib.gapiNs.clientNs.Request[ListServiceConfigsResponse],
    submit: gapiDotClientDotServicemanagementLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  ): ConfigsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), submit = js.Any.fromFunction1(submit))
  
    __obj.asInstanceOf[ConfigsResource]
  }
}

