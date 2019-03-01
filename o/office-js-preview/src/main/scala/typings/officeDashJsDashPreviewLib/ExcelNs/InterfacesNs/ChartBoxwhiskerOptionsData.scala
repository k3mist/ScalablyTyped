package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "chartBoxwhiskerOptions.toJSON()". */
trait ChartBoxwhiskerOptionsData extends js.Object {
  /**
    *
    * Returns or sets quartile calculation type of a Box & whisker chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var quartileCalculation: js.UndefOr[
    officeDashJsDashPreviewLib.ExcelNs.ChartBoxQuartileCalculation | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Inclusive | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Exclusive
  ] = js.undefined
  /**
    *
    * Returns or sets if inner points showed in a Box & whisker chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var showInnerPoints: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets if mean line showed in a Box & whisker chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var showMeanLine: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets if mean marker showed in a Box & whisker chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var showMeanMarker: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets if outlier points showed in a Box & whisker chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var showOutlierPoints: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartBoxwhiskerOptionsData {
  @scala.inline
  def apply(
    quartileCalculation: officeDashJsDashPreviewLib.ExcelNs.ChartBoxQuartileCalculation | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Inclusive | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Exclusive = null,
    showInnerPoints: js.UndefOr[scala.Boolean] = js.undefined,
    showMeanLine: js.UndefOr[scala.Boolean] = js.undefined,
    showMeanMarker: js.UndefOr[scala.Boolean] = js.undefined,
    showOutlierPoints: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartBoxwhiskerOptionsData = {
    val __obj = js.Dynamic.literal()
    if (quartileCalculation != null) __obj.updateDynamic("quartileCalculation")(quartileCalculation.asInstanceOf[js.Any])
    if (!js.isUndefined(showInnerPoints)) __obj.updateDynamic("showInnerPoints")(showInnerPoints)
    if (!js.isUndefined(showMeanLine)) __obj.updateDynamic("showMeanLine")(showMeanLine)
    if (!js.isUndefined(showMeanMarker)) __obj.updateDynamic("showMeanMarker")(showMeanMarker)
    if (!js.isUndefined(showOutlierPoints)) __obj.updateDynamic("showOutlierPoints")(showOutlierPoints)
    __obj.asInstanceOf[ChartBoxwhiskerOptionsData]
  }
}

