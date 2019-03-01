package typings
package fpDashTsLib.libFoldable2vMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Foldable2vComposition2C1[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */, LF]
  extends fpDashTsLib.libFoldableMod.FoldableComposition2C1[F, G, LF] {
  def foldMap[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, _]], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ]
  def foldr[A, B](
    fa: fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, A]],
    b: B,
    f: js.Function2[/* a */ A, /* b */ B, B]
  ): B
}

object Foldable2vComposition2C1 {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, G /* <: fpDashTsLib.libHKTMod.URIS */, LF](
    foldMap: js.Function1[
      fpDashTsLib.libMonoidMod.Monoid[js.Any], 
      js.Function2[
        /* fa */ fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, _]], 
        /* f */ js.Function1[/* a */ js.Any, js.Any], 
        js.Any
      ]
    ],
    foldr: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ],
    reduce: js.Function3[
      fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type[G, js.Any]], 
      js.Any, 
      js.Function2[js.Any, js.Any, js.Any], 
      js.Any
    ]
  ): Foldable2vComposition2C1[F, G, LF] = {
    val __obj = js.Dynamic.literal(foldMap = foldMap, foldr = foldr, reduce = reduce)
  
    __obj.asInstanceOf[Foldable2vComposition2C1[F, G, LF]]
  }
}

