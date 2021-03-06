package typings
package reactDashDndLib.libCjsDragDropContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/cjs/DragDropContext", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /* import warning: parser.TsParser#tsDeclVar $anonfun Dropped List(Provider) */ val Consumer: reactLib.reactMod.ReactNs.ExoticComponent[reactLib.reactMod.ReactNs.ConsumerProps[DragDropContext[js.Any]]] = js.native
  val DragDropContextProvider: reactLib.reactMod.ReactNs.FC[DragDropContextProviderProps[js.Any]] = js.native
  val context: reactLib.reactMod.ReactNs.Context[DragDropContext[js.Any]] = js.native
  def DragDropContext(backendFactory: dndDashCoreLib.libCjsInterfacesMod.BackendFactory): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.ComponentType[_] with reactDashDndLib.libCjsInterfacesClassApiMod.ContextComponent[_]
  ] = js.native
  def DragDropContext(backendFactory: dndDashCoreLib.libCjsInterfacesMod.BackendFactory, backendContext: js.Any): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.ComponentType[_] with reactDashDndLib.libCjsInterfacesClassApiMod.ContextComponent[_]
  ] = js.native
  def DragDropContext(
    backendFactory: dndDashCoreLib.libCjsInterfacesMod.BackendFactory,
    backendContext: js.Any,
    debugMode: scala.Boolean
  ): js.Function1[
    /* DecoratedComponent */ reactLib.reactMod.ReactNs.ComponentType[_], 
    reactLib.reactMod.ReactNs.ComponentType[_] with reactDashDndLib.libCjsInterfacesClassApiMod.ContextComponent[_]
  ] = js.native
  def createChildContext[BackendContext](backend: dndDashCoreLib.libCjsInterfacesMod.BackendFactory): reactDashDndLib.Anon_DragDropManager[BackendContext] = js.native
  def createChildContext[BackendContext](backend: dndDashCoreLib.libCjsInterfacesMod.BackendFactory, context: BackendContext): reactDashDndLib.Anon_DragDropManager[BackendContext] = js.native
  def createChildContext[BackendContext](
    backend: dndDashCoreLib.libCjsInterfacesMod.BackendFactory,
    context: BackendContext,
    debugMode: scala.Boolean
  ): reactDashDndLib.Anon_DragDropManager[BackendContext] = js.native
}

