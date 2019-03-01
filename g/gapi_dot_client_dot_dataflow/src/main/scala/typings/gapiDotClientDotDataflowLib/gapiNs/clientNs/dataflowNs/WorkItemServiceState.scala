package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemServiceState extends js.Object {
  /**
    * Other data returned by the service, specific to the particular
    * worker harness.
    */
  var harnessData: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /** Time at which the current lease will expire. */
  var leaseExpireTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The short ids that workers should use in subsequent metric updates.
    * Workers should strive to use short ids whenever possible, but it is ok
    * to request the short_id again if a worker lost track of it
    * (e.g. if the worker is recovering from a crash).
    * NOTE: it is possible that the response may have short ids for a subset
    * of the metrics.
    */
  var metricShortId: js.UndefOr[js.Array[MetricShortId]] = js.undefined
  /**
    * The index value to use for the next report sent by the worker.
    * Note: If the report call fails for whatever reason, the worker should
    * reuse this index for subsequent report attempts.
    */
  var nextReportIndex: js.UndefOr[java.lang.String] = js.undefined
  /** New recommended reporting interval. */
  var reportStatusInterval: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The progress point in the WorkItem where the Dataflow service
    * suggests that the worker truncate the task.
    */
  var splitRequest: js.UndefOr[ApproximateSplitRequest] = js.undefined
  /** DEPRECATED in favor of split_request. */
  var suggestedStopPoint: js.UndefOr[ApproximateProgress] = js.undefined
  /** Obsolete, always empty. */
  var suggestedStopPosition: js.UndefOr[Position] = js.undefined
}

object WorkItemServiceState {
  @scala.inline
  def apply(
    harnessData: stdLib.Record[java.lang.String, _] = null,
    leaseExpireTime: java.lang.String = null,
    metricShortId: js.Array[MetricShortId] = null,
    nextReportIndex: java.lang.String = null,
    reportStatusInterval: java.lang.String = null,
    splitRequest: ApproximateSplitRequest = null,
    suggestedStopPoint: ApproximateProgress = null,
    suggestedStopPosition: Position = null
  ): WorkItemServiceState = {
    val __obj = js.Dynamic.literal()
    if (harnessData != null) __obj.updateDynamic("harnessData")(harnessData)
    if (leaseExpireTime != null) __obj.updateDynamic("leaseExpireTime")(leaseExpireTime)
    if (metricShortId != null) __obj.updateDynamic("metricShortId")(metricShortId)
    if (nextReportIndex != null) __obj.updateDynamic("nextReportIndex")(nextReportIndex)
    if (reportStatusInterval != null) __obj.updateDynamic("reportStatusInterval")(reportStatusInterval)
    if (splitRequest != null) __obj.updateDynamic("splitRequest")(splitRequest)
    if (suggestedStopPoint != null) __obj.updateDynamic("suggestedStopPoint")(suggestedStopPoint)
    if (suggestedStopPosition != null) __obj.updateDynamic("suggestedStopPosition")(suggestedStopPosition)
    __obj.asInstanceOf[WorkItemServiceState]
  }
}

