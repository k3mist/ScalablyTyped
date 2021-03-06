package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Record", JSImport.Namespace)
@js.native
object libRecordMod extends js.Object {
  val empty: stdLib.Record[java.lang.String, scala.Nothing] = js.native
  def collect[A, B](d: stdLib.Record[java.lang.String, A], f: js.Function2[/* k */ java.lang.String, /* a */ A, B]): fpDashTsLib.libArrayMod.Global.Array[B] = js.native
  @JSName("collect")
  def collect_KStringAB[K /* <: java.lang.String */, A, B](d: stdLib.Record[K, A], f: js.Function2[/* k */ K, /* a */ A, B]): fpDashTsLib.libArrayMod.Global.Array[B] = js.native
  def compact[A](fa: stdLib.Record[java.lang.String, fpDashTsLib.libOptionMod.Option[A]]): stdLib.Record[java.lang.String, A] = js.native
  def elem[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[/* a */ A, /* fa */ org.scalablytyped.runtime.StringDictionary[A], scala.Boolean] = js.native
  def every[A](
    fa: org.scalablytyped.runtime.StringDictionary[A],
    predicate: js.Function1[/* a */ A, scala.Boolean]
  ): scala.Boolean = js.native
  def filter[A](fa: stdLib.Record[java.lang.String, A], p: fpDashTsLib.libFunctionMod.Predicate[A]): stdLib.Record[java.lang.String, A] = js.native
  def filterMap[A, B](
    fa: stdLib.Record[java.lang.String, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): stdLib.Record[java.lang.String, B] = js.native
  def filterMapWithIndex[A, B](
    fa: stdLib.Record[java.lang.String, A],
    f: js.Function2[/* key */ java.lang.String, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): stdLib.Record[java.lang.String, B] = js.native
  @JSName("filterMapWithIndex")
  def filterMapWithIndex_KStringAB[K /* <: java.lang.String */, A, B](
    fa: stdLib.Record[K, A],
    f: js.Function2[/* key */ K, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): stdLib.Record[java.lang.String, B] = js.native
  def filterMapWithKey[A, B](
    fa: stdLib.Record[java.lang.String, A],
    f: js.Function2[/* key */ java.lang.String, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): stdLib.Record[java.lang.String, B] = js.native
  @JSName("filterMapWithKey")
  def filterMapWithKey_KStringAB[K /* <: java.lang.String */, A, B](
    fa: stdLib.Record[K, A],
    f: js.Function2[/* key */ K, /* a */ A, fpDashTsLib.libOptionMod.Option[B]]
  ): stdLib.Record[java.lang.String, B] = js.native
  def filterWithIndex[A](
    fa: stdLib.Record[java.lang.String, A],
    p: js.Function2[/* key */ java.lang.String, /* a */ A, scala.Boolean]
  ): stdLib.Record[java.lang.String, A] = js.native
  @JSName("filterWithIndex")
  def filterWithIndex_KStringA[K /* <: java.lang.String */, A](fa: stdLib.Record[K, A], p: js.Function2[/* key */ K, /* a */ A, scala.Boolean]): stdLib.Record[java.lang.String, A] = js.native
  def filterWithKey[A](
    fa: stdLib.Record[java.lang.String, A],
    p: js.Function2[/* key */ java.lang.String, /* a */ A, scala.Boolean]
  ): stdLib.Record[java.lang.String, A] = js.native
  @JSName("filterWithKey")
  def filterWithKey_KStringA[K /* <: java.lang.String */, A](fa: stdLib.Record[K, A], p: js.Function2[/* key */ K, /* a */ A, scala.Boolean]): stdLib.Record[java.lang.String, A] = js.native
  @JSName("filter")
  def filter_ABA[A, B /* <: A */](fa: stdLib.Record[java.lang.String, A], p: fpDashTsLib.libFunctionMod.Refinement[A, B]): stdLib.Record[java.lang.String, B] = js.native
  def foldMap[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, M], 
    M
  ] = js.native
  def foldMapWithKey[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, M], 
    M
  ] = js.native
  def foldr[A, B](fa: stdLib.Record[java.lang.String, A], b: B, f: js.Function2[/* a */ A, /* b */ B, B]): B = js.native
  def foldrWithKey[A, B](
    fa: stdLib.Record[java.lang.String, A],
    b: B,
    f: js.Function3[/* k */ java.lang.String, /* a */ A, /* b */ B, B]
  ): B = js.native
  @JSName("foldrWithKey")
  def foldrWithKey_KStringAB[K /* <: java.lang.String */, A, B](fa: stdLib.Record[K, A], b: B, f: js.Function3[/* k */ K, /* a */ A, /* b */ B, B]): B = js.native
  def fromFoldable[F](F: fpDashTsLib.libFoldableMod.Foldable[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  def fromFoldable[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libFoldableMod.Foldable1[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type[F, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  def fromFoldable[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libFoldableMod.Foldable2[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type2[F, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  def fromFoldable[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libFoldableMod.Foldable3[F]): js.Function2[
    /* ta */ fpDashTsLib.libHKTMod.Type3[F, _, _, js.Tuple2[java.lang.String, _]], 
    /* f */ js.Function2[/* existing */ js.Any, /* a */ js.Any, _], 
    stdLib.Record[java.lang.String, _]
  ] = js.native
  def getMonoid[A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libMonoidMod.Monoid[stdLib.Record[java.lang.String, A]] = js.native
  @JSName("getMonoid")
  def getMonoid_KStringA[K /* <: java.lang.String */, A](S: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libMonoidMod.Monoid[stdLib.Record[K, A]] = js.native
  def getSetoid[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[stdLib.Record[java.lang.String, A]] = js.native
  @JSName("getSetoid")
  def getSetoid_KStringA[K /* <: java.lang.String */, A](S: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[stdLib.Record[K, A]] = js.native
  def insert[A](k: java.lang.String, a: A, d: stdLib.Record[java.lang.String, A]): stdLib.Record[java.lang.String, A] = js.native
  def insert[KS /* <: java.lang.String */, K /* <: java.lang.String */, A](k: K, a: A, d: stdLib.Record[KS, A]): stdLib.Record[KS | K, A] = js.native
  def isEmpty[A](d: stdLib.Record[java.lang.String, A]): scala.Boolean = js.native
  def isSubdictionary[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* d1 */ stdLib.Record[java.lang.String, A], 
    /* d2 */ stdLib.Record[java.lang.String, A], 
    scala.Boolean
  ] = js.native
  def isSubrecord[A](S: fpDashTsLib.libSetoidMod.Setoid[A]): js.Function2[
    /* d1 */ stdLib.Record[java.lang.String, A], 
    /* d2 */ stdLib.Record[java.lang.String, A], 
    scala.Boolean
  ] = js.native
  def lookup[A](key: java.lang.String, fa: stdLib.Record[java.lang.String, A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def map[A, B](fa: stdLib.Record[java.lang.String, A], f: js.Function1[/* a */ A, B]): stdLib.Record[java.lang.String, B] = js.native
  def mapWithKey[A, B](fa: stdLib.Record[java.lang.String, A], f: js.Function2[/* k */ java.lang.String, /* a */ A, B]): stdLib.Record[java.lang.String, B] = js.native
  @JSName("mapWithKey")
  def mapWithKey_KStringAB[K /* <: java.lang.String */, A, B](fa: stdLib.Record[K, A], f: js.Function2[/* k */ K, /* a */ A, B]): stdLib.Record[K, B] = js.native
  @JSName("map")
  def map_KStringAB[K /* <: java.lang.String */, A, B](fa: stdLib.Record[K, A], f: js.Function1[/* a */ A, B]): stdLib.Record[K, B] = js.native
  def partition[A](fa: stdLib.Record[java.lang.String, A], p: fpDashTsLib.libFunctionMod.Predicate[A]): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String, A]] = js.native
  def partitionMap[RL, RR, A](
    fa: stdLib.Record[java.lang.String, A],
    f: js.Function1[/* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, RL], stdLib.Record[java.lang.String, RR]] = js.native
  def partitionMapWithIndex[RL, RR, A](
    fa: stdLib.Record[java.lang.String, A],
    f: js.Function2[/* key */ java.lang.String, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, RL], stdLib.Record[java.lang.String, RR]] = js.native
  @JSName("partitionMapWithIndex")
  def partitionMapWithIndex_KStringRLRRA[K /* <: java.lang.String */, RL, RR, A](
    fa: stdLib.Record[K, A],
    f: js.Function2[/* key */ K, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, RL], stdLib.Record[java.lang.String, RR]] = js.native
  def partitionMapWithKey[RL, RR, A](
    fa: stdLib.Record[java.lang.String, A],
    f: js.Function2[/* key */ java.lang.String, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, RL], stdLib.Record[java.lang.String, RR]] = js.native
  @JSName("partitionMapWithKey")
  def partitionMapWithKey_KStringRLRRA[K /* <: java.lang.String */, RL, RR, A](
    fa: stdLib.Record[K, A],
    f: js.Function2[/* key */ K, /* a */ A, fpDashTsLib.libEitherMod.Either[RL, RR]]
  ): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, RL], stdLib.Record[java.lang.String, RR]] = js.native
  def partitionWithIndex[A](
    fa: stdLib.Record[java.lang.String, A],
    p: js.Function2[/* key */ java.lang.String, /* a */ A, scala.Boolean]
  ): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String, A]] = js.native
  @JSName("partitionWithIndex")
  def partitionWithIndex_KStringA[K /* <: java.lang.String */, A](fa: stdLib.Record[K, A], p: js.Function2[/* key */ K, /* a */ A, scala.Boolean]): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String, A]] = js.native
  def partitionWithKey[A](
    fa: stdLib.Record[java.lang.String, A],
    p: js.Function2[/* key */ java.lang.String, /* a */ A, scala.Boolean]
  ): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String, A]] = js.native
  @JSName("partitionWithKey")
  def partitionWithKey_KStringA[K /* <: java.lang.String */, A](fa: stdLib.Record[K, A], p: js.Function2[/* key */ K, /* a */ A, scala.Boolean]): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, A], stdLib.Record[java.lang.String, A]] = js.native
  def pop[A](k: java.lang.String, d: stdLib.Record[java.lang.String, A]): fpDashTsLib.libOptionMod.Option[js.Tuple2[A, stdLib.Record[java.lang.String, A]]] = js.native
  def reduce[A, B](fa: stdLib.Record[java.lang.String, A], b: B, f: js.Function2[/* b */ B, /* a */ A, B]): B = js.native
  def reduceWithKey[A, B](
    fa: stdLib.Record[java.lang.String, A],
    b: B,
    f: js.Function3[/* k */ java.lang.String, /* b */ B, /* a */ A, B]
  ): B = js.native
  @JSName("reduceWithKey")
  def reduceWithKey_KStringAB[K /* <: java.lang.String */, A, B](fa: stdLib.Record[K, A], b: B, f: js.Function3[/* k */ K, /* b */ B, /* a */ A, B]): B = js.native
  def remove[A](k: java.lang.String, d: stdLib.Record[java.lang.String, A]): stdLib.Record[java.lang.String, A] = js.native
  def remove[KS /* <: java.lang.String */, K /* <: java.lang.String */, A](k: K, d: stdLib.Record[KS, A]): stdLib.Record[(stdLib.Exclude[KS, K]) | java.lang.String, A] = js.native
  def separate[RL, RR](fa: stdLib.Record[java.lang.String, fpDashTsLib.libEitherMod.Either[RL, RR]]): fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, RL], stdLib.Record[java.lang.String, RR]] = js.native
  def sequence[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function1[
    /* ta */ stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function1[
    /* ta */ stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.Type[F, _]], 
    fpDashTsLib.libHKTMod.Type[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function1[
    /* ta */ stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function1[
    /* ta */ stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L]): js.Function1[
    /* ta */ stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.Type2[F, L, _]], 
    fpDashTsLib.libHKTMod.Type2[F, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def sequence[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L]): js.Function1[
    /* ta */ stdLib.Record[java.lang.String, fpDashTsLib.libHKTMod.Type3[F, U, L, _]], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def singleton[K /* <: java.lang.String */, A](k: K, a: A): stdLib.Record[K, A] = js.native
  def size[A](d: stdLib.Record[java.lang.String, A]): scala.Double = js.native
  def some[A](
    fa: org.scalablytyped.runtime.StringDictionary[A],
    predicate: js.Function1[/* a */ A, scala.Boolean]
  ): scala.Boolean = js.native
  def toArray[A](d: stdLib.Record[java.lang.String, A]): fpDashTsLib.libArrayMod.Global.Array[js.Tuple2[java.lang.String, A]] = js.native
  @JSName("toArray")
  def toArray_KStringA[K /* <: java.lang.String */, A](d: stdLib.Record[K, A]): fpDashTsLib.libArrayMod.Global.Array[js.Tuple2[K, A]] = js.native
  def toUnfoldable[F](unfoldable: fpDashTsLib.libUnfoldableMod.Unfoldable[F]): js.Function1[
    /* d */ stdLib.Record[java.lang.String, _], 
    fpDashTsLib.libHKTMod.HKT[F, js.Tuple2[java.lang.String, _]]
  ] = js.native
  def toUnfoldable[F /* <: fpDashTsLib.libHKTMod.URIS */](unfoldable: fpDashTsLib.libUnfoldableMod.Unfoldable1[F]): js.Function1[
    /* d */ stdLib.Record[java.lang.String, _], 
    fpDashTsLib.libHKTMod.Type[F, js.Tuple2[java.lang.String, _]]
  ] = js.native
  def traverse[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, _]], 
    fpDashTsLib.libHKTMod.Type[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, L, _]], 
    fpDashTsLib.libHKTMod.Type2[F, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverse[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, U, L, _]], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverseWithKey[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, _]], 
    fpDashTsLib.libHKTMod.HKT[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverseWithKey[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, _]], 
    fpDashTsLib.libHKTMod.Type[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverseWithKey[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.Type2[F, _, _]], 
    fpDashTsLib.libHKTMod.Type2[F, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def traverseWithKey[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* ta */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function2[/* k */ java.lang.String, /* a */ js.Any, fpDashTsLib.libHKTMod.Type3[F, _, _, _]], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def wilt[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.HKT[
      F, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  def wilt[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type[
      F, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  def wilt[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      F, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  def wilt[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      F, 
      _, 
      _, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  def wilt[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type2[
      F, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  def wilt[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libEitherMod.Either[_, _]]
    ], 
    fpDashTsLib.libHKTMod.Type3[
      F, 
      U, 
      L, 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Record[java.lang.String, _], stdLib.Record[java.lang.String, _]]
    ]
  ] = js.native
  def wither[F](F: fpDashTsLib.libApplicativeMod.Applicative[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.HKT[F, fpDashTsLib.libOptionMod.Option[_]]], 
    fpDashTsLib.libHKTMod.HKT[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def wither[F /* <: fpDashTsLib.libHKTMod.URIS */](F: fpDashTsLib.libApplicativeMod.Applicative1[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libHKTMod.Type[F, fpDashTsLib.libOptionMod.Option[_]]], 
    fpDashTsLib.libHKTMod.Type[F, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def wither[F /* <: fpDashTsLib.libHKTMod.URIS2 */](F: fpDashTsLib.libApplicativeMod.Applicative2[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[F, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def wither[F /* <: fpDashTsLib.libHKTMod.URIS3 */](F: fpDashTsLib.libApplicativeMod.Applicative3[F]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, _, _, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type3[F, _, _, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def wither[F /* <: fpDashTsLib.libHKTMod.URIS2 */, L](F: fpDashTsLib.libApplicativeMod.Applicative2C[F, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type2[F, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type2[F, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
  def wither[F /* <: fpDashTsLib.libHKTMod.URIS3 */, U, L](F: fpDashTsLib.libApplicativeMod.Applicative3C[F, U, L]): js.Function2[
    /* wa */ stdLib.Record[java.lang.String, _], 
    /* f */ js.Function1[
      /* a */ js.Any, 
      fpDashTsLib.libHKTMod.Type3[F, U, L, fpDashTsLib.libOptionMod.Option[_]]
    ], 
    fpDashTsLib.libHKTMod.Type3[F, U, L, stdLib.Record[java.lang.String, _]]
  ] = js.native
}

