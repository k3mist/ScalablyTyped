package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypes extends js.Object {
  val Count: scala.Double
  def Clone(): IObjectTypes
  def Item(Index: scala.Double): IObjectType
}

object IObjectTypes {
  @scala.inline
  def apply(Clone: () => IObjectTypes, Count: scala.Double, Item: scala.Double => IObjectType): IObjectTypes = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IObjectTypes]
  }
}

