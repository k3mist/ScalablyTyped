package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerLicenseManagementOperations extends js.Object {
  def GetLicenseStatus(): ILicenseStatus
  def SetLicenseCodeAndSerialNumber(SerialNumber: java.lang.String, LicenseCode: java.lang.String): scala.Unit
}

object IServerLicenseManagementOperations {
  @scala.inline
  def apply(
    GetLicenseStatus: () => ILicenseStatus,
    SetLicenseCodeAndSerialNumber: (java.lang.String, java.lang.String) => scala.Unit
  ): IServerLicenseManagementOperations = {
    val __obj = js.Dynamic.literal(GetLicenseStatus = js.Any.fromFunction0(GetLicenseStatus), SetLicenseCodeAndSerialNumber = js.Any.fromFunction2(SetLicenseCodeAndSerialNumber))
  
    __obj.asInstanceOf[IServerLicenseManagementOperations]
  }
}

