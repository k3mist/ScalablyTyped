package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupWindowResizeEventArgs extends PopupWindowEventArgs {
  val resizeState: scala.Double
}

object PopupWindowResizeEventArgs {
  @scala.inline
  def apply(resizeState: scala.Double, sender: Control, window: BootstrapPopupWindow): PopupWindowResizeEventArgs = {
    val __obj = js.Dynamic.literal(resizeState = resizeState, sender = sender, window = window)
  
    __obj.asInstanceOf[PopupWindowResizeEventArgs]
  }
}

