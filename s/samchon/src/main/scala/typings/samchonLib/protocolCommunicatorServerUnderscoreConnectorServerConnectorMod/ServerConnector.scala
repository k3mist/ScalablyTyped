package typings
package samchonLib.protocolCommunicatorServerUnderscoreConnectorServerConnectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- samchonLib.protocolCommunicatorIServerConnectorMod.IServerConnector because var conflicts: onClose. Inlined onConnect, connect */ @JSImport("samchon/protocol/communicator/server_connector/ServerConnector", "ServerConnector")
@js.native
class ServerConnector protected ()
  extends samchonLib.protocolCommunicatorCommunicatorCommunicatorMod.Communicator {
  /**
    * Construct from *listener*.
    *
    * @param listener A listener object to listen replied message from newly connected client in
    *				   {@link IProtocol.replyData replyData()} as an {@link Invoke} object.
    */
  def this(listener: samchonLib.protocolInvokeIProtocolMod.IProtocol) = this()
  /**
    * @hidden
    */
  var _Handle_connect: js.Any = js.native
  /**
    * @hidden
    */
  var _Send_dummy_packet_repeatedly: js.Any = js.native
  /**
    * @inheritdoc
    */
  var onConnect: js.Function = js.native
  /**
    * @inheritdoc
    */
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
  def connect(ip: java.lang.String, port: scala.Double): scala.Unit = js.native
}

