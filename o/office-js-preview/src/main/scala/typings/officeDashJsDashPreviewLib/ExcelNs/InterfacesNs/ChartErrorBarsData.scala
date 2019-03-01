package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartErrorBars.toJSON()". */
trait ChartErrorBarsData extends js.Object {
  /**
    *
    * Represents whether have the end style cap for the error bars.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var endStyleCap: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Represents the formatting of chart ErrorBars.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var format: js.UndefOr[ChartErrorBarsFormatData] = js.undefined
  /**
    *
    * Represents which error-bar parts to include. See Excel.ChartErrorBarsInclude for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var include: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsInclude | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Both | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MinusValues | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PlusValues
  ] = js.undefined
  /**
    *
    * Represents the range marked by error bars. See Excel.ChartErrorBarsType for details.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var `type`: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FixedValue | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Percent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StDev | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StError | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Custom
  ] = js.undefined
  /**
    *
    * Represents whether shown error bars.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartErrorBarsData {
  @scala.inline
  def apply(
    endStyleCap: js.UndefOr[scala.Boolean] = js.undefined,
    format: ChartErrorBarsFormatData = null,
    include: officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsInclude | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Both | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.MinusValues | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.PlusValues = null,
    `type`: officeDashJsDashPreviewLib.ExcelNs.ChartErrorBarsType | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.FixedValue | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Percent | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StDev | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.StError | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Custom = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartErrorBarsData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endStyleCap)) __obj.updateDynamic("endStyleCap")(endStyleCap)
    if (format != null) __obj.updateDynamic("format")(format)
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ChartErrorBarsData]
  }
}

