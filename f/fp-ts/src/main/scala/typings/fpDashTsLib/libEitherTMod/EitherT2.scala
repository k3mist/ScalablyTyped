package typings
package fpDashTsLib.libEitherTMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EitherT2[F /* <: fpDashTsLib.libHKTMod.URIS2 */]
  extends fpDashTsLib.libApplicativeMod.ApplicativeComposition22[F, fpDashTsLib.libEitherMod.URI] {
  def chain[L, M, A, B](
    f: js.Function1[
      /* a */ A, 
      fpDashTsLib.libHKTMod.Type2[F, M, fpDashTsLib.libEitherMod.Either[L, B]]
    ],
    fa: fpDashTsLib.libHKTMod.Type2[F, M, fpDashTsLib.libEitherMod.Either[L, A]]
  ): fpDashTsLib.libHKTMod.Type2[F, M, fpDashTsLib.libEitherMod.Either[L, B]]
}

object EitherT2 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */](
    ap: (fpDashTsLib.libHKTMod.Type2[
      F, 
      js.Any, 
      fpDashTsLib.libHKTMod.Type2[fpDashTsLib.libEitherMod.URI, js.Any, js.Function1[js.Any, js.Any]]
    ], fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.libEitherMod.URI, js.Any, js.Any]]) => fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.libEitherMod.URI, js.Any, js.Any]],
    chain: (js.Function1[
      js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]
    ], fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]) => fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]],
    map: (fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.libEitherMod.URI, js.Any, js.Any]], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.libEitherMod.URI, js.Any, js.Any]],
    of: js.Any => fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[fpDashTsLib.libEitherMod.URI, js.Any, js.Any]]
  ): EitherT2[F] = {
    val __obj = js.Dynamic.literal(ap = js.Any.fromFunction2(ap), chain = js.Any.fromFunction2(chain), map = js.Any.fromFunction2(map), of = js.Any.fromFunction1(of))
  
    __obj.asInstanceOf[EitherT2[F]]
  }
}

