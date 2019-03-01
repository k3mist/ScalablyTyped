package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArialabelAutoHeightChildren extends js.Object {
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Removes fixed height from the scrollingContainer so that the total height
    * of rows can stretch the window. Intended for use with WindowScroller
    */
  var autoHeight: js.UndefOr[scala.Boolean] = js.undefined
  /** One or more Columns describing the data displayed in this row */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Optional CSS class name */
  var className: js.UndefOr[java.lang.String] = js.undefined
  var deferredMeasurementCache: js.UndefOr[reactDashVirtualizedLib.distEsCellMeasurerMod.CellMeasurerCache] = js.undefined
  /** Disable rendering the header at all */
  var disableHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Used to estimate the total height of a Table before all of its rows have actually been measured.
    * The estimated total height is adjusted as rows are rendered.
    */
  var estimatedRowSize: js.UndefOr[scala.Double] = js.undefined
  /** Optional custom CSS class name to attach to inner Grid element. */
  var gridClassName: js.UndefOr[java.lang.String] = js.undefined
  /** Optional inline style to attach to inner Grid element. */
  var gridStyle: js.UndefOr[js.Any] = js.undefined
  /** Optional CSS class to apply to all column headers */
  var headerClassName: js.UndefOr[java.lang.String] = js.undefined
  /** Fixed height of header row */
  var headerHeight: scala.Double
  /**
    * Responsible for rendering a table row given an array of columns:
    * Should implement the following interface: ({
    *   className: string,
    *   columns: any[],
    *   style: any
    * }): PropTypes.node
    */
  var headerRowRenderer: js.UndefOr[reactDashVirtualizedLib.distEsTableMod.TableHeaderRowRenderer] = js.undefined
  /** Optional custom inline style to attach to table header columns. */
  var headerStyle: js.UndefOr[js.Any] = js.undefined
  /** Fixed/available height for out DOM element */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Optional id */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Optional renderer to be used in place of table body rows when rowCount is 0 */
  var noRowsRenderer: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Optional callback when a column's header is clicked.
    * ({ columnData: any, dataKey: string }): void
    */
  var onHeaderClick: js.UndefOr[
    js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.HeaderMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback invoked when a user clicks on a table row.
    * ({ index: number }): void
    */
  var onRowClick: js.UndefOr[
    js.Function1[
      /* info */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback invoked when a user double-clicks on a table row.
    * ({ index: number }): void
    */
  var onRowDoubleClick: js.UndefOr[
    js.Function1[
      /* info */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback invoked when the mouse leaves a table row.
    * ({ index: number }): void
    */
  var onRowMouseOut: js.UndefOr[
    js.Function1[
      /* info */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback invoked when a user moves the mouse over a table row.
    * ({ index: number }): void
    */
  var onRowMouseOver: js.UndefOr[
    js.Function1[
      /* info */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback invoked with information about the slice of rows that were just rendered.
    * ({ startIndex, stopIndex }): void
    */
  var onRowsRendered: js.UndefOr[
    js.Function1[
      /* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.IndexRange with reactDashVirtualizedLib.reactDashVirtualizedMod.OverscanIndexRange, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Callback invoked whenever the scroll offset changes within the inner scrollable region.
    * This callback can be used to sync scrolling between lists, tables, or grids.
    * ({ clientHeight, scrollHeight, scrollTop }): void
    */
  var onScroll: js.UndefOr[
    js.Function1[
      /* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.ScrollEventData, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Number of rows to render above/below the visible bounds of the list.
    * These rows can help for smoother scrolling on touch devices.
    */
  var overscanRowCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional CSS class to apply to all table rows (including the header row).
    * This property can be a CSS class name (string) or a function that returns a class name.
    * If a function is provided its signature should be: ({ index: number }): string
    */
  var rowClassName: js.UndefOr[
    java.lang.String | (js.Function1[/* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, java.lang.String])
  ] = js.undefined
  /** Number of rows in table. */
  var rowCount: scala.Double
  /**
    * Callback responsible for returning a data row given an index.
    * ({ index: number }): any
    */
  var rowGetter: js.UndefOr[
    js.Function1[/* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, _]
  ] = js.undefined
  /**
    * Either a fixed row height (number) or a function that returns the height of a row given its index.
    * ({ index: number }): number
    */
  var rowHeight: scala.Double | (js.Function1[/* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double])
  /**
    * Responsible for rendering a table row given an array of columns:
    * Should implement the following interface: ({
    *   className: string,
    *   columns: Array,
    *   index: number,
    *   isScrolling: boolean,
    *   onRowClick: ?Function,
    *   onRowDoubleClick: ?Function,
    *   onRowMouseOver: ?Function,
    *   onRowMouseOut: ?Function,
    *   rowData: any,
    *   style: any
    * }): PropTypes.node
    */
  var rowRenderer: js.UndefOr[reactDashVirtualizedLib.distEsTableMod.TableRowRenderer] = js.undefined
  /** Optional custom inline style to attach to table rows. */
  var rowStyle: js.UndefOr[
    reactLib.reactMod.ReactNs.CSSProperties | (js.Function1[
      /* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, 
      reactLib.reactMod.ReactNs.CSSProperties
    ])
  ] = js.undefined
  /** See Grid#scrollToAlignment */
  var scrollToAlignment: js.UndefOr[java.lang.String] = js.undefined
  /** Row index to ensure visible (by forcefully scrolling if necessary) */
  var scrollToIndex: js.UndefOr[scala.Double] = js.undefined
  /** Vertical offset. */
  var scrollTop: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sort function to be called if a sortable header is clicked.
    * ({ sortBy: string, sortDirection: SortDirection }): void
    */
  var sort: js.UndefOr[js.Function1[/* info */ Anon_SortBy, scala.Unit]] = js.undefined
  /** Table data is currently sorted by this :dataKey (if it is sorted at all) */
  var sortBy: js.UndefOr[java.lang.String] = js.undefined
  /** Table data is currently sorted in this direction (if it is sorted at all) */
  var sortDirection: js.UndefOr[reactDashVirtualizedLib.distEsTableMod.SortDirectionType] = js.undefined
  /** Optional inline style */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /** Tab index for focus */
  var tabIndex: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** Width of list */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ArialabelAutoHeightChildren {
  @scala.inline
  def apply(
    headerHeight: scala.Double,
    rowCount: scala.Double,
    rowHeight: scala.Double | (js.Function1[/* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, scala.Double]),
    `aria-label`: java.lang.String = null,
    autoHeight: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    deferredMeasurementCache: reactDashVirtualizedLib.distEsCellMeasurerMod.CellMeasurerCache = null,
    disableHeader: js.UndefOr[scala.Boolean] = js.undefined,
    estimatedRowSize: scala.Int | scala.Double = null,
    gridClassName: java.lang.String = null,
    gridStyle: js.Any = null,
    headerClassName: java.lang.String = null,
    headerRowRenderer: reactDashVirtualizedLib.distEsTableMod.TableHeaderRowRenderer = null,
    headerStyle: js.Any = null,
    height: scala.Int | scala.Double = null,
    id: java.lang.String = null,
    noRowsRenderer: js.Function0[scala.Unit] = null,
    onHeaderClick: js.Function1[
      /* params */ reactDashVirtualizedLib.distEsTableMod.HeaderMouseEventHandlerParams, 
      scala.Unit
    ] = null,
    onRowClick: js.Function1[
      /* info */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ] = null,
    onRowDoubleClick: js.Function1[
      /* info */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ] = null,
    onRowMouseOut: js.Function1[
      /* info */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ] = null,
    onRowMouseOver: js.Function1[
      /* info */ reactDashVirtualizedLib.distEsTableMod.RowMouseEventHandlerParams, 
      scala.Unit
    ] = null,
    onRowsRendered: js.Function1[
      /* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.IndexRange with reactDashVirtualizedLib.reactDashVirtualizedMod.OverscanIndexRange, 
      scala.Unit
    ] = null,
    onScroll: js.Function1[
      /* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.ScrollEventData, 
      scala.Unit
    ] = null,
    overscanRowCount: scala.Int | scala.Double = null,
    rowClassName: java.lang.String | (js.Function1[/* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, java.lang.String]) = null,
    rowGetter: js.Function1[/* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, _] = null,
    rowRenderer: reactDashVirtualizedLib.distEsTableMod.TableRowRenderer = null,
    rowStyle: reactLib.reactMod.ReactNs.CSSProperties | (js.Function1[
      /* info */ reactDashVirtualizedLib.reactDashVirtualizedMod.Index, 
      reactLib.reactMod.ReactNs.CSSProperties
    ]) = null,
    scrollToAlignment: java.lang.String = null,
    scrollToIndex: scala.Int | scala.Double = null,
    scrollTop: scala.Int | scala.Double = null,
    sort: js.Function1[/* info */ Anon_SortBy, scala.Unit] = null,
    sortBy: java.lang.String = null,
    sortDirection: reactDashVirtualizedLib.distEsTableMod.SortDirectionType = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_ArialabelAutoHeightChildren = {
    val __obj = js.Dynamic.literal(headerHeight = headerHeight, rowCount = rowCount, rowHeight = rowHeight.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (deferredMeasurementCache != null) __obj.updateDynamic("deferredMeasurementCache")(deferredMeasurementCache)
    if (!js.isUndefined(disableHeader)) __obj.updateDynamic("disableHeader")(disableHeader)
    if (estimatedRowSize != null) __obj.updateDynamic("estimatedRowSize")(estimatedRowSize.asInstanceOf[js.Any])
    if (gridClassName != null) __obj.updateDynamic("gridClassName")(gridClassName)
    if (gridStyle != null) __obj.updateDynamic("gridStyle")(gridStyle)
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName)
    if (headerRowRenderer != null) __obj.updateDynamic("headerRowRenderer")(headerRowRenderer)
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (noRowsRenderer != null) __obj.updateDynamic("noRowsRenderer")(noRowsRenderer)
    if (onHeaderClick != null) __obj.updateDynamic("onHeaderClick")(onHeaderClick)
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(onRowClick)
    if (onRowDoubleClick != null) __obj.updateDynamic("onRowDoubleClick")(onRowDoubleClick)
    if (onRowMouseOut != null) __obj.updateDynamic("onRowMouseOut")(onRowMouseOut)
    if (onRowMouseOver != null) __obj.updateDynamic("onRowMouseOver")(onRowMouseOver)
    if (onRowsRendered != null) __obj.updateDynamic("onRowsRendered")(onRowsRendered)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (overscanRowCount != null) __obj.updateDynamic("overscanRowCount")(overscanRowCount.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(rowClassName.asInstanceOf[js.Any])
    if (rowGetter != null) __obj.updateDynamic("rowGetter")(rowGetter)
    if (rowRenderer != null) __obj.updateDynamic("rowRenderer")(rowRenderer)
    if (rowStyle != null) __obj.updateDynamic("rowStyle")(rowStyle.asInstanceOf[js.Any])
    if (scrollToAlignment != null) __obj.updateDynamic("scrollToAlignment")(scrollToAlignment)
    if (scrollToIndex != null) __obj.updateDynamic("scrollToIndex")(scrollToIndex.asInstanceOf[js.Any])
    if (scrollTop != null) __obj.updateDynamic("scrollTop")(scrollTop.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (sortBy != null) __obj.updateDynamic("sortBy")(sortBy)
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArialabelAutoHeightChildren]
  }
}

