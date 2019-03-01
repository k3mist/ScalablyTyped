package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterView extends js.Object {
  /**
    * The criteria for showing/hiding values per column.
    * The map's key is the column index, and the value is the criteria for
    * that column.
    */
  var criteria: js.UndefOr[stdLib.Record[java.lang.String, FilterCriteria]] = js.undefined
  /** The ID of the filter view. */
  var filterViewId: js.UndefOr[scala.Double] = js.undefined
  /**
    * The named range this filter view is backed by, if any.
    *
    * When writing, only one of range or named_range_id
    * may be set.
    */
  var namedRangeId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The range this filter view covers.
    *
    * When writing, only one of range or named_range_id
    * may be set.
    */
  var range: js.UndefOr[GridRange] = js.undefined
  /**
    * The sort order per column. Later specifications are used when values
    * are equal in the earlier specifications.
    */
  var sortSpecs: js.UndefOr[js.Array[SortSpec]] = js.undefined
  /** The name of the filter view. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object FilterView {
  @scala.inline
  def apply(
    criteria: stdLib.Record[java.lang.String, FilterCriteria] = null,
    filterViewId: scala.Int | scala.Double = null,
    namedRangeId: java.lang.String = null,
    range: GridRange = null,
    sortSpecs: js.Array[SortSpec] = null,
    title: java.lang.String = null
  ): FilterView = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria)
    if (filterViewId != null) __obj.updateDynamic("filterViewId")(filterViewId.asInstanceOf[js.Any])
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId)
    if (range != null) __obj.updateDynamic("range")(range)
    if (sortSpecs != null) __obj.updateDynamic("sortSpecs")(sortSpecs)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[FilterView]
  }
}

