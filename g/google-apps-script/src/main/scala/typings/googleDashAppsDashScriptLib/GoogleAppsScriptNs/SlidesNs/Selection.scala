package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selection extends js.Object {
  def getCurrentPage(): Page
  def getPageElementRange(): PageElementRange
  def getPageRange(): PageRange
  def getSelectionType(): SelectionType
  def getTableCellRange(): TableCellRange
  def getTextRange(): TextRange
}

object Selection {
  @scala.inline
  def apply(
    getCurrentPage: js.Function0[Page],
    getPageElementRange: js.Function0[PageElementRange],
    getPageRange: js.Function0[PageRange],
    getSelectionType: js.Function0[SelectionType],
    getTableCellRange: js.Function0[TableCellRange],
    getTextRange: js.Function0[TextRange]
  ): Selection = {
    val __obj = js.Dynamic.literal(getCurrentPage = getCurrentPage, getPageElementRange = getPageElementRange, getPageRange = getPageRange, getSelectionType = getSelectionType, getTableCellRange = getTableCellRange, getTextRange = getTextRange)
  
    __obj.asInstanceOf[Selection]
  }
}

