package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationsResource extends js.Object {
  /** Get information about a location. */
  def get(
    request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyLocationsId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Location]
  /** Lists information about the supported locations for this service. */
  def list(request: gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsFilter): gapiDotClientLib.gapiNs.clientNs.Request[ListLocationsResponse]
}

object LocationsResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsKeyLocationsId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Location]
    ],
    list: js.Function1[
      gapiDotClientDotAppengineLib.Anon_AccesstokenAltAppsIdBearertokenCallbackFieldsFilter, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListLocationsResponse]
    ]
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(get = get, list = list)
  
    __obj.asInstanceOf[LocationsResource]
  }
}

