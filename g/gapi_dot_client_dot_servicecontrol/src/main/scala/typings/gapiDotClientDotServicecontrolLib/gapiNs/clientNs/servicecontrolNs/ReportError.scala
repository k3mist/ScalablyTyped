package typings
package gapiDotClientDotServicecontrolLib.gapiNs.clientNs.servicecontrolNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportError extends js.Object {
  /** The Operation.operation_id value from the request. */
  var operationId: js.UndefOr[java.lang.String] = js.undefined
  /** Details of the error when processing the Operation. */
  var status: js.UndefOr[Status] = js.undefined
}

object ReportError {
  @scala.inline
  def apply(operationId: java.lang.String = null, status: Status = null): ReportError = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ReportError]
  }
}

