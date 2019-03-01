package typings
package atPulumiAwsLib.applicationloadbalancingTargetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetGroupArgs extends js.Object {
  /**
    * The amount time for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.
    */
  val deregistrationDelay: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * A Health Check block. Health Check blocks are documented below.
    */
  val healthCheck: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_HealthyThresholdIntervalMatcher]
  ] = js.undefined
  /**
    * The name of the target group. If omitted, Terraform will assign a random, unique name.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The port to use to connect with the target. Valid values are either ports 1-65536, or `traffic-port`. Defaults to `traffic-port`.
    */
  val port: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The protocol to use to connect with the target. Defaults to `HTTP`. Not applicable when `target_type` is `lambda`.
    */
  val protocol: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Boolean to enable / disable support for proxy protocol v2 on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#proxy-protocol) for more information.
    */
  val proxyProtocolV2: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The amount time for targets to warm up before the load balancer sends them a full share of requests. The range is 30-900 seconds or 0 to disable. The default value is 0 seconds.
    */
  val slowStart: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * A Stickiness block. Stickiness blocks are documented below. `stickiness` is only valid if used with Load Balancers of type `Application`
    */
  val stickiness: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CookieDurationEnabledType]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * The type of target that you must specify when registering targets with this target group.
    * The possible values are `instance` (targets are specified by instance ID) or `ip` (targets are specified by IP address) or `lambda` (targets are specified by lambda arn).
    * The default is `instance`. Note that you can't specify targets for a target group using both instance IDs and IP addresses.
    * If the target type is `ip`, specify IP addresses from the subnets of the virtual private cloud (VPC) for the target group,
    * the RFC 1918 range (10.0.0.0/8, 172.16.0.0/12, and 192.168.0.0/16), and the RFC 6598 range (100.64.0.0/10).
    * You can't specify publicly routable IP addresses.
    */
  val targetType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The identifier of the VPC in which to create the target group. Required when `target_type` is `instance` or `ip`. Does not apply when `target_type` is `lambda`.
    */
  val vpcId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object TargetGroupArgs {
  @scala.inline
  def apply(
    deregistrationDelay: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    healthCheck: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_HealthyThresholdIntervalMatcher] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    port: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    protocol: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    proxyProtocolV2: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    slowStart: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    stickiness: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_CookieDurationEnabledType] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    targetType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): TargetGroupArgs = {
    val __obj = js.Dynamic.literal()
    if (deregistrationDelay != null) __obj.updateDynamic("deregistrationDelay")(deregistrationDelay.asInstanceOf[js.Any])
    if (healthCheck != null) __obj.updateDynamic("healthCheck")(healthCheck.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (proxyProtocolV2 != null) __obj.updateDynamic("proxyProtocolV2")(proxyProtocolV2.asInstanceOf[js.Any])
    if (slowStart != null) __obj.updateDynamic("slowStart")(slowStart.asInstanceOf[js.Any])
    if (stickiness != null) __obj.updateDynamic("stickiness")(stickiness.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (targetType != null) __obj.updateDynamic("targetType")(targetType.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroupArgs]
  }
}

