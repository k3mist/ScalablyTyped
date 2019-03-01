package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisRangeChangedEventUIParam extends js.Object {
  /**
  	 * Used to get reference to current chart axis object.
  	 */
  var axis: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get reference to chart object.
  	 */
  var chart: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get new maximum value.
  	 */
  var newMaximumValue: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get new minimum value.
  	 */
  var newMinimumValue: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get old maximum value.
  	 */
  var oldMaximumValue: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get old minimum value.
  	 */
  var oldMinimumValue: js.UndefOr[js.Any] = js.undefined
}

object AxisRangeChangedEventUIParam {
  @scala.inline
  def apply(
    axis: js.Any = null,
    chart: js.Any = null,
    newMaximumValue: js.Any = null,
    newMinimumValue: js.Any = null,
    oldMaximumValue: js.Any = null,
    oldMinimumValue: js.Any = null
  ): AxisRangeChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (chart != null) __obj.updateDynamic("chart")(chart)
    if (newMaximumValue != null) __obj.updateDynamic("newMaximumValue")(newMaximumValue)
    if (newMinimumValue != null) __obj.updateDynamic("newMinimumValue")(newMinimumValue)
    if (oldMaximumValue != null) __obj.updateDynamic("oldMaximumValue")(oldMaximumValue)
    if (oldMinimumValue != null) __obj.updateDynamic("oldMinimumValue")(oldMinimumValue)
    __obj.asInstanceOf[AxisRangeChangedEventUIParam]
  }
}

