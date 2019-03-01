package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which allows two way communication with other pages.
  * @since Chrome 26.
  */
trait Port extends js.Object {
  var name: java.lang.String
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onDisconnect: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* port */ this.type, scala.Unit]]
  /** An object which allows the addition and removal of listeners for a Chrome event. */
  var onMessage: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function2[/* message */ _, /* port */ this.type, scala.Unit]]
  /**
    * Optional.
    * This property will only be present on ports passed to onConnect/onConnectExternal listeners.
    */
  var sender: js.UndefOr[MessageSender] = js.undefined
  def disconnect(): scala.Unit
  def postMessage(message: js.Object): scala.Unit
}

object Port {
  @scala.inline
  def apply(
    disconnect: js.Function0[scala.Unit],
    name: java.lang.String,
    onDisconnect: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[Port, scala.Unit]],
    onMessage: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function2[/* message */ _, Port, scala.Unit]],
    postMessage: js.Function1[js.Object, scala.Unit],
    sender: MessageSender = null
  ): Port = {
    val __obj = js.Dynamic.literal(disconnect = disconnect, name = name, onDisconnect = onDisconnect, onMessage = onMessage, postMessage = postMessage)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[Port]
  }
}

