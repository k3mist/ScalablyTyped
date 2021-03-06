package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReportsResponse extends js.Object {
  /** Responses corresponding to each of the request. */
  var reports: js.UndefOr[js.Array[Report]] = js.undefined
}

object GetReportsResponse {
  @scala.inline
  def apply(reports: js.Array[Report] = null): GetReportsResponse = {
    val __obj = js.Dynamic.literal()
    if (reports != null) __obj.updateDynamic("reports")(reports)
    __obj.asInstanceOf[GetReportsResponse]
  }
}

