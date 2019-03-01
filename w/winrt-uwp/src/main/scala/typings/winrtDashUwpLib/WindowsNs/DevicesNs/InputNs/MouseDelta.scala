package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Identifies the change in screen location of the mouse pointer, relative to the location of the last mouse event. */
trait MouseDelta extends js.Object {
  /** The x-coordinate of the mouse pointer, relative to the location of the last mouse event. */
  var x: scala.Double
  /** The y-coordinate of the mouse pointer, relative to the location of the last mouse event. */
  var y: scala.Double
}

object MouseDelta {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): MouseDelta = {
    val __obj = js.Dynamic.literal(x = x, y = y)
  
    __obj.asInstanceOf[MouseDelta]
  }
}

