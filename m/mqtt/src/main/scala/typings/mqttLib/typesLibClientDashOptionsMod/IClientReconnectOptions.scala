package typings
package mqttLib.typesLibClientDashOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientReconnectOptions extends js.Object {
  /**
    * a Store for the incoming packets
    */
  var incomingStore: js.UndefOr[mqttLib.typesLibStoreMod.Store] = js.undefined
  /**
    * a Store for the outgoing packets
    */
  var outgoingStore: js.UndefOr[mqttLib.typesLibStoreMod.Store] = js.undefined
}

object IClientReconnectOptions {
  @scala.inline
  def apply(
    incomingStore: mqttLib.typesLibStoreMod.Store = null,
    outgoingStore: mqttLib.typesLibStoreMod.Store = null
  ): IClientReconnectOptions = {
    val __obj = js.Dynamic.literal()
    if (incomingStore != null) __obj.updateDynamic("incomingStore")(incomingStore)
    if (outgoingStore != null) __obj.updateDynamic("outgoingStore")(outgoingStore)
    __obj.asInstanceOf[IClientReconnectOptions]
  }
}

