package typings
package gapiDotClientDotVideointelligenceLib.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1beta1_VideoAnnotationResults extends js.Object {
  /**
    * If set, indicates an error. Note that for a single `AnnotateVideoRequest`
    * some videos may succeed and some may fail.
    */
  var error: js.UndefOr[GoogleRpc_Status] = js.undefined
  /**
    * Video file location in
    * [Google Cloud Storage](https://cloud.google.com/storage/).
    */
  var inputUri: js.UndefOr[java.lang.String] = js.undefined
  /** Label annotations. There is exactly one element for each unique label. */
  var labelAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1_LabelAnnotation]] = js.undefined
  /** Safe search annotations. */
  var safeSearchAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1_SafeSearchAnnotation]] = js.undefined
  /** Shot annotations. Each shot is represented as a video segment. */
  var shotAnnotations: js.UndefOr[js.Array[GoogleCloudVideointelligenceV1beta1_VideoSegment]] = js.undefined
}

object GoogleCloudVideointelligenceV1beta1_VideoAnnotationResults {
  @scala.inline
  def apply(
    error: GoogleRpc_Status = null,
    inputUri: java.lang.String = null,
    labelAnnotations: js.Array[GoogleCloudVideointelligenceV1beta1_LabelAnnotation] = null,
    safeSearchAnnotations: js.Array[GoogleCloudVideointelligenceV1beta1_SafeSearchAnnotation] = null,
    shotAnnotations: js.Array[GoogleCloudVideointelligenceV1beta1_VideoSegment] = null
  ): GoogleCloudVideointelligenceV1beta1_VideoAnnotationResults = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (inputUri != null) __obj.updateDynamic("inputUri")(inputUri)
    if (labelAnnotations != null) __obj.updateDynamic("labelAnnotations")(labelAnnotations)
    if (safeSearchAnnotations != null) __obj.updateDynamic("safeSearchAnnotations")(safeSearchAnnotations)
    if (shotAnnotations != null) __obj.updateDynamic("shotAnnotations")(shotAnnotations)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1beta1_VideoAnnotationResults]
  }
}

