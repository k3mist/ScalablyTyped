package typings
package officeDashJsDashPreviewLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the chart that raised the Added event.
  *
  * [Api set: ExcelApi 1.8]
  */
trait ChartAddedEventArgs extends js.Object {
  /**
    *
    * Gets the id of the chart that is added to the worksheet.
    *
    * [Api set: ExcelApi 1.8]
    */
  var chartId: java.lang.String
  /**
    *
    * Gets the source of the event. See Excel.EventSource for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var source: EventSource | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Local | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Remote
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ChartAdded
  /**
    *
    * Gets the id of the worksheet in which the chart is added.
    *
    * [Api set: ExcelApi 1.8]
    */
  var worksheetId: java.lang.String
}

object ChartAddedEventArgs {
  @scala.inline
  def apply(
    chartId: java.lang.String,
    source: EventSource | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Local | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Remote,
    `type`: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ChartAdded,
    worksheetId: java.lang.String
  ): ChartAddedEventArgs = {
    val __obj = js.Dynamic.literal(chartId = chartId, source = source.asInstanceOf[js.Any], worksheetId = worksheetId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChartAddedEventArgs]
  }
}

