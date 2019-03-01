package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanControlOptions extends js.Object {
  /**
    * Position id. Used to specify the position of the control on the map.
    * The default position is TOP_LEFT.
    */
  var position: js.UndefOr[ControlPosition] = js.undefined
}

object PanControlOptions {
  @scala.inline
  def apply(position: ControlPosition = null): PanControlOptions = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[PanControlOptions]
  }
}

