package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the OnServerError event.
  */
trait ASPxClientReportDesignerErrorEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to information about a server-side error.
    * Value: An object that provides information about an error.
    */
  var Error: js.Object
}

object ASPxClientReportDesignerErrorEventArgs {
  @scala.inline
  def apply(Error: js.Object): ASPxClientReportDesignerErrorEventArgs = {
    val __obj = js.Dynamic.literal(Error = Error)
  
    __obj.asInstanceOf[ASPxClientReportDesignerErrorEventArgs]
  }
}

