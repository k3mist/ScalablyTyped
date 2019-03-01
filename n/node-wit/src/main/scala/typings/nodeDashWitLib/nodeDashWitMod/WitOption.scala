package typings
package nodeDashWitLib.nodeDashWitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WitOption extends js.Object {
  var accessToken: java.lang.String
  var actions: js.UndefOr[js.Any] = js.undefined
  var logger: js.UndefOr[nodeDashWitLib.nodeDashWitMod.logNs.Logger] = js.undefined
}

object WitOption {
  @scala.inline
  def apply(
    accessToken: java.lang.String,
    actions: js.Any = null,
    logger: nodeDashWitLib.nodeDashWitMod.logNs.Logger = null
  ): WitOption = {
    val __obj = js.Dynamic.literal(accessToken = accessToken)
    if (actions != null) __obj.updateDynamic("actions")(actions)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    __obj.asInstanceOf[WitOption]
  }
}

