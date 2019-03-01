package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OwnerSourceDetails extends js.Object {
  var owner: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var sourceDetails: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_EventSourceMaximumExecutionFrequency]]
    ]
  ] = js.undefined
  var sourceIdentifier: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_OwnerSourceDetails {
  @scala.inline
  def apply(
    owner: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    sourceIdentifier: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    sourceDetails: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_EventSourceMaximumExecutionFrequency]]
    ] = null
  ): Anon_OwnerSourceDetails = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], sourceIdentifier = sourceIdentifier.asInstanceOf[js.Any])
    if (sourceDetails != null) __obj.updateDynamic("sourceDetails")(sourceDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OwnerSourceDetails]
  }
}

