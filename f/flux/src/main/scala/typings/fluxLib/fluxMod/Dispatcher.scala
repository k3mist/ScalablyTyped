package typings
package fluxLib.fluxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flux", "Dispatcher")
@js.native
/**
  * Create an instance of the Dispatcher class to use throughout the application.
  *
  * Specify a type in the 'TPayload' generic argument to use strongly-typed payloads,
  * otherwise specify 'any'
  *
  * Examples:
  *     var dispatcher = new flux.Dispatcher<any>()
  *     var typedDispatcher = new flux.Dispatcher<MyCustomActionType>()
  */
class Dispatcher[TPayload] ()
  extends fluxLib.libDispatcherMod.namespaced[TPayload]

