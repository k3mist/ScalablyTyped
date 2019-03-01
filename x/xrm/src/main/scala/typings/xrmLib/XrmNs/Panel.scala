package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the Xrm.Panel API
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-panel External Link: Xrm.Panel}
  */
trait Panel extends js.Object {
  /**
    * Displays the web page represented by a URL in the static area in the side pane, which appears on all pages in the Customer Engagement web client.
    * @param url URL of the page to be loaded in the side pane static area.
    * @param title Title of the side pane static area.
    * @remarks  This method is only supported for the web client.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-panel/loadpanel External Link: loadPanel (Client-side reference)}
    */
  def loadPanel(url: java.lang.String, title: java.lang.String): scala.Unit
}

object Panel {
  @scala.inline
  def apply(loadPanel: js.Function2[java.lang.String, java.lang.String, scala.Unit]): Panel = {
    val __obj = js.Dynamic.literal(loadPanel = loadPanel)
  
    __obj.asInstanceOf[Panel]
  }
}

