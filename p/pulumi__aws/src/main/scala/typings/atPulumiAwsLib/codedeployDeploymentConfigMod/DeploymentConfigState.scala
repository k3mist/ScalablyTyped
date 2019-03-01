package typings
package atPulumiAwsLib.codedeployDeploymentConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentConfigState extends js.Object {
  /**
    * The compute platform can be `Server`, `Lambda`, or `ECS`. Default is `Server`.
    */
  val computePlatform: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The AWS Assigned deployment config id
    */
  val deploymentConfigId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the deployment config.
    */
  val deploymentConfigName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A minimum_healthy_hosts block. Minimum Healthy Hosts are documented below.
    */
  val minimumHealthyHosts: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_TypeValueInput]] = js.undefined
  /**
    * A traffic_routing_config block. Traffic Routing Config is documented below.
    */
  val trafficRoutingConfig: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_TimeBasedCanaryTimeBasedLinear]
  ] = js.undefined
}

object DeploymentConfigState {
  @scala.inline
  def apply(
    computePlatform: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    deploymentConfigId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    deploymentConfigName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    minimumHealthyHosts: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_TypeValueInput] = null,
    trafficRoutingConfig: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_TimeBasedCanaryTimeBasedLinear] = null
  ): DeploymentConfigState = {
    val __obj = js.Dynamic.literal()
    if (computePlatform != null) __obj.updateDynamic("computePlatform")(computePlatform.asInstanceOf[js.Any])
    if (deploymentConfigId != null) __obj.updateDynamic("deploymentConfigId")(deploymentConfigId.asInstanceOf[js.Any])
    if (deploymentConfigName != null) __obj.updateDynamic("deploymentConfigName")(deploymentConfigName.asInstanceOf[js.Any])
    if (minimumHealthyHosts != null) __obj.updateDynamic("minimumHealthyHosts")(minimumHealthyHosts.asInstanceOf[js.Any])
    if (trafficRoutingConfig != null) __obj.updateDynamic("trafficRoutingConfig")(trafficRoutingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentConfigState]
  }
}

