package typings
package atPulumiAwsLib.sesReceiptRuleSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptRuleSetArgs extends js.Object {
  /**
    * The name of the rule set
    */
  val ruleSetName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object ReceiptRuleSetArgs {
  @scala.inline
  def apply(ruleSetName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]): ReceiptRuleSetArgs = {
    val __obj = js.Dynamic.literal(ruleSetName = ruleSetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReceiptRuleSetArgs]
  }
}

