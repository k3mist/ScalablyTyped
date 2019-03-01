package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjVers extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, ObjVer: IObjVer): scala.Unit
  def Clone(): IObjVers
  def GetAllDistinctObjIDs(): IObjIDs
  def Item(Index: scala.Double): IObjVer
  def Remove(Index: scala.Double): scala.Unit
  def ToJSON(): java.lang.String
}

object IObjVers {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, IObjVer, scala.Unit],
    Clone: js.Function0[IObjVers],
    Count: scala.Double,
    GetAllDistinctObjIDs: js.Function0[IObjIDs],
    Item: js.Function1[scala.Double, IObjVer],
    Remove: js.Function1[scala.Double, scala.Unit],
    ToJSON: js.Function0[java.lang.String]
  ): IObjVers = {
    val __obj = js.Dynamic.literal(Add = Add, Clone = Clone, Count = Count, GetAllDistinctObjIDs = GetAllDistinctObjIDs, Item = Item, Remove = Remove, ToJSON = ToJSON)
  
    __obj.asInstanceOf[IObjVers]
  }
}

