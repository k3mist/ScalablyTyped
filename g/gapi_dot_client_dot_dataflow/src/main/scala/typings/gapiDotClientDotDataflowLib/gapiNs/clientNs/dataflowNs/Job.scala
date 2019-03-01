package typings
package gapiDotClientDotDataflowLib.gapiNs.clientNs.dataflowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job extends js.Object {
  /**
    * The client's unique identifier of the job, re-used across retried attempts.
    * If this field is set, the service will ensure its uniqueness.
    * The request to create a job will fail if the service has knowledge of a
    * previously submitted job with the same client's ID and job name.
    * The caller may use this field to ensure idempotence of job
    * creation across retried attempts to create a job.
    * By default, the field is empty and, in that case, the service ignores it.
    */
  var clientRequestId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The timestamp when the job was initially created. Immutable and set by the
    * Cloud Dataflow service.
    */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The current state of the job.
    *
    * Jobs are created in the `JOB_STATE_STOPPED` state unless otherwise
    * specified.
    *
    * A job in the `JOB_STATE_RUNNING` state may asynchronously enter a
    * terminal state. After a job has reached a terminal state, no
    * further state updates may be made.
    *
    * This field may be mutated by the Cloud Dataflow service;
    * callers cannot mutate it.
    */
  var currentState: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp associated with the current state. */
  var currentStateTime: js.UndefOr[java.lang.String] = js.undefined
  /** The environment for the job. */
  var environment: js.UndefOr[Environment] = js.undefined
  /** Deprecated. */
  var executionInfo: js.UndefOr[JobExecutionInfo] = js.undefined
  /**
    * The unique ID of this job.
    *
    * This field is set by the Cloud Dataflow service when the Job is
    * created, and is immutable for the life of the job.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * User-defined labels for this job.
    *
    * The labels map can contain no more than 64 entries.  Entries of the labels
    * map are UTF8 strings that comply with the following restrictions:
    *
    * &#42; Keys must conform to regexp:  \p{Ll}\p{Lo}{0,62}
    * &#42; Values must conform to regexp:  [\p{Ll}\p{Lo}\p{N}_-]{0,63}
    * &#42; Both keys and values are additionally constrained to be <= 128 bytes in
    * size.
    */
  var labels: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The location that contains this job. */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The user-specified Cloud Dataflow job name.
    *
    * Only one Job with a given name may exist in a project at any
    * given time. If a caller attempts to create a Job with the same
    * name as an already-existing Job, the attempt returns the
    * existing Job.
    *
    * The name must match the regular expression
    * `[a-z]([-a-z0-9]{0,38}[a-z0-9])?`
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Preliminary field: The format of this data may change at any time.
    * A description of the user pipeline and stages through which it is executed.
    * Created by Cloud Dataflow service.  Only retrieved with
    * JOB_VIEW_DESCRIPTION or JOB_VIEW_ALL.
    */
  var pipelineDescription: js.UndefOr[PipelineDescription] = js.undefined
  /** The ID of the Cloud Platform project that the job belongs to. */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If this job is an update of an existing job, this field is the job ID
    * of the job it replaced.
    *
    * When sending a `CreateJobRequest`, you can update a job by specifying it
    * here. The job named here is stopped, and its intermediate state is
    * transferred to this job.
    */
  var replaceJobId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If another job is an update of this job (and thus, this job is in
    * `JOB_STATE_UPDATED`), this field contains the ID of that job.
    */
  var replacedByJobId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The job's requested state.
    *
    * `UpdateJob` may be used to switch between the `JOB_STATE_STOPPED` and
    * `JOB_STATE_RUNNING` states, by setting requested_state.  `UpdateJob` may
    * also be used to directly set a job's requested state to
    * `JOB_STATE_CANCELLED` or `JOB_STATE_DONE`, irrevocably terminating the
    * job if it has not already reached a terminal state.
    */
  var requestedState: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This field may be mutated by the Cloud Dataflow service;
    * callers cannot mutate it.
    */
  var stageStates: js.UndefOr[js.Array[ExecutionStageState]] = js.undefined
  /** The top-level steps that constitute the entire job. */
  var steps: js.UndefOr[js.Array[Step]] = js.undefined
  /**
    * A set of files the system should be aware of that are used
    * for temporary storage. These temporary files will be
    * removed on job completion.
    * No duplicates are allowed.
    * No file patterns are supported.
    *
    * The supported files are:
    *
    * Google Cloud Storage:
    *
    * storage.googleapis.com/{bucket}/{object}
    * bucket.storage.googleapis.com/{object}
    */
  var tempFiles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The map of transform name prefixes of the job to be replaced to the
    * corresponding name prefixes of the new job.
    */
  var transformNameMapping: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** The type of Cloud Dataflow job. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Job {
  @scala.inline
  def apply(
    clientRequestId: java.lang.String = null,
    createTime: java.lang.String = null,
    currentState: java.lang.String = null,
    currentStateTime: java.lang.String = null,
    environment: Environment = null,
    executionInfo: JobExecutionInfo = null,
    id: java.lang.String = null,
    labels: stdLib.Record[java.lang.String, java.lang.String] = null,
    location: java.lang.String = null,
    name: java.lang.String = null,
    pipelineDescription: PipelineDescription = null,
    projectId: java.lang.String = null,
    replaceJobId: java.lang.String = null,
    replacedByJobId: java.lang.String = null,
    requestedState: java.lang.String = null,
    stageStates: js.Array[ExecutionStageState] = null,
    steps: js.Array[Step] = null,
    tempFiles: js.Array[java.lang.String] = null,
    transformNameMapping: stdLib.Record[java.lang.String, java.lang.String] = null,
    `type`: java.lang.String = null
  ): Job = {
    val __obj = js.Dynamic.literal()
    if (clientRequestId != null) __obj.updateDynamic("clientRequestId")(clientRequestId)
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (currentState != null) __obj.updateDynamic("currentState")(currentState)
    if (currentStateTime != null) __obj.updateDynamic("currentStateTime")(currentStateTime)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (executionInfo != null) __obj.updateDynamic("executionInfo")(executionInfo)
    if (id != null) __obj.updateDynamic("id")(id)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pipelineDescription != null) __obj.updateDynamic("pipelineDescription")(pipelineDescription)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (replaceJobId != null) __obj.updateDynamic("replaceJobId")(replaceJobId)
    if (replacedByJobId != null) __obj.updateDynamic("replacedByJobId")(replacedByJobId)
    if (requestedState != null) __obj.updateDynamic("requestedState")(requestedState)
    if (stageStates != null) __obj.updateDynamic("stageStates")(stageStates)
    if (steps != null) __obj.updateDynamic("steps")(steps)
    if (tempFiles != null) __obj.updateDynamic("tempFiles")(tempFiles)
    if (transformNameMapping != null) __obj.updateDynamic("transformNameMapping")(transformNameMapping)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Job]
  }
}

