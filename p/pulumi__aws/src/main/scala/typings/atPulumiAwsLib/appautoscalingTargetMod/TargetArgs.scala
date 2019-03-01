package typings
package atPulumiAwsLib.appautoscalingTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetArgs extends js.Object {
  /**
    * The max capacity of the scalable target.
    */
  val maxCapacity: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  /**
    * The min capacity of the scalable target.
    */
  val minCapacity: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  /**
    * The resource type and unique identifier string for the resource associated with the scaling policy. Documentation can be found in the `ResourceId` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val resourceId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The ARN of the IAM role that allows Application
    * AutoScaling to modify your scalable target on your behalf.
    */
  val roleArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The scalable dimension of the scalable target. Documentation can be found in the `ScalableDimension` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val scalableDimension: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The AWS service namespace of the scalable target. Documentation can be found in the `ServiceNamespace` parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html#API_RegisterScalableTarget_RequestParameters)
    */
  val serviceNamespace: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object TargetArgs {
  @scala.inline
  def apply(
    maxCapacity: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    minCapacity: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    resourceId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    scalableDimension: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    serviceNamespace: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): TargetArgs = {
    val __obj = js.Dynamic.literal(maxCapacity = maxCapacity.asInstanceOf[js.Any], minCapacity = minCapacity.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], scalableDimension = scalableDimension.asInstanceOf[js.Any], serviceNamespace = serviceNamespace.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetArgs]
  }
}

