package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PartitionKeyPathInput extends js.Object {
  var partitionKeyPath: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_PartitionKeyPathInput {
  @scala.inline
  def apply(partitionKeyPath: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null): Anon_PartitionKeyPathInput = {
    val __obj = js.Dynamic.literal()
    if (partitionKeyPath != null) __obj.updateDynamic("partitionKeyPath")(partitionKeyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PartitionKeyPathInput]
  }
}

