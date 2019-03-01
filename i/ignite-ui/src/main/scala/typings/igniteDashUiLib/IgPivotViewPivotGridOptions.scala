package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewPivotGridOptions
  extends /**
	 * Option for IgPivotViewPivotGridOptions
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Enables sorting of the header cells in columns.
  	 */
  var allowHeaderColumnsSorting: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Enables sorting of the header cells in rows.
  	 */
  var allowHeaderRowsSorting: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Enables sorting of the value cells in columns.
  	 */
  var allowSorting: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The indentation for every level column when the compactColumnHeaders is set to true.
  	 */
  var compactColumnHeaderIndentation: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * A boolean value indicating wheter the column headers should be arranged for compact header layout – each hieararchy is in a single row.
  	 */
  var compactColumnHeaders: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * The indentation for every level row when the rowHeadersLayout is set to 'compact'.
  	 */
  var compactRowHeaderIndentation: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * A function that will be called to determine if an item can be moved in or dropped on an area of the pivot grid.
  	 * paramType="string" The location where the item will be moved - igPivotGrid, igPivotDataSelector, filters, rows, columns or measures.
  	 * paramType="string" The type of the item - Hierarchy, Measure or MeasureList.
  	 * paramType="string" The unique name of the item.
  	 * returnType="bool"  The function must return true if the item should be accepted.
  	 */
  var customMoveValidation: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Typle="number" Specifies the width of the row headers.
  	 */
  var defaultRowHeaderWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Disable the drag and drop for the columns drop area and the ability to use filtering and remove items from it.
  	 */
  var disableColumnsDropArea: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Disable the drag and drop for the filters drop area and the ability to use filtering and remove items from it.
  	 */
  var disableFiltersDropArea: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Disable the drag and drop for the measures drop area and the ability to use filtering and remove items from it.
  	 */
  var disableMeasuresDropArea: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Disable the drag and drop for the rows drop area and the ability to use filtering and remove items from it.
  	 */
  var disableRowsDropArea: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Settings for the drag and drop functionality of the igPivotDataSelector.
  	 */
  var dragAndDropSettings: js.UndefOr[IgPivotViewPivotGridOptionsDragAndDropSettings] = js.undefined
  /**
  	 * Specifies the parent for the drop downs.
  	 */
  var dropDownParent: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Spefies the default sort direction for the levels if no sort direction is specified in an item from the levelSortDirections option.
  	 */
  var firstLevelSortDirection: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Spefies the default sort direction for the rows.
  	 */
  var firstSortDirection: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Options specific to the igGrid that will render the pivot grid view.
  	 */
  var gridOptions: js.UndefOr[IgPivotViewPivotGridOptionsGridOptions] = js.undefined
  /**
  	 * Hide the columns drop area.
  	 */
  var hideColumnsDropArea: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Hide the filters drop area.
  	 */
  var hideFiltersDropArea: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Hide the measures drop area.
  	 */
  var hideMeasuresDropArea: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Hide the rows drop area.
  	 */
  var hideRowsDropArea: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * A boolean value indicating whether a parent in the columns is in front of its children.
  	 * If set to true, the query set sorts members in a level in their natural order - child members immediately follow their parent members.
  	 * If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
  	 */
  var isParentInFrontForColumns: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * A boolean value indicating whether a parent in the rows is in front of its children.
  	 * If set to true, the query set sorts members in a level in their natural order - child members immediately follow their parent members.
  	 * If set to false the query set sorts the members in a level using a post-natural order. In other words, child members precede their parents.
  	 */
  var isParentInFrontForRows: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * An array of level sort direction items, which predefine the sorted header cells.
  	 */
  var levelSortDirections: js.UndefOr[js.Array[IgPivotViewPivotGridOptionsLevelSortDirection]] = js.undefined
  /**
  	 * A value indicating wheter the layout that row headers should be arranged. For compact header layout – each hieararchy is in a single column.
  	 */
  var rowHeadersLayout: js.UndefOr[js.Any] = js.undefined
}

object IgPivotViewPivotGridOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotViewPivotGridOptions
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    allowHeaderColumnsSorting: js.UndefOr[scala.Boolean] = js.undefined,
    allowHeaderRowsSorting: js.UndefOr[scala.Boolean] = js.undefined,
    allowSorting: js.UndefOr[scala.Boolean] = js.undefined,
    compactColumnHeaderIndentation: scala.Int | scala.Double = null,
    compactColumnHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    compactRowHeaderIndentation: scala.Int | scala.Double = null,
    customMoveValidation: js.Function = null,
    defaultRowHeaderWidth: scala.Int | scala.Double = null,
    disableColumnsDropArea: js.UndefOr[scala.Boolean] = js.undefined,
    disableFiltersDropArea: js.UndefOr[scala.Boolean] = js.undefined,
    disableMeasuresDropArea: js.UndefOr[scala.Boolean] = js.undefined,
    disableRowsDropArea: js.UndefOr[scala.Boolean] = js.undefined,
    dragAndDropSettings: IgPivotViewPivotGridOptionsDragAndDropSettings = null,
    dropDownParent: js.Any = null,
    firstLevelSortDirection: js.Any = null,
    firstSortDirection: js.Any = null,
    gridOptions: IgPivotViewPivotGridOptionsGridOptions = null,
    hideColumnsDropArea: js.UndefOr[scala.Boolean] = js.undefined,
    hideFiltersDropArea: js.UndefOr[scala.Boolean] = js.undefined,
    hideMeasuresDropArea: js.UndefOr[scala.Boolean] = js.undefined,
    hideRowsDropArea: js.UndefOr[scala.Boolean] = js.undefined,
    isParentInFrontForColumns: js.UndefOr[scala.Boolean] = js.undefined,
    isParentInFrontForRows: js.UndefOr[scala.Boolean] = js.undefined,
    levelSortDirections: js.Array[IgPivotViewPivotGridOptionsLevelSortDirection] = null,
    rowHeadersLayout: js.Any = null
  ): IgPivotViewPivotGridOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowHeaderColumnsSorting)) __obj.updateDynamic("allowHeaderColumnsSorting")(allowHeaderColumnsSorting)
    if (!js.isUndefined(allowHeaderRowsSorting)) __obj.updateDynamic("allowHeaderRowsSorting")(allowHeaderRowsSorting)
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting)
    if (compactColumnHeaderIndentation != null) __obj.updateDynamic("compactColumnHeaderIndentation")(compactColumnHeaderIndentation.asInstanceOf[js.Any])
    if (!js.isUndefined(compactColumnHeaders)) __obj.updateDynamic("compactColumnHeaders")(compactColumnHeaders)
    if (compactRowHeaderIndentation != null) __obj.updateDynamic("compactRowHeaderIndentation")(compactRowHeaderIndentation.asInstanceOf[js.Any])
    if (customMoveValidation != null) __obj.updateDynamic("customMoveValidation")(customMoveValidation)
    if (defaultRowHeaderWidth != null) __obj.updateDynamic("defaultRowHeaderWidth")(defaultRowHeaderWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableColumnsDropArea)) __obj.updateDynamic("disableColumnsDropArea")(disableColumnsDropArea)
    if (!js.isUndefined(disableFiltersDropArea)) __obj.updateDynamic("disableFiltersDropArea")(disableFiltersDropArea)
    if (!js.isUndefined(disableMeasuresDropArea)) __obj.updateDynamic("disableMeasuresDropArea")(disableMeasuresDropArea)
    if (!js.isUndefined(disableRowsDropArea)) __obj.updateDynamic("disableRowsDropArea")(disableRowsDropArea)
    if (dragAndDropSettings != null) __obj.updateDynamic("dragAndDropSettings")(dragAndDropSettings)
    if (dropDownParent != null) __obj.updateDynamic("dropDownParent")(dropDownParent)
    if (firstLevelSortDirection != null) __obj.updateDynamic("firstLevelSortDirection")(firstLevelSortDirection)
    if (firstSortDirection != null) __obj.updateDynamic("firstSortDirection")(firstSortDirection)
    if (gridOptions != null) __obj.updateDynamic("gridOptions")(gridOptions)
    if (!js.isUndefined(hideColumnsDropArea)) __obj.updateDynamic("hideColumnsDropArea")(hideColumnsDropArea)
    if (!js.isUndefined(hideFiltersDropArea)) __obj.updateDynamic("hideFiltersDropArea")(hideFiltersDropArea)
    if (!js.isUndefined(hideMeasuresDropArea)) __obj.updateDynamic("hideMeasuresDropArea")(hideMeasuresDropArea)
    if (!js.isUndefined(hideRowsDropArea)) __obj.updateDynamic("hideRowsDropArea")(hideRowsDropArea)
    if (!js.isUndefined(isParentInFrontForColumns)) __obj.updateDynamic("isParentInFrontForColumns")(isParentInFrontForColumns)
    if (!js.isUndefined(isParentInFrontForRows)) __obj.updateDynamic("isParentInFrontForRows")(isParentInFrontForRows)
    if (levelSortDirections != null) __obj.updateDynamic("levelSortDirections")(levelSortDirections)
    if (rowHeadersLayout != null) __obj.updateDynamic("rowHeadersLayout")(rowHeadersLayout)
    __obj.asInstanceOf[IgPivotViewPivotGridOptions]
  }
}

