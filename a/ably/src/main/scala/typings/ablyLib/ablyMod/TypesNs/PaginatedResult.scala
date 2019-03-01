package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatedResult[T] extends js.Object {
  var items: js.Array[T]
  def current(results: paginatedResultCallback[T]): scala.Unit
  def first(results: paginatedResultCallback[T]): scala.Unit
  def hasNext(): scala.Boolean
  def isLast(): scala.Boolean
  def next(results: paginatedResultCallback[T]): scala.Unit
}

object PaginatedResult {
  @scala.inline
  def apply[T](
    current: js.Function1[paginatedResultCallback[T], scala.Unit],
    first: js.Function1[paginatedResultCallback[T], scala.Unit],
    hasNext: js.Function0[scala.Boolean],
    isLast: js.Function0[scala.Boolean],
    items: js.Array[T],
    next: js.Function1[paginatedResultCallback[T], scala.Unit]
  ): PaginatedResult[T] = {
    val __obj = js.Dynamic.literal(current = current, first = first, hasNext = hasNext, isLast = isLast, items = items, next = next)
  
    __obj.asInstanceOf[PaginatedResult[T]]
  }
}

