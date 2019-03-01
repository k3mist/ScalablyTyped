package typings
package atPulumiAwsLib.ec2VpcEndpointServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointServiceState extends js.Object {
  /**
    * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
    */
  val acceptanceRequired: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The ARNs of one or more principals allowed to discover the endpoint service.
    */
  val allowedPrincipals: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The Availability Zones in which the service is available.
    */
  val availabilityZones: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The DNS names for the service.
    */
  val baseEndpointDnsNames: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ARNs of one or more Network Load Balancers for the endpoint service.
    */
  val networkLoadBalancerArns: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The private DNS name for the service.
    */
  val privateDnsName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The service name.
    */
  val serviceName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The service type, `Gateway` or `Interface`.
    */
  val serviceType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The state of the VPC endpoint service.
    */
  val state: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object VpcEndpointServiceState {
  @scala.inline
  def apply(
    acceptanceRequired: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    allowedPrincipals: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    availabilityZones: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    baseEndpointDnsNames: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    networkLoadBalancerArns: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    privateDnsName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    serviceName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    serviceType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    state: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): VpcEndpointServiceState = {
    val __obj = js.Dynamic.literal()
    if (acceptanceRequired != null) __obj.updateDynamic("acceptanceRequired")(acceptanceRequired.asInstanceOf[js.Any])
    if (allowedPrincipals != null) __obj.updateDynamic("allowedPrincipals")(allowedPrincipals.asInstanceOf[js.Any])
    if (availabilityZones != null) __obj.updateDynamic("availabilityZones")(availabilityZones.asInstanceOf[js.Any])
    if (baseEndpointDnsNames != null) __obj.updateDynamic("baseEndpointDnsNames")(baseEndpointDnsNames.asInstanceOf[js.Any])
    if (networkLoadBalancerArns != null) __obj.updateDynamic("networkLoadBalancerArns")(networkLoadBalancerArns.asInstanceOf[js.Any])
    if (privateDnsName != null) __obj.updateDynamic("privateDnsName")(privateDnsName.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (serviceType != null) __obj.updateDynamic("serviceType")(serviceType.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointServiceState]
  }
}

