package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Workbook object, for use in "workbook.set({ ... })". */
trait WorkbookUpdateData extends js.Object {
  /**
    *
    * True if all charts in the workbook are tracking the actual data points to which they are attached.
    False if the charts track the index of the data points.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var chartDataPointTrack: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * True if no changes have been made to the specified workbook since it was last saved.
    You can set this property to True if you want to close a modified workbook without either saving it or being prompted to save it.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var isDirty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Gets the workbook properties.
    *
    * [Api set: ExcelApi 1.7]
    */
  var properties: js.UndefOr[DocumentPropertiesUpdateData] = js.undefined
  /**
    *
    * True if the workbook uses the 1904 date system.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var use1904DateSystem: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * True if calculations in this workbook will be done using only the precision of the numbers as they're displayed.
    Data will permanently lose accuracy when switching this property from false to true.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var usePrecisionAsDisplayed: js.UndefOr[scala.Boolean] = js.undefined
}

object WorkbookUpdateData {
  @scala.inline
  def apply(
    chartDataPointTrack: js.UndefOr[scala.Boolean] = js.undefined,
    isDirty: js.UndefOr[scala.Boolean] = js.undefined,
    properties: DocumentPropertiesUpdateData = null,
    use1904DateSystem: js.UndefOr[scala.Boolean] = js.undefined,
    usePrecisionAsDisplayed: js.UndefOr[scala.Boolean] = js.undefined
  ): WorkbookUpdateData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chartDataPointTrack)) __obj.updateDynamic("chartDataPointTrack")(chartDataPointTrack)
    if (!js.isUndefined(isDirty)) __obj.updateDynamic("isDirty")(isDirty)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (!js.isUndefined(use1904DateSystem)) __obj.updateDynamic("use1904DateSystem")(use1904DateSystem)
    if (!js.isUndefined(usePrecisionAsDisplayed)) __obj.updateDynamic("usePrecisionAsDisplayed")(usePrecisionAsDisplayed)
    __obj.asInstanceOf[WorkbookUpdateData]
  }
}

