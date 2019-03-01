package typings
package atPulumiAwsLib.ec2VpcEndpointServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpointServiceArgs extends js.Object {
  /**
    * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
    */
  val acceptanceRequired: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
  /**
    * The ARNs of one or more principals allowed to discover the endpoint service.
    */
  val allowedPrincipals: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The ARNs of one or more Network Load Balancers for the endpoint service.
    */
  val networkLoadBalancerArns: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
}

object VpcEndpointServiceArgs {
  @scala.inline
  def apply(
    acceptanceRequired: atPulumiPulumiLib.resourceMod.Input[scala.Boolean],
    networkLoadBalancerArns: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    allowedPrincipals: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): VpcEndpointServiceArgs = {
    val __obj = js.Dynamic.literal(acceptanceRequired = acceptanceRequired.asInstanceOf[js.Any], networkLoadBalancerArns = networkLoadBalancerArns.asInstanceOf[js.Any])
    if (allowedPrincipals != null) __obj.updateDynamic("allowedPrincipals")(allowedPrincipals.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcEndpointServiceArgs]
  }
}

