package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionSettingsIndicatorSymbolSize extends js.Object {
  /** Specifies the height of indicator symbol.
    * @Default {10}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the width of indicator symbol.
    * @Default {10}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object CaptionSettingsIndicatorSymbolSize {
  @scala.inline
  def apply(height: scala.Int | scala.Double = null, width: scala.Int | scala.Double = null): CaptionSettingsIndicatorSymbolSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionSettingsIndicatorSymbolSize]
  }
}

