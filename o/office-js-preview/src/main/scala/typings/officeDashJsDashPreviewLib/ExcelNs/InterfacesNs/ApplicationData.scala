package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "application.toJSON()". */
trait ApplicationData extends js.Object {
  /**
    *
    * Returns a number about the version of Excel Calculation Engine that the workbook was last fully recalculated by. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var calculationEngineVersion: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Returns the calculation mode used in the workbook, as defined by the constants in Excel.CalculationMode. Possible values are: `Automatic`, where Excel controls recalculation; `AutomaticExceptTables`, where Excel controls recalculation but ignores changes in tables; `Manual`, where calculation is done when the user requests it.
    *
    * [Api set: ExcelApi 1.1 for get, 1.8 for set]
    */
  var calculationMode: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.CalculationMode | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutomaticExceptTables | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Manual
  ] = js.undefined
  /**
    *
    * Returns a CalculationState that indicates the calculation state of the application. See Excel.CalculationState for details. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var calculationState: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.CalculationState | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Done | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Calculating | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Pending
  ] = js.undefined
  /**
    *
    * Returns the Iterative Calculation settings.
    On Excel for Windows and Excel for Mac, the settings will apply to the Excel Application.
    On Excel Online and Excel for other platforms, the settings will apply to the active workbook.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var iterativeCalculation: js.UndefOr[IterativeCalculationData] = js.undefined
}

object ApplicationData {
  @scala.inline
  def apply(
    calculationEngineVersion: scala.Int | scala.Double = null,
    calculationMode: officeDashJsDashPreviewLib.ExcelNs.CalculationMode | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.AutomaticExceptTables | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Manual = null,
    calculationState: officeDashJsDashPreviewLib.ExcelNs.CalculationState | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Done | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Calculating | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Pending = null,
    iterativeCalculation: IterativeCalculationData = null
  ): ApplicationData = {
    val __obj = js.Dynamic.literal()
    if (calculationEngineVersion != null) __obj.updateDynamic("calculationEngineVersion")(calculationEngineVersion.asInstanceOf[js.Any])
    if (calculationMode != null) __obj.updateDynamic("calculationMode")(calculationMode.asInstanceOf[js.Any])
    if (calculationState != null) __obj.updateDynamic("calculationState")(calculationState.asInstanceOf[js.Any])
    if (iterativeCalculation != null) __obj.updateDynamic("iterativeCalculation")(iterativeCalculation)
    __obj.asInstanceOf[ApplicationData]
  }
}

