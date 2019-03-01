package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetDataValidationRequest extends js.Object {
  /** The range the data validation rule should apply to. */
  var range: js.UndefOr[GridRange] = js.undefined
  /**
    * The data validation rule to set on each cell in the range,
    * or empty to clear the data validation in the range.
    */
  var rule: js.UndefOr[DataValidationRule] = js.undefined
}

object SetDataValidationRequest {
  @scala.inline
  def apply(range: GridRange = null, rule: DataValidationRule = null): SetDataValidationRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[SetDataValidationRequest]
  }
}

