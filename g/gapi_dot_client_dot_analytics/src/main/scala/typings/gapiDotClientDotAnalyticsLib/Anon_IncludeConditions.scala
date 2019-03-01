package typings
package gapiDotClientDotAnalyticsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeConditions extends js.Object {
  /** Defines the conditions to include users to the audience. */
  var includeConditions: js.UndefOr[gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs.IncludeConditions] = js.undefined
}

object Anon_IncludeConditions {
  @scala.inline
  def apply(
    includeConditions: gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs.IncludeConditions = null
  ): Anon_IncludeConditions = {
    val __obj = js.Dynamic.literal()
    if (includeConditions != null) __obj.updateDynamic("includeConditions")(includeConditions)
    __obj.asInstanceOf[Anon_IncludeConditions]
  }
}

