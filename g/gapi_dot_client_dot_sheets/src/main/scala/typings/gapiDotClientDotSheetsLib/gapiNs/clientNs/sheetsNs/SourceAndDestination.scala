package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceAndDestination extends js.Object {
  /** The dimension that data should be filled into. */
  var dimension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of rows or columns that data should be filled into.
    * Positive numbers expand beyond the last row or last column
    * of the source.  Negative numbers expand before the first row
    * or first column of the source.
    */
  var fillLength: js.UndefOr[scala.Double] = js.undefined
  /** The location of the data to use as the source of the autofill. */
  var source: js.UndefOr[GridRange] = js.undefined
}

object SourceAndDestination {
  @scala.inline
  def apply(
    dimension: java.lang.String = null,
    fillLength: scala.Int | scala.Double = null,
    source: GridRange = null
  ): SourceAndDestination = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension)
    if (fillLength != null) __obj.updateDynamic("fillLength")(fillLength.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[SourceAndDestination]
  }
}

