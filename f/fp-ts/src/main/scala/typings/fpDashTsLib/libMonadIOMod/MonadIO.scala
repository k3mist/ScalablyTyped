package typings
package fpDashTsLib.libMonadIOMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonadIO[M]
  extends fpDashTsLib.libMonadMod.Monad[M] {
  def fromIO[A](fa: fpDashTsLib.libIOMod.IO[A]): fpDashTsLib.libHKTMod.HKT[M, A]
}

object MonadIO {
  @scala.inline
  def apply[M](
    URI: M,
    ap: js.Function2[
      fpDashTsLib.libHKTMod.HKT[M, js.Function1[js.Any, js.Any]], 
      fpDashTsLib.libHKTMod.HKT[M, js.Any], 
      fpDashTsLib.libHKTMod.HKT[M, js.Any]
    ],
    chain: js.Function2[
      fpDashTsLib.libHKTMod.HKT[M, js.Any], 
      js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Any]], 
      fpDashTsLib.libHKTMod.HKT[M, js.Any]
    ],
    fromIO: js.Function1[fpDashTsLib.libIOMod.IO[js.Any], fpDashTsLib.libHKTMod.HKT[M, js.Any]],
    map: js.Function2[
      fpDashTsLib.libHKTMod.HKT[M, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.HKT[M, js.Any]
    ],
    of: js.Function1[js.Any, fpDashTsLib.libHKTMod.HKT[M, js.Any]]
  ): MonadIO[M] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], ap = ap, chain = chain, fromIO = fromIO, map = map, of = of)
  
    __obj.asInstanceOf[MonadIO[M]]
  }
}

