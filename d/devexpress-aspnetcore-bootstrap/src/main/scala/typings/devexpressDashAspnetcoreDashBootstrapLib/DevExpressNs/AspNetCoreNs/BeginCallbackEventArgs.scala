package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginCallbackEventArgs extends EventArgs {
  val command: java.lang.String
}

object BeginCallbackEventArgs {
  @scala.inline
  def apply(command: java.lang.String, sender: Control): BeginCallbackEventArgs = {
    val __obj = js.Dynamic.literal(command = command, sender = sender)
  
    __obj.asInstanceOf[BeginCallbackEventArgs]
  }
}

