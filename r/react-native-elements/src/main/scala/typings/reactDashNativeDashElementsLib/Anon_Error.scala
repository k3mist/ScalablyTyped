package typings
package reactDashNativeDashElementsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: java.lang.String
  var primary: java.lang.String
  var secondary: java.lang.String
  var success: java.lang.String
  var warning: java.lang.String
}

object Anon_Error {
  @scala.inline
  def apply(
    error: java.lang.String,
    primary: java.lang.String,
    secondary: java.lang.String,
    success: java.lang.String,
    warning: java.lang.String
  ): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error, primary = primary, secondary = secondary, success = success, warning = warning)
  
    __obj.asInstanceOf[Anon_Error]
  }
}

