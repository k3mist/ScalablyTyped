package typings
package gapiDotClientDotAppengineLib.gapiNs.clientNs.appengineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlDispatchRule extends js.Object {
  /** Domain name to match against. The wildcard "&#42;" is supported if specified before a period: "&#42;.".Defaults to matching all domains: "&#42;". */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Pathname within the host. Must start with a "/". A single "&#42;" can be included at the end of the path.The sum of the lengths of the domain and path may
    * not exceed 100 characters.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Resource ID of a service in this application that should serve the matched request. The service must already exist. Example: default. */
  var service: js.UndefOr[java.lang.String] = js.undefined
}

object UrlDispatchRule {
  @scala.inline
  def apply(domain: java.lang.String = null, path: java.lang.String = null, service: java.lang.String = null): UrlDispatchRule = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (path != null) __obj.updateDynamic("path")(path)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[UrlDispatchRule]
  }
}

