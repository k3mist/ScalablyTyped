package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side dashboard parameter.
  */
trait ASPxClientDashboardParameter extends js.Object {
  /**
    * Gets the dashboard parameter name on the client side.
    * Value: A string value that is the dashboard parameter name on the client side.
    */
  var Name: java.lang.String
  /**
    * Gets the dashboard parameter value on the client side.
    * Value: A string value that specifies the dashboard parameter value on the client side.
    */
  var Value: js.Object
  /**
    * Returns a default parameter value.
    */
  def GetDefaultValue(): js.Object
  /**
    * Returns the parameter's description displayed to an end-user.
    */
  def GetDescription(): java.lang.String
  /**
    * Returns a parameter name.
    */
  def GetName(): java.lang.String
  /**
    * Returns a parameter type.
    */
  def GetType(): java.lang.String
  /**
    * Returns a current parameter value(s).
    */
  def GetValue(): js.Object
  /**
    * Returns possible parameter values.
    */
  def GetValues(): js.Array[ASPxClientDashboardParameterValue]
  /**
    * Specifies the current parameter value(s).
    * @param value The current parameter value(s).
    */
  def SetValue(value: js.Object): scala.Unit
}

object ASPxClientDashboardParameter {
  @scala.inline
  def apply(
    GetDefaultValue: () => js.Object,
    GetDescription: () => java.lang.String,
    GetName: () => java.lang.String,
    GetType: () => java.lang.String,
    GetValue: () => js.Object,
    GetValues: () => js.Array[ASPxClientDashboardParameterValue],
    Name: java.lang.String,
    SetValue: js.Object => scala.Unit,
    Value: js.Object
  ): ASPxClientDashboardParameter = {
    val __obj = js.Dynamic.literal(GetDefaultValue = js.Any.fromFunction0(GetDefaultValue), GetDescription = js.Any.fromFunction0(GetDescription), GetName = js.Any.fromFunction0(GetName), GetType = js.Any.fromFunction0(GetType), GetValue = js.Any.fromFunction0(GetValue), GetValues = js.Any.fromFunction0(GetValues), Name = Name, SetValue = js.Any.fromFunction1(SetValue), Value = Value)
  
    __obj.asInstanceOf[ASPxClientDashboardParameter]
  }
}

