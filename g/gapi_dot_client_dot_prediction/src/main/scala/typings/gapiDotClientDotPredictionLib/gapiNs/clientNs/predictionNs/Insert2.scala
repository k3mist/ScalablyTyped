package typings
package gapiDotClientDotPredictionLib.gapiNs.clientNs.predictionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Insert2 extends js.Object {
  /** Insert time of the model (as a RFC 3339 timestamp). */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** The unique name for the predictive model. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** What kind of resource this is. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Model metadata. */
  var modelInfo: js.UndefOr[gapiDotClientDotPredictionLib.Anon_ClassWeightedAccuracy] = js.undefined
  /** Type of predictive model (CLASSIFICATION or REGRESSION). */
  var modelType: js.UndefOr[java.lang.String] = js.undefined
  /** A URL to re-request this resource. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Google storage location of the training data file. */
  var storageDataLocation: js.UndefOr[java.lang.String] = js.undefined
  /** Google storage location of the preprocessing pmml file. */
  var storagePMMLLocation: js.UndefOr[java.lang.String] = js.undefined
  /** Google storage location of the pmml model file. */
  var storagePMMLModelLocation: js.UndefOr[java.lang.String] = js.undefined
  /** Training completion time (as a RFC 3339 timestamp). */
  var trainingComplete: js.UndefOr[java.lang.String] = js.undefined
  /** The current status of the training job. This can be one of following: RUNNING; DONE; ERROR; ERROR: TRAINING JOB NOT FOUND */
  var trainingStatus: js.UndefOr[java.lang.String] = js.undefined
}

object Insert2 {
  @scala.inline
  def apply(
    created: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    modelInfo: gapiDotClientDotPredictionLib.Anon_ClassWeightedAccuracy = null,
    modelType: java.lang.String = null,
    selfLink: java.lang.String = null,
    storageDataLocation: java.lang.String = null,
    storagePMMLLocation: java.lang.String = null,
    storagePMMLModelLocation: java.lang.String = null,
    trainingComplete: java.lang.String = null,
    trainingStatus: java.lang.String = null
  ): Insert2 = {
    val __obj = js.Dynamic.literal()
    if (created != null) __obj.updateDynamic("created")(created)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (modelInfo != null) __obj.updateDynamic("modelInfo")(modelInfo)
    if (modelType != null) __obj.updateDynamic("modelType")(modelType)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (storageDataLocation != null) __obj.updateDynamic("storageDataLocation")(storageDataLocation)
    if (storagePMMLLocation != null) __obj.updateDynamic("storagePMMLLocation")(storagePMMLLocation)
    if (storagePMMLModelLocation != null) __obj.updateDynamic("storagePMMLModelLocation")(storagePMMLModelLocation)
    if (trainingComplete != null) __obj.updateDynamic("trainingComplete")(trainingComplete)
    if (trainingStatus != null) __obj.updateDynamic("trainingStatus")(trainingStatus)
    __obj.asInstanceOf[Insert2]
  }
}

