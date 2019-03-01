package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the DataValidation object, for use in "dataValidation.set({ ... })". */
trait DataValidationUpdateData extends js.Object {
  /**
    *
    * Error alert when user enters invalid data.
    *
    * [Api set: ExcelApi 1.8]
    */
  var errorAlert: js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.DataValidationErrorAlert] = js.undefined
  /**
    *
    * Ignore blanks: no data validation will be performed on blank cells, it defaults to true.
    *
    * [Api set: ExcelApi 1.8]
    */
  var ignoreBlanks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Prompt when users select a cell.
    *
    * [Api set: ExcelApi 1.8]
    */
  var prompt: js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.DataValidationPrompt] = js.undefined
  /**
    *
    * Data validation rule that contains different type of data validation criteria.
    *
    * [Api set: ExcelApi 1.8]
    */
  var rule: js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.DataValidationRule] = js.undefined
}

object DataValidationUpdateData {
  @scala.inline
  def apply(
    errorAlert: officeDashJsDashPreviewLib.ExcelNs.DataValidationErrorAlert = null,
    ignoreBlanks: js.UndefOr[scala.Boolean] = js.undefined,
    prompt: officeDashJsDashPreviewLib.ExcelNs.DataValidationPrompt = null,
    rule: officeDashJsDashPreviewLib.ExcelNs.DataValidationRule = null
  ): DataValidationUpdateData = {
    val __obj = js.Dynamic.literal()
    if (errorAlert != null) __obj.updateDynamic("errorAlert")(errorAlert)
    if (!js.isUndefined(ignoreBlanks)) __obj.updateDynamic("ignoreBlanks")(ignoreBlanks)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[DataValidationUpdateData]
  }
}

