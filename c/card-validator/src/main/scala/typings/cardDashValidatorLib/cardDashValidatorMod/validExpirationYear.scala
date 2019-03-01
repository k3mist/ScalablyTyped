package typings
package cardDashValidatorLib.cardDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait validExpirationYear extends valid {
  var isCurrentYear: scala.Boolean
}

object validExpirationYear {
  @scala.inline
  def apply(isCurrentYear: scala.Boolean, isPotentiallyValid: scala.Boolean, isValid: scala.Boolean): validExpirationYear = {
    val __obj = js.Dynamic.literal(isCurrentYear = isCurrentYear, isPotentiallyValid = isPotentiallyValid, isValid = isValid)
  
    __obj.asInstanceOf[validExpirationYear]
  }
}

