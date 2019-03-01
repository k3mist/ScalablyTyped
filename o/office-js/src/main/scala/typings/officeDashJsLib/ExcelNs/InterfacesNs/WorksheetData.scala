package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "worksheet.toJSON()". */
trait WorksheetData extends js.Object {
  /**
    *
    * Returns collection of charts that are part of the worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var charts: js.UndefOr[js.Array[ChartData]] = js.undefined
  /**
    *
    * Returns a value that uniquely identifies the worksheet in a given workbook. The value of the identifier remains the same even when the worksheet is renamed or moved. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * The display name of the worksheet.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Collection of names scoped to the current worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.4]
    */
  var names: js.UndefOr[js.Array[NamedItemData]] = js.undefined
  /**
    *
    * Collection of PivotTables that are part of the worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.3]
    */
  var pivotTables: js.UndefOr[js.Array[PivotTableData]] = js.undefined
  /**
    *
    * The zero-based position of the worksheet within the workbook.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns sheet protection object for a worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.2]
    */
  var protection: js.UndefOr[WorksheetProtectionData] = js.undefined
  /**
    *
    * Gets or sets the worksheet's gridlines flag.
    This flag determines whether gridlines are visible to the user.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showGridlines: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets the worksheet's headings flag.
    This flag determines whether headings are visible to the user.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showHeadings: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns the standard (default) height of all the rows in the worksheet, in points. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns or sets the standard (default) width of all the columns in the worksheet.
    One unit of column width is equal to the width of one character in the Normal style. For proportional fonts, the width of the character 0 (zero) is used.
    *
    * [Api set: ExcelApi 1.7]
    */
  var standardWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Gets or sets the worksheet tab color.
    When retrieving the tab color, if the worksheet is invisible, the value will be null. If the worksheet is visible but the tab color is set to auto, an empty string will be returned. Otherwise, the property will be set to a color, in the form "#123456"
    When setting the color, use an empty-string to set an "auto" color, or a real color otherwise.
    *
    * [Api set: ExcelApi 1.7]
    */
  var tabColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Collection of tables that are part of the worksheet. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var tables: js.UndefOr[js.Array[TableData]] = js.undefined
  /**
    *
    * The Visibility of the worksheet.
    *
    * [Api set: ExcelApi 1.1 for reading visibility; 1.2 for setting it.]
    */
  var visibility: js.UndefOr[
    officeDashJsLib.ExcelNs.SheetVisibility | officeDashJsLib.officeDashJsLibStrings.Visible | officeDashJsLib.officeDashJsLibStrings.Hidden | officeDashJsLib.officeDashJsLibStrings.VeryHidden
  ] = js.undefined
}

object WorksheetData {
  @scala.inline
  def apply(
    charts: js.Array[ChartData] = null,
    id: java.lang.String = null,
    name: java.lang.String = null,
    names: js.Array[NamedItemData] = null,
    pivotTables: js.Array[PivotTableData] = null,
    position: scala.Int | scala.Double = null,
    protection: WorksheetProtectionData = null,
    showGridlines: js.UndefOr[scala.Boolean] = js.undefined,
    showHeadings: js.UndefOr[scala.Boolean] = js.undefined,
    standardHeight: scala.Int | scala.Double = null,
    standardWidth: scala.Int | scala.Double = null,
    tabColor: java.lang.String = null,
    tables: js.Array[TableData] = null,
    visibility: officeDashJsLib.ExcelNs.SheetVisibility | officeDashJsLib.officeDashJsLibStrings.Visible | officeDashJsLib.officeDashJsLibStrings.Hidden | officeDashJsLib.officeDashJsLibStrings.VeryHidden = null
  ): WorksheetData = {
    val __obj = js.Dynamic.literal()
    if (charts != null) __obj.updateDynamic("charts")(charts)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (names != null) __obj.updateDynamic("names")(names)
    if (pivotTables != null) __obj.updateDynamic("pivotTables")(pivotTables)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (protection != null) __obj.updateDynamic("protection")(protection)
    if (!js.isUndefined(showGridlines)) __obj.updateDynamic("showGridlines")(showGridlines)
    if (!js.isUndefined(showHeadings)) __obj.updateDynamic("showHeadings")(showHeadings)
    if (standardHeight != null) __obj.updateDynamic("standardHeight")(standardHeight.asInstanceOf[js.Any])
    if (standardWidth != null) __obj.updateDynamic("standardWidth")(standardWidth.asInstanceOf[js.Any])
    if (tabColor != null) __obj.updateDynamic("tabColor")(tabColor)
    if (tables != null) __obj.updateDynamic("tables")(tables)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetData]
  }
}

