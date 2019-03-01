package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditValidationEventArgs extends EventArgs {
  var errorText: java.lang.String
  var isValid: scala.Boolean
  var value: java.lang.String
}

object EditValidationEventArgs {
  @scala.inline
  def apply(errorText: java.lang.String, isValid: scala.Boolean, sender: Control, value: java.lang.String): EditValidationEventArgs = {
    val __obj = js.Dynamic.literal(errorText = errorText, isValid = isValid, sender = sender, value = value)
  
    __obj.asInstanceOf[EditValidationEventArgs]
  }
}

