package typings
package mobxLib.libTypesObservablearrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IArraySplice[T] extends js.Object {
  var added: js.Array[T]
  var addedCount: scala.Double
  var index: scala.Double
  var `object`: IObservableArray[T]
  var removed: js.Array[T]
  var removedCount: scala.Double
  var `type`: mobxLib.mobxLibStrings.splice
}

object IArraySplice {
  @scala.inline
  def apply[T](
    added: js.Array[T],
    addedCount: scala.Double,
    index: scala.Double,
    `object`: IObservableArray[T],
    removed: js.Array[T],
    removedCount: scala.Double,
    `type`: mobxLib.mobxLibStrings.splice
  ): IArraySplice[T] = {
    val __obj = js.Dynamic.literal(added = added, addedCount = addedCount, index = index, `object` = `object`, removed = removed, removedCount = removedCount, `type` = `type`)
  
    __obj.asInstanceOf[IArraySplice[T]]
  }
}

