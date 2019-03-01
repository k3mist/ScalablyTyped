package typings
package pubnubLib.pubnubMod.PubnubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// addListener
trait ListenerParameters extends js.Object {
  var message: js.UndefOr[js.Function1[/* messageEvent */ MessageEvent, scala.Unit]] = js.undefined
  var presence: js.UndefOr[js.Function1[/* presenceEvent */ PresenceEvent, scala.Unit]] = js.undefined
  var status: js.UndefOr[js.Function1[/* statusEvent */ StatusEvent, scala.Unit]] = js.undefined
}

object ListenerParameters {
  @scala.inline
  def apply(
    message: js.Function1[/* messageEvent */ MessageEvent, scala.Unit] = null,
    presence: js.Function1[/* presenceEvent */ PresenceEvent, scala.Unit] = null,
    status: js.Function1[/* statusEvent */ StatusEvent, scala.Unit] = null
  ): ListenerParameters = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message)
    if (presence != null) __obj.updateDynamic("presence")(presence)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ListenerParameters]
  }
}

