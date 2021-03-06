package typings
package gapiDotClientDotDoubleclicksearchLib.gapiNs.clientNs.doubleclicksearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SavedColumnsResource extends js.Object {
  /** Retrieve the list of saved columns for a specified advertiser. */
  def list(request: gapiDotClientDotDoubleclicksearchLib.Anon_AdvertiserIdAgencyId): gapiDotClientLib.gapiNs.clientNs.Request[SavedColumnList]
}

object SavedColumnsResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotDoubleclicksearchLib.Anon_AdvertiserIdAgencyId => gapiDotClientLib.gapiNs.clientNs.Request[SavedColumnList]
  ): SavedColumnsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[SavedColumnsResource]
  }
}

