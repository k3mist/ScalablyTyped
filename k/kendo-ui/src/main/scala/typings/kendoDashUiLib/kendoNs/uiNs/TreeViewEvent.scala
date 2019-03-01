package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeViewEvent extends js.Object {
  var preventDefault: js.Function
  var sender: TreeView
  def isDefaultPrevented(): scala.Boolean
}

object TreeViewEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: TreeView): TreeViewEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[TreeViewEvent]
  }
}

