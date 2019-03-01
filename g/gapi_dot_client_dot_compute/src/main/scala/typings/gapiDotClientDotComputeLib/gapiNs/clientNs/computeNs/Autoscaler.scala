package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autoscaler extends js.Object {
  /**
    * The configuration parameters for the autoscaling algorithm. You can define one or more of the policies for an autoscaler: cpuUtilization,
    * customMetricUtilizations, and loadBalancingUtilization.
    *
    * If none of these are specified, the default will be to autoscale based on cpuUtilization to 0.6 or 60%.
    */
  var autoscalingPolicy: js.UndefOr[AutoscalingPolicy] = js.undefined
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Type of the resource. Always compute#autoscaler for autoscalers. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] URL of the region where the instance group resides (for autoscalers living in regional scope). */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The status of the autoscaler configuration. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output Only] Human-readable details about the current state of the autoscaler. Read the documentation for Commonly returned status messages for
    * examples of status messages you might encounter.
    */
  var statusDetails: js.UndefOr[js.Array[AutoscalerStatusDetails]] = js.undefined
  /** URL of the managed instance group that this autoscaler will scale. */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] URL of the zone where the instance group resides (for autoscalers living in zonal scope). */
  var zone: js.UndefOr[java.lang.String] = js.undefined
}

object Autoscaler {
  @scala.inline
  def apply(
    autoscalingPolicy: AutoscalingPolicy = null,
    creationTimestamp: java.lang.String = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    region: java.lang.String = null,
    selfLink: java.lang.String = null,
    status: java.lang.String = null,
    statusDetails: js.Array[AutoscalerStatusDetails] = null,
    target: java.lang.String = null,
    zone: java.lang.String = null
  ): Autoscaler = {
    val __obj = js.Dynamic.literal()
    if (autoscalingPolicy != null) __obj.updateDynamic("autoscalingPolicy")(autoscalingPolicy)
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (region != null) __obj.updateDynamic("region")(region)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (status != null) __obj.updateDynamic("status")(status)
    if (statusDetails != null) __obj.updateDynamic("statusDetails")(statusDetails)
    if (target != null) __obj.updateDynamic("target")(target)
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[Autoscaler]
  }
}

