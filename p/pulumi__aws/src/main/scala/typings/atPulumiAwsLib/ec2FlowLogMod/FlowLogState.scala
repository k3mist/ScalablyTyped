package typings
package atPulumiAwsLib.ec2FlowLogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlowLogState extends js.Object {
  /**
    * Elastic Network Interface ID to attach to
    */
  val eniId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN for the IAM role that's used to post flow logs to a CloudWatch Logs log group
    */
  val iamRoleArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the logging destination.
    */
  val logDestination: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of the logging destination. Valid values: `cloud-watch-logs`, `s3`. Default: `cloud-watch-logs`.
    */
  val logDestinationType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * *Deprecated:* Use `log_destination` instead. The name of the CloudWatch log group.
    */
  val logGroupName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Subnet ID to attach to
    */
  val subnetId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of traffic to capture. Valid values: `ACCEPT`,`REJECT`, `ALL`.
    */
  val trafficType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * VPC ID to attach to
    */
  val vpcId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object FlowLogState {
  @scala.inline
  def apply(
    eniId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    iamRoleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    logDestination: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    logDestinationType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    logGroupName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    subnetId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    trafficType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    vpcId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): FlowLogState = {
    val __obj = js.Dynamic.literal()
    if (eniId != null) __obj.updateDynamic("eniId")(eniId.asInstanceOf[js.Any])
    if (iamRoleArn != null) __obj.updateDynamic("iamRoleArn")(iamRoleArn.asInstanceOf[js.Any])
    if (logDestination != null) __obj.updateDynamic("logDestination")(logDestination.asInstanceOf[js.Any])
    if (logDestinationType != null) __obj.updateDynamic("logDestinationType")(logDestinationType.asInstanceOf[js.Any])
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (trafficType != null) __obj.updateDynamic("trafficType")(trafficType.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowLogState]
  }
}

