package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptimizationActivity extends js.Object {
  /** Floodlight activity ID of this optimization activity. This is a required field. */
  var floodlightActivityId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the floodlight activity. This is a read-only, auto-generated field. */
  var floodlightActivityIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /**
    * Weight associated with this optimization. The weight assigned will be understood in proportion to the weights assigned to the other optimization
    * activities. Value must be greater than or equal to 1.
    */
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object OptimizationActivity {
  @scala.inline
  def apply(
    floodlightActivityId: java.lang.String = null,
    floodlightActivityIdDimensionValue: DimensionValue = null,
    weight: scala.Int | scala.Double = null
  ): OptimizationActivity = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivityId != null) __obj.updateDynamic("floodlightActivityId")(floodlightActivityId)
    if (floodlightActivityIdDimensionValue != null) __obj.updateDynamic("floodlightActivityIdDimensionValue")(floodlightActivityIdDimensionValue)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizationActivity]
  }
}

