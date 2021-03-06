package typings
package fpDashTsLib.libFilterableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterableWithIndex3C[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I, U, L]
  extends fpDashTsLib.libFilterableMod.Filterable3C[F, U, L]
     with fpDashTsLib.libFunctorWithIndexMod.FunctorWithIndex3C[F, I, U, L] {
  /* InferMemberOverrides */
  override val URI: F
  /* InferMemberOverrides */
  override val _L: L
  /* InferMemberOverrides */
  override val _U: U
  def filterMapWithIndex[A, B](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): fpDashTsLib.libHKTMod.Type3[F, U, L, B]
  def filterWithIndex[A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libHKTMod.Type3[F, U, L, A]
  def partitionMapWithIndex[RL, RR, A](
    fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A],
    f: js.Function2[/* i */ I, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, RL], fpDashTsLib.libHKTMod.Type3[F, U, L, RR]]
  def partitionWithIndex[A](fa: fpDashTsLib.libHKTMod.Type3[F, U, L, A], p: js.Function2[/* i */ I, /* a */ A, scala.Boolean]): fpDashTsLib.libCompactableMod.Separated[fpDashTsLib.libHKTMod.Type3[F, U, L, A], fpDashTsLib.libHKTMod.Type3[F, U, L, A]]
}

object FilterableWithIndex3C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS3 */, I, U, L](
    URI: F,
    _L: L,
    _U: U,
    compact: fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libOptionMod.Option[js.Any]] => fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any],
    filter: (fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], fpDashTsLib.libFunctionMod.Predicate[js.Any]) => fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any],
    filterMap: (fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], js.Function1[js.Any, fpDashTsLib.libOptionMod.Option[js.Any]]) => fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any],
    filterMapWithIndex: (fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], js.Function2[/* i */ I, js.Any, fpDashTsLib.libOptionMod.Option[js.Any]]) => fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any],
    filterWithIndex: (fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], js.Function2[/* i */ I, js.Any, scala.Boolean]) => fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any],
    map: (fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], js.Function1[js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any],
    mapWithIndex: (fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], js.Function2[I, js.Any, js.Any]) => fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any],
    partition: (fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], fpDashTsLib.libFunctionMod.Predicate[js.Any]) => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    partitionMap: (fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], js.Function1[js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]) => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    partitionMapWithIndex: (fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], js.Function2[/* i */ I, js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]]) => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    partitionWithIndex: (fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], js.Function2[/* i */ I, js.Any, scala.Boolean]) => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ],
    separate: fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]] => fpDashTsLib.libCompactableMod.Separated[
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any], 
      fpDashTsLib.libHKTMod.Type3[F, U, L, js.Any]
    ]
  ): FilterableWithIndex3C[F, I, U, L] = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], _L = _L.asInstanceOf[js.Any], _U = _U.asInstanceOf[js.Any], compact = js.Any.fromFunction1(compact), filter = js.Any.fromFunction2(filter), filterMap = js.Any.fromFunction2(filterMap), filterMapWithIndex = js.Any.fromFunction2(filterMapWithIndex), filterWithIndex = js.Any.fromFunction2(filterWithIndex), map = js.Any.fromFunction2(map), mapWithIndex = js.Any.fromFunction2(mapWithIndex), partition = js.Any.fromFunction2(partition), partitionMap = js.Any.fromFunction2(partitionMap), partitionMapWithIndex = js.Any.fromFunction2(partitionMapWithIndex), partitionWithIndex = js.Any.fromFunction2(partitionWithIndex), separate = js.Any.fromFunction1(separate))
  
    __obj.asInstanceOf[FilterableWithIndex3C[F, I, U, L]]
  }
}

