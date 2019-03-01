package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageFormatRoleArn extends js.Object {
  var messageFormat: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var targetArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_MessageFormatRoleArn {
  @scala.inline
  def apply(
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    targetArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    messageFormat: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_MessageFormatRoleArn = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], targetArn = targetArn.asInstanceOf[js.Any])
    if (messageFormat != null) __obj.updateDynamic("messageFormat")(messageFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MessageFormatRoleArn]
  }
}

