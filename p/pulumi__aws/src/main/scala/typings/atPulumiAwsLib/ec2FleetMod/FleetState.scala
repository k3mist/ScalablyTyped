package typings
package atPulumiAwsLib.ec2FleetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetState extends js.Object {
  /**
    * Whether running instances should be terminated if the total target capacity of the EC2 Fleet is decreased below the current size of the EC2. Valid values: `no-termination`, `termination`. Defaults to `termination`.
    */
  val excessCapacityTerminationPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Nested argument containing EC2 Launch Template configurations. Defined below.
    */
  val launchTemplateConfig: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      atPulumiAwsLib.Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZoneInstanceType
    ]
  ] = js.undefined
  /**
    * Nested argument containing On-Demand configurations. Defined below.
    */
  val onDemandOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllocationStrategyInput]] = js.undefined
  /**
    * Whether EC2 Fleet should replace unhealthy instances. Defaults to `false`.
    */
  val replaceUnhealthyInstances: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Nested argument containing Spot configurations. Defined below.
    */
  val spotOptions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      atPulumiAwsLib.Anon_AllocationStrategyInstanceInterruptionBehaviorInstancePoolsToUseCount
    ]
  ] = js.undefined
  /**
    * Map of Fleet tags. To tag instances at launch, specify the tags in the Launch Template.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * Nested argument containing target capacity configurations. Defined below.
    */
  val targetCapacitySpecification: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DefaultTargetCapacityTypeOnDemandTargetCapacity]
  ] = js.undefined
  /**
    * Whether to terminate instances for an EC2 Fleet if it is deleted successfully. Defaults to `false`.
    */
  val terminateInstances: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Whether running instances should be terminated when the EC2 Fleet expires. Defaults to `false`.
    */
  val terminateInstancesWithExpiration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The type of request. Indicates whether the EC2 Fleet only requests the target capacity, or also attempts to maintain it. Valid values: `maintain`, `request`. Defaults to `maintain`.
    */
  val `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object FleetState {
  @scala.inline
  def apply(
    excessCapacityTerminationPolicy: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    launchTemplateConfig: atPulumiPulumiLib.resourceMod.Input[
      atPulumiAwsLib.Anon_LaunchTemplateSpecificationOverridesAnonAvailabilityZoneInstanceType
    ] = null,
    onDemandOptions: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AllocationStrategyInput] = null,
    replaceUnhealthyInstances: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    spotOptions: atPulumiPulumiLib.resourceMod.Input[
      atPulumiAwsLib.Anon_AllocationStrategyInstanceInterruptionBehaviorInstancePoolsToUseCount
    ] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
    ] = null,
    targetCapacitySpecification: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DefaultTargetCapacityTypeOnDemandTargetCapacity] = null,
    terminateInstances: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    terminateInstancesWithExpiration: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): FleetState = {
    val __obj = js.Dynamic.literal()
    if (excessCapacityTerminationPolicy != null) __obj.updateDynamic("excessCapacityTerminationPolicy")(excessCapacityTerminationPolicy.asInstanceOf[js.Any])
    if (launchTemplateConfig != null) __obj.updateDynamic("launchTemplateConfig")(launchTemplateConfig.asInstanceOf[js.Any])
    if (onDemandOptions != null) __obj.updateDynamic("onDemandOptions")(onDemandOptions.asInstanceOf[js.Any])
    if (replaceUnhealthyInstances != null) __obj.updateDynamic("replaceUnhealthyInstances")(replaceUnhealthyInstances.asInstanceOf[js.Any])
    if (spotOptions != null) __obj.updateDynamic("spotOptions")(spotOptions.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (targetCapacitySpecification != null) __obj.updateDynamic("targetCapacitySpecification")(targetCapacitySpecification.asInstanceOf[js.Any])
    if (terminateInstances != null) __obj.updateDynamic("terminateInstances")(terminateInstances.asInstanceOf[js.Any])
    if (terminateInstancesWithExpiration != null) __obj.updateDynamic("terminateInstancesWithExpiration")(terminateInstancesWithExpiration.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetState]
  }
}

