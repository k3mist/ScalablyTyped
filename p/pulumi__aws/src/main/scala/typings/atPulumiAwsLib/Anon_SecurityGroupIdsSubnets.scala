package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupIdsSubnets extends js.Object {
  var securityGroupIds: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  var subnets: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  var vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_SecurityGroupIdsSubnets {
  @scala.inline
  def apply(
    securityGroupIds: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    subnets: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_SecurityGroupIdsSubnets = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SecurityGroupIdsSubnets]
  }
}

