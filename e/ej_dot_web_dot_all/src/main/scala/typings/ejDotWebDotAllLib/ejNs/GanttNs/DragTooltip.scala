package typings
package ejDotWebDotAllLib.ejNs.GanttNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragTooltip extends js.Object {
  /** Specifies option to enable/disable tooltip while drag and drop a row.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the data source fields to be displayed in the drag tooltip.
    * @Default {[]}
    */
  var tooltipItems: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the custom template for drag tooltip.
    * @Default {null}
    */
  var tooltipTemplate: js.UndefOr[java.lang.String] = js.undefined
}

object DragTooltip {
  @scala.inline
  def apply(
    showTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    tooltipItems: js.Array[_] = null,
    tooltipTemplate: java.lang.String = null
  ): DragTooltip = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip)
    if (tooltipItems != null) __obj.updateDynamic("tooltipItems")(tooltipItems)
    if (tooltipTemplate != null) __obj.updateDynamic("tooltipTemplate")(tooltipTemplate)
    __obj.asInstanceOf[DragTooltip]
  }
}

