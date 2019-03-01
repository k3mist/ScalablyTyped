package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageSetup extends js.Object {
  /**
  	 * Print without colour
  	 *
  	 * false by default
  	 */
  var blackAndWhite: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Where to place comments
  	 *
  	 * Default is `None`
  	 */
  var cellComments: js.UndefOr[
    exceljsLib.exceljsLibStrings.atEnd | exceljsLib.exceljsLibStrings.asDisplayed | exceljsLib.exceljsLibStrings.None
  ] = js.undefined
  /**
  	 * Print with less quality (and ink)
  	 *
  	 * false by default
  	 */
  var draft: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Where to show errors
  	 *
  	 * Default is `displayed`
  	 */
  var errors: js.UndefOr[
    exceljsLib.exceljsLibStrings.dash | exceljsLib.exceljsLibStrings.blank | exceljsLib.exceljsLibStrings.NA | exceljsLib.exceljsLibStrings.displayed
  ] = js.undefined
  /**
  	 * Which number to use for the first page
  	 */
  var firstPageNumber: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * How many pages high the sheet should print on to. Active when fitToPage is true
  	 *
  	 * Default is 1
  	 */
  var fitToHeight: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Whether to use fitToWidth and fitToHeight or scale settings.
  	 *
  	 * Default is based on presence of these settings in the pageSetup object - if both are present,
  	 * scale wins (i.e. default will be false)
  	 */
  var fitToPage: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * How many pages wide the sheet should print on to. Active when fitToPage is true
  	 *
  	 * Default is 1
  	 */
  var fitToWidth: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * 	Whether to center the sheet data horizontally, `false` by default
  	 */
  var horizontalCentered: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Horizontal Dots per Inch. Default value is 4294967295
  	 */
  var horizontalDpi: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Whitespace on the borders of the page. Units are inches.
  	 */
  var margins: js.UndefOr[Margins] = js.undefined
  /**
  	 * Orientation of the page - i.e. taller (`'portrait'`) or wider (`'landscape'`).
  	 *
  	 * `'portrait'` by default
  	 */
  var orientation: js.UndefOr[exceljsLib.exceljsLibStrings.portrait | exceljsLib.exceljsLibStrings.landscape] = js.undefined
  /**
  	 * Which order to print the pages.
  	 *
  	 * Default is `downThenOver`
  	 */
  var pageOrder: js.UndefOr[
    exceljsLib.exceljsLibStrings.downThenOver | exceljsLib.exceljsLibStrings.overThenDown
  ] = js.undefined
  /**
  	 * 	What paper size to use (see below)
  	 *
  	 * | Name                          | Value       |
  	 * | ----------------------------- | ---------   |
  	 * | Letter                        | `undefined` |
  	 * | Legal                         |  `5`        |
  	 * | Executive                     |  `7`        |
  	 * | A4                            |  `9`        |
  	 * | A5                            |  `11`       |
  	 * | B5 (JIS)                      |  `13`       |
  	 * | Envelope #10                  |  `20`       |
  	 * | Envelope DL                   |  `27`       |
  	 * | Envelope C5                   |  `28`       |
  	 * | Envelope B5                   |  `34`       |
  	 * | Envelope Monarch              |  `37`       |
  	 * | Double Japan Postcard Rotated |  `82`       |
  	 * | 16K 197x273 mm                |  `119`      |
  	 */
  var paperSize: js.UndefOr[PaperSize] = js.undefined
  /**
  	 * Set Print Area for a sheet, e.g. `'A1:G20'`
  	 */
  var printArea: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Repeat specific rows on every printed page, e.g. `'1:3'`
  	 */
  var printTitlesRow: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Percentage value to increase or reduce the size of the print. Active when fitToPage is false
  	 *
  	 * Default is 100
  	 */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Whether to show grid lines, `false` by default
  	 */
  var showGridLines: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Whether to show the row numbers and column letters, `false` by default
  	 */
  var showRowColHeaders: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * 	Whether to center the sheet data vertically, `false` by default
  	 */
  var verticalCentered: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Vertical Dots per Inch. Default value is 4294967295
  	 */
  var verticalDpi: js.UndefOr[scala.Double] = js.undefined
}

