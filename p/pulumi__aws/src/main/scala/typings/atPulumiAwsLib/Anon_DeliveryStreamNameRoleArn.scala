package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeliveryStreamNameRoleArn extends js.Object {
  var deliveryStreamName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var separator: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_DeliveryStreamNameRoleArn {
  @scala.inline
  def apply(
    deliveryStreamName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    separator: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_DeliveryStreamNameRoleArn = {
    val __obj = js.Dynamic.literal(deliveryStreamName = deliveryStreamName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DeliveryStreamNameRoleArn]
  }
}

