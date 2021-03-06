package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserOrUserGroupIDs extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, UserOrUserGroupID: IUserOrUserGroupID): scala.Unit
  def Clone(): IUserOrUserGroupIDs
  def GetUserOrUserGroupID(UserOrGroupID: scala.Double, UserOrGroupType: mfilesLib.MFilesNs.MFUserOrUserGroupType): IUserOrUserGroupID
  def GetUserOrUserGroupIDIndex(UserOrGroupID: scala.Double, UserOrGroupType: mfilesLib.MFilesNs.MFUserOrUserGroupType): scala.Double
  def Item(Index: scala.Double): IUserOrUserGroupID
  def Remove(Index: scala.Double): scala.Unit
}

object IUserOrUserGroupIDs {
  @scala.inline
  def apply(
    Add: (scala.Double, IUserOrUserGroupID) => scala.Unit,
    Clone: () => IUserOrUserGroupIDs,
    Count: scala.Double,
    GetUserOrUserGroupID: (scala.Double, mfilesLib.MFilesNs.MFUserOrUserGroupType) => IUserOrUserGroupID,
    GetUserOrUserGroupIDIndex: (scala.Double, mfilesLib.MFilesNs.MFUserOrUserGroupType) => scala.Double,
    Item: scala.Double => IUserOrUserGroupID,
    Remove: scala.Double => scala.Unit
  ): IUserOrUserGroupIDs = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count, GetUserOrUserGroupID = js.Any.fromFunction2(GetUserOrUserGroupID), GetUserOrUserGroupIDIndex = js.Any.fromFunction2(GetUserOrUserGroupIDIndex), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[IUserOrUserGroupIDs]
  }
}

