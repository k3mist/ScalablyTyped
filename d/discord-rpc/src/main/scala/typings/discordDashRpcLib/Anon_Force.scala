package typings
package discordDashRpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Force extends js.Object {
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Force {
  @scala.inline
  def apply(force: js.UndefOr[scala.Boolean] = js.undefined, timeout: scala.Int | scala.Double = null): Anon_Force = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Force]
  }
}

