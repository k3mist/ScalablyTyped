package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddConditionalFormatRuleRequest extends js.Object {
  /** The zero-based index where the rule should be inserted. */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** The rule to add. */
  var rule: js.UndefOr[ConditionalFormatRule] = js.undefined
}

object AddConditionalFormatRuleRequest {
  @scala.inline
  def apply(index: scala.Int | scala.Double = null, rule: ConditionalFormatRule = null): AddConditionalFormatRuleRequest = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[AddConditionalFormatRuleRequest]
  }
}

