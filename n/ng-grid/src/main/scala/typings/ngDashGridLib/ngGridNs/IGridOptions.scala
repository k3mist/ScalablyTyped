package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridOptions extends js.Object {
  /** Callback for when you want to validate something after selection. */
  var afterSelectionChange: js.UndefOr[
    js.Function2[/* rowItem */ js.UndefOr[IRow], /* event */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** Define an aggregate template to customize the rows when grouped. See github wiki for more details. */
  var aggregateTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Callback if you want to inspect something before selection,
    return false if you want to cancel the selection. return true otherwise.
    If you need to wait for an async call to proceed with selection you can
    use rowItem.changeSelection(event) method after returning false initially.
    Note: when shift+ Selecting multiple items in the grid this will only get called
    once and the rowItem will be an array of items that are queued to be selected. */
  var beforeSelectionChange: js.UndefOr[
    js.Function2[/* rowItem */ js.UndefOr[IRow], /* event */ js.UndefOr[js.Any], scala.Boolean]
  ] = js.undefined
  /** checkbox templates. */
  var checkboxCellTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** checkbox templates. */
  var checkboxHeaderTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** definitions of columns as an array [], if not defined columns are auto-generated. See github wiki for more details. */
  var columnDefs: js.UndefOr[js.Array[IColumnDef]] = js.undefined
  /** Data being displayed in the grid. This can be either a string of object ID or object reference.
    Using string is preferred, as this turns on change tracking in ng-grid
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Data updated callback, fires every time the data is modified from outside the grid. */
  var dataUpdated: js.UndefOr[angularLib.angularMod.Global.Function] = js.undefined
  /** Enables cell editing. */
  var enableCellEdit: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables cell selection. */
  var enableCellSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable or disable HEAVY column virtualization. This turns off selection checkboxes and column pinning and is designed for spreadsheet-like data. */
  var enableColumnHeavyVirt: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable or disable reordering of columns */
  var enableColumnReordering: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable or disable resizing of columns */
  var enableColumnResize: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables text highlighting in grid by adding the "unselectable" class (See CSS file) */
  var enableHighlighting: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables the server-side paging feature */
  var enablePaging: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable column pinning */
  var enablePinning: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable drag and drop row reordering. Only works in HTML5 compliant browsers. */
  var enableRowReordering: js.UndefOr[scala.Boolean] = js.undefined
  /** To be able to have selectable rows in grid. */
  var enableRowSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables sorting in grid. */
  var enableSorting: js.UndefOr[scala.Boolean] = js.undefined
  /**  string list of properties to exclude when auto-generating columns. */
  var excludeProperties: js.UndefOr[js.Any] = js.undefined
  /** filterOptions -
    filterText: The text bound to the built-in search box.
    useExternalFilter: Bypass internal filtering if you want to roll your own filtering mechanism but want to use builtin search box.
    */
  var filterOptions: js.UndefOr[IFilterOptions] = js.undefined
  /** Defining the height of the footer in pixels. */
  var footerRowHeight: js.UndefOr[scala.Double] = js.undefined
  /** Initial fields to group data by. Array of field names, not displayName. */
  var groups: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The height of the header row in pixels. */
  var headerRowHeight: js.UndefOr[scala.Double] = js.undefined
  /** Define a header row template for further customization. See github wiki for more details. */
  var headerRowTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** i18n language support. choose from the installed or included languages, en, fr, sp, etc...*/
  var i18n: js.UndefOr[java.lang.String] = js.undefined
  /** Enables the use of jquery UI reaggable/droppable plugin. requires jqueryUI to work if enabled.
    Useful if you want drag + drop but your users insist on crappy browsers. */
  var jqueryUIDraggable: js.UndefOr[scala.Boolean] = js.undefined
  /** Enable the use jqueryUIThemes */
  var jqueryUITheme: js.UndefOr[scala.Boolean] = js.undefined
  /** Prevent unselections when in single selection mode. */
  var keepLastSelected: js.UndefOr[scala.Boolean] = js.undefined
  /** Maintains the column widths while resizing.
    Defaults to true when using *'s or undefined widths. Can be ovverriden by setting to false. */
  var maintainColumnRatios: js.UndefOr[scala.Boolean] = js.undefined
  /** Set this to false if you only want one item selected at a time */
  var multiSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**  pagingOptions - */
  var pagingOptions: js.UndefOr[IPagingOptions] = js.undefined
  /** Array of plugin functions to register in ng-grid */
  var pinSelectionCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  /** Array of plugin functions to register in ng-grid */
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  /** Row height of rows in grid. */
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
  /** Define a row template to customize output. See github wiki for more details. */
  var rowTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Select deselect an item by index. */
  var selectItem: js.UndefOr[js.Function2[/* idx */ scala.Double, /* state */ scala.Boolean, _]] = js.undefined
  /** Disable row selections by clicking on the row and only when the checkbox is clicked. */
  var selectWithCheckboxOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** all of the items selected in the grid. In single select mode there will only be one item in the array. */
  var selectedItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Enables menu to choose which columns to display and group by.
    If both showColumnMenu and showFilter are false the menu button will not display.*/
  var showColumnMenu: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables display of the filterbox in the column menu.
    If both showColumnMenu and showFilter are false the menu button will not display.*/
  var showFilter: js.UndefOr[scala.Boolean] = js.undefined
  /** Show or hide the footer alltogether the footer is enabled by default */
  var showFooter: js.UndefOr[scala.Boolean] = js.undefined
  /** Show the dropzone for drag and drop grouping */
  var showGroupPanel: js.UndefOr[scala.Boolean] = js.undefined
  /** Row selection check boxes appear as the first column. */
  var showSelectionCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  /** Define a sortInfo object to specify a default sorting state.
    You can also observe this variable to utilize server-side sorting (see useExternalSorting).
    Syntax is sortinfo: { fields: ['fieldName1',' fieldName2'], direction: 'ASC'/'asc' || 'desc'/'DESC'}*/
  var sortInfo: js.UndefOr[js.Any] = js.undefined
  /** Set the tab index of the Vieport. */
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  /** Prevents the internal sorting from executing.
    The sortInfo object will be updated with the sorting information so you can handle sorting (see sortInfo)*/
  var useExternalSorting: js.UndefOr[scala.Boolean] = js.undefined
  /** the threshold in rows to force virtualization on  */
  var virtualizationThreshold: js.UndefOr[scala.Double] = js.undefined
}

object IGridOptions {
  @scala.inline
  def apply(
    afterSelectionChange: js.Function2[/* rowItem */ js.UndefOr[IRow], /* event */ js.UndefOr[js.Any], scala.Unit] = null,
    aggregateTemplate: java.lang.String = null,
    beforeSelectionChange: js.Function2[/* rowItem */ js.UndefOr[IRow], /* event */ js.UndefOr[js.Any], scala.Boolean] = null,
    checkboxCellTemplate: java.lang.String = null,
    checkboxHeaderTemplate: java.lang.String = null,
    columnDefs: js.Array[IColumnDef] = null,
    data: js.Any = null,
    dataUpdated: angularLib.angularMod.Global.Function = null,
    enableCellEdit: js.UndefOr[scala.Boolean] = js.undefined,
    enableCellSelection: js.UndefOr[scala.Boolean] = js.undefined,
    enableColumnHeavyVirt: js.UndefOr[scala.Boolean] = js.undefined,
    enableColumnReordering: js.UndefOr[scala.Boolean] = js.undefined,
    enableColumnResize: js.UndefOr[scala.Boolean] = js.undefined,
    enableHighlighting: js.UndefOr[scala.Boolean] = js.undefined,
    enablePaging: js.UndefOr[scala.Boolean] = js.undefined,
    enablePinning: js.UndefOr[scala.Boolean] = js.undefined,
    enableRowReordering: js.UndefOr[scala.Boolean] = js.undefined,
    enableRowSelection: js.UndefOr[scala.Boolean] = js.undefined,
    enableSorting: js.UndefOr[scala.Boolean] = js.undefined,
    excludeProperties: js.Any = null,
    filterOptions: IFilterOptions = null,
    footerRowHeight: scala.Int | scala.Double = null,
    groups: js.Array[java.lang.String] = null,
    headerRowHeight: scala.Int | scala.Double = null,
    headerRowTemplate: java.lang.String = null,
    i18n: java.lang.String = null,
    jqueryUIDraggable: js.UndefOr[scala.Boolean] = js.undefined,
    jqueryUITheme: js.UndefOr[scala.Boolean] = js.undefined,
    keepLastSelected: js.UndefOr[scala.Boolean] = js.undefined,
    maintainColumnRatios: js.UndefOr[scala.Boolean] = js.undefined,
    multiSelect: js.UndefOr[scala.Boolean] = js.undefined,
    pagingOptions: IPagingOptions = null,
    pinSelectionCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    plugins: js.Array[_] = null,
    rowHeight: scala.Int | scala.Double = null,
    rowTemplate: java.lang.String = null,
    selectItem: js.Function2[/* idx */ scala.Double, /* state */ scala.Boolean, _] = null,
    selectWithCheckboxOnly: js.UndefOr[scala.Boolean] = js.undefined,
    selectedItems: js.Array[_] = null,
    showColumnMenu: js.UndefOr[scala.Boolean] = js.undefined,
    showFilter: js.UndefOr[scala.Boolean] = js.undefined,
    showFooter: js.UndefOr[scala.Boolean] = js.undefined,
    showGroupPanel: js.UndefOr[scala.Boolean] = js.undefined,
    showSelectionCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    sortInfo: js.Any = null,
    tabIndex: scala.Int | scala.Double = null,
    useExternalSorting: js.UndefOr[scala.Boolean] = js.undefined,
    virtualizationThreshold: scala.Int | scala.Double = null
  ): IGridOptions = {
    val __obj = js.Dynamic.literal()
    if (afterSelectionChange != null) __obj.updateDynamic("afterSelectionChange")(afterSelectionChange)
    if (aggregateTemplate != null) __obj.updateDynamic("aggregateTemplate")(aggregateTemplate)
    if (beforeSelectionChange != null) __obj.updateDynamic("beforeSelectionChange")(beforeSelectionChange)
    if (checkboxCellTemplate != null) __obj.updateDynamic("checkboxCellTemplate")(checkboxCellTemplate)
    if (checkboxHeaderTemplate != null) __obj.updateDynamic("checkboxHeaderTemplate")(checkboxHeaderTemplate)
    if (columnDefs != null) __obj.updateDynamic("columnDefs")(columnDefs)
    if (data != null) __obj.updateDynamic("data")(data)
    if (dataUpdated != null) __obj.updateDynamic("dataUpdated")(dataUpdated)
    if (!js.isUndefined(enableCellEdit)) __obj.updateDynamic("enableCellEdit")(enableCellEdit)
    if (!js.isUndefined(enableCellSelection)) __obj.updateDynamic("enableCellSelection")(enableCellSelection)
    if (!js.isUndefined(enableColumnHeavyVirt)) __obj.updateDynamic("enableColumnHeavyVirt")(enableColumnHeavyVirt)
    if (!js.isUndefined(enableColumnReordering)) __obj.updateDynamic("enableColumnReordering")(enableColumnReordering)
    if (!js.isUndefined(enableColumnResize)) __obj.updateDynamic("enableColumnResize")(enableColumnResize)
    if (!js.isUndefined(enableHighlighting)) __obj.updateDynamic("enableHighlighting")(enableHighlighting)
    if (!js.isUndefined(enablePaging)) __obj.updateDynamic("enablePaging")(enablePaging)
    if (!js.isUndefined(enablePinning)) __obj.updateDynamic("enablePinning")(enablePinning)
    if (!js.isUndefined(enableRowReordering)) __obj.updateDynamic("enableRowReordering")(enableRowReordering)
    if (!js.isUndefined(enableRowSelection)) __obj.updateDynamic("enableRowSelection")(enableRowSelection)
    if (!js.isUndefined(enableSorting)) __obj.updateDynamic("enableSorting")(enableSorting)
    if (excludeProperties != null) __obj.updateDynamic("excludeProperties")(excludeProperties)
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions)
    if (footerRowHeight != null) __obj.updateDynamic("footerRowHeight")(footerRowHeight.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups)
    if (headerRowHeight != null) __obj.updateDynamic("headerRowHeight")(headerRowHeight.asInstanceOf[js.Any])
    if (headerRowTemplate != null) __obj.updateDynamic("headerRowTemplate")(headerRowTemplate)
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    if (!js.isUndefined(jqueryUIDraggable)) __obj.updateDynamic("jqueryUIDraggable")(jqueryUIDraggable)
    if (!js.isUndefined(jqueryUITheme)) __obj.updateDynamic("jqueryUITheme")(jqueryUITheme)
    if (!js.isUndefined(keepLastSelected)) __obj.updateDynamic("keepLastSelected")(keepLastSelected)
    if (!js.isUndefined(maintainColumnRatios)) __obj.updateDynamic("maintainColumnRatios")(maintainColumnRatios)
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect)
    if (pagingOptions != null) __obj.updateDynamic("pagingOptions")(pagingOptions)
    if (!js.isUndefined(pinSelectionCheckbox)) __obj.updateDynamic("pinSelectionCheckbox")(pinSelectionCheckbox)
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowTemplate != null) __obj.updateDynamic("rowTemplate")(rowTemplate)
    if (selectItem != null) __obj.updateDynamic("selectItem")(selectItem)
    if (!js.isUndefined(selectWithCheckboxOnly)) __obj.updateDynamic("selectWithCheckboxOnly")(selectWithCheckboxOnly)
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems)
    if (!js.isUndefined(showColumnMenu)) __obj.updateDynamic("showColumnMenu")(showColumnMenu)
    if (!js.isUndefined(showFilter)) __obj.updateDynamic("showFilter")(showFilter)
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter)
    if (!js.isUndefined(showGroupPanel)) __obj.updateDynamic("showGroupPanel")(showGroupPanel)
    if (!js.isUndefined(showSelectionCheckbox)) __obj.updateDynamic("showSelectionCheckbox")(showSelectionCheckbox)
    if (sortInfo != null) __obj.updateDynamic("sortInfo")(sortInfo)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(useExternalSorting)) __obj.updateDynamic("useExternalSorting")(useExternalSorting)
    if (virtualizationThreshold != null) __obj.updateDynamic("virtualizationThreshold")(virtualizationThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridOptions]
  }
}

