package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CustomizedMetricSpecification extends js.Object {
  var customizedMetricSpecification: js.UndefOr[Anon_Dimensions] = js.undefined
  var disableScaleIn: js.UndefOr[scala.Boolean] = js.undefined
  var predefinedMetricSpecification: js.UndefOr[Anon_PredefinedMetricType] = js.undefined
  var scaleInCooldown: js.UndefOr[scala.Double] = js.undefined
  var scaleOutCooldown: js.UndefOr[scala.Double] = js.undefined
  var targetValue: scala.Double
}

object Anon_CustomizedMetricSpecification {
  @scala.inline
  def apply(
    targetValue: scala.Double,
    customizedMetricSpecification: Anon_Dimensions = null,
    disableScaleIn: js.UndefOr[scala.Boolean] = js.undefined,
    predefinedMetricSpecification: Anon_PredefinedMetricType = null,
    scaleInCooldown: scala.Int | scala.Double = null,
    scaleOutCooldown: scala.Int | scala.Double = null
  ): Anon_CustomizedMetricSpecification = {
    val __obj = js.Dynamic.literal(targetValue = targetValue)
    if (customizedMetricSpecification != null) __obj.updateDynamic("customizedMetricSpecification")(customizedMetricSpecification)
    if (!js.isUndefined(disableScaleIn)) __obj.updateDynamic("disableScaleIn")(disableScaleIn)
    if (predefinedMetricSpecification != null) __obj.updateDynamic("predefinedMetricSpecification")(predefinedMetricSpecification)
    if (scaleInCooldown != null) __obj.updateDynamic("scaleInCooldown")(scaleInCooldown.asInstanceOf[js.Any])
    if (scaleOutCooldown != null) __obj.updateDynamic("scaleOutCooldown")(scaleOutCooldown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CustomizedMetricSpecification]
  }
}

