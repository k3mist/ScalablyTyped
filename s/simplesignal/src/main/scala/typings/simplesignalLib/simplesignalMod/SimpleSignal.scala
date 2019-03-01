package typings
package simplesignalLib.simplesignalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSignal[F /* <: js.Function */] extends js.Object {
  var functions: js.Any
  val numItems: scala.Double
  def add(func: F): scala.Boolean
  def dispatch(args: js.Any*): scala.Unit
  def remove(func: F): scala.Boolean
  def removeAll(): scala.Boolean
}

object SimpleSignal {
  @scala.inline
  def apply[F /* <: js.Function */](
    add: js.Function1[F, scala.Boolean],
    dispatch: js.Function1[/* repeated */ js.Any, scala.Unit],
    functions: js.Any,
    numItems: scala.Double,
    remove: js.Function1[F, scala.Boolean],
    removeAll: js.Function0[scala.Boolean]
  ): SimpleSignal[F] = {
    val __obj = js.Dynamic.literal(add = add, dispatch = dispatch, functions = functions, numItems = numItems, remove = remove, removeAll = removeAll)
  
    __obj.asInstanceOf[SimpleSignal[F]]
  }
}

