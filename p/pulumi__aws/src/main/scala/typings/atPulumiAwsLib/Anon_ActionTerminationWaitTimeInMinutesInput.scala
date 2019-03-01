package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionTerminationWaitTimeInMinutesInput extends js.Object {
  var action: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var terminationWaitTimeInMinutes: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
}

object Anon_ActionTerminationWaitTimeInMinutesInput {
  @scala.inline
  def apply(
    action: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    terminationWaitTimeInMinutes: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): Anon_ActionTerminationWaitTimeInMinutesInput = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (terminationWaitTimeInMinutes != null) __obj.updateDynamic("terminationWaitTimeInMinutes")(terminationWaitTimeInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionTerminationWaitTimeInMinutesInput]
  }
}

