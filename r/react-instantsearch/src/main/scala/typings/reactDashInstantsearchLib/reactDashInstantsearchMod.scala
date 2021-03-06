package typings
package reactDashInstantsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch", JSImport.Namespace)
@js.native
object reactDashInstantsearchMod extends js.Object {
  def createConnector[TProvided, TExposed](
    connectorDesc: reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectorDescription[TProvided, TExposed]
  ): (js.Function1[
    /* stateless */ reactLib.reactMod.ReactNs.StatelessComponent[
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectorProvided[TProvided]
    ], 
    reactLib.reactMod.ReactNs.ComponentClass[TExposed, reactLib.reactMod.ReactNs.ComponentState]
  ]) with (js.Function1[
    /* Composed */ reactLib.reactMod.ReactNs.ComponentType[
      stdLib.Partial[
        reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectorProvided[TProvided]
      ]
    ], 
    reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectedComponentClass[
      stdLib.Partial[
        reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectorProvided[TProvided]
      ], 
      reactDashInstantsearchDashCoreLib.reactDashInstantsearchDashCoreMod.ConnectorProvided[TProvided], 
      TExposed
    ]
  ]) = js.native
}

