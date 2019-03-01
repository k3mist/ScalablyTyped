package typings
package atPulumiAwsLib.ssmPatchGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchGroupArgs extends js.Object {
  /**
    * The ID of the patch baseline to register the patch group with.
    */
  val baselineId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The name of the patch group that should be registered with the patch baseline.
    */
  val patchGroup: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object PatchGroupArgs {
  @scala.inline
  def apply(
    baselineId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    patchGroup: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): PatchGroupArgs = {
    val __obj = js.Dynamic.literal(baselineId = baselineId.asInstanceOf[js.Any], patchGroup = patchGroup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PatchGroupArgs]
  }
}

