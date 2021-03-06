package typings
package gapiDotClientDotResourceviewsLib.gapiNs.clientNs.resourceviewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  /**
    * [Output only] An optional identifier specified by the client when the mutation was initiated. Must be unique for all operation resources in the
    * project.
    */
  var clientOperationId: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The time that this operation was requested, in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The time that this operation was completed, in RFC3339 text format. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] If errors occurred during processing of this operation, this field will be populated. */
  var error: js.UndefOr[gapiDotClientDotResourceviewsLib.Anon_Errors] = js.undefined
  /** [Output only] If operation fails, the HTTP error message returned. */
  var httpErrorMessage: js.UndefOr[java.lang.String] = js.undefined
  /** [Output only] If operation fails, the HTTP error status code returned. */
  var httpErrorStatusCode: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] Unique identifier for the resource, generated by the server. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The time that this operation was requested, in RFC3339 text format. */
  var insertTime: js.UndefOr[java.lang.String] = js.undefined
  /** [Output only] Type of the resource. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Name of the resource. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Output only] Type of the operation. Operations include insert, update, and delete. */
  var operationType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * [Output only] An optional progress indicator that ranges from 0 to 100. There is no requirement that this be linear or support any granularity of
    * operations. This should not be used to guess at when the operation will be complete. This number should be monotonically increasing as the operation
    * progresses.
    */
  var progress: js.UndefOr[scala.Double] = js.undefined
  /** [Output Only] URL of the region where the operation resides. Only available when performing regional operations. */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Server-defined fully-qualified URL for this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] The time that this operation was started by the server, in RFC3339 text format. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Status of the operation. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] An optional textual description of the current status of the operation. */
  var statusMessage: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] Unique target ID which identifies a particular incarnation of the target. */
  var targetId: js.UndefOr[java.lang.String] = js.undefined
  /** [Output only] URL of the resource the operation is mutating. */
  var targetLink: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] User who requested the operation, for example: user@example.com. */
  var user: js.UndefOr[java.lang.String] = js.undefined
  /** [Output Only] If there are issues with this operation, a warning is returned. */
  var warnings: js.UndefOr[js.Array[gapiDotClientDotResourceviewsLib.Anon_CodeData]] = js.undefined
  /** [Output Only] URL of the zone where the operation resides. Only available when performing per-zone operations. */
  var zone: js.UndefOr[java.lang.String] = js.undefined
}

object Operation {
  @scala.inline
  def apply(
    clientOperationId: java.lang.String = null,
    creationTimestamp: java.lang.String = null,
    endTime: java.lang.String = null,
    error: gapiDotClientDotResourceviewsLib.Anon_Errors = null,
    httpErrorMessage: java.lang.String = null,
    httpErrorStatusCode: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    insertTime: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    operationType: java.lang.String = null,
    progress: scala.Int | scala.Double = null,
    region: java.lang.String = null,
    selfLink: java.lang.String = null,
    startTime: java.lang.String = null,
    status: java.lang.String = null,
    statusMessage: java.lang.String = null,
    targetId: java.lang.String = null,
    targetLink: java.lang.String = null,
    user: java.lang.String = null,
    warnings: js.Array[gapiDotClientDotResourceviewsLib.Anon_CodeData] = null,
    zone: java.lang.String = null
  ): Operation = {
    val __obj = js.Dynamic.literal()
    if (clientOperationId != null) __obj.updateDynamic("clientOperationId")(clientOperationId)
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (error != null) __obj.updateDynamic("error")(error)
    if (httpErrorMessage != null) __obj.updateDynamic("httpErrorMessage")(httpErrorMessage)
    if (httpErrorStatusCode != null) __obj.updateDynamic("httpErrorStatusCode")(httpErrorStatusCode.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (insertTime != null) __obj.updateDynamic("insertTime")(insertTime)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (operationType != null) __obj.updateDynamic("operationType")(operationType)
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (status != null) __obj.updateDynamic("status")(status)
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    if (targetId != null) __obj.updateDynamic("targetId")(targetId)
    if (targetLink != null) __obj.updateDynamic("targetLink")(targetLink)
    if (user != null) __obj.updateDynamic("user")(user)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[Operation]
  }
}

