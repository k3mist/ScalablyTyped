package typings
package atPulumiAwsLib.applicationloadbalancingTargetGroupAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetGroupAttachmentArgs extends js.Object {
  /**
    * The Availability Zone where the IP address of the target is to be registered.
    */
  val availabilityZone: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The port on which targets receive traffic.
    */
  val port: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The ARN of the target group with which to register targets
    */
  val targetGroupArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda.
    */
  val targetId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object TargetGroupAttachmentArgs {
  @scala.inline
  def apply(
    targetGroupArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    targetId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    availabilityZone: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    port: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): TargetGroupAttachmentArgs = {
    val __obj = js.Dynamic.literal(targetGroupArn = targetGroupArn.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroupAttachmentArgs]
  }
}

