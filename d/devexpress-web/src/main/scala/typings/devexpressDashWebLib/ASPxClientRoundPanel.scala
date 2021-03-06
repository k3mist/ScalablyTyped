package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxRoundPanel control.
  */
@js.native
trait ASPxClientRoundPanel extends ASPxClientPanelBase {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientRoundPanel]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientRoundPanel.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientRoundPanel]] = js.native
  /**
    * Fires on the client side after a panel has been expanded or collapsed via end-user interactions, i.e., by clicking a panel header or collapse button.
    */
  var CollapsedChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientRoundPanel]] = js.native
  /**
    * Fires on the client side before a panel is expanded or collapsed by end-user interactions, i.e., by clicking a panel header or collapse button.
    */
  var CollapsedChanging: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientRoundPanel]] = js.native
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientRoundPanel]] = js.native
  /**
    * Returns a value indicating whether the panel is collapsed.
    */
  def GetCollapsed(): scala.Boolean = js.native
  /**
    * Returns the text displayed within the panel's header.
    */
  def GetHeaderText(): java.lang.String = js.native
  /**
    * Sends a callback to the server and generates the server-side ContentCallback event, passing it the specified argument.
    * @param parameter A string value that is any information that needs to be sent to the server-side ContentCallback event.
    */
  def PerformCallback(parameter: java.lang.String): scala.Unit = js.native
  /**
    * Sends a callback to the server and generates the server-side ContentCallback event, passing it the specified argument.
    * @param parameter A string value that is any information that needs to be sent to the server-side ContentCallback event.
    * @param onSuccess A client action to perform if the server round-trip completed successfully.
    */
  def PerformCallback(parameter: java.lang.String, onSuccess: js.Function1[/* arg1 */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
    * Sets a value indicating whether the panel is collapsed.
    * @param collapsed true, to collapse the panel; otherwise, false.
    */
  def SetCollapsed(collapsed: scala.Boolean): scala.Unit = js.native
  /**
    * Specifies the text displayed in the panel's header.
    * @param text A string value that specifies the panel header's text.
    */
  def SetHeaderText(text: java.lang.String): scala.Unit = js.native
}

