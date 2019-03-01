package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFilterValueRange extends js.Object {
  /** The data filter describing the location of the values in the spreadsheet. */
  var dataFilter: js.UndefOr[DataFilter] = js.undefined
  /** The major dimension of the values. */
  var majorDimension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The data to be written.  If the provided values exceed any of the ranges
    * matched by the data filter then the request will fail.  If the provided
    * values are less than the matched ranges only the specified values will be
    * written, existing values in the matched ranges will remain unaffected.
    */
  var values: js.UndefOr[js.Array[js.Array[_]]] = js.undefined
}

object DataFilterValueRange {
  @scala.inline
  def apply(
    dataFilter: DataFilter = null,
    majorDimension: java.lang.String = null,
    values: js.Array[js.Array[_]] = null
  ): DataFilterValueRange = {
    val __obj = js.Dynamic.literal()
    if (dataFilter != null) __obj.updateDynamic("dataFilter")(dataFilter)
    if (majorDimension != null) __obj.updateDynamic("majorDimension")(majorDimension)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[DataFilterValueRange]
  }
}

