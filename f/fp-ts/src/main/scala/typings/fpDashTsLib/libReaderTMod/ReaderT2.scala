package typings
package fpDashTsLib.libReaderTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderT2[M /* <: fpDashTsLib.libHKTMod.URIS2 */] extends js.Object {
  def ap[L, E, A, B](
    fab: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type2[M, L, js.Function1[/* a */ A, B]]],
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type2[M, L, A]]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type2[M, L, B]]
  def chain[L, E, A, B](
    f: js.Function1[/* a */ A, js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type2[M, L, B]]],
    fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type2[M, L, A]]
  ): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type2[M, L, B]]
  def map[L, E, A, B](f: js.Function1[/* a */ A, B], fa: js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type2[M, L, A]]): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type2[M, L, B]]
  def of[L, E, A](a: A): js.Function1[/* e */ E, fpDashTsLib.libHKTMod.Type2[M, L, A]]
}

object ReaderT2 {
  @scala.inline
  def apply[M /* <: fpDashTsLib.libHKTMod.URIS2 */](
    ap: js.Function2[
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Function1[js.Any, js.Any]]], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]]
    ],
    chain: js.Function2[
      js.Function1[js.Any, js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]]], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]]
    ],
    map: js.Function2[
      js.Function1[js.Any, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]]
    ],
    of: js.Function1[js.Any, js.Function1[js.Any, fpDashTsLib.libHKTMod.Type2[M, js.Any, js.Any]]]
  ): ReaderT2[M] = {
    val __obj = js.Dynamic.literal(ap = ap, chain = chain, map = map, of = of)
  
    __obj.asInstanceOf[ReaderT2[M]]
  }
}

