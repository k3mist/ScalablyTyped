package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessDetail extends js.Object {
  /** If a native process other than the app crashed. */
  var otherNativeCrash: js.UndefOr[scala.Boolean] = js.undefined
}

object SuccessDetail {
  @scala.inline
  def apply(otherNativeCrash: js.UndefOr[scala.Boolean] = js.undefined): SuccessDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(otherNativeCrash)) __obj.updateDynamic("otherNativeCrash")(otherNativeCrash)
    __obj.asInstanceOf[SuccessDetail]
  }
}

