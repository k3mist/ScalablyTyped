package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantitativeScaleSettingsFeatureMeasure extends js.Object {
  /** Specifies the category of feature measure.
    * @Default {null}
    */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /** Comparative measure render till the specified value.
    * @Default {null}
    */
  var comparativeMeasureValue: js.UndefOr[scala.Double] = js.undefined
  /** Feature measure render till the specified value.
    * @Default {null}
    */
  var value: js.UndefOr[scala.Double] = js.undefined
}

object QuantitativeScaleSettingsFeatureMeasure {
  @scala.inline
  def apply(
    category: java.lang.String = null,
    comparativeMeasureValue: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): QuantitativeScaleSettingsFeatureMeasure = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (comparativeMeasureValue != null) __obj.updateDynamic("comparativeMeasureValue")(comparativeMeasureValue.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsFeatureMeasure]
  }
}

