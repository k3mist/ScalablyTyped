package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to clicking on the control's tabs.
  */
trait BootstrapClientTabControlTabClickEventArgs extends BootstrapClientTabControlTabCancelEventArgs {
  /**
    * Gets an HTML object that contains the processed tab.
    * Value: An HTML object.
    */
  var htmlElement: js.Object
  /**
    * Gets a DHTML event object that relates to the processed event.
    * Value: A DHTML event object.
    */
  var htmlEvent: js.Object
}

object BootstrapClientTabControlTabClickEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    htmlElement: js.Object,
    htmlEvent: js.Object,
    processOnServer: scala.Boolean,
    reloadContentOnCallback: scala.Boolean,
    tab: BootstrapClientTab
  ): BootstrapClientTabControlTabClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, htmlElement = htmlElement, htmlEvent = htmlEvent, processOnServer = processOnServer, reloadContentOnCallback = reloadContentOnCallback, tab = tab)
  
    __obj.asInstanceOf[BootstrapClientTabControlTabClickEventArgs]
  }
}

