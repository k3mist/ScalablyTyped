package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfoBox extends js.Object {
  var container: stdLib.Element
  var frame: stdLib.HTMLIFrameElement
  var viewModel: InfoBoxViewModel
  def destroy(): scala.Unit
  def isDestroyed(): scala.Boolean
}

object InfoBox {
  @scala.inline
  def apply(
    container: stdLib.Element,
    destroy: js.Function0[scala.Unit],
    frame: stdLib.HTMLIFrameElement,
    isDestroyed: js.Function0[scala.Boolean],
    viewModel: InfoBoxViewModel
  ): InfoBox = {
    val __obj = js.Dynamic.literal(container = container, destroy = destroy, frame = frame, isDestroyed = isDestroyed, viewModel = viewModel)
  
    __obj.asInstanceOf[InfoBox]
  }
}

