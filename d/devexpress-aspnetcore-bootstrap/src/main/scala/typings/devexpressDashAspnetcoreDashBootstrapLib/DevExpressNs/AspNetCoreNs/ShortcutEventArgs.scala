package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcutEventArgs extends EventArgs {
  val commandName: java.lang.String
  val handled: scala.Boolean
  val htmlEvent: js.Object
}

object ShortcutEventArgs {
  @scala.inline
  def apply(commandName: java.lang.String, handled: scala.Boolean, htmlEvent: js.Object, sender: Control): ShortcutEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName, handled = handled, htmlEvent = htmlEvent, sender = sender)
  
    __obj.asInstanceOf[ShortcutEventArgs]
  }
}

