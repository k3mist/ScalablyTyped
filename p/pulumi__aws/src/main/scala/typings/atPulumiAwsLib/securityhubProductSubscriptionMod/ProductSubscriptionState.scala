package typings
package atPulumiAwsLib.securityhubProductSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductSubscriptionState extends js.Object {
  /**
    * The ARN of a resource that represents your subscription to the product that generates the findings that you want to import into Security Hub.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the product that generates findings that you want to import into Security Hub - see below.
    */
  val productArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object ProductSubscriptionState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    productArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): ProductSubscriptionState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (productArn != null) __obj.updateDynamic("productArn")(productArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductSubscriptionState]
  }
}

