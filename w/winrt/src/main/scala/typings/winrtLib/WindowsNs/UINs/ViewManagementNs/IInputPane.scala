package typings
package winrtLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInputPane extends js.Object {
  var occludedRect: winrtLib.WindowsNs.FoundationNs.Rect
  var onhiding: js.Any
  var onshowing: js.Any
}

object IInputPane {
  @scala.inline
  def apply(occludedRect: winrtLib.WindowsNs.FoundationNs.Rect, onhiding: js.Any, onshowing: js.Any): IInputPane = {
    val __obj = js.Dynamic.literal(occludedRect = occludedRect, onhiding = onhiding, onshowing = onshowing)
  
    __obj.asInstanceOf[IInputPane]
  }
}

