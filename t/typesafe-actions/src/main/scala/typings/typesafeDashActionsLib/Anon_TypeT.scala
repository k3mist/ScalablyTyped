package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeT[T /* <: typesafeDashActionsLib.distTypesMod.StringType */]
  extends typesafeDashActionsLib.distCreateDashActionMod.PayloadMetaAction[T, js.Any, js.Any] {
  var `type`: T
}

object Anon_TypeT {
  @scala.inline
  def apply[T /* <: typesafeDashActionsLib.distTypesMod.StringType */](`type`: T): Anon_TypeT[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TypeT[T]]
  }
}

