package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Meta[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, P, M]
  extends typesafeDashActionsLib.distCreateDashActionMod.PayloadMetaAction[T, P, M] {
  var meta: M
  var payload: P
  var `type`: T
}

object Anon_Meta {
  @scala.inline
  def apply[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, P, M](meta: M, payload: P, `type`: T): Anon_Meta[T, P, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], `type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Meta[T, P, M]]
  }
}

