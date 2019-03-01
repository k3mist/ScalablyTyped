package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterStatusResponse extends js.Object {
  /** Type of resource. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var result: js.UndefOr[RouterStatus] = js.undefined
}

object RouterStatusResponse {
  @scala.inline
  def apply(kind: java.lang.String = null, result: RouterStatus = null): RouterStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (result != null) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[RouterStatusResponse]
  }
}

