package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionCidrBlockFromPort extends js.Object {
  var action: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var cidrBlock: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var fromPort: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var icmpCode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var icmpType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var ipv6CidrBlock: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var protocol: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var ruleNo: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var toPort: atPulumiPulumiLib.resourceMod.Input[scala.Double]
}

object Anon_ActionCidrBlockFromPort {
  @scala.inline
  def apply(
    action: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    fromPort: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    protocol: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    ruleNo: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    toPort: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    cidrBlock: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    icmpCode: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    icmpType: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    ipv6CidrBlock: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_ActionCidrBlockFromPort = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], fromPort = fromPort.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], ruleNo = ruleNo.asInstanceOf[js.Any], toPort = toPort.asInstanceOf[js.Any])
    if (cidrBlock != null) __obj.updateDynamic("cidrBlock")(cidrBlock.asInstanceOf[js.Any])
    if (icmpCode != null) __obj.updateDynamic("icmpCode")(icmpCode.asInstanceOf[js.Any])
    if (icmpType != null) __obj.updateDynamic("icmpType")(icmpType.asInstanceOf[js.Any])
    if (ipv6CidrBlock != null) __obj.updateDynamic("ipv6CidrBlock")(ipv6CidrBlock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionCidrBlockFromPort]
  }
}

