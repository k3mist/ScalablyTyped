package typings
package gapiDotClientDotAdminLib.gapiNs.clientNs.adminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserUsageReportResource extends js.Object {
  /** Retrieves a report which is a collection of properties / statistics for a set of users. */
  def get(request: gapiDotClientDotAdminLib.Anon_AltCustomerIdDate): gapiDotClientLib.gapiNs.clientNs.Request[UsageReports]
}

object UserUsageReportResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotAdminLib.Anon_AltCustomerIdDate => gapiDotClientLib.gapiNs.clientNs.Request[UsageReports]
  ): UserUsageReportResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[UserUsageReportResource]
  }
}

