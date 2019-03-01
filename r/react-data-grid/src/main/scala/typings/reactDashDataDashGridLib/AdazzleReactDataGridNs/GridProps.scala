package typings
package reactDashDataDashGridLib.AdazzleReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridProps[T] extends js.Object {
  /**
    * Controls what happens when the user navigates beyond the first or last cells.
    * 'loopOverRow' will navigate to the beginning/end of the current row.
    * 'changeRow' will navigate to the beginning of the next row or the end of the last.
    * 'none' will do nothing.
    * @default none
    */
  var cellNavigationMode: js.UndefOr[
    reactDashDataDashGridLib.reactDashDataDashGridLibStrings.none | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.loopOverRow | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.changeRow
  ] = js.undefined
  /**
    * The columns to render.
    */
  var columns: js.UndefOr[js.Array[Column[T]]] = js.undefined
  /**
    * A context menu to disiplay when the user right-clicks a cell.
    * Consider using "react-contextmenu", included in "react-data-grid/addons".
    */
  var contextMenu: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * A component to display when there are no rows to render.
    */
  var emptyRowsView: js.UndefOr[
    (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[_]
  ] = js.undefined
  /**
    * Enables cells to be selected when clicked.
    * @default false
    */
  var enableCellSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables cells to be dragged and dropped
    * @default false
    */
  var enableDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When set to true or 'multi', enables multiple row select.
    * When set to 'single', enables single row select.
    * When set to false or not set, disables row select.
    * @default false
    */
  var enableRowSelect: js.UndefOr[
    scala.Boolean | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.single | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.multi
  ] = js.undefined
  var getCellActions: js.UndefOr[
    js.Function2[/* column */ Column[T], /* row */ T, js.Array[ActionButton | ActionMenu]]
  ] = js.undefined
  /**
    * Responsible for returning an Array of values that can be used for filtering
    * a column that is column.filterable and using a column.filterRenderer that
    * displays a list of options.
    * @param columnKey the column key that we are looking to pull values from
    */
  var getValidFilterValues: js.UndefOr[js.Function1[/* columnKey */ java.lang.String, js.Array[_]]] = js.undefined
  /**
    * The height of the header filter row in pixels.
    * @default 45
    */
  var headerFiltersHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The height of the header row in pixels.
    * @default rowHeight
    */
  var headerRowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum width of each column in pixels.
    * @default 80
    */
  var minColumnWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum height of the entire grid in pixels.
    * @default 350
    */
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum width of the entire grid in pixels.
    */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Called when the user filters a column by some value.
    * Should restrict the rows in rowGetter to only things that match the filter.
    * @param filter The filter being added
    */
  var onAddFilter: js.UndefOr[js.Function1[/* filter */ Filter, scala.Unit]] = js.undefined
  /**
    * Invoked when the user copies a value from one cell and pastes it into another (in the same column).
    * Should update the value of the cell in row e.toRow.
    * @param e Information about the event
    */
  var onCellCopyPaste: js.UndefOr[js.Function1[/* e */ CellCopyPasteEvent, scala.Unit]] = js.undefined
  /**
    * Called when a cell is deselected.
    * @param coordinates The row and column indices of the deselected cell.
    */
  var onCellDeSelected: js.UndefOr[js.Function1[/* coordinates */ reactDashDataDashGridLib.Anon_Idx, scala.Unit]] = js.undefined
  /**
    * Called when a cell is selected.
    * @param coordinates The row and column indices of the selected cell.
    */
  var onCellSelected: js.UndefOr[js.Function1[/* coordinates */ reactDashDataDashGridLib.Anon_Idx, scala.Unit]] = js.undefined
  /**
    * Invoked when the user pulls down the drag handle of an editable cell.
    * Should update the values of the selected cells.
    * @param e Information about the event
    */
  var onCellsDragged: js.UndefOr[js.Function1[/* e */ CellDragEvent, scala.Unit]] = js.undefined
  /**
    * Called when the user clears all filters.
    * Should restore the rows in rowGetter to their original state.
    */
  var onClearFilters: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Invoked when a column has been resized.
    * @param index The index of the column
    * @param width The new width of the column
    */
  var onColumnResize: js.UndefOr[js.Function2[/* index */ scala.Double, /* width */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Invoked when the user double clicks on the drag handle of an editable cell.
    * Should update the values of the cells beneath the selected cell.
    * @param e Information about the event
    */
  var onDragHandleDoubleClick: js.UndefOr[js.Function1[/* e */ DragHandleDoubleClickEvent[T], scala.Unit]] = js.undefined
  /**
    * Invoked after the user updates the grid rows in any way.
    * @param e Information about the event
    */
  var onGridRowsUpdated: js.UndefOr[js.Function1[/* e */ GridRowsUpdatedEvent[T], scala.Unit]] = js.undefined
  /**
    * Called when the user sorts the grid by some column.
    * Should update the order of the rows returned by rowGetter.
    * @param sortColumn The name of the column being sorted by
    * @param sortDirection The direction to sort ('ASC'/'DESC'/'NONE')
    */
  var onGridSort: js.UndefOr[
    js.Function2[
      /* sortColumn */ java.lang.String, 
      /* sortDirection */ reactDashDataDashGridLib.reactDashDataDashGridLibStrings.ASC | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.DESC | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.NONE, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * An event function called when a row is clicked.
    * Clicking the header row will trigger a call with -1 for the rowIdx.
    * @param rowIdx zero index number of row clicked
    * @param row object behind the row
    */
  var onRowClick: js.UndefOr[js.Function2[/* rowIdx */ scala.Double, /* row */ T, scala.Unit]] = js.undefined
  /**
    * An event function called when a row is expanded with the toggle
    * @param props OnRowExpandToggle object
    */
  var onRowExpandToggle: js.UndefOr[js.Function1[/* props */ OnRowExpandToggle, scala.Unit]] = js.undefined
  /**
    * Called when a row is selected.
    * @param rows The (complete) current selection of rows.
    */
  var onRowSelect: js.UndefOr[js.Function1[/* rows */ js.Array[T], scala.Unit]] = js.undefined
  /**
    * Invoked when the user changes the value of a single cell.
    * Should update that cell's value.
    * @param e Information about the event
    */
  var onRowUpdated: js.UndefOr[js.Function1[/* e */ RowUpdateEvent[T], scala.Unit]] = js.undefined
  /**
    * A custom formatter for select row column
    * @default AdazzleReactDataGridPlugins.Editors.CheckboxEditor
    */
  var rowActionsCell: js.UndefOr[
    (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[_]
  ] = js.undefined
  /**
    * Gets the data to render in each row. Required.
    * Can be an array or a function that takes an index and returns an object.
    */
  var rowGetter: js.Array[T] | (js.Function1[/* rowIdx */ scala.Double, T])
  /**
    * The height of each individual row in pixels.
    * @default 35
    */
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * A property that's unique to every row.
    * This property is required to enable row selection.
    * @default 'id'
    */
  var rowKey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A react component to customize how rows are rendered.
    * If you want to define your own, consider extending ReactDataGrid.Row.
    */
  var rowRenderer: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactElement[_] | (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[_]
  ] = js.undefined
  /**
    * How long to wait before rendering a new row while scrolling in milliseconds.
    * @default 0
    */
  var rowScrollTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Options object for selecting rows
    */
  var rowSelection: js.UndefOr[reactDashDataDashGridLib.Anon_EnableShiftSelect[T]] = js.undefined
  /**
    * The total number of rows to render. Required.
    */
  var rowsCount: scala.Double
  /**
    * A custom formatter for the select all checkbox cell
    * @default react-data-grid/src/formatters/SelectAll.js
    */
  var selectAllRenderer: js.UndefOr[
    (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[_]
  ] = js.undefined
  /**
    * key of the initial sorted column
    */
  var sortColumn: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Initial sorting direction
    */
  var sortDirection: js.UndefOr[
    reactDashDataDashGridLib.reactDashDataDashGridLibStrings.ASC | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.DESC | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.NONE
  ] = js.undefined
  /**
    * A toolbar to display above the grid.
    * Consider using the toolbar included in "react-data-grid/addons".
    */
  var toolbar: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
}

object GridProps {
  @scala.inline
  def apply[T](
    rowGetter: js.Array[T] | (js.Function1[/* rowIdx */ scala.Double, T]),
    rowsCount: scala.Double,
    cellNavigationMode: reactDashDataDashGridLib.reactDashDataDashGridLibStrings.none | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.loopOverRow | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.changeRow = null,
    columns: js.Array[Column[T]] = null,
    contextMenu: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    emptyRowsView: (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[_] = null,
    enableCellSelect: js.UndefOr[scala.Boolean] = js.undefined,
    enableDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined,
    enableRowSelect: scala.Boolean | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.single | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.multi = null,
    getCellActions: js.Function2[/* column */ Column[T], /* row */ T, js.Array[ActionButton | ActionMenu]] = null,
    getValidFilterValues: js.Function1[/* columnKey */ java.lang.String, js.Array[_]] = null,
    headerFiltersHeight: scala.Int | scala.Double = null,
    headerRowHeight: scala.Int | scala.Double = null,
    minColumnWidth: scala.Int | scala.Double = null,
    minHeight: scala.Int | scala.Double = null,
    minWidth: scala.Int | scala.Double = null,
    onAddFilter: js.Function1[/* filter */ Filter, scala.Unit] = null,
    onCellCopyPaste: js.Function1[/* e */ CellCopyPasteEvent, scala.Unit] = null,
    onCellDeSelected: js.Function1[/* coordinates */ reactDashDataDashGridLib.Anon_Idx, scala.Unit] = null,
    onCellSelected: js.Function1[/* coordinates */ reactDashDataDashGridLib.Anon_Idx, scala.Unit] = null,
    onCellsDragged: js.Function1[/* e */ CellDragEvent, scala.Unit] = null,
    onClearFilters: js.Function0[scala.Unit] = null,
    onColumnResize: js.Function2[/* index */ scala.Double, /* width */ scala.Double, scala.Unit] = null,
    onDragHandleDoubleClick: js.Function1[/* e */ DragHandleDoubleClickEvent[T], scala.Unit] = null,
    onGridRowsUpdated: js.Function1[/* e */ GridRowsUpdatedEvent[T], scala.Unit] = null,
    onGridSort: js.Function2[
      /* sortColumn */ java.lang.String, 
      /* sortDirection */ reactDashDataDashGridLib.reactDashDataDashGridLibStrings.ASC | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.DESC | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.NONE, 
      scala.Unit
    ] = null,
    onRowClick: js.Function2[/* rowIdx */ scala.Double, /* row */ T, scala.Unit] = null,
    onRowExpandToggle: js.Function1[/* props */ OnRowExpandToggle, scala.Unit] = null,
    onRowSelect: js.Function1[/* rows */ js.Array[T], scala.Unit] = null,
    onRowUpdated: js.Function1[/* e */ RowUpdateEvent[T], scala.Unit] = null,
    rowActionsCell: (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[_] = null,
    rowHeight: scala.Int | scala.Double = null,
    rowKey: java.lang.String = null,
    rowRenderer: reactLib.reactMod.ReactNs.ReactElement[_] | (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[_] = null,
    rowScrollTimeout: scala.Int | scala.Double = null,
    rowSelection: reactDashDataDashGridLib.Anon_EnableShiftSelect[T] = null,
    selectAllRenderer: (reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]) | reactLib.reactMod.ReactNs.StatelessComponent[_] = null,
    sortColumn: java.lang.String = null,
    sortDirection: reactDashDataDashGridLib.reactDashDataDashGridLibStrings.ASC | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.DESC | reactDashDataDashGridLib.reactDashDataDashGridLibStrings.NONE = null,
    toolbar: reactLib.reactMod.ReactNs.ReactElement[_] = null
  ): GridProps[T] = {
    val __obj = js.Dynamic.literal(rowGetter = rowGetter.asInstanceOf[js.Any], rowsCount = rowsCount)
    if (cellNavigationMode != null) __obj.updateDynamic("cellNavigationMode")(cellNavigationMode.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu)
    if (emptyRowsView != null) __obj.updateDynamic("emptyRowsView")(emptyRowsView.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellSelect)) __obj.updateDynamic("enableCellSelect")(enableCellSelect)
    if (!js.isUndefined(enableDragAndDrop)) __obj.updateDynamic("enableDragAndDrop")(enableDragAndDrop)
    if (enableRowSelect != null) __obj.updateDynamic("enableRowSelect")(enableRowSelect.asInstanceOf[js.Any])
    if (getCellActions != null) __obj.updateDynamic("getCellActions")(getCellActions)
    if (getValidFilterValues != null) __obj.updateDynamic("getValidFilterValues")(getValidFilterValues)
    if (headerFiltersHeight != null) __obj.updateDynamic("headerFiltersHeight")(headerFiltersHeight.asInstanceOf[js.Any])
    if (headerRowHeight != null) __obj.updateDynamic("headerRowHeight")(headerRowHeight.asInstanceOf[js.Any])
    if (minColumnWidth != null) __obj.updateDynamic("minColumnWidth")(minColumnWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onAddFilter != null) __obj.updateDynamic("onAddFilter")(onAddFilter)
    if (onCellCopyPaste != null) __obj.updateDynamic("onCellCopyPaste")(onCellCopyPaste)
    if (onCellDeSelected != null) __obj.updateDynamic("onCellDeSelected")(onCellDeSelected)
    if (onCellSelected != null) __obj.updateDynamic("onCellSelected")(onCellSelected)
    if (onCellsDragged != null) __obj.updateDynamic("onCellsDragged")(onCellsDragged)
    if (onClearFilters != null) __obj.updateDynamic("onClearFilters")(onClearFilters)
    if (onColumnResize != null) __obj.updateDynamic("onColumnResize")(onColumnResize)
    if (onDragHandleDoubleClick != null) __obj.updateDynamic("onDragHandleDoubleClick")(onDragHandleDoubleClick)
    if (onGridRowsUpdated != null) __obj.updateDynamic("onGridRowsUpdated")(onGridRowsUpdated)
    if (onGridSort != null) __obj.updateDynamic("onGridSort")(onGridSort)
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(onRowClick)
    if (onRowExpandToggle != null) __obj.updateDynamic("onRowExpandToggle")(onRowExpandToggle)
    if (onRowSelect != null) __obj.updateDynamic("onRowSelect")(onRowSelect)
    if (onRowUpdated != null) __obj.updateDynamic("onRowUpdated")(onRowUpdated)
    if (rowActionsCell != null) __obj.updateDynamic("rowActionsCell")(rowActionsCell.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey)
    if (rowRenderer != null) __obj.updateDynamic("rowRenderer")(rowRenderer.asInstanceOf[js.Any])
    if (rowScrollTimeout != null) __obj.updateDynamic("rowScrollTimeout")(rowScrollTimeout.asInstanceOf[js.Any])
    if (rowSelection != null) __obj.updateDynamic("rowSelection")(rowSelection)
    if (selectAllRenderer != null) __obj.updateDynamic("selectAllRenderer")(selectAllRenderer.asInstanceOf[js.Any])
    if (sortColumn != null) __obj.updateDynamic("sortColumn")(sortColumn)
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar)
    __obj.asInstanceOf[GridProps[T]]
  }
}

