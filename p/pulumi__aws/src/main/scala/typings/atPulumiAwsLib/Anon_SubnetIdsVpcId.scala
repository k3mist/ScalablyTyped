package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SubnetIdsVpcId extends js.Object {
  var subnetIds: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  var vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_SubnetIdsVpcId {
  @scala.inline
  def apply(
    subnetIds: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_SubnetIdsVpcId = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SubnetIdsVpcId]
  }
}

