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

