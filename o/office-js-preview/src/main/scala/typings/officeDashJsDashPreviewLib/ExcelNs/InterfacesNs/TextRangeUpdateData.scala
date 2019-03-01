package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the TextRange object, for use in "textRange.set({ ... })". */
trait TextRangeUpdateData extends js.Object {
  /**
    *
    * Returns a ShapeFont object that represents the font attributes for the text range.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var font: js.UndefOr[ShapeFontUpdateData] = js.undefined
  /**
    *
    * Represents the plain text content of the text range.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object TextRangeUpdateData {
  @scala.inline
  def apply(font: ShapeFontUpdateData = null, text: java.lang.String = null): TextRangeUpdateData = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TextRangeUpdateData]
  }
}

