package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProtectInfo extends _WSKeys {
  /**
    * Filter
    * @default: false
    */
  var autoFilter: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delete columns
    * @default: false
    */
  var deleteColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Delete rows
    * @default: false
    */
  var deleteRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Format cells
    * @default: false
    */
  var formatCells: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Format columns
    * @default: false
    */
  var formatColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Format rows
    * @default: false
    */
  var formatRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Insert columns
    * @default: false
    */
  var insertColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Insert hyperlinks
    * @default: false
    */
  var insertHyperlinks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Insert rows
    * @default: false
    */
  var insertRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Edit objects
    * @default: true
    */
  var objects: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The password for formats that support password-protected sheets
    * (XLSX/XLSB/XLS). The writer uses the XOR obfuscation method.
    */
  var password: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use PivotTable reports
    * @default: false
    */
  var pivotTables: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Edit scenarios
    * @default: true
    */
  var scenarios: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Select locked cells
    * @default: true
    */
  var selectLockedCells: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Select unlocked cells
    * @default: true
    */
  var selectUnlockedCells: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sort
    * @default: false
    */
  var sort: js.UndefOr[scala.Boolean] = js.undefined
}

object ProtectInfo {
  @scala.inline
  def apply(
    autoFilter: js.UndefOr[scala.Boolean] = js.undefined,
    deleteColumns: js.UndefOr[scala.Boolean] = js.undefined,
    deleteRows: js.UndefOr[scala.Boolean] = js.undefined,
    formatCells: js.UndefOr[scala.Boolean] = js.undefined,
    formatColumns: js.UndefOr[scala.Boolean] = js.undefined,
    formatRows: js.UndefOr[scala.Boolean] = js.undefined,
    insertColumns: js.UndefOr[scala.Boolean] = js.undefined,
    insertHyperlinks: js.UndefOr[scala.Boolean] = js.undefined,
    insertRows: js.UndefOr[scala.Boolean] = js.undefined,
    objects: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    pivotTables: js.UndefOr[scala.Boolean] = js.undefined,
    scenarios: js.UndefOr[scala.Boolean] = js.undefined,
    selectLockedCells: js.UndefOr[scala.Boolean] = js.undefined,
    selectUnlockedCells: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.UndefOr[scala.Boolean] = js.undefined
  ): ProtectInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFilter)) __obj.updateDynamic("autoFilter")(autoFilter)
    if (!js.isUndefined(deleteColumns)) __obj.updateDynamic("deleteColumns")(deleteColumns)
    if (!js.isUndefined(deleteRows)) __obj.updateDynamic("deleteRows")(deleteRows)
    if (!js.isUndefined(formatCells)) __obj.updateDynamic("formatCells")(formatCells)
    if (!js.isUndefined(formatColumns)) __obj.updateDynamic("formatColumns")(formatColumns)
    if (!js.isUndefined(formatRows)) __obj.updateDynamic("formatRows")(formatRows)
    if (!js.isUndefined(insertColumns)) __obj.updateDynamic("insertColumns")(insertColumns)
    if (!js.isUndefined(insertHyperlinks)) __obj.updateDynamic("insertHyperlinks")(insertHyperlinks)
    if (!js.isUndefined(insertRows)) __obj.updateDynamic("insertRows")(insertRows)
    if (!js.isUndefined(objects)) __obj.updateDynamic("objects")(objects)
    if (password != null) __obj.updateDynamic("password")(password)
    if (!js.isUndefined(pivotTables)) __obj.updateDynamic("pivotTables")(pivotTables)
    if (!js.isUndefined(scenarios)) __obj.updateDynamic("scenarios")(scenarios)
    if (!js.isUndefined(selectLockedCells)) __obj.updateDynamic("selectLockedCells")(selectLockedCells)
    if (!js.isUndefined(selectUnlockedCells)) __obj.updateDynamic("selectUnlockedCells")(selectUnlockedCells)
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[ProtectInfo]
  }
}

