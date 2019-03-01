package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridPaging
  extends /**
	 * Option for igTreeGridPaging
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Sets/gets (it is set via  $.html()) delimiter between ancestors in the breadcrumb trail. It is used only when contextRowMode is breadcrumb
  	 *
  	 */
  var breadcrumbDelimiter: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets/gets the column key of ancestor to be shown in the breadcrumb trail. It is used only when contextRowMode is breadcrumb
  	 *
  	 */
  var breadcrumbKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been deprecated as of the 2017.2 Volume release.
  	 * Sets/gets the text message shown while loading content of the context row(while processing breadcrumb/immediate parent row). It is set via $.html(). If set to null loading message is not shown.
  	 * Use option [locale.contextRowLoadingText](ui.igtreegridpaging#options:locale.contextRowLoadingText)
  	 */
  var contextRowLoadingText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * When data flows to the next page there are a couple of different modes that can help communicate the context of a leaf level row. When mode option is "rootLevelOnly" then the context row always shows the value of the contextRowRootText option.
  	 *
  	 *
  	 * Valid values:
  	 * "none" Does not render the contextual row
  	 * "parent" Renders a read-only representation of the immediate parent row
  	 * "breadcrumb" Renders a read-only breadcrumb trail representing the full path through all ancestors
  	 */
  var contextRowMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event fired context row content is rendered.
  	 */
  var contextRowRendered: js.UndefOr[ContextRowRenderedEvent] = js.undefined
  /**
  	 * Event fired before rendering context row content.
  	 * Return false in order to cancel this event.
  	 */
  var contextRowRendering: js.UndefOr[ContextRowRenderingEvent] = js.undefined
  /**
  	 * This option has been deprecated as of the 2017.2 Volume release.
  	 * Sets/gets the content of the context row when the first record in the page is root(hasn't ancestors) record. It is set via $.html()
  	 * Use option [locale.contextRowRootText](ui.igtreegridpaging#options:locale.contextRowRootText)
  	 */
  var contextRowRootText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Leading label text for the drop down from where the page index can be switched. Use option [locale.currentPageDropDownLeadingLabel](ui.iggridpaging#options:locale.currentPageDropDownLeadingLabel).
  	 */
  var currentPageDropDownLeadingLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the page index drop down. Use option [locale.currentPageDropDownTooltip](ui.iggridpaging#options:locale.currentPageDropDownTooltip).
  	 */
  var currentPageDropDownTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Trailing label text for the drop down from where the page index can be switched. Use option [locale.currentPageDropDownTrailingLabel](ui.iggridpaging#options:locale.currentPageDropDownTrailingLabel).
  	 */
  var currentPageDropDownTrailingLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Current page index that's bound in the data source and rendered in the UI.
  	 *
  	 */
  var currentPageIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Drop down width for the page size and page index drop downs.
  	 *
  	 */
  var defaultDropDownWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Time in milliseconds for which page drop down will wait for keystrokes before changing the page.
  	 *
  	 */
  var delayOnPageChanged: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text for the first page label. Use option [locale.firstPageLabelText](ui.iggridpaging#options:locale.firstPageLabelText).
  	 */
  var firstPageLabelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the first page button. Use option [locale.firstPageTooltip](ui.iggridpaging#options:locale.firstPageTooltip).
  	 */
  var firstPageTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
  	 */
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text for the last page label. Use option [locale.lastPageLabelText](ui.iggridpaging#options:locale.lastPageLabelText).
  	 */
  var lastPageLabelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the last page button. Use option [locale.lastPageTooltip](ui.iggridpaging#options:locale.lastPageTooltip).
  	 */
  var lastPageTooltip: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[IgTreeGridPagingLocale] = js.undefined
  /**
  	 * Sets gets paging mode.
  	 *
  	 *
  	 * Valid values:
  	 * "rootLevelOnly" Only pages records at the root of the tree grid are displayed.
  	 * "allLevels" includes all visible records in paging.
  	 */
  var mode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text for the next page label. Use option [locale.nextPageLabelText](ui.iggridpaging#options:locale.nextPageLabelText).
  	 */
  var nextPageLabelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the next page button. Use option [locale.nextPageTooltip](ui.iggridpaging#options:locale.nextPageTooltip).
  	 */
  var nextPageTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Sets/Gets the number of pages which if exceeded a drop down list of page indices is displayed. If the number of pages is less than or equal to this option then buttons for each page are displayed.
  	 *
  	 */
  var pageCountLimit: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Event fired after the page index is changed , but before grid data rebinds
  	 */
  var pageIndexChanged: js.UndefOr[PageIndexChangedEvent] = js.undefined
  /**
  	 * Event fired before the page index is changed.
  	 * Return false in order to cancel page index changing.
  	 */
  var pageIndexChanging: js.UndefOr[PageIndexChangingEvent] = js.undefined
  /**
  	 * Denotes the name of the encoded URL parameter that will state what is the currently requested page index.
  	 *
  	 */
  var pageIndexUrlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Number of records loaded and displayed per page.
  	 *
  	 */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Event fired after the page size is changed from the page size dropdown.
  	 */
  var pageSizeChanged: js.UndefOr[PageSizeChangedEvent] = js.undefined
  /**
  	 * Event fired when the page size is about to be changed from the page size dropdown.
  	 * Return false in order to cancel page size changing.
  	 */
  var pageSizeChanging: js.UndefOr[PageSizeChangingEvent] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text rendered in front of the page size dropdown, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true.
  	 * Use option [locale.pageSizeDropDownLabel](ui.iggridpaging#options:locale.pageSizeDropDownLabel).
  	 */
  var pageSizeDropDownLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Page size dropdown location, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true. Can be rendered above the grid header or inside the pager, next to the page links.
  	 *
  	 *
  	 * Valid values:
  	 * "above" The page size drop down will be rendered above the grid header.
  	 * "inpager" The page size drop down will be rendered next to page links.
  	 */
  var pageSizeDropDownLocation: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the page size drop down. Use option [locale.pageSizeDropDownTooltip](ui.iggridpaging#options:locale.pageSizeDropDownTooltip).
  	 */
  var pageSizeDropDownTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Trailing text for the page size dropdown, when [showPageSizeDropDown](ui.iggridpaging#options:showPageSizeDropDown) is set to true.
  	 * Use option [locale.pageSizeDropDownTrailingLabel](ui.iggridpaging#options:locale.pageSizeDropDownTrailingLabel).
  	 */
  var pageSizeDropDownTrailingLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Predefined page sizes that are available to the end user to switch their grid paging to, through a drop down in the grid header.
  	 *
  	 */
  var pageSizeList: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Denotes the name of the encoded URL parameter that will state what is the currently requested page size.
  	 *
  	 */
  var pageSizeUrlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text templates of buttons that navigate to a particular page. The format string follows the [igTemplating](http://www.igniteui.com/help/igtemplating-overview) style and syntax. See also the [pageCountLimit](ui.iggridpaging#options:pageCountLimit) option.
  	 * Use option [locale.pageTooltipFormat](ui.iggridpaging#options:locale.pageTooltipFormat).
  	 */
  var pageTooltipFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Custom pager records label template - in [igTemplating](http://www.igniteui.com/help/igtemplating-overview) style and syntax.
  	 * Use option [locale.pagerRecordsLabelTemplate](ui.iggridpaging#options:locale.pagerRecordsLabelTemplate).
  	 */
  var pagerRecordsLabelTemplate: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the pager records label. Use option [locale.pagerRecordsLabelTooltip](ui.iggridpaging#options:locale.pagerRecordsLabelTooltip).
  	 */
  var pagerRecordsLabelTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Event fired after the pager footer is rendered
  	 */
  var pagerRendered: js.UndefOr[PagerRenderedEvent] = js.undefined
  /**
  	 * Event fired before the pager footer is rendered (the whole area below the grid records).
  	 *  Event fired after the page size is changed from the page size dropdown.
  	 */
  var pagerRendering: js.UndefOr[PagerRenderingEvent] = js.undefined
  /**
  	 * Enables/disables paging persistence between states.
  	 *
  	 */
  var persist: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Text for the previous page label. Use option [locale.prevPageLabelText](ui.iggridpaging#options:locale.prevPageLabelText).
  	 */
  var prevPageLabelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * This option has been removed as of 2017.2 Volume release.
  	 * Tooltip text for the previous page button. Use option [locale.prevPageTooltip](ui.iggridpaging#options:locale.prevPageTooltip).
  	 */
  var prevPageTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The property in the response data, when using remote data source, that will hold the total number of records in the data source.
  	 *
  	 */
  var recordCountKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Reference to the (or name of )function, called before rendering context row content(rendering loading message/bread crumb/parent row). The function takes 4 arguments- dataRow, $textArea- jQuery representation of the text area of the context row(when mode is loading/breadcrumb then it is <span /> otherwise <tr />), array of parent rows and context mode - "loading"|"breadcrumb"|"parent". When the function returns string it is used as html set in $textArea. If the function does not return result or returns false/empty string then rendering of the content of the context row should be handled by the developer(similar to canceling rendering of context row content).
  	 *
  	 */
  var renderContextRowFunc: js.UndefOr[js.Function | java.lang.String] = js.undefined
  /**
  	 * Option specifying whether to render the first and last page navigation buttons.
  	 *
  	 */
  var showFirstLastPages: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * If false, a dropdown allowing to change the page size will not be rendered in the UI.
  	 *
  	 */
  var showPageSizeDropDown: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Option specifying whether to show summary label for the currently rendered records or not.
  	 *
  	 */
  var showPagerRecordsLabel: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Option specifying whether to render the previous and next page navigation buttons.
  	 *
  	 */
  var showPrevNextPages: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Type of paging. Delegates all paging functionality to the [$.ig.DataSource](ig.datasource).
  	 *
  	 *
  	 * Valid values:
  	 * "remote" Paging is performed by a remote end-point.
  	 * "local" Paging is performed locally by the [$.ig.DataSource](ig.datasource).
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Number of page buttons, adjacent to and including the [active page](ui.iggridpaging#options:currentPageIndex), that are constantly visible. For the invisible pages, previous and next buttons are used.
  	 *
  	 */
  var visiblePageCount: js.UndefOr[scala.Double] = js.undefined
}

object IgTreeGridPaging {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igTreeGridPaging
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    breadcrumbDelimiter: java.lang.String = null,
    breadcrumbKey: java.lang.String = null,
    contextRowLoadingText: java.lang.String = null,
    contextRowMode: java.lang.String = null,
    contextRowRendered: ContextRowRenderedEvent = null,
    contextRowRendering: ContextRowRenderingEvent = null,
    contextRowRootText: java.lang.String = null,
    currentPageDropDownLeadingLabel: java.lang.String = null,
    currentPageDropDownTooltip: java.lang.String = null,
    currentPageDropDownTrailingLabel: java.lang.String = null,
    currentPageIndex: scala.Int | scala.Double = null,
    defaultDropDownWidth: scala.Int | scala.Double = null,
    delayOnPageChanged: scala.Int | scala.Double = null,
    firstPageLabelText: java.lang.String = null,
    firstPageTooltip: java.lang.String = null,
    inherit: js.UndefOr[scala.Boolean] = js.undefined,
    lastPageLabelText: java.lang.String = null,
    lastPageTooltip: java.lang.String = null,
    locale: IgTreeGridPagingLocale = null,
    mode: java.lang.String = null,
    nextPageLabelText: java.lang.String = null,
    nextPageTooltip: java.lang.String = null,
    pageCountLimit: scala.Int | scala.Double = null,
    pageIndexChanged: PageIndexChangedEvent = null,
    pageIndexChanging: PageIndexChangingEvent = null,
    pageIndexUrlKey: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    pageSizeChanged: PageSizeChangedEvent = null,
    pageSizeChanging: PageSizeChangingEvent = null,
    pageSizeDropDownLabel: java.lang.String = null,
    pageSizeDropDownLocation: java.lang.String = null,
    pageSizeDropDownTooltip: java.lang.String = null,
    pageSizeDropDownTrailingLabel: java.lang.String = null,
    pageSizeList: js.Any = null,
    pageSizeUrlKey: java.lang.String = null,
    pageTooltipFormat: java.lang.String = null,
    pagerRecordsLabelTemplate: java.lang.String = null,
    pagerRecordsLabelTooltip: java.lang.String = null,
    pagerRendered: PagerRenderedEvent = null,
    pagerRendering: PagerRenderingEvent = null,
    persist: js.UndefOr[scala.Boolean] = js.undefined,
    prevPageLabelText: java.lang.String = null,
    prevPageTooltip: java.lang.String = null,
    recordCountKey: java.lang.String = null,
    renderContextRowFunc: js.Function | java.lang.String = null,
    showFirstLastPages: js.UndefOr[scala.Boolean] = js.undefined,
    showPageSizeDropDown: js.UndefOr[scala.Boolean] = js.undefined,
    showPagerRecordsLabel: js.UndefOr[scala.Boolean] = js.undefined,
    showPrevNextPages: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    visiblePageCount: scala.Int | scala.Double = null
  ): IgTreeGridPaging = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (breadcrumbDelimiter != null) __obj.updateDynamic("breadcrumbDelimiter")(breadcrumbDelimiter)
    if (breadcrumbKey != null) __obj.updateDynamic("breadcrumbKey")(breadcrumbKey)
    if (contextRowLoadingText != null) __obj.updateDynamic("contextRowLoadingText")(contextRowLoadingText)
    if (contextRowMode != null) __obj.updateDynamic("contextRowMode")(contextRowMode)
    if (contextRowRendered != null) __obj.updateDynamic("contextRowRendered")(contextRowRendered)
    if (contextRowRendering != null) __obj.updateDynamic("contextRowRendering")(contextRowRendering)
    if (contextRowRootText != null) __obj.updateDynamic("contextRowRootText")(contextRowRootText)
    if (currentPageDropDownLeadingLabel != null) __obj.updateDynamic("currentPageDropDownLeadingLabel")(currentPageDropDownLeadingLabel)
    if (currentPageDropDownTooltip != null) __obj.updateDynamic("currentPageDropDownTooltip")(currentPageDropDownTooltip)
    if (currentPageDropDownTrailingLabel != null) __obj.updateDynamic("currentPageDropDownTrailingLabel")(currentPageDropDownTrailingLabel)
    if (currentPageIndex != null) __obj.updateDynamic("currentPageIndex")(currentPageIndex.asInstanceOf[js.Any])
    if (defaultDropDownWidth != null) __obj.updateDynamic("defaultDropDownWidth")(defaultDropDownWidth.asInstanceOf[js.Any])
    if (delayOnPageChanged != null) __obj.updateDynamic("delayOnPageChanged")(delayOnPageChanged.asInstanceOf[js.Any])
    if (firstPageLabelText != null) __obj.updateDynamic("firstPageLabelText")(firstPageLabelText)
    if (firstPageTooltip != null) __obj.updateDynamic("firstPageTooltip")(firstPageTooltip)
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit)
    if (lastPageLabelText != null) __obj.updateDynamic("lastPageLabelText")(lastPageLabelText)
    if (lastPageTooltip != null) __obj.updateDynamic("lastPageTooltip")(lastPageTooltip)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (nextPageLabelText != null) __obj.updateDynamic("nextPageLabelText")(nextPageLabelText)
    if (nextPageTooltip != null) __obj.updateDynamic("nextPageTooltip")(nextPageTooltip)
    if (pageCountLimit != null) __obj.updateDynamic("pageCountLimit")(pageCountLimit.asInstanceOf[js.Any])
    if (pageIndexChanged != null) __obj.updateDynamic("pageIndexChanged")(pageIndexChanged)
    if (pageIndexChanging != null) __obj.updateDynamic("pageIndexChanging")(pageIndexChanging)
    if (pageIndexUrlKey != null) __obj.updateDynamic("pageIndexUrlKey")(pageIndexUrlKey)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageSizeChanged != null) __obj.updateDynamic("pageSizeChanged")(pageSizeChanged)
    if (pageSizeChanging != null) __obj.updateDynamic("pageSizeChanging")(pageSizeChanging)
    if (pageSizeDropDownLabel != null) __obj.updateDynamic("pageSizeDropDownLabel")(pageSizeDropDownLabel)
    if (pageSizeDropDownLocation != null) __obj.updateDynamic("pageSizeDropDownLocation")(pageSizeDropDownLocation)
    if (pageSizeDropDownTooltip != null) __obj.updateDynamic("pageSizeDropDownTooltip")(pageSizeDropDownTooltip)
    if (pageSizeDropDownTrailingLabel != null) __obj.updateDynamic("pageSizeDropDownTrailingLabel")(pageSizeDropDownTrailingLabel)
    if (pageSizeList != null) __obj.updateDynamic("pageSizeList")(pageSizeList)
    if (pageSizeUrlKey != null) __obj.updateDynamic("pageSizeUrlKey")(pageSizeUrlKey)
    if (pageTooltipFormat != null) __obj.updateDynamic("pageTooltipFormat")(pageTooltipFormat)
    if (pagerRecordsLabelTemplate != null) __obj.updateDynamic("pagerRecordsLabelTemplate")(pagerRecordsLabelTemplate)
    if (pagerRecordsLabelTooltip != null) __obj.updateDynamic("pagerRecordsLabelTooltip")(pagerRecordsLabelTooltip)
    if (pagerRendered != null) __obj.updateDynamic("pagerRendered")(pagerRendered)
    if (pagerRendering != null) __obj.updateDynamic("pagerRendering")(pagerRendering)
    if (!js.isUndefined(persist)) __obj.updateDynamic("persist")(persist)
    if (prevPageLabelText != null) __obj.updateDynamic("prevPageLabelText")(prevPageLabelText)
    if (prevPageTooltip != null) __obj.updateDynamic("prevPageTooltip")(prevPageTooltip)
    if (recordCountKey != null) __obj.updateDynamic("recordCountKey")(recordCountKey)
    if (renderContextRowFunc != null) __obj.updateDynamic("renderContextRowFunc")(renderContextRowFunc.asInstanceOf[js.Any])
    if (!js.isUndefined(showFirstLastPages)) __obj.updateDynamic("showFirstLastPages")(showFirstLastPages)
    if (!js.isUndefined(showPageSizeDropDown)) __obj.updateDynamic("showPageSizeDropDown")(showPageSizeDropDown)
    if (!js.isUndefined(showPagerRecordsLabel)) __obj.updateDynamic("showPagerRecordsLabel")(showPagerRecordsLabel)
    if (!js.isUndefined(showPrevNextPages)) __obj.updateDynamic("showPrevNextPages")(showPrevNextPages)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (visiblePageCount != null) __obj.updateDynamic("visiblePageCount")(visiblePageCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgTreeGridPaging]
  }
}

