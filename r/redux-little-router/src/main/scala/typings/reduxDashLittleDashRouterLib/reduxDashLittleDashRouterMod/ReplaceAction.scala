package typings
package reduxDashLittleDashRouterLib.reduxDashLittleDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAction extends RouterActions {
  var payload: Location
  var `type`: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_REPLACE
}

object ReplaceAction {
  @scala.inline
  def apply(
    payload: Location,
    `type`: reduxDashLittleDashRouterLib.reduxDashLittleDashRouterLibStrings.ROUTER_REPLACE
  ): ReplaceAction = {
    val __obj = js.Dynamic.literal(payload = payload, `type` = `type`)
  
    __obj.asInstanceOf[ReplaceAction]
  }
}

