package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdLogStreamArnRoleArn extends js.Object {
  var id: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var logStreamArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_IdLogStreamArnRoleArn {
  @scala.inline
  def apply(
    logStreamArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    id: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_IdLogStreamArnRoleArn = {
    val __obj = js.Dynamic.literal(logStreamArn = logStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdLogStreamArnRoleArn]
  }
}

