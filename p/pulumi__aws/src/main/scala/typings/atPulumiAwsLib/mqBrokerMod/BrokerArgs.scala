package typings
package atPulumiAwsLib.mqBrokerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerArgs extends js.Object {
  /**
    * Specifies whether any broker modifications
    * are applied immediately, or during the next maintenance window. Default is `false`.
    */
  val applyImmediately: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions.
    */
  val autoMinorVersionUpgrade: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The name of the broker.
    */
  val brokerName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Configuration of the broker. See below.
    */
  val configuration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_IdRevisionInput]] = js.undefined
  /**
    * The deployment mode of the broker. Supported: `SINGLE_INSTANCE` and `ACTIVE_STANDBY_MULTI_AZ`. Defaults to `SINGLE_INSTANCE`.
    */
  val deploymentMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of broker engine. Currently, Amazon MQ supports only `ActiveMQ`.
    */
  val engineType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The version of the broker engine. Currently, Amazon MQ supports only `5.15.0` or `5.15.6`.
    */
  val engineVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The broker's instance type. e.g. `mq.t2.micro` or `mq.m4.large`
    */
  val hostInstanceType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Logging configuration of the broker. See below.
    */
  val logs: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AuditGeneral]] = js.undefined
  /**
    * Maintenance window start time. See below.
    */
  val maintenanceWindowStartTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DayOfWeekTimeOfDay]] = js.undefined
  /**
    * Whether to enable connections from applications outside of the VPC that hosts the broker's subnets.
    */
  val publiclyAccessible: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The list of security group IDs assigned to the broker.
    */
  val securityGroups: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  /**
    * The list of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires two subnets.
    */
  val subnetIds: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * The list of all ActiveMQ usernames for the specified broker. See below.
    */
  val users: atPulumiPulumiLib.resourceMod.Input[
    js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ConsoleAccessGroups]]
  ]
}

object BrokerArgs {
  @scala.inline
  def apply(
    brokerName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    engineType: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    engineVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    hostInstanceType: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    securityGroups: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]],
    users: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_ConsoleAccessGroups]]
    ],
    applyImmediately: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    autoMinorVersionUpgrade: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    configuration: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_IdRevisionInput] = null,
    deploymentMode: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    logs: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AuditGeneral] = null,
    maintenanceWindowStartTime: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DayOfWeekTimeOfDay] = null,
    publiclyAccessible: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    subnetIds: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): BrokerArgs = {
    val __obj = js.Dynamic.literal(brokerName = brokerName.asInstanceOf[js.Any], engineType = engineType.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any], hostInstanceType = hostInstanceType.asInstanceOf[js.Any], securityGroups = securityGroups.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    if (applyImmediately != null) __obj.updateDynamic("applyImmediately")(applyImmediately.asInstanceOf[js.Any])
    if (autoMinorVersionUpgrade != null) __obj.updateDynamic("autoMinorVersionUpgrade")(autoMinorVersionUpgrade.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (deploymentMode != null) __obj.updateDynamic("deploymentMode")(deploymentMode.asInstanceOf[js.Any])
    if (logs != null) __obj.updateDynamic("logs")(logs.asInstanceOf[js.Any])
    if (maintenanceWindowStartTime != null) __obj.updateDynamic("maintenanceWindowStartTime")(maintenanceWindowStartTime.asInstanceOf[js.Any])
    if (publiclyAccessible != null) __obj.updateDynamic("publiclyAccessible")(publiclyAccessible.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerArgs]
  }
}

