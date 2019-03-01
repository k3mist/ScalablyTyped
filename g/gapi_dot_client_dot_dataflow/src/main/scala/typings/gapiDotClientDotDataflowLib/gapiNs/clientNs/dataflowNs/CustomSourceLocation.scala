package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomSourceLocation extends js.Object {
  /** Whether this source is stateful. */
  var stateful: js.UndefOr[scala.Boolean] = js.undefined
}

object CustomSourceLocation {
  @scala.inline
  def apply(stateful: js.UndefOr[scala.Boolean] = js.undefined): CustomSourceLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stateful)) __obj.updateDynamic("stateful")(stateful)
    __obj.asInstanceOf[CustomSourceLocation]
  }
}

