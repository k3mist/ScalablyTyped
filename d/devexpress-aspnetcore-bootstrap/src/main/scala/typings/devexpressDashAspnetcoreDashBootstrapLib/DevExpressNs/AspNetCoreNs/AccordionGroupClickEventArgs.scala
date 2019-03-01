package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionGroupClickEventArgs extends AccordionGroupCancelEventArgs {
  val htmlElement: js.Object
  val htmlEvent: js.Object
}

object AccordionGroupClickEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    group: BootstrapAccordionGroup,
    htmlElement: js.Object,
    htmlEvent: js.Object,
    processOnServer: scala.Boolean,
    sender: Control
  ): AccordionGroupClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, group = group, htmlElement = htmlElement, htmlEvent = htmlEvent, processOnServer = processOnServer, sender = sender)
  
    __obj.asInstanceOf[AccordionGroupClickEventArgs]
  }
}

