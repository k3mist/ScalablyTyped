package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSelectionContextMenu extends js.Object {
  /** Enables/disables the copy menu in the text selection context menu.
    */
  var isCopyEnable: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/ disables the text selection context menu.
    */
  var isEnable: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables the highlight annotation menu in the text selection context menu.
    */
  var isHighlightEnable: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables the search menu in the text selection context menu.
    */
  var isSearchEnable: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables the strikeout annotation menu in the text selection context menu.
    */
  var isStrikeoutEnable: js.UndefOr[scala.Boolean] = js.undefined
}

object TextSelectionContextMenu {
  @scala.inline
  def apply(
    isCopyEnable: js.UndefOr[scala.Boolean] = js.undefined,
    isEnable: js.UndefOr[scala.Boolean] = js.undefined,
    isHighlightEnable: js.UndefOr[scala.Boolean] = js.undefined,
    isSearchEnable: js.UndefOr[scala.Boolean] = js.undefined,
    isStrikeoutEnable: js.UndefOr[scala.Boolean] = js.undefined
  ): TextSelectionContextMenu = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isCopyEnable)) __obj.updateDynamic("isCopyEnable")(isCopyEnable)
    if (!js.isUndefined(isEnable)) __obj.updateDynamic("isEnable")(isEnable)
    if (!js.isUndefined(isHighlightEnable)) __obj.updateDynamic("isHighlightEnable")(isHighlightEnable)
    if (!js.isUndefined(isSearchEnable)) __obj.updateDynamic("isSearchEnable")(isSearchEnable)
    if (!js.isUndefined(isStrikeoutEnable)) __obj.updateDynamic("isStrikeoutEnable")(isStrikeoutEnable)
    __obj.asInstanceOf[TextSelectionContextMenu]
  }
}

