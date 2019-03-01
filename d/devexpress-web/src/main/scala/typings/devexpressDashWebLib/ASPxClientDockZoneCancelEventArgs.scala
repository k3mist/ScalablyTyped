package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the BeforeDock event.
  */
trait ASPxClientDockZoneCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  /**
    * Gets the panel currently being processed.
    * Value: An ASPxClientDockPanel object that is the processed panel.
    */
  var panel: ASPxClientDockPanel
}

object ASPxClientDockZoneCancelEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, panel: ASPxClientDockPanel, processOnServer: scala.Boolean): ASPxClientDockZoneCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, panel = panel, processOnServer = processOnServer)
  
    __obj.asInstanceOf[ASPxClientDockZoneCancelEventArgs]
  }
}

