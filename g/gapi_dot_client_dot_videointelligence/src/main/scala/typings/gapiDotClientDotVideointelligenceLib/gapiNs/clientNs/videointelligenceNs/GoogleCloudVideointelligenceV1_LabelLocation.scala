package typings
package gapiDotClientDotVideointelligenceLib.gapiNs.clientNs.videointelligenceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudVideointelligenceV1_LabelLocation extends js.Object {
  /** Confidence that the label is accurate. Range: [0, 1]. */
  var confidence: js.UndefOr[scala.Double] = js.undefined
  /** Label level. */
  var level: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Video segment. Unset for video-level labels.
    * Set to a frame timestamp for frame-level labels.
    * Otherwise, corresponds to one of `AnnotateSpec.segments`
    * (if specified) or to shot boundaries (if requested).
    */
  var segment: js.UndefOr[GoogleCloudVideointelligenceV1_VideoSegment] = js.undefined
}

object GoogleCloudVideointelligenceV1_LabelLocation {
  @scala.inline
  def apply(
    confidence: scala.Int | scala.Double = null,
    level: java.lang.String = null,
    segment: GoogleCloudVideointelligenceV1_VideoSegment = null
  ): GoogleCloudVideointelligenceV1_LabelLocation = {
    val __obj = js.Dynamic.literal()
    if (confidence != null) __obj.updateDynamic("confidence")(confidence.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level)
    if (segment != null) __obj.updateDynamic("segment")(segment)
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1_LabelLocation]
  }
}

