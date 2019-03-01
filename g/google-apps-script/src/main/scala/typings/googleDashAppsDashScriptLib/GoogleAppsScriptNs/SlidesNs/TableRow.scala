package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRow extends js.Object {
  def getCell(cellIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TableCell
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getMinimumHeight(): stdLib.Number
  def getNumCells(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getParentTable(): Table
  def remove(): scala.Unit
}

object TableRow {
  @scala.inline
  def apply(
    getCell: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, TableCell],
    getIndex: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getMinimumHeight: js.Function0[stdLib.Number],
    getNumCells: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getParentTable: js.Function0[Table],
    remove: js.Function0[scala.Unit]
  ): TableRow = {
    val __obj = js.Dynamic.literal(getCell = getCell, getIndex = getIndex, getMinimumHeight = getMinimumHeight, getNumCells = getNumCells, getParentTable = getParentTable, remove = remove)
  
    __obj.asInstanceOf[TableRow]
  }
}

