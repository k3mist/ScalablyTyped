package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationError extends js.Object {
  /** Identifies the specific error that occurred. */
  var code: js.UndefOr[java.lang.String] = js.undefined
  /** This is always sql#operationError. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Additional information about the error encountered. */
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object OperationError {
  @scala.inline
  def apply(code: java.lang.String = null, kind: java.lang.String = null, message: java.lang.String = null): OperationError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[OperationError]
  }
}

