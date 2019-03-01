package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlarmsEnabled extends js.Object {
  var alarms: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  var enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var ignorePollAlarmFailure: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
}

object Anon_AlarmsEnabled {
  @scala.inline
  def apply(
    alarms: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    ignorePollAlarmFailure: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null
  ): Anon_AlarmsEnabled = {
    val __obj = js.Dynamic.literal()
    if (alarms != null) __obj.updateDynamic("alarms")(alarms.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (ignorePollAlarmFailure != null) __obj.updateDynamic("ignorePollAlarmFailure")(ignorePollAlarmFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlarmsEnabled]
  }
}

