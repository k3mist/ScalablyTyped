package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IVaultUserOperations extends js.Object {
  def AddOrUndeleteUserAccount(User: IUserAccount): IUserAccount
  def AddUserAccount(User: IUserAccount): IUserAccount
  def GetLoginAccountOfUser(UserID: scala.Double): ILoginAccount
  def GetLoginAccounts(): ILoginAccounts
  def GetUserAccount(UserID: scala.Double): IUserAccount
  def GetUserAccounts(): IUserAccounts
  def GetUserIDByGUID(UserGUID: java.lang.String): scala.Double
  def GetUserList(): IKeyNamePairs
  def ModifyUserAccount(User: IUserAccount): scala.Unit
  def RemoveUserAccount(UserID: scala.Double): scala.Unit
}

object IVaultUserOperations {
  @scala.inline
  def apply(
    AddOrUndeleteUserAccount: js.Function1[IUserAccount, IUserAccount],
    AddUserAccount: js.Function1[IUserAccount, IUserAccount],
    GetLoginAccountOfUser: js.Function1[scala.Double, ILoginAccount],
    GetLoginAccounts: js.Function0[ILoginAccounts],
    GetUserAccount: js.Function1[scala.Double, IUserAccount],
    GetUserAccounts: js.Function0[IUserAccounts],
    GetUserIDByGUID: js.Function1[java.lang.String, scala.Double],
    GetUserList: js.Function0[IKeyNamePairs],
    ModifyUserAccount: js.Function1[IUserAccount, scala.Unit],
    RemoveUserAccount: js.Function1[scala.Double, scala.Unit]
  ): IVaultUserOperations = {
    val __obj = js.Dynamic.literal(AddOrUndeleteUserAccount = AddOrUndeleteUserAccount, AddUserAccount = AddUserAccount, GetLoginAccountOfUser = GetLoginAccountOfUser, GetLoginAccounts = GetLoginAccounts, GetUserAccount = GetUserAccount, GetUserAccounts = GetUserAccounts, GetUserIDByGUID = GetUserIDByGUID, GetUserList = GetUserList, ModifyUserAccount = ModifyUserAccount, RemoveUserAccount = RemoveUserAccount)
  
    __obj.asInstanceOf[IVaultUserOperations]
  }
}

