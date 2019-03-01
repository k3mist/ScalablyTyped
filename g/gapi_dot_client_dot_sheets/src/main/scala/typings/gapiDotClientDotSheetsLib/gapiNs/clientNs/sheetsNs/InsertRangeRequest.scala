package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertRangeRequest extends js.Object {
  /** The range to insert new cells into. */
  var range: js.UndefOr[GridRange] = js.undefined
  /**
    * The dimension which will be shifted when inserting cells.
    * If ROWS, existing cells will be shifted down.
    * If COLUMNS, existing cells will be shifted right.
    */
  var shiftDimension: js.UndefOr[java.lang.String] = js.undefined
}

object InsertRangeRequest {
  @scala.inline
  def apply(range: GridRange = null, shiftDimension: java.lang.String = null): InsertRangeRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range)
    if (shiftDimension != null) __obj.updateDynamic("shiftDimension")(shiftDimension)
    __obj.asInstanceOf[InsertRangeRequest]
  }
}

