package typings
package antdLib.libPopconfirmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopconfirmState extends js.Object {
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object PopconfirmState {
  @scala.inline
  def apply(visible: js.UndefOr[scala.Boolean] = js.undefined): PopconfirmState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[PopconfirmState]
  }
}

