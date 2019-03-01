package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timeline extends js.Object {
  var container: stdLib.Element
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
  def resize(): scala.Unit
  def zoomTo(startTime: JulianDate, stopTime: JulianDate): scala.Unit
}

object Timeline {
  @scala.inline
  def apply(
    container: stdLib.Element,
    destroy: js.Function0[scala.Unit],
    isDestroyed: js.Function0[scala.Boolean],
    resize: js.Function0[scala.Unit],
    zoomTo: js.Function2[JulianDate, JulianDate, scala.Unit]
  ): Timeline = {
    val __obj = js.Dynamic.literal(container = container, destroy = destroy, isDestroyed = isDestroyed, resize = resize, zoomTo = zoomTo)
  
    __obj.asInstanceOf[Timeline]
  }
}

