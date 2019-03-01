package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "colorScaleConditionalFormat.toJSON()". */
trait ColorScaleConditionalFormatData extends js.Object {
  /**
    *
    * The criteria of the color scale. Midpoint is optional when using a two point color scale.
    *
    * [Api set: ExcelApi 1.6]
    */
  var criteria: js.UndefOr[officeDashJsDashPreviewLib.ExcelNs.ConditionalColorScaleCriteria] = js.undefined
  /**
    *
    * If true the color scale will have three points (minimum, midpoint, maximum), otherwise it will have two (minimum, maximum).
    *
    * [Api set: ExcelApi 1.6]
    */
  var threeColorScale: js.UndefOr[scala.Boolean] = js.undefined
}

object ColorScaleConditionalFormatData {
  @scala.inline
  def apply(
    criteria: officeDashJsDashPreviewLib.ExcelNs.ConditionalColorScaleCriteria = null,
    threeColorScale: js.UndefOr[scala.Boolean] = js.undefined
  ): ColorScaleConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    if (criteria != null) __obj.updateDynamic("criteria")(criteria)
    if (!js.isUndefined(threeColorScale)) __obj.updateDynamic("threeColorScale")(threeColorScale)
    __obj.asInstanceOf[ColorScaleConditionalFormatData]
  }
}

