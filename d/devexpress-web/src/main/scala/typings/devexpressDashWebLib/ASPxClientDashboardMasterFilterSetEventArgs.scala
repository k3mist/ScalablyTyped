package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the MasterFilterSet event.
  */
trait ASPxClientDashboardMasterFilterSetEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the dashboard item.
    * Value: A string value that specifies the component name of the dashboard item.
    */
  var ItemName: java.lang.String
  /**
    * Gets values of currently selected elements in the master filter item.
    * Value: Values of currently selected elements in the master filter item.
    */
  var Values: js.Array[js.Array[js.Object]]
  /**
    * Returns whether or not the specified value is NullValue.
    * @param value The specified value.
    */
  def IsNullValue(value: js.Object): scala.Boolean
  /**
    * Returns whether or not the specified value is OthersValue.
    * @param value The specified value.
    */
  def IsOthersValue(value: js.Object): scala.Boolean
}

object ASPxClientDashboardMasterFilterSetEventArgs {
  @scala.inline
  def apply(
    IsNullValue: js.Function1[js.Object, scala.Boolean],
    IsOthersValue: js.Function1[js.Object, scala.Boolean],
    ItemName: java.lang.String,
    Values: js.Array[js.Array[js.Object]]
  ): ASPxClientDashboardMasterFilterSetEventArgs = {
    val __obj = js.Dynamic.literal(IsNullValue = IsNullValue, IsOthersValue = IsOthersValue, ItemName = ItemName, Values = Values)
  
    __obj.asInstanceOf[ASPxClientDashboardMasterFilterSetEventArgs]
  }
}

