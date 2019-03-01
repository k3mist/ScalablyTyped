package typings
package consulLib.consulMod.ConsulNs.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOptions
  extends consulLib.consulMod.ConsulNs.CommonOptions {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ListOptions {
  @scala.inline
  def apply(
    consistent: js.UndefOr[scala.Boolean] = js.undefined,
    ctx: nodeLib.NodeJSNs.EventEmitter = null,
    dc: java.lang.String = null,
    name: java.lang.String = null,
    stale: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    token: java.lang.String = null,
    wait: java.lang.String = null,
    wan: js.UndefOr[scala.Boolean] = js.undefined
  ): ListOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(consistent)) __obj.updateDynamic("consistent")(consistent)
    if (ctx != null) __obj.updateDynamic("ctx")(ctx)
    if (dc != null) __obj.updateDynamic("dc")(dc)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token)
    if (wait != null) __obj.updateDynamic("wait")(wait)
    if (!js.isUndefined(wan)) __obj.updateDynamic("wan")(wan)
    __obj.asInstanceOf[ListOptions]
  }
}

