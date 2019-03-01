package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamSocketListenerConnectionReceivedEventArgs extends js.Object {
  var socket: StreamSocket
}

object IStreamSocketListenerConnectionReceivedEventArgs {
  @scala.inline
  def apply(socket: StreamSocket): IStreamSocketListenerConnectionReceivedEventArgs = {
    val __obj = js.Dynamic.literal(socket = socket)
  
    __obj.asInstanceOf[IStreamSocketListenerConnectionReceivedEventArgs]
  }
}

