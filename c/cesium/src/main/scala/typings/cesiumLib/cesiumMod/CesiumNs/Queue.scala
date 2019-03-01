package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queue extends js.Object {
  val length: scala.Double
  def clear(): scala.Unit
  def contains(item: js.Any): scala.Boolean
  def dequeue(): js.Any
  def enqueue(item: js.Any): scala.Unit
  def peek(): js.Any
  def sort(compareFunction: cesiumLib.cesiumMod.CesiumNs.QueueNs.Comparator): scala.Unit
}

object Queue {
  @scala.inline
  def apply(
    clear: js.Function0[scala.Unit],
    contains: js.Function1[js.Any, scala.Boolean],
    dequeue: js.Function0[js.Any],
    enqueue: js.Function1[js.Any, scala.Unit],
    length: scala.Double,
    peek: js.Function0[js.Any],
    sort: js.Function1[cesiumLib.cesiumMod.CesiumNs.QueueNs.Comparator, scala.Unit]
  ): Queue = {
    val __obj = js.Dynamic.literal(clear = clear, contains = contains, dequeue = dequeue, enqueue = enqueue, length = length, peek = peek, sort = sort)
  
    __obj.asInstanceOf[Queue]
  }
}

