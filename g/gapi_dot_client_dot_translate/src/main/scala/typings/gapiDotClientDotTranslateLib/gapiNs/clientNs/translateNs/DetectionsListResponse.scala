package typings
package gapiDotClientDotTranslateLib.gapiNs.clientNs.translateNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectionsListResponse extends js.Object {
  /** A detections contains detection results of several text */
  var detections: js.UndefOr[js.Array[_]] = js.undefined
}

object DetectionsListResponse {
  @scala.inline
  def apply(detections: js.Array[_] = null): DetectionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (detections != null) __obj.updateDynamic("detections")(detections)
    __obj.asInstanceOf[DetectionsListResponse]
  }
}

