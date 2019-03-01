package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWorkflows extends js.Object {
  val Count: scala.Double
  def Item(Index: scala.Double): IWorkflow
}

object IWorkflows {
  @scala.inline
  def apply(Count: scala.Double, Item: js.Function1[scala.Double, IWorkflow]): IWorkflows = {
    val __obj = js.Dynamic.literal(Count = Count, Item = Item)
  
    __obj.asInstanceOf[IWorkflows]
  }
}

