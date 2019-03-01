package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationMetadata extends js.Object {
  /**
    * This field is deprecated. Use `labels` instead. Optionally provided by the
    * caller when submitting the request that creates the operation.
    */
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which the job was submitted to the Genomics service. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /** The time at which the job stopped running. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional event messages that were generated during the job's execution.
    * This also contains any warnings that were generated during import
    * or export.
    */
  var events: js.UndefOr[js.Array[OperationEvent]] = js.undefined
  /**
    * Optionally provided by the caller when submitting the request that creates
    * the operation.
    */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The Google Cloud Project in which the job is scoped. */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The original request that started the operation. Note that this will be in
    * current version of the API. If the operation was started with v1beta2 API
    * and a GetOperation is performed on v1 API, a v1 request will be returned.
    */
  var request: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /** Runtime metadata on this Operation. */
  var runtimeMetadata: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  /** The time at which the job began to run. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
}

object OperationMetadata {
  @scala.inline
  def apply(
    clientId: java.lang.String = null,
    createTime: java.lang.String = null,
    endTime: java.lang.String = null,
    events: js.Array[OperationEvent] = null,
    labels: stdLib.Record[java.lang.String, java.lang.String] = null,
    projectId: java.lang.String = null,
    request: stdLib.Record[java.lang.String, _] = null,
    runtimeMetadata: stdLib.Record[java.lang.String, _] = null,
    startTime: java.lang.String = null
  ): OperationMetadata = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (events != null) __obj.updateDynamic("events")(events)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (request != null) __obj.updateDynamic("request")(request)
    if (runtimeMetadata != null) __obj.updateDynamic("runtimeMetadata")(runtimeMetadata)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[OperationMetadata]
  }
}

