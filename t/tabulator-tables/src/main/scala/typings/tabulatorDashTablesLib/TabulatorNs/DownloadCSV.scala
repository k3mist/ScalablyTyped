package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadCSV extends js.Object {
  /** If you need the output CSV to include a byte order mark (BOM) to ensure that output with UTF-8 characters can be correctly interpereted across didfferent applications, you should set the bom option to true */
  var bom: js.UndefOr[scala.Boolean] = js.undefined
  /** By default CSV files are created using a comma (,) delimiter. If you need to change this for any reason the you can pass the options object with a delimiter property to the download function which will then use this delimiter instead of the comma. */
  var delimiter: js.UndefOr[tabulatorDashTablesLib.tabulatorDashTablesLibStrings.string] = js.undefined
}

object DownloadCSV {
  @scala.inline
  def apply(
    bom: js.UndefOr[scala.Boolean] = js.undefined,
    delimiter: tabulatorDashTablesLib.tabulatorDashTablesLibStrings.string = null
  ): DownloadCSV = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bom)) __obj.updateDynamic("bom")(bom)
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    __obj.asInstanceOf[DownloadCSV]
  }
}

