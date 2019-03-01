package typings
package ejDotWebDotAllLib.ejNs.TooltipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TipAdjust extends js.Object {
  /** Sets horizontal gap between Tooltip and target element.
    * @Default {0}
    */
  var xValue: js.UndefOr[scala.Double] = js.undefined
  /** Sets vertical gap between Tooltip and target element.
    * @Default {0}
    */
  var yValue: js.UndefOr[scala.Double] = js.undefined
}

object TipAdjust {
  @scala.inline
  def apply(xValue: scala.Int | scala.Double = null, yValue: scala.Int | scala.Double = null): TipAdjust = {
    val __obj = js.Dynamic.literal()
    if (xValue != null) __obj.updateDynamic("xValue")(xValue.asInstanceOf[js.Any])
    if (yValue != null) __obj.updateDynamic("yValue")(yValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipAdjust]
  }
}

