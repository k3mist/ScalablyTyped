package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLogsRoleArnFieldLogLevel extends js.Object {
  var cloudwatchLogsRoleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var fieldLogLevel: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_CloudwatchLogsRoleArnFieldLogLevel {
  @scala.inline
  def apply(
    cloudwatchLogsRoleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    fieldLogLevel: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): Anon_CloudwatchLogsRoleArnFieldLogLevel = {
    val __obj = js.Dynamic.literal(cloudwatchLogsRoleArn = cloudwatchLogsRoleArn.asInstanceOf[js.Any], fieldLogLevel = fieldLogLevel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CloudwatchLogsRoleArnFieldLogLevel]
  }
}