object PageSetup {
  @scala.inline
  def apply(
    blackAndWhite: js.UndefOr[scala.Boolean] = js.undefined,
    cellComments: exceljsLib.exceljsLibStrings.atEnd | exceljsLib.exceljsLibStrings.asDisplayed | exceljsLib.exceljsLibStrings.None = null,
    draft: js.UndefOr[scala.Boolean] = js.undefined,
    errors: exceljsLib.exceljsLibStrings.dash | exceljsLib.exceljsLibStrings.blank | exceljsLib.exceljsLibStrings.NA | exceljsLib.exceljsLibStrings.displayed = null,
    firstPageNumber: scala.Int | scala.Double = null,
    fitToHeight: scala.Int | scala.Double = null,
    fitToPage: js.UndefOr[scala.Boolean] = js.undefined,
    fitToWidth: scala.Int | scala.Double = null,
    horizontalCentered: js.UndefOr[scala.Boolean] = js.undefined,
    horizontalDpi: scala.Int | scala.Double = null,
    margins: Margins = null,
    orientation: exceljsLib.exceljsLibStrings.portrait | exceljsLib.exceljsLibStrings.landscape = null,
    pageOrder: exceljsLib.exceljsLibStrings.downThenOver | exceljsLib.exceljsLibStrings.overThenDown = null,
    paperSize: PaperSize = null,
    printArea: java.lang.String = null,
    printTitlesRow: java.lang.String = null,
    scale: scala.Int | scala.Double = null,
    showGridLines: js.UndefOr[scala.Boolean] = js.undefined,
    showRowColHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    verticalCentered: js.UndefOr[scala.Boolean] = js.undefined,
    verticalDpi: scala.Int | scala.Double = null
  ): PageSetup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blackAndWhite)) __obj.updateDynamic("blackAndWhite")(blackAndWhite)
    if (cellComments != null) __obj.updateDynamic("cellComments")(cellComments.asInstanceOf[js.Any])
    if (!js.isUndefined(draft)) __obj.updateDynamic("draft")(draft)
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (firstPageNumber != null) __obj.updateDynamic("firstPageNumber")(firstPageNumber.asInstanceOf[js.Any])
    if (fitToHeight != null) __obj.updateDynamic("fitToHeight")(fitToHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(fitToPage)) __obj.updateDynamic("fitToPage")(fitToPage)
    if (fitToWidth != null) __obj.updateDynamic("fitToWidth")(fitToWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalCentered)) __obj.updateDynamic("horizontalCentered")(horizontalCentered)
    if (horizontalDpi != null) __obj.updateDynamic("horizontalDpi")(horizontalDpi.asInstanceOf[js.Any])
    if (margins != null) __obj.updateDynamic("margins")(margins)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (pageOrder != null) __obj.updateDynamic("pageOrder")(pageOrder.asInstanceOf[js.Any])
    if (paperSize != null) __obj.updateDynamic("paperSize")(paperSize)
    if (printArea != null) __obj.updateDynamic("printArea")(printArea)
    if (printTitlesRow != null) __obj.updateDynamic("printTitlesRow")(printTitlesRow)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (!js.isUndefined(showGridLines)) __obj.updateDynamic("showGridLines")(showGridLines)
    if (!js.isUndefined(showRowColHeaders)) __obj.updateDynamic("showRowColHeaders")(showRowColHeaders)
    if (!js.isUndefined(verticalCentered)) __obj.updateDynamic("verticalCentered")(verticalCentered)
    if (verticalDpi != null) __obj.updateDynamic("verticalDpi")(verticalDpi.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSetup]
  }
}

