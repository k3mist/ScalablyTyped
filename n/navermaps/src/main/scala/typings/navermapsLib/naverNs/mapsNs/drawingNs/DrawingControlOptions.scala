package typings
package navermapsLib.naverNs.mapsNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawingControlOptions extends js.Object {
  var position: js.UndefOr[navermapsLib.naverNs.mapsNs.Position] = js.undefined
  var style: js.UndefOr[DrawingStyle] = js.undefined
}

object DrawingControlOptions {
  @scala.inline
  def apply(position: navermapsLib.naverNs.mapsNs.Position = null, style: DrawingStyle = null): DrawingControlOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[DrawingControlOptions]
  }
}

