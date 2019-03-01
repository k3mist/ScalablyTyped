package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  /** A reply from adding a banded range. */
  var addBanding: js.UndefOr[AddBandingResponse] = js.undefined
  /** A reply from adding a chart. */
  var addChart: js.UndefOr[AddChartResponse] = js.undefined
  /** A reply from adding a filter view. */
  var addFilterView: js.UndefOr[AddFilterViewResponse] = js.undefined
  /** A reply from adding a named range. */
  var addNamedRange: js.UndefOr[AddNamedRangeResponse] = js.undefined
  /** A reply from adding a protected range. */
  var addProtectedRange: js.UndefOr[AddProtectedRangeResponse] = js.undefined
  /** A reply from adding a sheet. */
  var addSheet: js.UndefOr[AddSheetResponse] = js.undefined
  /** A reply from creating a developer metadata entry. */
  var createDeveloperMetadata: js.UndefOr[CreateDeveloperMetadataResponse] = js.undefined
  /** A reply from deleting a conditional format rule. */
  var deleteConditionalFormatRule: js.UndefOr[DeleteConditionalFormatRuleResponse] = js.undefined
  /** A reply from deleting a developer metadata entry. */
  var deleteDeveloperMetadata: js.UndefOr[DeleteDeveloperMetadataResponse] = js.undefined
  /** A reply from duplicating a filter view. */
  var duplicateFilterView: js.UndefOr[DuplicateFilterViewResponse] = js.undefined
  /** A reply from duplicating a sheet. */
  var duplicateSheet: js.UndefOr[DuplicateSheetResponse] = js.undefined
  /** A reply from doing a find/replace. */
  var findReplace: js.UndefOr[FindReplaceResponse] = js.undefined
  /** A reply from updating a conditional format rule. */
  var updateConditionalFormatRule: js.UndefOr[UpdateConditionalFormatRuleResponse] = js.undefined
  /** A reply from updating a developer metadata entry. */
  var updateDeveloperMetadata: js.UndefOr[UpdateDeveloperMetadataResponse] = js.undefined
  /** A reply from updating an embedded object's position. */
  var updateEmbeddedObjectPosition: js.UndefOr[UpdateEmbeddedObjectPositionResponse] = js.undefined
}

object Response {
  @scala.inline
  def apply(
    addBanding: AddBandingResponse = null,
    addChart: AddChartResponse = null,
    addFilterView: AddFilterViewResponse = null,
    addNamedRange: AddNamedRangeResponse = null,
    addProtectedRange: AddProtectedRangeResponse = null,
    addSheet: AddSheetResponse = null,
    createDeveloperMetadata: CreateDeveloperMetadataResponse = null,
    deleteConditionalFormatRule: DeleteConditionalFormatRuleResponse = null,
    deleteDeveloperMetadata: DeleteDeveloperMetadataResponse = null,
    duplicateFilterView: DuplicateFilterViewResponse = null,
    duplicateSheet: DuplicateSheetResponse = null,
    findReplace: FindReplaceResponse = null,
    updateConditionalFormatRule: UpdateConditionalFormatRuleResponse = null,
    updateDeveloperMetadata: UpdateDeveloperMetadataResponse = null,
    updateEmbeddedObjectPosition: UpdateEmbeddedObjectPositionResponse = null
  ): Response = {
    val __obj = js.Dynamic.literal()
    if (addBanding != null) __obj.updateDynamic("addBanding")(addBanding)
    if (addChart != null) __obj.updateDynamic("addChart")(addChart)
    if (addFilterView != null) __obj.updateDynamic("addFilterView")(addFilterView)
    if (addNamedRange != null) __obj.updateDynamic("addNamedRange")(addNamedRange)
    if (addProtectedRange != null) __obj.updateDynamic("addProtectedRange")(addProtectedRange)
    if (addSheet != null) __obj.updateDynamic("addSheet")(addSheet)
    if (createDeveloperMetadata != null) __obj.updateDynamic("createDeveloperMetadata")(createDeveloperMetadata)
    if (deleteConditionalFormatRule != null) __obj.updateDynamic("deleteConditionalFormatRule")(deleteConditionalFormatRule)
    if (deleteDeveloperMetadata != null) __obj.updateDynamic("deleteDeveloperMetadata")(deleteDeveloperMetadata)
    if (duplicateFilterView != null) __obj.updateDynamic("duplicateFilterView")(duplicateFilterView)
    if (duplicateSheet != null) __obj.updateDynamic("duplicateSheet")(duplicateSheet)
    if (findReplace != null) __obj.updateDynamic("findReplace")(findReplace)
    if (updateConditionalFormatRule != null) __obj.updateDynamic("updateConditionalFormatRule")(updateConditionalFormatRule)
    if (updateDeveloperMetadata != null) __obj.updateDynamic("updateDeveloperMetadata")(updateDeveloperMetadata)
    if (updateEmbeddedObjectPosition != null) __obj.updateDynamic("updateEmbeddedObjectPosition")(updateEmbeddedObjectPosition)
    __obj.asInstanceOf[Response]
  }
}

