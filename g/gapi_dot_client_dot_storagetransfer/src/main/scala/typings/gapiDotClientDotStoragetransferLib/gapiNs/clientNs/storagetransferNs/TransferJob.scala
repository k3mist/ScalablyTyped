package typings
package gapiDotClientDotStoragetransferLib.gapiNs.clientNs.storagetransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferJob extends js.Object {
  /** This field cannot be changed by user requests. */
  var creationTime: js.UndefOr[java.lang.String] = js.undefined
  /** This field cannot be changed by user requests. */
  var deletionTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A description provided by the user for the job. Its max length is 1024
    * bytes when Unicode-encoded.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** This field cannot be changed by user requests. */
  var lastModificationTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A globally unique name assigned by Storage Transfer Service when the
    * job is created. This field should be left empty in requests to create a new
    * transfer job; otherwise, the requests result in an `INVALID_ARGUMENT`
    * error.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the Google Cloud Platform Console project that owns the job. */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /** Schedule specification. */
  var schedule: js.UndefOr[Schedule] = js.undefined
  /**
    * Status of the job. This value MUST be specified for
    * `CreateTransferJobRequests`.
    *
    * NOTE: The effect of the new job status takes place during a subsequent job
    * run. For example, if you change the job status from `ENABLED` to
    * `DISABLED`, and an operation spawned by the transfer is running, the status
    * change would not affect the current operation.
    */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** Transfer specification. */
  var transferSpec: js.UndefOr[TransferSpec] = js.undefined
}

object TransferJob {
  @scala.inline
  def apply(
    creationTime: java.lang.String = null,
    deletionTime: java.lang.String = null,
    description: java.lang.String = null,
    lastModificationTime: java.lang.String = null,
    name: java.lang.String = null,
    projectId: java.lang.String = null,
    schedule: Schedule = null,
    status: java.lang.String = null,
    transferSpec: TransferSpec = null
  ): TransferJob = {
    val __obj = js.Dynamic.literal()
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (deletionTime != null) __obj.updateDynamic("deletionTime")(deletionTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (lastModificationTime != null) __obj.updateDynamic("lastModificationTime")(lastModificationTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (schedule != null) __obj.updateDynamic("schedule")(schedule)
    if (status != null) __obj.updateDynamic("status")(status)
    if (transferSpec != null) __obj.updateDynamic("transferSpec")(transferSpec)
    __obj.asInstanceOf[TransferJob]
  }
}

