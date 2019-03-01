package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the text frame for a shape object.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait TextFrameLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the auto sizing settings for the text frame. A text frame can be set to auto size the text to fit the text frame, or auto size the text frame to fit the text, or without auto sizing.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var autoSize: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the bottom margin, in points, of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var bottomMargin: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Specifies whether the TextFrame contains text.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var hasText: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the horizontal alignment of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var horizontalAlignment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the horizontal overflow type of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var horizontalOverflow: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the left margin, in points, of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var leftMargin: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the text orientation of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var orientation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the reading order of the text frame, RTL or LTR.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var readingOrder: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the right margin, in points, of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var rightMargin: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the text range in the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var textRange: js.UndefOr[TextRangeLoadOptions] = js.undefined
  /**
    *
    * Represents the top margin, in points, of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var topMargin: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the vertical alignment of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var verticalAlignment: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the vertical overflow type of the text frame.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var verticalOverflow: js.UndefOr[scala.Boolean] = js.undefined
}

object TextFrameLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    autoSize: js.UndefOr[scala.Boolean] = js.undefined,
    bottomMargin: js.UndefOr[scala.Boolean] = js.undefined,
    hasText: js.UndefOr[scala.Boolean] = js.undefined,
    horizontalAlignment: js.UndefOr[scala.Boolean] = js.undefined,
    horizontalOverflow: js.UndefOr[scala.Boolean] = js.undefined,
    leftMargin: js.UndefOr[scala.Boolean] = js.undefined,
    orientation: js.UndefOr[scala.Boolean] = js.undefined,
    readingOrder: js.UndefOr[scala.Boolean] = js.undefined,
    rightMargin: js.UndefOr[scala.Boolean] = js.undefined,
    textRange: TextRangeLoadOptions = null,
    topMargin: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlignment: js.UndefOr[scala.Boolean] = js.undefined,
    verticalOverflow: js.UndefOr[scala.Boolean] = js.undefined
  ): TextFrameLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize)
    if (!js.isUndefined(bottomMargin)) __obj.updateDynamic("bottomMargin")(bottomMargin)
    if (!js.isUndefined(hasText)) __obj.updateDynamic("hasText")(hasText)
    if (!js.isUndefined(horizontalAlignment)) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment)
    if (!js.isUndefined(horizontalOverflow)) __obj.updateDynamic("horizontalOverflow")(horizontalOverflow)
    if (!js.isUndefined(leftMargin)) __obj.updateDynamic("leftMargin")(leftMargin)
    if (!js.isUndefined(orientation)) __obj.updateDynamic("orientation")(orientation)
    if (!js.isUndefined(readingOrder)) __obj.updateDynamic("readingOrder")(readingOrder)
    if (!js.isUndefined(rightMargin)) __obj.updateDynamic("rightMargin")(rightMargin)
    if (textRange != null) __obj.updateDynamic("textRange")(textRange)
    if (!js.isUndefined(topMargin)) __obj.updateDynamic("topMargin")(topMargin)
    if (!js.isUndefined(verticalAlignment)) __obj.updateDynamic("verticalAlignment")(verticalAlignment)
    if (!js.isUndefined(verticalOverflow)) __obj.updateDynamic("verticalOverflow")(verticalOverflow)
    __obj.asInstanceOf[TextFrameLoadOptions]
  }
}

