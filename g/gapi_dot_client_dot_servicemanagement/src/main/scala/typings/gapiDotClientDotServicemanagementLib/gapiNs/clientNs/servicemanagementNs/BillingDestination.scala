package typings
package gapiDotClientDotServicemanagementLib.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingDestination extends js.Object {
  /**
    * Names of the metrics to report to this billing destination.
    * Each name must be defined in Service.metrics section.
    */
  var metrics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The monitored resource type. The type must be defined in
    * Service.monitored_resources section.
    */
  var monitoredResource: js.UndefOr[java.lang.String] = js.undefined
}

object BillingDestination {
  @scala.inline
  def apply(metrics: js.Array[java.lang.String] = null, monitoredResource: java.lang.String = null): BillingDestination = {
    val __obj = js.Dynamic.literal()
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (monitoredResource != null) __obj.updateDynamic("monitoredResource")(monitoredResource)
    __obj.asInstanceOf[BillingDestination]
  }
}

