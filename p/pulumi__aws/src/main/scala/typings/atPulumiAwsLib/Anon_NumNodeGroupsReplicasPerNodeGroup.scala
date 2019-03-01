package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NumNodeGroupsReplicasPerNodeGroup extends js.Object {
  var numNodeGroups: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var replicasPerNodeGroup: atPulumiPulumiLib.resourceMod.Input[scala.Double]
}

object Anon_NumNodeGroupsReplicasPerNodeGroup {
  @scala.inline
  def apply(
    numNodeGroups: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    replicasPerNodeGroup: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  ): Anon_NumNodeGroupsReplicasPerNodeGroup = {
    val __obj = js.Dynamic.literal(numNodeGroups = numNodeGroups.asInstanceOf[js.Any], replicasPerNodeGroup = replicasPerNodeGroup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NumNodeGroupsReplicasPerNodeGroup]
  }
}

