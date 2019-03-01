package typings
package meteorLib.reactiveDashVarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactiveVar[T] extends js.Object {
  def get(): T
  def set(newValue: T): scala.Unit
}

object ReactiveVar {
  @scala.inline
  def apply[T](get: js.Function0[T], set: js.Function1[T, scala.Unit]): ReactiveVar[T] = {
    val __obj = js.Dynamic.literal(get = get, set = set)
  
    __obj.asInstanceOf[ReactiveVar[T]]
  }
}

