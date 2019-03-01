package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaPlayerEvent extends js.Object {
  var preventDefault: js.Function
  var sender: MediaPlayer
  def isDefaultPrevented(): scala.Boolean
}

object MediaPlayerEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: MediaPlayer): MediaPlayerEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[MediaPlayerEvent]
  }
}

