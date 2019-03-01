package typings
package gapiDotClientDotVisionLib.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAnnotation extends js.Object {
  /** List of pages detected by OCR. */
  var pages: js.UndefOr[js.Array[Page]] = js.undefined
  /** UTF-8 text detected on the pages. */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object TextAnnotation {
  @scala.inline
  def apply(pages: js.Array[Page] = null, text: java.lang.String = null): TextAnnotation = {
    val __obj = js.Dynamic.literal()
    if (pages != null) __obj.updateDynamic("pages")(pages)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TextAnnotation]
  }
}

