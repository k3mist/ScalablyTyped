package typings
package tsDashMockitoLib.libCaptureArgCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] extends js.Object {
  def beforeLast(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  def byCallIndex(index: scala.Double): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  def first(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  def last(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  def second(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
  def third(): js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]
}

object ArgCaptor10 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9](
    beforeLast: js.Function0[js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]],
    byCallIndex: js.Function1[scala.Double, js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]],
    first: js.Function0[js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]],
    last: js.Function0[js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]],
    second: js.Function0[js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]],
    third: js.Function0[js.Tuple10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]]
  ): ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9] = {
    val __obj = js.Dynamic.literal(beforeLast = beforeLast, byCallIndex = byCallIndex, first = first, last = last, second = second, third = third)
  
    __obj.asInstanceOf[ArgCaptor10[T0, T1, T2, T3, T4, T5, T6, T7, T8, T9]]
  }
}

