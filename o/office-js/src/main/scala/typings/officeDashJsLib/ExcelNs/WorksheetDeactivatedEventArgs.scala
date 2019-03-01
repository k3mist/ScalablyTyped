package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Provides information about the worksheet that raised the Deactivated event.
  *
  * [Api set: ExcelApi 1.7]
  */
trait WorksheetDeactivatedEventArgs extends js.Object {
  /**
    *
    * Gets the type of the event. See Excel.EventType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var `type`: officeDashJsLib.officeDashJsLibStrings.WorksheetDeactivated
  /**
    *
    * Gets the id of the worksheet that is deactivated.
    *
    * [Api set: ExcelApi 1.7]
    */
  var worksheetId: java.lang.String
}

object WorksheetDeactivatedEventArgs {
  @scala.inline
  def apply(`type`: officeDashJsLib.officeDashJsLibStrings.WorksheetDeactivated, worksheetId: java.lang.String): WorksheetDeactivatedEventArgs = {
    val __obj = js.Dynamic.literal(`type` = `type`, worksheetId = worksheetId)
  
    __obj.asInstanceOf[WorksheetDeactivatedEventArgs]
  }
}

