package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartMapOptions object, for use in "chartMapOptions.set({ ... })". */
trait ChartMapOptionsUpdateData extends js.Object {
  /**
    *
    * Returns or sets series map labels strategy of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var labelStrategy: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartMapLabelStrategy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BestFit | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShowAll
  ] = js.undefined
  /**
    *
    * Returns or sets series map area of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var level: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartMapAreaLevel | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DataOnly | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.City | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.County | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.State | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Country | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Continent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.World
  ] = js.undefined
  /**
    *
    * Returns or sets series projection type of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var projectionType: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartMapProjectionType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mercator | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Miller | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Robinson | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Albers
  ] = js.undefined
}

object ChartMapOptionsUpdateData {
  @scala.inline
  def apply(
    labelStrategy: officeDashJsDashPreviewLib.ExcelNs.ChartMapLabelStrategy | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.None | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.BestFit | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.ShowAll = null,
    level: officeDashJsDashPreviewLib.ExcelNs.ChartMapAreaLevel | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.DataOnly | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.City | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.County | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.State | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Country | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Continent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.World = null,
    projectionType: officeDashJsDashPreviewLib.ExcelNs.ChartMapProjectionType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Automatic | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Mercator | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Miller | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Robinson | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Albers = null
  ): ChartMapOptionsUpdateData = {
    val __obj = js.Dynamic.literal()
    if (labelStrategy != null) __obj.updateDynamic("labelStrategy")(labelStrategy.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (projectionType != null) __obj.updateDynamic("projectionType")(projectionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartMapOptionsUpdateData]
  }
}

