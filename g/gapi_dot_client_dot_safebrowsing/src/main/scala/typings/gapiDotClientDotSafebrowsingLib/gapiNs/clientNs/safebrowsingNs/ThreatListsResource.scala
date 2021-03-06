package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatListsResource extends js.Object {
  /** Lists the Safe Browsing threat lists available for download. */
  def list(request: gapiDotClientDotSafebrowsingLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[ListThreatListsResponse]
}

object ThreatListsResource {
  @scala.inline
  def apply(
    list: gapiDotClientDotSafebrowsingLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[ListThreatListsResponse]
  ): ThreatListsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ThreatListsResource]
  }
}

