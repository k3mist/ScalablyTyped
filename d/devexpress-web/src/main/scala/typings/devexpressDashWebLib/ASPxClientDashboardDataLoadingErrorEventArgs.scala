package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the DataLoadingError event.
  */
trait ASPxClientDashboardDataLoadingErrorEventArgs extends ASPxClientEventArgs {
  /**
    * Allows you to obtain the displayed error message.
    */
  def GetError(): java.lang.String
  /**
    * Allows you to determine whether or not the error message will be shown.
    */
  def IsErrorMessageShown(): scala.Boolean
  /**
    * Allows you to specify the displayed error message.
    * @param value A string value that specifies the displayed error message.
    */
  def SetError(value: java.lang.String): scala.Unit
  /**
    * Allows you to specify whether to show the error message.
    * @param value true, to show the error message; otherwise, false.
    */
  def ShowErrorMessage(value: scala.Boolean): scala.Unit
}

object ASPxClientDashboardDataLoadingErrorEventArgs {
  @scala.inline
  def apply(
    GetError: js.Function0[java.lang.String],
    IsErrorMessageShown: js.Function0[scala.Boolean],
    SetError: js.Function1[java.lang.String, scala.Unit],
    ShowErrorMessage: js.Function1[scala.Boolean, scala.Unit]
  ): ASPxClientDashboardDataLoadingErrorEventArgs = {
    val __obj = js.Dynamic.literal(GetError = GetError, IsErrorMessageShown = IsErrorMessageShown, SetError = SetError, ShowErrorMessage = ShowErrorMessage)
  
    __obj.asInstanceOf[ASPxClientDashboardDataLoadingErrorEventArgs]
  }
}

