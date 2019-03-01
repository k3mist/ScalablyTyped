package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragPanHandler extends js.Object {
  def disable(): scala.Unit
  def enable(): scala.Unit
  def isActive(): scala.Boolean
  def isEnabled(): scala.Boolean
}

object DragPanHandler {
  @scala.inline
  def apply(
    disable: js.Function0[scala.Unit],
    enable: js.Function0[scala.Unit],
    isActive: js.Function0[scala.Boolean],
    isEnabled: js.Function0[scala.Boolean]
  ): DragPanHandler = {
    val __obj = js.Dynamic.literal(disable = disable, enable = enable, isActive = isActive, isEnabled = isEnabled)
  
    __obj.asInstanceOf[DragPanHandler]
  }
}

