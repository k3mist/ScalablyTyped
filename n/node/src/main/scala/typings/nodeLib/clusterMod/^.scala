package typings
package nodeLib.clusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cluster", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val isMaster: scala.Boolean = js.native
  val isWorker: scala.Boolean = js.native
  // TODO: cluster.schedulingPolicy
  val settings: ClusterSettings = js.native
  val worker: Worker = js.native
  /**
    * events.EventEmitter
    *   1. disconnect
    *   2. exit
    *   3. fork
    *   4. listening
    *   5. message
    *   6. online
    *   7. setup
    */
  def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): Cluster = js.native
  @JSName("addListener")
  def addListener_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function1[/* worker */ Worker, scala.Unit]): Cluster = js.native
  @JSName("addListener")
  def addListener_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("addListener")
  def addListener_fork(event: nodeLib.nodeLibStrings.fork, listener: js.Function1[/* worker */ Worker, scala.Unit]): Cluster = js.native
  @JSName("addListener")
  def addListener_listening(
    event: nodeLib.nodeLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("addListener")
  def addListener_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("addListener")
  def addListener_online(event: nodeLib.nodeLibStrings.online, listener: js.Function1[/* worker */ Worker, scala.Unit]): Cluster = js.native
  @JSName("addListener")
  def addListener_setup(event: nodeLib.nodeLibStrings.setup, listener: js.Function1[/* settings */ js.Any, scala.Unit]): Cluster = js.native
  def disconnect(): scala.Unit = js.native
  def disconnect(callback: js.Function): scala.Unit = js.native
  def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  @JSName("emit")
  def emit_disconnect(event: nodeLib.nodeLibStrings.disconnect, worker: Worker): scala.Boolean = js.native
  @JSName("emit")
  def emit_exit(event: nodeLib.nodeLibStrings.exit, worker: Worker, code: scala.Double, signal: java.lang.String): scala.Boolean = js.native
  @JSName("emit")
  def emit_fork(event: nodeLib.nodeLibStrings.fork, worker: Worker): scala.Boolean = js.native
  @JSName("emit")
  def emit_listening(event: nodeLib.nodeLibStrings.listening, worker: Worker, address: Address): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(
    event: nodeLib.nodeLibStrings.message,
    worker: Worker,
    message: js.Any,
    handle: nodeLib.netMod.Server
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_message(
    event: nodeLib.nodeLibStrings.message,
    worker: Worker,
    message: js.Any,
    handle: nodeLib.netMod.Socket
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_online(event: nodeLib.nodeLibStrings.online, worker: Worker): scala.Boolean = js.native
  @JSName("emit")
  def emit_setup(event: nodeLib.nodeLibStrings.setup, settings: js.Any): scala.Boolean = js.native
  def eventNames(): js.Array[java.lang.String] = js.native
  def fork(): Worker = js.native
  def fork(env: js.Any): Worker = js.native
  def getMaxListeners(): scala.Double = js.native
  def listenerCount(`type`: java.lang.String): scala.Double = js.native
  def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): Cluster = js.native
  @JSName("on")
  def on_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function1[/* worker */ Worker, scala.Unit]): Cluster = js.native
  @JSName("on")
  def on_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("on")
  def on_fork(event: nodeLib.nodeLibStrings.fork, listener: js.Function1[/* worker */ Worker, scala.Unit]): Cluster = js.native
  @JSName("on")
  def on_listening(
    event: nodeLib.nodeLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): Cluster = js.native
  @JSName("on")
  def on_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("on")
  def on_online(event: nodeLib.nodeLibStrings.online, listener: js.Function1[/* worker */ Worker, scala.Unit]): Cluster = js.native
  @JSName("on")
  def on_setup(event: nodeLib.nodeLibStrings.setup, listener: js.Function1[/* settings */ js.Any, scala.Unit]): Cluster = js.native
  def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): Cluster = js.native
  @JSName("once")
  def once_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function1[/* worker */ Worker, scala.Unit]): Cluster = js.native
  @JSName("once")
  def once_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("once")
  def once_fork(event: nodeLib.nodeLibStrings.fork, listener: js.Function1[/* worker */ Worker, scala.Unit]): Cluster = js.native
  @JSName("once")
  def once_listening(
    event: nodeLib.nodeLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): Cluster = js.native
  @JSName("once")
  def once_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("once")
  def once_online(event: nodeLib.nodeLibStrings.online, listener: js.Function1[/* worker */ Worker, scala.Unit]): Cluster = js.native
  @JSName("once")
  def once_setup(event: nodeLib.nodeLibStrings.setup, listener: js.Function1[/* settings */ js.Any, scala.Unit]): Cluster = js.native
  def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): Cluster = js.native
  @JSName("prependListener")
  def prependListener_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function1[/* worker */ Worker, scala.Unit]): Cluster = js.native
  @JSName("prependListener")
  def prependListener_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("prependListener")
  def prependListener_fork(event: nodeLib.nodeLibStrings.fork, listener: js.Function1[/* worker */ Worker, scala.Unit]): Cluster = js.native
  @JSName("prependListener")
  def prependListener_listening(
    event: nodeLib.nodeLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependListener")
  def prependListener_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("prependListener")
  def prependListener_online(event: nodeLib.nodeLibStrings.online, listener: js.Function1[/* worker */ Worker, scala.Unit]): Cluster = js.native
  @JSName("prependListener")
  def prependListener_setup(event: nodeLib.nodeLibStrings.setup, listener: js.Function1[/* settings */ js.Any, scala.Unit]): Cluster = js.native
  def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_disconnect(event: nodeLib.nodeLibStrings.disconnect, listener: js.Function1[/* worker */ Worker, scala.Unit]): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_exit(
    event: nodeLib.nodeLibStrings.exit,
    listener: js.Function3[
      /* worker */ Worker, 
      /* code */ scala.Double, 
      /* signal */ java.lang.String, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_fork(event: nodeLib.nodeLibStrings.fork, listener: js.Function1[/* worker */ Worker, scala.Unit]): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_listening(
    event: nodeLib.nodeLibStrings.listening,
    listener: js.Function2[/* worker */ Worker, /* address */ Address, scala.Unit]
  ): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  @JSName("prependOnceListener")
  def prependOnceListener_message(
    event: nodeLib.nodeLibStrings.message,
    listener: js.Function3[
      /* worker */ Worker, 
      /* message */ js.Any, 
      /* handle */ nodeLib.netMod.Socket | nodeLib.netMod.Server, 
      scala.Unit
    ]
  ): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_online(event: nodeLib.nodeLibStrings.online, listener: js.Function1[/* worker */ Worker, scala.Unit]): Cluster = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_setup(event: nodeLib.nodeLibStrings.setup, listener: js.Function1[/* settings */ js.Any, scala.Unit]): Cluster = js.native
  def removeAllListeners(): Cluster = js.native
  def removeAllListeners(event: java.lang.String): Cluster = js.native
  def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): Cluster = js.native
  def setMaxListeners(n: scala.Double): Cluster = js.native
  def setupMaster(): scala.Unit = js.native
  def setupMaster(settings: ClusterSettings): scala.Unit = js.native
}

