package typings
package connectDashTimeoutLib.connectDashTimeoutMod.eNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Interface for timeout options.
  * @interface
  */
trait TimeoutOptions extends js.Object {
  /**
    * @summary Controls if this module will "respond" in the form of forwarding an error.
    * @type {boolean}
    */
  var respond: js.UndefOr[scala.Boolean] = js.undefined
}

object TimeoutOptions {
  @scala.inline
  def apply(respond: js.UndefOr[scala.Boolean] = js.undefined): TimeoutOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(respond)) __obj.updateDynamic("respond")(respond)
    __obj.asInstanceOf[TimeoutOptions]
  }
}

