package typings
package samchonLib.protocolCommunicatorIServerConnectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerConnector
  extends samchonLib.protocolCommunicatorICommunicatorMod.ICommunicator {
  /**
    * Callback function for connection completed.
    *
    * When you call {@link connect connect()} and the connection has completed, then this call back function
    * {@link onConnect} will be called. Note that, if the listener of this {@link onConnect} is a member method of
    * some class, then you've use the ```bind```.
    */
  var onConnect: js.Function
  /**
    * Connect to a server.
    *
    * Connects to a server with specified *host* address and *port* number. After the connection has
    * succeeded, callback function {@link onConnect} is called. Listening data from the connected server also begins.
    * Replied messages from the connected server will be converted to {@link Invoke} classes and will be shifted to
    * the {@link WebCommunicator.listener listener}'s {@link IProtocol.replyData replyData()} method.
    *
    * If the connection fails immediately, either an event is dispatched or an exception is thrown: an error
    * event is dispatched if a host was specified, and an exception is thrown if no host was specified. Otherwise,
    * the status of the connection is reported by an event. If the socket is already connected, the existing
    * connection is closed first.
    *
    * @param ip The name or IP address of the host to connect to.
    *			 If no host is specified, the host that is contacted is the host where the calling file resides.
    *			 If you do not specify a host, use an event listener to determine whether the connection was
    *			 successful.
    * @param port The port number to connect to.
    */
  def connect(ip: java.lang.String, port: scala.Double): scala.Unit
}

object IServerConnector {
  @scala.inline
  def apply(
    close: js.Function0[scala.Unit],
    connect: js.Function2[java.lang.String, scala.Double, scala.Unit],
    isConnected: js.Function0[scala.Boolean],
    onClose: js.Function,
    onConnect: js.Function,
    replyData: js.Function1[samchonLib.protocolInvokeInvokeMod.Invoke, scala.Unit],
    sendData: js.Function1[samchonLib.protocolInvokeInvokeMod.Invoke, scala.Unit]
  ): IServerConnector = {
    val __obj = js.Dynamic.literal(close = close, connect = connect, isConnected = isConnected, onClose = onClose, onConnect = onConnect, replyData = replyData, sendData = sendData)
  
    __obj.asInstanceOf[IServerConnector]
  }
}

