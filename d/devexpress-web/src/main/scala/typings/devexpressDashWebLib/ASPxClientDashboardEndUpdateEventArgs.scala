package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the DashboardEndUpdate event.
  */
trait ASPxClientDashboardEndUpdateEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the identifier of the dashboard for which the event was raised.
    * Value: A string value that is the dashboard identifier.
    */
  var DashboardId: java.lang.String
}

object ASPxClientDashboardEndUpdateEventArgs {
  @scala.inline
  def apply(DashboardId: java.lang.String): ASPxClientDashboardEndUpdateEventArgs = {
    val __obj = js.Dynamic.literal(DashboardId = DashboardId)
  
    __obj.asInstanceOf[ASPxClientDashboardEndUpdateEventArgs]
  }
}

