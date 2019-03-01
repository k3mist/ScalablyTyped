package typings
package msgpack5Lib.msgpack5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsgPackOptions extends js.Object {
  var compatibilityMode: js.UndefOr[scala.Boolean] = js.undefined
  var forceFloat64: js.UndefOr[scala.Boolean] = js.undefined
}

object MsgPackOptions {
  @scala.inline
  def apply(
    compatibilityMode: js.UndefOr[scala.Boolean] = js.undefined,
    forceFloat64: js.UndefOr[scala.Boolean] = js.undefined
  ): MsgPackOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compatibilityMode)) __obj.updateDynamic("compatibilityMode")(compatibilityMode)
    if (!js.isUndefined(forceFloat64)) __obj.updateDynamic("forceFloat64")(forceFloat64)
    __obj.asInstanceOf[MsgPackOptions]
  }
}

