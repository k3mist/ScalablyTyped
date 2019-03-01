package typings
package atPulumiAwsLib.elasticloadbalancingLoadBalancerBackendServerPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerBackendServerPolicyState extends js.Object {
  /**
    * The instance port to apply the policy to.
    */
  val instancePort: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The load balancer to attach the policy to.
    */
  val loadBalancerName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * List of Policy Names to apply to the backend server.
    */
  val policyNames: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
}

object LoadBalancerBackendServerPolicyState {
  @scala.inline
  def apply(
    instancePort: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    loadBalancerName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    policyNames: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): LoadBalancerBackendServerPolicyState = {
    val __obj = js.Dynamic.literal()
    if (instancePort != null) __obj.updateDynamic("instancePort")(instancePort.asInstanceOf[js.Any])
    if (loadBalancerName != null) __obj.updateDynamic("loadBalancerName")(loadBalancerName.asInstanceOf[js.Any])
    if (policyNames != null) __obj.updateDynamic("policyNames")(policyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerBackendServerPolicyState]
  }
}

