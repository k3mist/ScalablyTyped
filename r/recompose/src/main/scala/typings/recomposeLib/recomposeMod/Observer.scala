package typings
package recomposeLib.recomposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  def complete(): scala.Unit
  def next(props: T): scala.Unit
}

object Observer {
  @scala.inline
  def apply[T](complete: js.Function0[scala.Unit], next: js.Function1[T, scala.Unit]): Observer[T] = {
    val __obj = js.Dynamic.literal(complete = complete, next = next)
  
    __obj.asInstanceOf[Observer[T]]
  }
}

