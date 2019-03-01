package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the ASPxHiddenField control.
  */
trait ASPxClientHiddenField extends ASPxClientControl {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientHiddenField]]
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientHiddenField.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientHiddenField]]
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientHiddenField]]
  /**
    * Adds a new value to the control's collection of property name/value pairs, on the client side.
    * @param propertyName A string value that specifies the property name. It can contain letters, digits, underline characters, and dollar signs. It cannot begin with a digit character.
    * @param propertyValue An object that represents the value of the specified property.
    */
  def Add(propertyName: java.lang.String, propertyValue: js.Object): scala.Unit
  /**
    * Clears the ASPxHiddenField's value collection.
    */
  def Clear(): scala.Unit
  /**
    * Returns a value indicating whether the value with the specified property name is contained within the ASPxHiddenField control's value collection.
    * @param propertyName A string value that specifies the property name.
    */
  def Contains(propertyName: java.lang.String): scala.Boolean
  /**
    * Returns the value with the specified property name.
    * @param propertyName A string value that specifies the property name.
    */
  def Get(propertyName: java.lang.String): js.Object
  /**
    * Sends a callback to the server and generates the server-side CustomCallback event, passing it the specified argument.
    * @param parameter A string value that represents any information that needs to be sent to the server-side CustomCallback event.
    */
  def PerformCallback(parameter: java.lang.String): scala.Unit
  /**
    * Removes the specified value from the ASPxHiddenField collection.
    * @param propertyName A string value representing the property name.
    */
  def Remove(propertyName: java.lang.String): scala.Unit
  /**
    * Adds a new value to the control's collection of property name/value pairs, on the client side.
    * @param propertyName A string value that specifies the property name. It can contain letters, digits, underline characters, and dollar signs. It cannot begin with a digit character.
    * @param propertyValue An object that represents the property value.
    */
  def Set(propertyName: java.lang.String, propertyValue: js.Object): scala.Unit
}

object ASPxClientHiddenField {
  @scala.inline
  def apply(
    Add: js.Function2[java.lang.String, js.Object, scala.Unit],
    AdjustControl: js.Function0[scala.Unit],
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientHiddenField]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientHiddenField]],
    Clear: js.Function0[scala.Unit],
    Contains: js.Function1[java.lang.String, scala.Boolean],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientHiddenField]],
    Get: js.Function1[java.lang.String, js.Object],
    GetClientVisible: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    PerformCallback: js.Function1[java.lang.String, scala.Unit],
    Remove: js.Function1[java.lang.String, scala.Unit],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    Set: js.Function2[java.lang.String, js.Object, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientHiddenField = {
    val __obj = js.Dynamic.literal(Add = Add, AdjustControl = AdjustControl, BeginCallback = BeginCallback, CallbackError = CallbackError, Clear = Clear, Contains = Contains, EndCallback = EndCallback, Get = Get, GetClientVisible = GetClientVisible, GetHeight = GetHeight, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, PerformCallback = PerformCallback, Remove = Remove, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, Set = Set, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[ASPxClientHiddenField]
  }
}

