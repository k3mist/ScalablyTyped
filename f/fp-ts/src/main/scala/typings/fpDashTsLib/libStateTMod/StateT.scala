package typings
package fpDashTsLib.libStateTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateT[M] extends js.Object {
  def ap[S, A, B](
    fab: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[js.Function1[/* a */ A, B], S]]],
    fa: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[A, S]]]
  ): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[B, S]]]
  def chain[S, A, B](
    f: js.Function1[/* a */ A, js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[B, S]]]],
    fa: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[A, S]]]
  ): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[B, S]]]
  def map[S, A, B](
    f: js.Function1[/* a */ A, B],
    fa: js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[A, S]]]
  ): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[B, S]]]
  def of[S, A](a: A): js.Function1[/* s */ S, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[A, S]]]
}

object StateT {
  @scala.inline
  def apply[M](
    ap: js.Function2[
      js.Function1[
        js.Any, 
        fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[js.Function1[js.Any, js.Any], js.Any]]
      ], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[js.Any, js.Any]]], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[js.Any, js.Any]]]
    ],
    chain: js.Function2[
      js.Function1[
        js.Any, 
        js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[js.Any, js.Any]]]
      ], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[js.Any, js.Any]]], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[js.Any, js.Any]]]
    ],
    map: js.Function2[
      js.Function1[js.Any, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[js.Any, js.Any]]], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[js.Any, js.Any]]]
    ],
    of: js.Function1[
      js.Any, 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Tuple2[js.Any, js.Any]]]
    ]
  ): StateT[M] = {
    val __obj = js.Dynamic.literal(ap = ap, chain = chain, map = map, of = of)
  
    __obj.asInstanceOf[StateT[M]]
  }
}

