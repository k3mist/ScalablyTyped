package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldValidation extends js.Object {
  var __errors: js.Array[FieldError]
  def addError(message: java.lang.String): scala.Unit
}

object FieldValidation {
  @scala.inline
  def apply(__errors: js.Array[FieldError], addError: js.Function1[java.lang.String, scala.Unit]): FieldValidation = {
    val __obj = js.Dynamic.literal(__errors = __errors, addError = addError)
  
    __obj.asInstanceOf[FieldValidation]
  }
}

