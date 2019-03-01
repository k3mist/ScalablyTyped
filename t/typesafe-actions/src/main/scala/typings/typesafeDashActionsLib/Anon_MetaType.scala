package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MetaType[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, M]
  extends typesafeDashActionsLib.distCreateDashActionMod.PayloadMetaAction[T, js.Any, M] {
  var meta: M
  var `type`: T
}

object Anon_MetaType {
  @scala.inline
  def apply[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, M](meta: M, `type`: T): Anon_MetaType[T, M] = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], `type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_MetaType[T, M]]
  }
}

