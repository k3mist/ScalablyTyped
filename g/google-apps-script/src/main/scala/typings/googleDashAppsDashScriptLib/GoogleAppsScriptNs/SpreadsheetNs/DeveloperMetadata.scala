package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadata extends js.Object {
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  def getKey(): java.lang.String
  def getLocation(): DeveloperMetadataLocation
  def getValue(): java.lang.String
  def getVisibility(): DeveloperMetadataVisibility
  def moveToColumn(column: Range): DeveloperMetadata
  def moveToRow(row: Range): DeveloperMetadata
  def moveToSheet(sheet: Sheet): DeveloperMetadata
  def moveToSpreadsheet(): DeveloperMetadata
  def remove(): scala.Unit
  def setKey(key: java.lang.String): DeveloperMetadata
  def setValue(value: java.lang.String): DeveloperMetadata
  def setVisibility(visibility: DeveloperMetadataVisibility): DeveloperMetadata
}

object DeveloperMetadata {
  @scala.inline
  def apply(
    getId: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer],
    getKey: js.Function0[java.lang.String],
    getLocation: js.Function0[DeveloperMetadataLocation],
    getValue: js.Function0[java.lang.String],
    getVisibility: js.Function0[DeveloperMetadataVisibility],
    moveToColumn: js.Function1[Range, DeveloperMetadata],
    moveToRow: js.Function1[Range, DeveloperMetadata],
    moveToSheet: js.Function1[Sheet, DeveloperMetadata],
    moveToSpreadsheet: js.Function0[DeveloperMetadata],
    remove: js.Function0[scala.Unit],
    setKey: js.Function1[java.lang.String, DeveloperMetadata],
    setValue: js.Function1[java.lang.String, DeveloperMetadata],
    setVisibility: js.Function1[DeveloperMetadataVisibility, DeveloperMetadata]
  ): DeveloperMetadata = {
    val __obj = js.Dynamic.literal(getId = getId, getKey = getKey, getLocation = getLocation, getValue = getValue, getVisibility = getVisibility, moveToColumn = moveToColumn, moveToRow = moveToRow, moveToSheet = moveToSheet, moveToSpreadsheet = moveToSpreadsheet, remove = remove, setKey = setKey, setValue = setValue, setVisibility = setVisibility)
  
    __obj.asInstanceOf[DeveloperMetadata]
  }
}

