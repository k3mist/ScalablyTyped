package typings
package atPulumiAwsLib.elasticloadbalancingSslNegotiationPolicyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslNegotiationPolicyArgs extends js.Object {
  /**
    * An SSL Negotiation policy attribute. Each has two properties:
    */
  val attributes: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_NameValue]]]
  ] = js.undefined
  /**
    * The load balancer port to which the policy
    * should be applied. This must be an active listener on the load
    * balancer.
    */
  val lbPort: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  /**
    * The load balancer to which the policy
    * should be attached.
    */
  val loadBalancer: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name of the attribute
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object SslNegotiationPolicyArgs {
  @scala.inline
  def apply(
    lbPort: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    loadBalancer: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    attributes: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_NameValue]]] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): SslNegotiationPolicyArgs = {
    val __obj = js.Dynamic.literal(lbPort = lbPort.asInstanceOf[js.Any], loadBalancer = loadBalancer.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SslNegotiationPolicyArgs]
  }
}

