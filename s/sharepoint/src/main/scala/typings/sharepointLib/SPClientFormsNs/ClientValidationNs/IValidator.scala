package typings
package sharepointLib.SPClientFormsNs.ClientValidationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IValidator extends js.Object {
  def Validate(value: js.Any): ValidationResult
}

object IValidator {
  @scala.inline
  def apply(Validate: js.Function1[js.Any, ValidationResult]): IValidator = {
    val __obj = js.Dynamic.literal(Validate = Validate)
  
    __obj.asInstanceOf[IValidator]
  }
}

