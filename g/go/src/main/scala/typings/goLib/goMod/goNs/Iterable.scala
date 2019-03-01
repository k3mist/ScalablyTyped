package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface is implemented by the List, Set, and Map
  * classes; it provides the .iterator read-only property that returns an Iterator.
  */
trait Iterable[T] extends js.Object {
  /*This is an interface and thus does not have a constructor.*/
  /**Gets an Iterator that can iterate over the items in the collection.*/
  var iterator: Iterator[T]
}

object Iterable {
  @scala.inline
  def apply[T](iterator: Iterator[T]): Iterable[T] = {
    val __obj = js.Dynamic.literal(iterator = iterator)
  
    __obj.asInstanceOf[Iterable[T]]
  }
}

