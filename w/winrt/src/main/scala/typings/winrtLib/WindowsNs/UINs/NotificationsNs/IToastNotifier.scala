package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastNotifier extends js.Object {
  var setting: NotificationSetting
  def addToSchedule(scheduledToast: ScheduledToastNotification): scala.Unit
  def getScheduledToastNotifications(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ScheduledToastNotification]
  def hide(notification: ToastNotification): scala.Unit
  def removeFromSchedule(scheduledToast: ScheduledToastNotification): scala.Unit
  def show(notification: ToastNotification): scala.Unit
}

object IToastNotifier {
  @scala.inline
  def apply(
    addToSchedule: js.Function1[ScheduledToastNotification, scala.Unit],
    getScheduledToastNotifications: js.Function0[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ScheduledToastNotification]
    ],
    hide: js.Function1[ToastNotification, scala.Unit],
    removeFromSchedule: js.Function1[ScheduledToastNotification, scala.Unit],
    setting: NotificationSetting,
    show: js.Function1[ToastNotification, scala.Unit]
  ): IToastNotifier = {
    val __obj = js.Dynamic.literal(addToSchedule = addToSchedule, getScheduledToastNotifications = getScheduledToastNotifications, hide = hide, removeFromSchedule = removeFromSchedule, setting = setting, show = show)
  
    __obj.asInstanceOf[IToastNotifier]
  }
}

