package typings
package atPulumiAwsLib.wafregionalIpSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpSetState extends js.Object {
  /**
    * The ARN of the WAF IPSet.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * One or more pairs specifying the IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) from which web requests originate.
    */
  val ipSetDescriptors: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_TypeValueInputString]]
    ]
  ] = js.undefined
  /**
    * The name or description of the IPSet.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object IpSetState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    ipSetDescriptors: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_TypeValueInputString]]
    ] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): IpSetState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (ipSetDescriptors != null) __obj.updateDynamic("ipSetDescriptors")(ipSetDescriptors.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpSetState]
  }
}

