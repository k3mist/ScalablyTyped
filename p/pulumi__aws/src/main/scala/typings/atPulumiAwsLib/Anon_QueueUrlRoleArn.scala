package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueueUrlRoleArn extends js.Object {
  var queueUrl: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var useBase64: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
}

object Anon_QueueUrlRoleArn {
  @scala.inline
  def apply(
    queueUrl: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    useBase64: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
  ): Anon_QueueUrlRoleArn = {
    val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], useBase64 = useBase64.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_QueueUrlRoleArn]
  }
}

