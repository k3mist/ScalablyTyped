package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantitativeScaleSettingsComparativeMeasureSettings extends js.Object {
  /** Specifies the stroke of the comparative measure.
    * @Default {null}
    */
  var stroke: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the width of the comparative measure.
    * @Default {5}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object QuantitativeScaleSettingsComparativeMeasureSettings {
  @scala.inline
  def apply(stroke: scala.Int | scala.Double = null, width: scala.Int | scala.Double = null): QuantitativeScaleSettingsComparativeMeasureSettings = {
    val __obj = js.Dynamic.literal()
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsComparativeMeasureSettings]
  }
}

