package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadataLocation extends js.Object {
  def getColumn(): Range
  def getLocationType(): DeveloperMetadataLocationType
  def getRow(): Range
  def getSheet(): Sheet
  def getSpreadsheet(): Spreadsheet
}

object DeveloperMetadataLocation {
  @scala.inline
  def apply(
    getColumn: js.Function0[Range],
    getLocationType: js.Function0[DeveloperMetadataLocationType],
    getRow: js.Function0[Range],
    getSheet: js.Function0[Sheet],
    getSpreadsheet: js.Function0[Spreadsheet]
  ): DeveloperMetadataLocation = {
    val __obj = js.Dynamic.literal(getColumn = getColumn, getLocationType = getLocationType, getRow = getRow, getSheet = getSheet, getSpreadsheet = getSpreadsheet)
  
    __obj.asInstanceOf[DeveloperMetadataLocation]
  }
}

