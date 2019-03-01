package typings
package fpDashTsLib.libFunctorWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctorWithIndex3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I, U, L]
  extends fpDashTsLib.libFunctorMod.Functor3C[F, U, L] {
  def mapWithIndex[A, B](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], f: js.Function2[/* i */ I, /* a */ A, B]): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
}

object FunctorWithIndex3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I, U, L](
    URI: F,
    _L: L,
    _U: U,
    map: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function1[js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    mapWithIndex: js.Function2[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      js.Function2[/* i */ I, js.Any, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ]
  ): FunctorWithIndex3C[F, I, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], map = map, mapWithIndex = mapWithIndex)
  
    __obj.asInstanceOf[FunctorWithIndex3C[F, I, U, L]]
  }
}

