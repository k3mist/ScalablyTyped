package typings
package typesafeDashActionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Payload[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, P]
  extends typesafeDashActionsLib.distCreateDashActionMod.PayloadMetaAction[T, P, js.Any] {
  var payload: P
  var `type`: T
}

object Anon_Payload {
  @scala.inline
  def apply[T /* <: typesafeDashActionsLib.distTypesMod.StringType */, P](payload: P, `type`: T): Anon_Payload[T, P] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], `type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Payload[T, P]]
  }
}

