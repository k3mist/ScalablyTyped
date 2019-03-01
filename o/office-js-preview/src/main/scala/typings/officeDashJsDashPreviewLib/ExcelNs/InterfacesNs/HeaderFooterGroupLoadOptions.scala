package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait HeaderFooterGroupLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * The general header/footer, used for all pages unless even/odd or first page is specified.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var defaultForAllPages: js.UndefOr[HeaderFooterLoadOptions] = js.undefined
  /**
    *
    * The header/footer to use for even pages, odd header/footer needs to be specified for odd pages.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var evenPages: js.UndefOr[HeaderFooterLoadOptions] = js.undefined
  /**
    *
    * The first page header/footer, for all other pages general or even/odd is used.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var firstPage: js.UndefOr[HeaderFooterLoadOptions] = js.undefined
  /**
    *
    * The header/footer to use for odd pages, even header/footer needs to be specified for even pages.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var oddPages: js.UndefOr[HeaderFooterLoadOptions] = js.undefined
  /**
    *
    * Gets or sets the state of which headers/footers are set. See Excel.HeaderFooterState for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var state: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets a flag indicating if headers/footers are aligned with the page margins set in the page layout options for the worksheet.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var useSheetMargins: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets or sets a flag indicating if headers/footers should be scaled by the page percentage scale set in the page layout options for the worksheet.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var useSheetScale: js.UndefOr[scala.Boolean] = js.undefined
}

object HeaderFooterGroupLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    defaultForAllPages: HeaderFooterLoadOptions = null,
    evenPages: HeaderFooterLoadOptions = null,
    firstPage: HeaderFooterLoadOptions = null,
    oddPages: HeaderFooterLoadOptions = null,
    state: js.UndefOr[scala.Boolean] = js.undefined,
    useSheetMargins: js.UndefOr[scala.Boolean] = js.undefined,
    useSheetScale: js.UndefOr[scala.Boolean] = js.undefined
  ): HeaderFooterGroupLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (defaultForAllPages != null) __obj.updateDynamic("defaultForAllPages")(defaultForAllPages)
    if (evenPages != null) __obj.updateDynamic("evenPages")(evenPages)
    if (firstPage != null) __obj.updateDynamic("firstPage")(firstPage)
    if (oddPages != null) __obj.updateDynamic("oddPages")(oddPages)
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state)
    if (!js.isUndefined(useSheetMargins)) __obj.updateDynamic("useSheetMargins")(useSheetMargins)
    if (!js.isUndefined(useSheetScale)) __obj.updateDynamic("useSheetScale")(useSheetScale)
    __obj.asInstanceOf[HeaderFooterGroupLoadOptions]
  }
}

