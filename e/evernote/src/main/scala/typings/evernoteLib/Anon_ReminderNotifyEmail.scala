package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReminderNotifyEmail extends js.Object {
  var reminderNotifyEmail: js.UndefOr[scala.Boolean] = js.undefined
  var reminderNotifyInApp: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ReminderNotifyEmail {
  @scala.inline
  def apply(
    reminderNotifyEmail: js.UndefOr[scala.Boolean] = js.undefined,
    reminderNotifyInApp: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ReminderNotifyEmail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reminderNotifyEmail)) __obj.updateDynamic("reminderNotifyEmail")(reminderNotifyEmail)
    if (!js.isUndefined(reminderNotifyInApp)) __obj.updateDynamic("reminderNotifyInApp")(reminderNotifyInApp)
    __obj.asInstanceOf[Anon_ReminderNotifyEmail]
  }
}

