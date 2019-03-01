package typings
package atPulumiAwsLib.servicediscoveryServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceState extends js.Object {
  /**
    * The ARN of the service.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The description of the service.
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
    */
  val dnsConfig: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DnsRecordsNamespaceId]] = js.undefined
  /**
    * A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
    */
  val healthCheckConfig: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_FailureThresholdResourcePath]
  ] = js.undefined
  /**
    * A complex type that contains settings for ECS managed health checks.
    */
  val healthCheckCustomConfig: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_FailureThresholdInput]] = js.undefined
  /**
    * The name of the service.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object ServiceState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    dnsConfig: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DnsRecordsNamespaceId] = null,
    healthCheckConfig: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_FailureThresholdResourcePath] = null,
    healthCheckCustomConfig: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_FailureThresholdInput] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): ServiceState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dnsConfig != null) __obj.updateDynamic("dnsConfig")(dnsConfig.asInstanceOf[js.Any])
    if (healthCheckConfig != null) __obj.updateDynamic("healthCheckConfig")(healthCheckConfig.asInstanceOf[js.Any])
    if (healthCheckCustomConfig != null) __obj.updateDynamic("healthCheckCustomConfig")(healthCheckCustomConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceState]
  }
}

