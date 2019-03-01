package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The destination range of outgoing packets that this route applies to. Only IPv4 is supported. */
  var destRange: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Type of this resource. Always compute#routes for Route resources. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular expression [a-z]([-a-z0-9]&#42;[a-z0-9])? which means the first character must be
    * a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Fully-qualified URL of the network that this route applies to. */
  var network: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL to a gateway that should handle matching packets. You can only specify the internet gateway using a full or partial valid URL:
    * projects/<project-id>/global/gateways/default-internet-gateway
    */
  var nextHopGateway: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL to an instance that should handle matching packets. You can specify this as a full or partial URL. For example:
    * https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/
    */
  var nextHopInstance: js.UndefOr[java.lang.String] = js.undefined
  /** The network IP address of an instance that should handle matching packets. Only IPv4 is supported. */
  var nextHopIp: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of the local network if it should handle matching packets. */
  var nextHopNetwork: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The network peering name that should handle matching packets, which should conform to RFC1035. */
  var nextHopPeering: js.UndefOr[java.lang.String] = js.undefined
  /** The URL to a VpnTunnel that should handle matching packets. */
  var nextHopVpnTunnel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The priority of this route. Priority is used to break ties in cases where there is more than one matching route of equal prefix length. In the case of
    * two routes with equal prefix length, the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0 through 65535.
    */
  var priority: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] Server-defined fully-qualified URL for this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** A list of instance tags to which this route applies. */
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** [Output Only] If potential misconfigurations are detected for this route, this field will be populated with warning messages. */
  var warnings: js.UndefOr[js.Array[gapiDotClientDotComputeLib.Anon_Code]] = js.undefined
}

object Route {
  @scala.inline
  def apply(
    creationTimestamp: java.lang.String = null,
    description: java.lang.String = null,
    destRange: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    network: java.lang.String = null,
    nextHopGateway: java.lang.String = null,
    nextHopInstance: java.lang.String = null,
    nextHopIp: java.lang.String = null,
    nextHopNetwork: java.lang.String = null,
    nextHopPeering: java.lang.String = null,
    nextHopVpnTunnel: java.lang.String = null,
    priority: scala.Int | scala.Double = null,
    selfLink: java.lang.String = null,
    tags: js.Array[java.lang.String] = null,
    warnings: js.Array[gapiDotClientDotComputeLib.Anon_Code] = null
  ): Route = {
    val __obj = js.Dynamic.literal()
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (description != null) __obj.updateDynamic("description")(description)
    if (destRange != null) __obj.updateDynamic("destRange")(destRange)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (network != null) __obj.updateDynamic("network")(network)
    if (nextHopGateway != null) __obj.updateDynamic("nextHopGateway")(nextHopGateway)
    if (nextHopInstance != null) __obj.updateDynamic("nextHopInstance")(nextHopInstance)
    if (nextHopIp != null) __obj.updateDynamic("nextHopIp")(nextHopIp)
    if (nextHopNetwork != null) __obj.updateDynamic("nextHopNetwork")(nextHopNetwork)
    if (nextHopPeering != null) __obj.updateDynamic("nextHopPeering")(nextHopPeering)
    if (nextHopVpnTunnel != null) __obj.updateDynamic("nextHopVpnTunnel")(nextHopVpnTunnel)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[Route]
  }
}

