package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxTitleIndex object.
  */
trait ASPxClientTitleIndex extends ASPxClientControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTitleIndex]]
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientTitleIndex.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTitleIndex]]
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTitleIndex]]
  /**
    * Fires after an item has been clicked.
    */
  var ItemClick: ASPxClientEvent[ASPxClientTitleIndexItemEventHandler[ASPxClientTitleIndex]]
}

object ASPxClientTitleIndex {
  @scala.inline
  def apply(
    AdjustControl: () => scala.Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientTitleIndex]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientTitleIndex]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientTitleIndex]],
    GetClientVisible: () => scala.Boolean,
    GetHeight: () => scala.Double,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetVisible: () => scala.Boolean,
    GetWidth: () => scala.Double,
    InCallback: () => scala.Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    ItemClick: ASPxClientEvent[ASPxClientTitleIndexItemEventHandler[ASPxClientTitleIndex]],
    SendMessageToAssistiveTechnology: java.lang.String => scala.Unit,
    SetClientVisible: scala.Boolean => scala.Unit,
    SetHeight: scala.Double => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    SetWidth: scala.Double => scala.Unit,
    name: java.lang.String
  ): ASPxClientTitleIndex = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback, CallbackError = CallbackError, EndCallback = EndCallback, GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, ItemClick = ItemClick, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name)
  
    __obj.asInstanceOf[ASPxClientTitleIndex]
  }
}

