package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the CloseUp event.
  */
trait ASPxClientPopupWindowCloseUpEventArgs extends ASPxClientPopupWindowEventArgs {
  /**
    * Gets the value that identifies the reason the popup window closes.
    * Value: One of the ASPxClientPopupControlCloseReason enumeration values.
    */
  var closeReason: ASPxClientPopupControlCloseReason
}

object ASPxClientPopupWindowCloseUpEventArgs {
  @scala.inline
  def apply(closeReason: ASPxClientPopupControlCloseReason, window: ASPxClientPopupWindow): ASPxClientPopupWindowCloseUpEventArgs = {
    val __obj = js.Dynamic.literal(closeReason = closeReason, window = window)
  
    __obj.asInstanceOf[ASPxClientPopupWindowCloseUpEventArgs]
  }
}

