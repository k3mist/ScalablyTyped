package typings
package fpDashTsLib.libWitherableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Witherable3C[T /* <: fpDashTsLib.libHKTMod.URIS3 */, TU, TL]
  extends fpDashTsLib.libTraversableMod.Traversable3C[T, TU, TL]
     with fpDashTsLib.libFilterableMod.Filterable3C[T, TU, TL] {
  /* InferMemberOverrides */
  override val URI: T = js.native
  /* InferMemberOverrides */
  override val _L: TL = js.native
  /* InferMemberOverrides */
  override val _U: TU = js.native
  @JSName("wilt")
  var wilt_Original: Wilt3C[T, TU, TL] = js.native
  @JSName("wither")
  var wither_Original: Wither3C[T, TU, TL] = js.native
  def wilt[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.HKT[
      F, 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
        fpDashTsLib.libHKTMod.Type3[T, TU, TL, _]
      ]
    ]
  ] = js.native
  def wilt[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type[
      F, 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
        fpDashTsLib.libHKTMod.Type3[T, TU, TL, _]
      ]
    ]
  ] = js.native
  def wilt[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      F, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
        fpDashTsLib.libHKTMod.Type3[T, TU, TL, _]
      ]
    ]
  ] = js.native
  def wilt[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      F, 
      _, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
        fpDashTsLib.libHKTMod.Type3[T, TU, TL, _]
      ]
    ]
  ] = js.native
  def wilt[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      F, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
        fpDashTsLib.libHKTMod.Type3[T, TU, TL, _]
      ]
    ]
  ] = js.native
  def wilt[F /* <: fpDashTsLib.libHKTMod.URIS3 */, FU, FL](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, FU, FL]): js.Function2[
    /* wa */ fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, FU, FL, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      F, 
      FU, 
      FL, 
      fpDashTsLib.libCompactableMod.Separated[
        fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
        fpDashTsLib.libHKTMod.Type3[T, TU, TL, _]
      ]
    ]
  ] = js.native
  def wither[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]]], 
    fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libHKTMod.Type3[T, TU, TL, _]]
  ] = js.native
  def wither[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libOptionMod.Option[_]]], 
    fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libHKTMod.Type3[T, TU, TL, _]]
  ] = js.native
  def wither[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type3[T, TU, TL, _]]
  ] = js.native
  def wither[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libHKTMod.Type3[T, TU, TL, _]]
  ] = js.native
  def wither[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FL](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[F, FL, fpDashTsLib.libHKTMod.Type3[T, TU, TL, _]]
  ] = js.native
  def wither[F /* <: fpDashTsLib.libHKTMod.URIS3 */, FU, FL](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, FU, FL]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type3[T, TU, TL, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, FU, FL, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type3[F, FU, FL, fpDashTsLib.libHKTMod.Type3[T, TU, TL, _]]
  ] = js.native
}

