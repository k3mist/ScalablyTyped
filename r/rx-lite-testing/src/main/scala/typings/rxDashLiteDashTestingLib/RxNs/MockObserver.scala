package typings
package rxDashLiteDashTestingLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockObserver[T]
  extends rxDashCoreLib.RxNs.Observer[T] {
  var messages: js.Array[Recorded]
}

object MockObserver {
  @scala.inline
  def apply[T](checked: js.Function0[rxDashCoreLib.RxNs.Observer[_]], messages: js.Array[Recorded]): MockObserver[T] = {
    val __obj = js.Dynamic.literal(checked = checked, messages = messages)
  
    __obj.asInstanceOf[MockObserver[T]]
  }
}

