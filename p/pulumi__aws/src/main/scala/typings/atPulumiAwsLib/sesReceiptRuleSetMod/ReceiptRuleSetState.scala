package typings
package atPulumiAwsLib.sesReceiptRuleSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleSetState extends js.Object {
  /**
    * The name of the rule set
    */
  val ruleSetName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object ReceiptRuleSetState {
  @scala.inline
  def apply(ruleSetName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null): ReceiptRuleSetState = {
    val __obj = js.Dynamic.literal()
    if (ruleSetName != null) __obj.updateDynamic("ruleSetName")(ruleSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRuleSetState]
  }
}

