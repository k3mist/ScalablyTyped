package typings
package gapiDotClientDotClouduseraccountsLib.gapiNs.clientNs.clouduseraccountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogConfig extends js.Object {
  /** Counter options. */
  var counter: js.UndefOr[LogConfigCounterOptions] = js.undefined
}

object LogConfig {
  @scala.inline
  def apply(counter: LogConfigCounterOptions = null): LogConfig = {
    val __obj = js.Dynamic.literal()
    if (counter != null) __obj.updateDynamic("counter")(counter)
    __obj.asInstanceOf[LogConfig]
  }
}

