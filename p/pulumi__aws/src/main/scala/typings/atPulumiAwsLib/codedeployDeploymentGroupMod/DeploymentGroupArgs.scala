package typings
package atPulumiAwsLib.codedeployDeploymentGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupArgs extends js.Object {
  /**
    * Configuration block of alarms associated with the deployment group (documented below).
    */
  val alarmConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AlarmsEnabled]] = js.undefined
  /**
    * The name of the application.
    */
  val appName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
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
  val deploymentGroupName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
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
  val serviceRoleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
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

