package typings
package freedomLib.freedomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// See |Core_unprivileged| in |core.unprivileged.js|
trait Core extends js.Object {
  // Given an ChannelEndpointIdentifier for a channel, create a proxy event
  // interface for it.
  def bindChannel(channelIdentifier: java.lang.String): js.Promise[Channel]
  // Create a new channel which which to communicate between modules.
  def createChannel(): js.Promise[ChannelSpecifier]
  // Returns the list of identifiers describing the dependency path.
  def getId(): js.Promise[js.Array[java.lang.String]]
  def getLogger(tag: java.lang.String): js.Promise[Logger]
}

object Core {
  @scala.inline
  def apply(
    bindChannel: js.Function1[java.lang.String, js.Promise[Channel]],
    createChannel: js.Function0[js.Promise[ChannelSpecifier]],
    getId: js.Function0[js.Promise[js.Array[java.lang.String]]],
    getLogger: js.Function1[java.lang.String, js.Promise[Logger]]
  ): Core = {
    val __obj = js.Dynamic.literal(bindChannel = bindChannel, createChannel = createChannel, getId = getId, getLogger = getLogger)
  
    __obj.asInstanceOf[Core]
  }
}

