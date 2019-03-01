package typings
package gapiDotClientDotCloudmonitoringLib.gapiNs.clientNs.cloudmonitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDescriptorTypeDescriptor extends js.Object {
  /** The method of collecting data for the metric. See Metric types. */
  var metricType: js.UndefOr[java.lang.String] = js.undefined
  /** The data type of of individual points in the metric's time series. See Metric value types. */
  var valueType: js.UndefOr[java.lang.String] = js.undefined
}

object MetricDescriptorTypeDescriptor {
  @scala.inline
  def apply(metricType: java.lang.String = null, valueType: java.lang.String = null): MetricDescriptorTypeDescriptor = {
    val __obj = js.Dynamic.literal()
    if (metricType != null) __obj.updateDynamic("metricType")(metricType)
    if (valueType != null) __obj.updateDynamic("valueType")(valueType)
    __obj.asInstanceOf[MetricDescriptorTypeDescriptor]
  }
}

