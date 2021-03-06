package typings
package fpDashTsLib.libChoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choice2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libProfunctorMod.Profunctor2[F] {
  def left[A, B, C](pab: fpDashTsLib.libHKTMod.Type2[F, A, B]): fpDashTsLib.libHKTMod.Type2[F, fpDashTsLib.libEitherMod.Either[A, C], fpDashTsLib.libEitherMod.Either[B, C]]
  def right[A, B, C](pbc: fpDashTsLib.libHKTMod.Type2[F, B, C]): fpDashTsLib.libHKTMod.Type2[F, fpDashTsLib.libEitherMod.Either[A, B], fpDashTsLib.libEitherMod.Either[A, C]]
}

object Choice2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    URI: F,
    left: fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any] => fpDashTsLib.libHKTMod.Type2[
      F, 
      fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
      fpDashTsLib.libEitherMod.Either[js.Any, js.Any]
    ],
    map: (fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any],
    promap: (fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any], js.Function1[js.Any, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any],
    right: fpDashTsLib.libHKTMod.Type2[F, js.Any, js.Any] => fpDashTsLib.libHKTMod.Type2[
      F, 
      fpDashTsLib.libEitherMod.Either[js.Any, js.Any], 
      fpDashTsLib.libEitherMod.Either[js.Any, js.Any]
    ]
  ): Choice2[F] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], left = js.Any.fromFunction1(left), map = js.Any.fromFunction2(map), promap = js.Any.fromFunction3(promap), right = js.Any.fromFunction1(right))
  
    __obj.asInstanceOf[Choice2[F]]
  }
}

