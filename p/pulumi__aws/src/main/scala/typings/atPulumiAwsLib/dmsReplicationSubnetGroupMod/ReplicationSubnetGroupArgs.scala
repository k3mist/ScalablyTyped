package typings
package atPulumiAwsLib.dmsReplicationSubnetGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationSubnetGroupArgs extends js.Object {
  /**
    * The description for the subnet group.
    */
  val replicationSubnetGroupDescription: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name for the replication subnet group. This value is stored as a lowercase string.
    */
  val replicationSubnetGroupId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * A list of the EC2 subnet IDs for the subnet group.
    */
  val subnetIds: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
}

object ReplicationSubnetGroupArgs {
  @scala.inline
  def apply(
    replicationSubnetGroupDescription: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    replicationSubnetGroupId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    subnetIds: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): ReplicationSubnetGroupArgs = {
    val __obj = js.Dynamic.literal(replicationSubnetGroupDescription = replicationSubnetGroupDescription.asInstanceOf[js.Any], replicationSubnetGroupId = replicationSubnetGroupId.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationSubnetGroupArgs]
  }
}

