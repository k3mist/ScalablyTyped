package typings
package tsDashMockitoLib.libCaptureArgCaptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8] extends js.Object {
  def beforeLast(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
  def byCallIndex(index: scala.Double): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
  def first(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
  def last(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
  def second(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
  def third(): js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]
}

object ArgCaptor9 {
  @scala.inline
  def apply[T0, T1, T2, T3, T4, T5, T6, T7, T8](
    beforeLast: js.Function0[js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]],
    byCallIndex: js.Function1[scala.Double, js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]],
    first: js.Function0[js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]],
    last: js.Function0[js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]],
    second: js.Function0[js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]],
    third: js.Function0[js.Tuple9[T0, T1, T2, T3, T4, T5, T6, T7, T8]]
  ): ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8] = {
    val __obj = js.Dynamic.literal(beforeLast = beforeLast, byCallIndex = byCallIndex, first = first, last = last, second = second, third = third)
  
    __obj.asInstanceOf[ArgCaptor9[T0, T1, T2, T3, T4, T5, T6, T7, T8]]
  }
}

