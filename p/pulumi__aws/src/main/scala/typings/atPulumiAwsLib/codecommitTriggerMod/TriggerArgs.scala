package typings
package atPulumiAwsLib.codecommitTriggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerArgs extends js.Object {
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  val triggers: atPulumiPulumiLib.resourceMod.Input[
    js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BranchesCustomData]]
  ]
}

object TriggerArgs {
  @scala.inline
  def apply(
    repositoryName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    triggers: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BranchesCustomData]]
    ]
  ): TriggerArgs = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TriggerArgs]
  }
}

