package typings
package altLib.AltJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AltStore[S] extends js.Object {
  def emitChange(): scala.Unit
  def getState(): S
  def listen(handler: js.Function1[/* state */ S, _]): js.Function0[scala.Unit]
  def unlisten(handler: js.Function1[/* state */ S, _]): scala.Unit
}

object AltStore {
  @scala.inline
  def apply[S](
    emitChange: js.Function0[scala.Unit],
    getState: js.Function0[S],
    listen: js.Function1[js.Function1[/* state */ S, _], js.Function0[scala.Unit]],
    unlisten: js.Function1[js.Function1[/* state */ S, _], scala.Unit]
  ): AltStore[S] = {
    val __obj = js.Dynamic.literal(emitChange = emitChange, getState = getState, listen = listen, unlisten = unlisten)
  
    __obj.asInstanceOf[AltStore[S]]
  }
}

