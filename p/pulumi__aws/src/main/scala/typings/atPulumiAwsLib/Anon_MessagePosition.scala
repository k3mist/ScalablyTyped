package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessagePosition extends js.Object {
  var message: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var position: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  var sender: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var smtpReplyCode: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var statusCode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var topicArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_MessagePosition {
  @scala.inline
  def apply(
    message: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    position: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    sender: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    smtpReplyCode: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    statusCode: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    topicArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_MessagePosition = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], smtpReplyCode = smtpReplyCode.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MessagePosition]
  }
}

