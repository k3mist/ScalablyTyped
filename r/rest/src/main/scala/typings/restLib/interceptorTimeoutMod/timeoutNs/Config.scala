package typings
package restLib.interceptorTimeoutMod.timeoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var transient: js.UndefOr[scala.Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(timeout: scala.Int | scala.Double = null, transient: js.UndefOr[scala.Boolean] = js.undefined): Config = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(transient)) __obj.updateDynamic("transient")(transient)
    __obj.asInstanceOf[Config]
  }
}

