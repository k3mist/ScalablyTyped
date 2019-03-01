package typings
package atPulumiAwsLib.route53QueryLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryLogArgs extends js.Object {
  /**
    * CloudWatch log group ARN to send query logs.
    */
  val cloudwatchLogGroupArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Route53 hosted zone ID to enable query logs.
    */
  val zoneId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object QueryLogArgs {
  @scala.inline
  def apply(
    cloudwatchLogGroupArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    zoneId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): QueryLogArgs = {
    val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryLogArgs]
  }
}

