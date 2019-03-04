package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.UtilsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  def isKeyboard(e: reactLib.Event): scala.Boolean
  def off(el: reactLib.Element, `type`: java.lang.String, callback: stdLib.EventListener): scala.Unit
  def on(el: reactLib.Element, `type`: java.lang.String, callback: stdLib.EventListener): scala.Unit
  def once(el: reactLib.Element, `type`: java.lang.String, callback: stdLib.EventListener): scala.Unit
}

object Events {
  @scala.inline
  def apply(
    isKeyboard: reactLib.Event => scala.Boolean,
    off: (reactLib.Element, java.lang.String, stdLib.EventListener) => scala.Unit,
    on: (reactLib.Element, java.lang.String, stdLib.EventListener) => scala.Unit,
    once: (reactLib.Element, java.lang.String, stdLib.EventListener) => scala.Unit
  ): Events = {
    val __obj = js.Dynamic.literal(isKeyboard = js.Any.fromFunction1(isKeyboard), off = js.Any.fromFunction3(off), on = js.Any.fromFunction3(on), once = js.Any.fromFunction3(once))
  
    __obj.asInstanceOf[Events]
  }
}

