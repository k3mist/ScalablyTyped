package typings
package atlassianDashCrowdDashClientLib.libModelsValidationDashFactorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationFactors extends js.Object {
  val validationFactors: js.Any
  def toCrowd(): ValidationFactorsObj
}

object ValidationFactors {
  @scala.inline
  def apply(toCrowd: js.Function0[ValidationFactorsObj], validationFactors: js.Any): ValidationFactors = {
    val __obj = js.Dynamic.literal(toCrowd = toCrowd, validationFactors = validationFactors)
  
    __obj.asInstanceOf[ValidationFactors]
  }
}

