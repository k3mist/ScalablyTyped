package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClassGroup extends js.Object {
  var ID: scala.Double
  var Members: IIDs
  var Name: java.lang.String
  var ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType | scala.Double
  def AddMember(Member: scala.Double): scala.Unit
  def Clone(): IClassGroup
  def RemoveMember(Member: scala.Double): scala.Unit
}

object IClassGroup {
  @scala.inline
  def apply(
    AddMember: js.Function1[scala.Double, scala.Unit],
    Clone: js.Function0[IClassGroup],
    ID: scala.Double,
    Members: IIDs,
    Name: java.lang.String,
    ObjectType: mfilesLib.MFilesNs.MFBuiltInObjectType | scala.Double,
    RemoveMember: js.Function1[scala.Double, scala.Unit]
  ): IClassGroup = {
    val __obj = js.Dynamic.literal(AddMember = AddMember, Clone = Clone, ID = ID, Members = Members, Name = Name, ObjectType = ObjectType.asInstanceOf[js.Any], RemoveMember = RemoveMember)
  
    __obj.asInstanceOf[IClassGroup]
  }
}

