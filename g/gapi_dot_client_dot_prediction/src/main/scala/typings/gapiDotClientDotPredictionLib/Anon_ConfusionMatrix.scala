package typings
package gapiDotClientDotPredictionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfusionMatrix extends js.Object {
  /**
    * An output confusion matrix. This shows an estimate for how this model will do in predictions. This is first indexed by the true class label. For each
    * true class label, this provides a pair {predicted_label, count}, where count is the estimated number of times the model will predict the predicted
    * label given the true label. Will not output if more then 100 classes (Categorical models only).
    */
  var confusionMatrix: js.UndefOr[
    stdLib.Record[java.lang.String, stdLib.Record[java.lang.String, java.lang.String]]
  ] = js.undefined
  /** A list of the confusion matrix row totals. */
  var confusionMatrixRowTotals: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** Basic information about the model. */
  var modelinfo: js.UndefOr[gapiDotClientDotPredictionLib.gapiNs.clientNs.predictionNs.Insert2] = js.undefined
}

object Anon_ConfusionMatrix {
  @scala.inline
  def apply(
    confusionMatrix: stdLib.Record[java.lang.String, stdLib.Record[java.lang.String, java.lang.String]] = null,
    confusionMatrixRowTotals: stdLib.Record[java.lang.String, java.lang.String] = null,
    modelinfo: gapiDotClientDotPredictionLib.gapiNs.clientNs.predictionNs.Insert2 = null
  ): Anon_ConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    if (confusionMatrix != null) __obj.updateDynamic("confusionMatrix")(confusionMatrix)
    if (confusionMatrixRowTotals != null) __obj.updateDynamic("confusionMatrixRowTotals")(confusionMatrixRowTotals)
    if (modelinfo != null) __obj.updateDynamic("modelinfo")(modelinfo)
    __obj.asInstanceOf[Anon_ConfusionMatrix]
  }
}

