package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  def getColumnFilterCriteria(columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): FilterCriteria
  def getRange(): Range
  def remove(): scala.Unit
  def removeColumnFilterCriteria(columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Filter
  def setColumnFilterCriteria(
    columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    filterCriteria: FilterCriteria
  ): Filter
  def sort(columnPosition: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ascending: scala.Boolean): Filter
}

object Filter {
  @scala.inline
  def apply(
    getColumnFilterCriteria: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, FilterCriteria],
    getRange: js.Function0[Range],
    remove: js.Function0[scala.Unit],
    removeColumnFilterCriteria: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, Filter],
    setColumnFilterCriteria: js.Function2[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, FilterCriteria, Filter],
    sort: js.Function2[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, scala.Boolean, Filter]
  ): Filter = {
    val __obj = js.Dynamic.literal(getColumnFilterCriteria = getColumnFilterCriteria, getRange = getRange, remove = remove, removeColumnFilterCriteria = removeColumnFilterCriteria, setColumnFilterCriteria = setColumnFilterCriteria, sort = sort)
  
    __obj.asInstanceOf[Filter]
  }
}

