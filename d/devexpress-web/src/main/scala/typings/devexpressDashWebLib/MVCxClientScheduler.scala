package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the Scheduler extension.
  */
@js.native
trait MVCxClientScheduler extends ASPxClientScheduler {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientScheduler: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientScheduler]] = js.native
  /**
    * Occurs on the client side when the tooltip is about to be displayed.
    */
  var ToolTipDisplaying: ASPxClientEvent[MVCxClientSchedulerToolTipDisplayingEventHandler[MVCxClientScheduler]] = js.native
  /**
    * Sends a callback with a parameter to update the Scheduler by processing the passed information on the server, in an Action specified via the Scheduler's CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the CustomActionRouteValues property.
    */
  def PerformCallback(data: js.Object): scala.Unit = js.native
  /**
    * Sends a callback with a parameter to update the Scheduler by processing the passed information on the server, in an Action specified via the Scheduler's CustomActionRouteValues property.
    * @param data An object containing any information that needs to be passed to a handling Action specified via the CustomActionRouteValues property.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(data: js.Object, onSuccess: js.Function1[/* arg1 */ java.lang.String, scala.Unit]): scala.Unit = js.native
}

