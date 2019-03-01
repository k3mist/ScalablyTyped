package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudMlV1__Job extends js.Object {
  /** Output only. When the job was created. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. When the job processing was completed. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The details of a failure or a cancellation. */
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The user-specified id of the job. */
  var jobId: js.UndefOr[java.lang.String] = js.undefined
  /** Input parameters to create a prediction job. */
  var predictionInput: js.UndefOr[GoogleCloudMlV1__PredictionInput] = js.undefined
  /** The current prediction job result. */
  var predictionOutput: js.UndefOr[GoogleCloudMlV1__PredictionOutput] = js.undefined
  /** Output only. When the job processing was started. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** Output only. The detailed state of a job. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Input parameters to create a training job. */
  var trainingInput: js.UndefOr[GoogleCloudMlV1__TrainingInput] = js.undefined
  /** The current training job result. */
  var trainingOutput: js.UndefOr[GoogleCloudMlV1__TrainingOutput] = js.undefined
}

object GoogleCloudMlV1__Job {
  @scala.inline
  def apply(
    createTime: java.lang.String = null,
    endTime: java.lang.String = null,
    errorMessage: java.lang.String = null,
    jobId: java.lang.String = null,
    predictionInput: GoogleCloudMlV1__PredictionInput = null,
    predictionOutput: GoogleCloudMlV1__PredictionOutput = null,
    startTime: java.lang.String = null,
    state: java.lang.String = null,
    trainingInput: GoogleCloudMlV1__TrainingInput = null,
    trainingOutput: GoogleCloudMlV1__TrainingOutput = null
  ): GoogleCloudMlV1__Job = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (predictionInput != null) __obj.updateDynamic("predictionInput")(predictionInput)
    if (predictionOutput != null) __obj.updateDynamic("predictionOutput")(predictionOutput)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (state != null) __obj.updateDynamic("state")(state)
    if (trainingInput != null) __obj.updateDynamic("trainingInput")(trainingInput)
    if (trainingOutput != null) __obj.updateDynamic("trainingOutput")(trainingOutput)
    __obj.asInstanceOf[GoogleCloudMlV1__Job]
  }
}

