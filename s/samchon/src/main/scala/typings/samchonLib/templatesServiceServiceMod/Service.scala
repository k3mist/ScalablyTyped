package typings
package samchonLib.templatesServiceServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/templates/service/Service", "Service")
@js.native
abstract class Service protected ()
  extends samchonLib.protocolInvokeIProtocolMod.IProtocol {
  /**
    * Construct from parent {@link Client} and requested path.
    *
    * @param client Driver of remote client.
    * @param path Requested path that identifies this {@link Service}.
    */
  def this(client: samchonLib.templatesServiceClientMod.Client, path: java.lang.String) = this()
  /**
    * @hidden
    */
  var client_ : js.Any = js.native
  /**
    * @hidden
    */
  var path_ : js.Any = js.native
  /**
    * Default Destructor.
    *
    * This {@link destructor destructor()} method is call when the {@link Service} object is destructed and the
    * {@link Service} object is destructed when its parent {@link Client} object has
    * {@link Client.destructor destructed} or the {@link Client} object {@link Client.changeService changed} its
    * child {@link Service service} object to another one.
    *
    * Note that, don't call this {@link destructor destructor()} method by yourself. It must be called automatically
    * by those *destruction* cases. Also, if your derived {@link Service} class has something to do on the
    * *destruction*, then overrides this {@link destructor destructor()} method and defines the something to do.
    */
  /* protected */ def destructor(): scala.Unit = js.native
  /**
    * Get client.
    */
  def getClient(): samchonLib.templatesServiceClientMod.Client = js.native
  /**
    * Get requested path.
    */
  def getPath(): java.lang.String = js.native
  /**
    * Sending message.
    *
    * Sends message to related system or shifts the responsibility to chain.
    *
    * @param invoke Invoke message to send
    */
  /* CompleteClass */
  override def replyData(invoke: samchonLib.protocolInvokeInvokeMod.Invoke): scala.Unit = js.native
  /**
    * Handling replied message.
    *
    * Handles replied message or shifts the responsibility to chain.
    *
    * @param invoke An {@link Invoke} message has received.
    */
  /* CompleteClass */
  override def sendData(invoke: samchonLib.protocolInvokeInvokeMod.Invoke): scala.Unit = js.native
}

