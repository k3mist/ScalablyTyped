package typings
package fpDashTsLib.fpDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts", "these")
@js.native
object theseNs extends js.Object {
  @js.native
  class Both[L, A] protected ()
    extends fpDashTsLib.libTheseMod.Both[L, A] {
    def this(l: L, a: A) = this()
  }
  
  @js.native
  class That[L, A] protected ()
    extends fpDashTsLib.libTheseMod.That[L, A] {
    def this(value: A) = this()
  }
  
  @js.native
  class This[L, A] protected ()
    extends fpDashTsLib.libTheseMod.This[L, A] {
    def this(value: L) = this()
  }
  
  val URI: /* These */ java.lang.String = js.native
  val these: fpDashTsLib.libFunctorMod.Functor2[fpDashTsLib.libTheseMod.URI] with fpDashTsLib.libBifunctorMod.Bifunctor2[fpDashTsLib.libTheseMod.URI] with fpDashTsLib.libFoldable2vMod.Foldable2v2[fpDashTsLib.libTheseMod.URI] with fpDashTsLib.libTraversable2vMod.Traversable2v2[fpDashTsLib.libTheseMod.URI] = js.native
  def both[L, A](l: L, a: A): fpDashTsLib.libTheseMod.These[L, A] = js.native
  def fromEither[L, A](fa: fpDashTsLib.libEitherMod.Either[L, A]): fpDashTsLib.libTheseMod.These[L, A] = js.native
  def fromOptions[L, A](fl: fpDashTsLib.libOptionMod.Option[L], fa: fpDashTsLib.libOptionMod.Option[A]): fpDashTsLib.libOptionMod.Option[fpDashTsLib.libTheseMod.These[L, A]] = js.native
  def fromThese[L, A](defaultThis: L, defaultThat: A): js.Function1[/* fa */ fpDashTsLib.libTheseMod.These[L, A], js.Tuple2[L, A]] = js.native
  def getMonad[L](S: fpDashTsLib.libSemigroupMod.Semigroup[L]): fpDashTsLib.libMonadMod.Monad2C[fpDashTsLib.fpDashTsLibStrings.These, L] = js.native
  def getSemigroup[L, A](SL: fpDashTsLib.libSemigroupMod.Semigroup[L], SA: fpDashTsLib.libSemigroupMod.Semigroup[A]): fpDashTsLib.libSemigroupMod.Semigroup[fpDashTsLib.libTheseMod.These[L, A]] = js.native
  def getSetoid[L, A](SL: fpDashTsLib.libSetoidMod.Setoid[L], SA: fpDashTsLib.libSetoidMod.Setoid[A]): fpDashTsLib.libSetoidMod.Setoid[fpDashTsLib.libTheseMod.These[L, A]] = js.native
  def isBoth[L, A](fa: fpDashTsLib.libTheseMod.These[L, A]): /* is fp-ts.fp-ts/lib/These.Both<L, A> */ scala.Boolean = js.native
  def isThat[L, A](fa: fpDashTsLib.libTheseMod.These[L, A]): /* is fp-ts.fp-ts/lib/These.That<L, A> */ scala.Boolean = js.native
  def isThis[L, A](fa: fpDashTsLib.libTheseMod.These[L, A]): /* is fp-ts.fp-ts/lib/These.This<L, A> */ scala.Boolean = js.native
  def that[L, A](a: A): fpDashTsLib.libTheseMod.These[L, A] = js.native
  def thatOrBoth[L, A](defaultThat: A, ml: fpDashTsLib.libOptionMod.Option[L]): fpDashTsLib.libTheseMod.These[L, A] = js.native
  def theseLeft[L, A](fa: fpDashTsLib.libTheseMod.These[L, A]): fpDashTsLib.libOptionMod.Option[L] = js.native
  def theseRight[L, A](fa: fpDashTsLib.libTheseMod.These[L, A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def theseThat[L, A](fa: fpDashTsLib.libTheseMod.These[L, A]): fpDashTsLib.libOptionMod.Option[A] = js.native
  def theseThis[L, A](fa: fpDashTsLib.libTheseMod.These[L, A]): fpDashTsLib.libOptionMod.Option[L] = js.native
  def thisOrBoth[L, A](defaultThis: L, ma: fpDashTsLib.libOptionMod.Option[A]): fpDashTsLib.libTheseMod.These[L, A] = js.native
  def this_[L, A](l: L): fpDashTsLib.libTheseMod.These[L, A] = js.native
}

