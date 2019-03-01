package typings
package gapiDotClientDotStoragetransferLib.gapiNs.clientNs.storagetransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferOperation extends js.Object {
  /** Information about the progress of the transfer operation. */
  var counters: js.UndefOr[TransferCounters] = js.undefined
  /** End time of this transfer execution. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Summarizes errors encountered with sample error log entries. */
  var errorBreakdowns: js.UndefOr[js.Array[ErrorSummary]] = js.undefined
  /** A globally unique ID assigned by the system. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ID of the Google Cloud Platform Console project that owns the operation.
    * Required.
    */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /** Start time of this transfer execution. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** Status of the transfer operation. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the transfer job that triggers this transfer operation. */
  var transferJobName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Transfer specification.
    * Required.
    */
  var transferSpec: js.UndefOr[TransferSpec] = js.undefined
}

object TransferOperation {
  @scala.inline
  def apply(
    counters: TransferCounters = null,
    endTime: java.lang.String = null,
    errorBreakdowns: js.Array[ErrorSummary] = null,
    name: java.lang.String = null,
    projectId: java.lang.String = null,
    startTime: java.lang.String = null,
    status: java.lang.String = null,
    transferJobName: java.lang.String = null,
    transferSpec: TransferSpec = null
  ): TransferOperation = {
    val __obj = js.Dynamic.literal()
    if (counters != null) __obj.updateDynamic("counters")(counters)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (errorBreakdowns != null) __obj.updateDynamic("errorBreakdowns")(errorBreakdowns)
    if (name != null) __obj.updateDynamic("name")(name)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (status != null) __obj.updateDynamic("status")(status)
    if (transferJobName != null) __obj.updateDynamic("transferJobName")(transferJobName)
    if (transferSpec != null) __obj.updateDynamic("transferSpec")(transferSpec)
    __obj.asInstanceOf[TransferOperation]
  }
}

