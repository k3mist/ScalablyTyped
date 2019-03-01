package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccessControlListComponentKeys extends js.Object {
  val Count: scala.Double
  def Clone(): IAccessControlListComponentKeys
  def Item(Index: scala.Double): IAccessControlListComponentKey
}

object IAccessControlListComponentKeys {
  @scala.inline
  def apply(
    Clone: js.Function0[IAccessControlListComponentKeys],
    Count: scala.Double,
    Item: js.Function1[scala.Double, IAccessControlListComponentKey]
  ): IAccessControlListComponentKeys = {
    val __obj = js.Dynamic.literal(Clone = Clone, Count = Count, Item = Item)
  
    __obj.asInstanceOf[IAccessControlListComponentKeys]
  }
}

