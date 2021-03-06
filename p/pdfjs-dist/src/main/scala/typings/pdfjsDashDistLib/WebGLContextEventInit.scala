package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLContextEventInit extends EventInit {
  var statusMessage: js.UndefOr[java.lang.String] = js.undefined
}

object WebGLContextEventInit {
  @scala.inline
  def apply(
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined,
    statusMessage: java.lang.String = null
  ): WebGLContextEventInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    __obj.asInstanceOf[WebGLContextEventInit]
  }
}

