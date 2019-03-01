package typings
package atPulumiAwsLib.elasticloadbalancingListenerPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerPolicyArgs extends js.Object {
  /**
    * The load balancer to attach the policy to.
    */
  val loadBalancerName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The load balancer listener port to apply the policy to.
    */
  val loadBalancerPort: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  /**
    * List of Policy Names to apply to the backend server.
    */
  val policyNames: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
}

object ListenerPolicyArgs {
  @scala.inline
  def apply(
    loadBalancerName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    loadBalancerPort: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    policyNames: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): ListenerPolicyArgs = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any], loadBalancerPort = loadBalancerPort.asInstanceOf[js.Any])
    if (policyNames != null) __obj.updateDynamic("policyNames")(policyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerPolicyArgs]
  }
}

