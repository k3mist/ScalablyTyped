package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Custom data validation criteria.
  *
  * [Api set: ExcelApi 1.8]
  */
trait CustomDataValidation extends js.Object {
  /**
    *
    * A custom data validation formula. This creates special input rules, such as preventing duplicates, or limiting the total in a range of cells.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula: java.lang.String
}

object CustomDataValidation {
  @scala.inline
  def apply(formula: java.lang.String): CustomDataValidation = {
    val __obj = js.Dynamic.literal(formula = formula)
  
    __obj.asInstanceOf[CustomDataValidation]
  }
}

