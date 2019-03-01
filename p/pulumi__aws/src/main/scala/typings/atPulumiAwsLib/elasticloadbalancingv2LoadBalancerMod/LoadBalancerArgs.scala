package typings
package atPulumiAwsLib.elasticloadbalancingv2LoadBalancerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerArgs extends js.Object {
  /**
    * An Access Logs block. Access Logs documented below. Only valid for Load Balancers of type `application`.
    */
  val accessLogs: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BucketEnabledPrefix]] = js.undefined
  /**
    * If true, cross-zone load balancing of the load balancer will be enabled.
    * This is a `network` load balancer feature. Defaults to `false`.
    */
  val enableCrossZoneLoadBalancing: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * If true, deletion of the load balancer will be disabled via
    * the AWS API. This will prevent Terraform from deleting the load balancer. Defaults to `false`.
    */
  val enableDeletionProtection: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Indicates whether HTTP/2 is enabled in `application` load balancers. Defaults to `true`.
    */
  val enableHttp2: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The time in seconds that the connection is allowed to be idle. Only valid for Load Balancers of type `application`. Default: 60.
    */
  val idleTimeout: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * If true, the LB will be internal.
    */
  val internal: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The type of IP addresses used by the subnets for your load balancer. The possible values are `ipv4` and `dualstack`
    */
  val ipAddressType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of load balancer to create. Possible values are `application` or `network`. The default value is `application`.
    */
  val loadBalancerType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the LB. This name must be unique within your AWS account, can have a maximum of 32 characters,
    * must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen. If not specified,
    * Terraform will autogenerate a name beginning with `tf-lb`.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of security group IDs to assign to the LB. Only valid for Load Balancers of type `application`.
    */
  val securityGroups: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A subnet mapping block as documented below.
    */
  val subnetMappings: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllocationIdSubnetId]]
    ]
  ] = js.undefined
  /**
    * A list of subnet IDs to attach to the LB. Subnets
    * cannot be updated for Load Balancers of type `network`. Changing this value
    * for load balancers of type `network` will force a recreation of the resource.
    */
  val subnets: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
}

object LoadBalancerArgs {
  @scala.inline
  def apply(
    accessLogs: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BucketEnabledPrefix] = null,
    enableCrossZoneLoadBalancing: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    enableDeletionProtection: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    enableHttp2: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    idleTimeout: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    internal: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    ipAddressType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    loadBalancerType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    securityGroups: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    subnetMappings: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllocationIdSubnetId]]
    ] = null,
    subnets: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): LoadBalancerArgs = {
    val __obj = js.Dynamic.literal()
    if (accessLogs != null) __obj.updateDynamic("accessLogs")(accessLogs.asInstanceOf[js.Any])
    if (enableCrossZoneLoadBalancing != null) __obj.updateDynamic("enableCrossZoneLoadBalancing")(enableCrossZoneLoadBalancing.asInstanceOf[js.Any])
    if (enableDeletionProtection != null) __obj.updateDynamic("enableDeletionProtection")(enableDeletionProtection.asInstanceOf[js.Any])
    if (enableHttp2 != null) __obj.updateDynamic("enableHttp2")(enableHttp2.asInstanceOf[js.Any])
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout.asInstanceOf[js.Any])
    if (internal != null) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (ipAddressType != null) __obj.updateDynamic("ipAddressType")(ipAddressType.asInstanceOf[js.Any])
    if (loadBalancerType != null) __obj.updateDynamic("loadBalancerType")(loadBalancerType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (subnetMappings != null) __obj.updateDynamic("subnetMappings")(subnetMappings.asInstanceOf[js.Any])
    if (subnets != null) __obj.updateDynamic("subnets")(subnets.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerArgs]
  }
}

