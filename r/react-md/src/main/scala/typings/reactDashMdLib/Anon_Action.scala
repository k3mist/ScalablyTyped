package typings
package reactDashMdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Action extends js.Object {
  var action: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | Anon_Label] = js.undefined
  var text: reactLib.reactMod.ReactNs.ReactNode
}

object Anon_Action {
  @scala.inline
  def apply(
    text: reactLib.reactMod.ReactNs.ReactNode,
    action: reactLib.reactMod.ReactNs.ReactNode | Anon_Label = null
  ): Anon_Action = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Action]
  }
}

