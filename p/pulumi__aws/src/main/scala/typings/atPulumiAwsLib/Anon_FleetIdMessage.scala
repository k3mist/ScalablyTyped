package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FleetIdMessage extends js.Object {
  var fleetId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_FleetIdMessage {
  @scala.inline
  def apply(
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    fleetId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    message: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_FleetIdMessage = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    if (fleetId != null) __obj.updateDynamic("fleetId")(fleetId.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FleetIdMessage]
  }
}

