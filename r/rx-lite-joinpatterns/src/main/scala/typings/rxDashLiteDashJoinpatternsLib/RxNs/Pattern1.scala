package typings
package rxDashLiteDashJoinpatternsLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pattern1[T1] extends js.Object {
  def and[T2](other: Observable[T2]): Pattern2[T1, T2]
  def thenDo[TR](selector: js.Function1[/* item1 */ T1, TR]): Plan[TR]
}

object Pattern1 {
  @scala.inline
  def apply[T1](
    and: js.Function1[Observable[js.Any], Pattern2[T1, js.Any]],
    thenDo: js.Function1[js.Function1[/* item1 */ T1, js.Any], Plan[js.Any]]
  ): Pattern1[T1] = {
    val __obj = js.Dynamic.literal(and = and, thenDo = thenDo)
  
    __obj.asInstanceOf[Pattern1[T1]]
  }
}

