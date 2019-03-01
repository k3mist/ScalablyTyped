package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricHeaderEntry extends js.Object {
  /** The name of the header. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the metric, for example `INTEGER`. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object MetricHeaderEntry {
  @scala.inline
  def apply(name: java.lang.String = null, `type`: java.lang.String = null): MetricHeaderEntry = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MetricHeaderEntry]
  }
}

