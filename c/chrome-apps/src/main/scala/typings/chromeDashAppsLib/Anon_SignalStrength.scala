package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SignalStrength extends js.Object {
  var SignalStrength: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
}

object Anon_SignalStrength {
  @scala.inline
  def apply(SignalStrength: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined): Anon_SignalStrength = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(SignalStrength)) __obj.updateDynamic("SignalStrength")(SignalStrength)
    __obj.asInstanceOf[Anon_SignalStrength]
  }
}

