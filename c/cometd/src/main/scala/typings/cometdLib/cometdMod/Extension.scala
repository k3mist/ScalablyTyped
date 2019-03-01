package typings
package cometdLib.cometdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends js.Object {
  var incoming: js.UndefOr[Listener] = js.undefined
  var outgoing: js.UndefOr[Listener] = js.undefined
  var registered: js.UndefOr[js.Function2[/* name */ java.lang.String, /* cometd */ CometD, scala.Unit]] = js.undefined
  var unregistered: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Extension {
  @scala.inline
  def apply(
    incoming: Listener = null,
    outgoing: Listener = null,
    registered: js.Function2[/* name */ java.lang.String, /* cometd */ CometD, scala.Unit] = null,
    unregistered: js.Function0[scala.Unit] = null
  ): Extension = {
    val __obj = js.Dynamic.literal()
    if (incoming != null) __obj.updateDynamic("incoming")(incoming)
    if (outgoing != null) __obj.updateDynamic("outgoing")(outgoing)
    if (registered != null) __obj.updateDynamic("registered")(registered)
    if (unregistered != null) __obj.updateDynamic("unregistered")(unregistered)
    __obj.asInstanceOf[Extension]
  }
}

