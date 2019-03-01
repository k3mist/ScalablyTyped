package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitoredResource extends js.Object {
  /**
    * Required. Values for all of the labels listed in the associated monitored resource descriptor. For example, Compute Engine VM instances use the labels
    * "project_id", "instance_id", and "zone".
    */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /**
    * Required. The monitored resource type. This field must match the type field of a MonitoredResourceDescriptor object. For example, the type of a Compute
    * Engine VM instance is gce_instance.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object MonitoredResource {
  @scala.inline
  def apply(labels: stdLib.Record[java.lang.String, java.lang.String] = null, `type`: java.lang.String = null): MonitoredResource = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MonitoredResource]
  }
}

