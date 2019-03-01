package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sheet extends js.Object {
  /** The banded (i.e. alternating colors) ranges on this sheet. */
  var bandedRanges: js.UndefOr[js.Array[BandedRange]] = js.undefined
  /** The filter on this sheet, if any. */
  var basicFilter: js.UndefOr[BasicFilter] = js.undefined
  /** The specifications of every chart on this sheet. */
  var charts: js.UndefOr[js.Array[EmbeddedChart]] = js.undefined
  /** The conditional format rules in this sheet. */
  var conditionalFormats: js.UndefOr[js.Array[ConditionalFormatRule]] = js.undefined
  /**
    * Data in the grid, if this is a grid sheet.
    * The number of GridData objects returned is dependent on the number of
    * ranges requested on this sheet. For example, if this is representing
    * `Sheet1`, and the spreadsheet was requested with ranges
    * `Sheet1!A1:C10` and `Sheet1!D15:E20`, then the first GridData will have a
    * startRow/startColumn of `0`,
    * while the second one will have `startRow 14` (zero-based row 15),
    * and `startColumn 3` (zero-based column D).
    */
  var data: js.UndefOr[js.Array[GridData]] = js.undefined
  /** The developer metadata associated with a sheet. */
  var developerMetadata: js.UndefOr[js.Array[DeveloperMetadata]] = js.undefined
  /** The filter views in this sheet. */
  var filterViews: js.UndefOr[js.Array[FilterView]] = js.undefined
  /** The ranges that are merged together. */
  var merges: js.UndefOr[js.Array[GridRange]] = js.undefined
  /** The properties of the sheet. */
  var properties: js.UndefOr[SheetProperties] = js.undefined
  /** The protected ranges in this sheet. */
  var protectedRanges: js.UndefOr[js.Array[ProtectedRange]] = js.undefined
}

object Sheet {
  @scala.inline
  def apply(
    bandedRanges: js.Array[BandedRange] = null,
    basicFilter: BasicFilter = null,
    charts: js.Array[EmbeddedChart] = null,
    conditionalFormats: js.Array[ConditionalFormatRule] = null,
    data: js.Array[GridData] = null,
    developerMetadata: js.Array[DeveloperMetadata] = null,
    filterViews: js.Array[FilterView] = null,
    merges: js.Array[GridRange] = null,
    properties: SheetProperties = null,
    protectedRanges: js.Array[ProtectedRange] = null
  ): Sheet = {
    val __obj = js.Dynamic.literal()
    if (bandedRanges != null) __obj.updateDynamic("bandedRanges")(bandedRanges)
    if (basicFilter != null) __obj.updateDynamic("basicFilter")(basicFilter)
    if (charts != null) __obj.updateDynamic("charts")(charts)
    if (conditionalFormats != null) __obj.updateDynamic("conditionalFormats")(conditionalFormats)
    if (data != null) __obj.updateDynamic("data")(data)
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata)
    if (filterViews != null) __obj.updateDynamic("filterViews")(filterViews)
    if (merges != null) __obj.updateDynamic("merges")(merges)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (protectedRanges != null) __obj.updateDynamic("protectedRanges")(protectedRanges)
    __obj.asInstanceOf[Sheet]
  }
}

