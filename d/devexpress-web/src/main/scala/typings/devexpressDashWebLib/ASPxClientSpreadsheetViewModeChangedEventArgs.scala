package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ViewModeChanged event.
  */
trait ASPxClientSpreadsheetViewModeChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the control's current view mode when the event is triggered.
    * Value: A <see cref="ASPxClientSpreadsheetViewMode" /> value specifying the control's view mode.
    */
  var oldViewMode: js.Any
}

object ASPxClientSpreadsheetViewModeChangedEventArgs {
  @scala.inline
  def apply(oldViewMode: js.Any): ASPxClientSpreadsheetViewModeChangedEventArgs = {
    val __obj = js.Dynamic.literal(oldViewMode = oldViewMode)
  
    __obj.asInstanceOf[ASPxClientSpreadsheetViewModeChangedEventArgs]
  }
}

