package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGroup extends js.Object {
  /** True if the pivot table should include the totals for this grouping. */
  var showTotals: js.UndefOr[scala.Boolean] = js.undefined
  /** The order the values in this group should be sorted. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The column offset of the source range that this grouping is based on.
    *
    * For example, if the source was `C10:E15`, a `sourceColumnOffset` of `0`
    * means this group refers to column `C`, whereas the offset `1` would refer
    * to column `D`.
    */
  var sourceColumnOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The bucket of the opposite pivot group to sort by.
    * If not specified, sorting is alphabetical by this group's values.
    */
  var valueBucket: js.UndefOr[PivotGroupSortValueBucket] = js.undefined
  /** Metadata about values in the grouping. */
  var valueMetadata: js.UndefOr[js.Array[PivotGroupValueMetadata]] = js.undefined
}

object PivotGroup {
  @scala.inline
  def apply(
    showTotals: js.UndefOr[scala.Boolean] = js.undefined,
    sortOrder: java.lang.String = null,
    sourceColumnOffset: scala.Int | scala.Double = null,
    valueBucket: PivotGroupSortValueBucket = null,
    valueMetadata: js.Array[PivotGroupValueMetadata] = null
  ): PivotGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showTotals)) __obj.updateDynamic("showTotals")(showTotals)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    if (sourceColumnOffset != null) __obj.updateDynamic("sourceColumnOffset")(sourceColumnOffset.asInstanceOf[js.Any])
    if (valueBucket != null) __obj.updateDynamic("valueBucket")(valueBucket)
    if (valueMetadata != null) __obj.updateDynamic("valueMetadata")(valueMetadata)
    __obj.asInstanceOf[PivotGroup]
  }
}

