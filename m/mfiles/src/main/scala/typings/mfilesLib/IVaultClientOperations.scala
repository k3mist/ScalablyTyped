package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultClientOperations extends js.Object {
  def DisableCheckInReminderForCallingProcess(): scala.Unit
  def EnableCheckInReminderForCallingProcess(): scala.Unit
  def IsOffline(): scala.Boolean
  def IsOnline(): scala.Boolean
  def SetVaultToOffline(ParentWindow: scala.Double): mfilesLib.MFilesNs.MFOfflineTransitionResultFlags
  def SetVaultToOnline(ParentWindow: scala.Double): mfilesLib.MFilesNs.MFOnlineTransitionResultFlags
}

object IVaultClientOperations {
  @scala.inline
  def apply(
    DisableCheckInReminderForCallingProcess: js.Function0[scala.Unit],
    EnableCheckInReminderForCallingProcess: js.Function0[scala.Unit],
    IsOffline: js.Function0[scala.Boolean],
    IsOnline: js.Function0[scala.Boolean],
    SetVaultToOffline: js.Function1[scala.Double, mfilesLib.MFilesNs.MFOfflineTransitionResultFlags],
    SetVaultToOnline: js.Function1[scala.Double, mfilesLib.MFilesNs.MFOnlineTransitionResultFlags]
  ): IVaultClientOperations = {
    val __obj = js.Dynamic.literal(DisableCheckInReminderForCallingProcess = DisableCheckInReminderForCallingProcess, EnableCheckInReminderForCallingProcess = EnableCheckInReminderForCallingProcess, IsOffline = IsOffline, IsOnline = IsOnline, SetVaultToOffline = SetVaultToOffline, SetVaultToOnline = SetVaultToOnline)
  
    __obj.asInstanceOf[IVaultClientOperations]
  }
}

