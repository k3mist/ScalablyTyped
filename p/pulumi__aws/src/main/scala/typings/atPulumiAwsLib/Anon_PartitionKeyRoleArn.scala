package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PartitionKeyRoleArn extends js.Object {
  var partitionKey: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var streamName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_PartitionKeyRoleArn {
  @scala.inline
  def apply(
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    streamName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    partitionKey: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_PartitionKeyRoleArn = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any])
    if (partitionKey != null) __obj.updateDynamic("partitionKey")(partitionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PartitionKeyRoleArn]
  }
}

