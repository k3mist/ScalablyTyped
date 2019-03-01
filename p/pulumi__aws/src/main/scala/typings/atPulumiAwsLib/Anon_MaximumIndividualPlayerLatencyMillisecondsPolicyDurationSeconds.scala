package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaximumIndividualPlayerLatencyMillisecondsPolicyDurationSeconds extends js.Object {
  var maximumIndividualPlayerLatencyMilliseconds: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var policyDurationSeconds: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
}

object Anon_MaximumIndividualPlayerLatencyMillisecondsPolicyDurationSeconds {
  @scala.inline
  def apply(
    maximumIndividualPlayerLatencyMilliseconds: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    policyDurationSeconds: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): Anon_MaximumIndividualPlayerLatencyMillisecondsPolicyDurationSeconds = {
    val __obj = js.Dynamic.literal(maximumIndividualPlayerLatencyMilliseconds = maximumIndividualPlayerLatencyMilliseconds.asInstanceOf[js.Any])
    if (policyDurationSeconds != null) __obj.updateDynamic("policyDurationSeconds")(policyDurationSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaximumIndividualPlayerLatencyMillisecondsPolicyDurationSeconds]
  }
}

