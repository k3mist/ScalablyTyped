package typings
package atPulumiAwsLib.codedeployDeploymentGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupState extends js.Object {
  /**
    * Configuration block of alarms associated with the deployment group (documented below).
    */
  val alarmConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AlarmsEnabled]] = js.undefined
  /**
    * The name of the application.
    */
  val appName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Configuration block of the automatic rollback configuration associated with the deployment group (documented below).
    */
  val autoRollbackConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EnabledEvents]] = js.undefined
  /**
    * Autoscaling groups associated with the deployment group.
    */
  val autoscalingGroups: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Configuration block of the blue/green deployment options for a deployment group (documented below).
    */
  val blueGreenDeploymentConfig: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DeploymentReadyOptionGreenFleetProvisioningOption]
  ] = js.undefined
  /**
    * The name of the group's deployment config. The default is "CodeDeployDefault.OneAtATime".
    */
  val deploymentConfigName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the deployment group.
    */
  val deploymentGroupName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Configuration block of the type of deployment, either in-place or blue/green, you want to run and whether to route deployment traffic behind a load balancer (documented below).
    */
  val deploymentStyle: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DeploymentOptionDeploymentType]
  ] = js.undefined
  /**
    * Tag filters associated with the deployment group. See the AWS docs for details.
    */
  val ec2TagFilters: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_KeyTypeValueInput]]
    ]
  ] = js.undefined
  /**
    * Configuration block(s) of Tag filters associated with the deployment group, which are also referred to as tag groups (documented below). See the AWS docs for details.
    */
  val ec2TagSets: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_Ec2TagFiltersAnonKeyTypeValueInput]
      ]
    ]
  ] = js.undefined
  /**
    * Configuration block(s) of the ECS services for a deployment group (documented below).
    */
  val ecsService: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ClusterNameServiceName]] = js.undefined
  /**
    * Single configuration block of the load balancer to use in a blue/green deployment (documented below).
    */
  val loadBalancerInfo: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ElbInfosTargetGroupInfos]
  ] = js.undefined
  /**
    * On premise tag filters associated with the group. See the AWS docs for details.
    */
  val onPremisesInstanceTagFilters: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_KeyTypeValueInput]]
    ]
  ] = js.undefined
  /**
    * The service role ARN that allows deployments.
    */
  val serviceRoleArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Configuration block(s) of the triggers for the deployment group (documented below).
    */
  val triggerConfigurations: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_TriggerEventsTriggerName]
      ]
    ]
  ] = js.undefined
}

object DeploymentGroupState {
  @scala.inline
  def apply(
    alarmConfiguration: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AlarmsEnabled] = null,
    appName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    autoRollbackConfiguration: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EnabledEvents] = null,
    autoscalingGroups: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    blueGreenDeploymentConfig: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DeploymentReadyOptionGreenFleetProvisioningOption] = null,
    deploymentConfigName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    deploymentGroupName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    deploymentStyle: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DeploymentOptionDeploymentType] = null,
    ec2TagFilters: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_KeyTypeValueInput]]
    ] = null,
    ec2TagSets: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_Ec2TagFiltersAnonKeyTypeValueInput]
      ]
    ] = null,
    ecsService: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ClusterNameServiceName] = null,
    loadBalancerInfo: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ElbInfosTargetGroupInfos] = null,
    onPremisesInstanceTagFilters: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_KeyTypeValueInput]]
    ] = null,
    serviceRoleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    triggerConfigurations: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_TriggerEventsTriggerName]
      ]
    ] = null
  ): DeploymentGroupState = {
    val __obj = js.Dynamic.literal()
    if (alarmConfiguration != null) __obj.updateDynamic("alarmConfiguration")(alarmConfiguration.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (autoRollbackConfiguration != null) __obj.updateDynamic("autoRollbackConfiguration")(autoRollbackConfiguration.asInstanceOf[js.Any])
    if (autoscalingGroups != null) __obj.updateDynamic("autoscalingGroups")(autoscalingGroups.asInstanceOf[js.Any])
    if (blueGreenDeploymentConfig != null) __obj.updateDynamic("blueGreenDeploymentConfig")(blueGreenDeploymentConfig.asInstanceOf[js.Any])
    if (deploymentConfigName != null) __obj.updateDynamic("deploymentConfigName")(deploymentConfigName.asInstanceOf[js.Any])
    if (deploymentGroupName != null) __obj.updateDynamic("deploymentGroupName")(deploymentGroupName.asInstanceOf[js.Any])
    if (deploymentStyle != null) __obj.updateDynamic("deploymentStyle")(deploymentStyle.asInstanceOf[js.Any])
    if (ec2TagFilters != null) __obj.updateDynamic("ec2TagFilters")(ec2TagFilters.asInstanceOf[js.Any])
    if (ec2TagSets != null) __obj.updateDynamic("ec2TagSets")(ec2TagSets.asInstanceOf[js.Any])
    if (ecsService != null) __obj.updateDynamic("ecsService")(ecsService.asInstanceOf[js.Any])
    if (loadBalancerInfo != null) __obj.updateDynamic("loadBalancerInfo")(loadBalancerInfo.asInstanceOf[js.Any])
    if (onPremisesInstanceTagFilters != null) __obj.updateDynamic("onPremisesInstanceTagFilters")(onPremisesInstanceTagFilters.asInstanceOf[js.Any])
    if (serviceRoleArn != null) __obj.updateDynamic("serviceRoleArn")(serviceRoleArn.asInstanceOf[js.Any])
    if (triggerConfigurations != null) __obj.updateDynamic("triggerConfigurations")(triggerConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupState]
  }
}

