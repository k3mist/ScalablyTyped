package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Report extends js.Object {
  /** The averages of the report. This is the same length as any other row in the report; cells corresponding to dimension columns are empty. */
  var averages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The header information of the columns requested in the report. This is a list of headers; one for each dimension in the request, followed by one for
    * each metric in the request.
    */
  var headers: js.UndefOr[js.Array[gapiDotClientDotAdexchangesellerLib.Anon_Currency]] = js.undefined
  /** Kind this is, in this case adexchangeseller#report. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The output rows of the report. Each row is a list of cells; one for each dimension in the request, followed by one for each metric in the request. The
    * dimension cells contain strings, and the metric cells contain numbers.
    */
  var rows: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  /**
    * The total number of rows matched by the report request. Fewer rows may be returned in the response due to being limited by the row count requested or
    * the report row limit.
    */
  var totalMatchedRows: js.UndefOr[java.lang.String] = js.undefined
  /** The totals of the report. This is the same length as any other row in the report; cells corresponding to dimension columns are empty. */
  var totals: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Any warnings associated with generation of the report. */
  var warnings: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Report {
  @scala.inline
  def apply(
    averages: js.Array[java.lang.String] = null,
    headers: js.Array[gapiDotClientDotAdexchangesellerLib.Anon_Currency] = null,
    kind: java.lang.String = null,
    rows: js.Array[js.Array[java.lang.String]] = null,
    totalMatchedRows: java.lang.String = null,
    totals: js.Array[java.lang.String] = null,
    warnings: js.Array[java.lang.String] = null
  ): Report = {
    val __obj = js.Dynamic.literal()
    if (averages != null) __obj.updateDynamic("averages")(averages)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (totalMatchedRows != null) __obj.updateDynamic("totalMatchedRows")(totalMatchedRows)
    if (totals != null) __obj.updateDynamic("totals")(totals)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[Report]
  }
}

