package typings
package immutabilityDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Apply[T]
  extends immutabilityDashHelperLib.immutabilityDashHelperMod._Spec[T, js.Any] {
  @JSName("$apply")
  def $apply(v: T): T
}

object Anon_Apply {
  @scala.inline
  def apply[T]($apply: js.Function1[T, T]): Anon_Apply[T] = {
    val __obj = js.Dynamic.literal($apply = $apply)
  
    __obj.asInstanceOf[Anon_Apply[T]]
  }
}

