package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessingModeCancelEventArgs extends ProcessingModeEventArgs {
  var cancel: scala.Boolean
}

object ProcessingModeCancelEventArgs {
  @scala.inline
  def apply(cancel: scala.Boolean, processOnServer: scala.Boolean, sender: Control): ProcessingModeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, processOnServer = processOnServer, sender = sender)
  
    __obj.asInstanceOf[ProcessingModeCancelEventArgs]
  }
}

