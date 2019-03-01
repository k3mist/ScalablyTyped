package typings
package atPulumiAwsLib.elasticbeanstalkEnvironmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentState extends js.Object {
  /**
    * List of all option settings configured in the Environment. These
    * are a combination of default settings and their overrides from `setting` in
    * the configuration.
    */
  val allSettings: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_NameNamespaceResource]]
    ]
  ] = js.undefined
  /**
    * Name of the application that contains the version
    * to be deployed
    */
  val application: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.elasticbeanstalkApplicationMod.Application]
  ] = js.undefined
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The autoscaling groups used by this environment.
    */
  val autoscalingGroups: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Fully qualified DNS name for the Environment.
    */
  val cname: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Prefix to use for the fully qualified DNS name of
    * the Environment.
    */
  val cnamePrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Short description of the Environment
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Instances used by this environment.
    */
  val instances: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Launch configurations in use by this environment.
    */
  val launchConfigurations: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Elastic load balancers in use by this environment.
    */
  val loadBalancers: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A unique name for this Environment. This name is used
    * in the application URL
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The [ARN][2] of the Elastic Beanstalk [Platform][3]
    * to use in deployment
    */
  val platformArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The time between polling the AWS API to
    * check if changes have been applied. Use this to adjust the rate of API calls
    * for any `create` or `update` action. Minimum `10s`, maximum `180s`. Omit this to
    * use the default behavior, which is an exponential backoff
    */
  val pollInterval: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * SQS queues in use by this environment.
    */
  val queues: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Option settings to configure the new Environment. These
    * override specific values that are set as defaults. The format is detailed
    * below in Option Settings
    */
  val settings: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_NameNamespaceResource]]
    ]
  ] = js.undefined
  /**
    * A solution stack to base your environment
    * off of. Example stacks can be found in the [Amazon API documentation][1]
    */
  val solutionStackName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A set of tags to apply to the Environment.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * The name of the Elastic Beanstalk Configuration
    * template to use in deployment
    */
  val templateName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Elastic Beanstalk Environment tier. Valid values are `Worker`
    * or `WebServer`. If tier is left blank `WebServer` will be used.
    */
  val tier: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Autoscaling triggers in use by this environment.
    */
  val triggers: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The name of the Elastic Beanstalk Application Version
    * to use in deployment.
    */
  val version: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersion]
  ] = js.undefined
  /**
    * The maximum
    * [duration](https://golang.org/pkg/time/#ParseDuration) that Terraform should
    * wait for an Elastic Beanstalk Environment to be in a ready state before timing
    * out.
    */
  val waitForReadyTimeout: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object EnvironmentState {
  @scala.inline
  def apply(
    allSettings: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_NameNamespaceResource]]
    ] = null,
    application: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.elasticbeanstalkApplicationMod.Application] = null,
    arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    autoscalingGroups: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    cname: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    cnamePrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    instances: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    launchConfigurations: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    loadBalancers: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    platformArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    pollInterval: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    queues: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    settings: atPulumiPulumiLib.resourceMod.Input[
      js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_NameNamespaceResource]]
    ] = null,
    solutionStackName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    templateName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tier: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    triggers: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    version: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.elasticbeanstalkApplicationVersionMod.ApplicationVersion] = null,
    waitForReadyTimeout: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): EnvironmentState = {
    val __obj = js.Dynamic.literal()
    if (allSettings != null) __obj.updateDynamic("allSettings")(allSettings.asInstanceOf[js.Any])
    if (application != null) __obj.updateDynamic("application")(application.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (autoscalingGroups != null) __obj.updateDynamic("autoscalingGroups")(autoscalingGroups.asInstanceOf[js.Any])
    if (cname != null) __obj.updateDynamic("cname")(cname.asInstanceOf[js.Any])
    if (cnamePrefix != null) __obj.updateDynamic("cnamePrefix")(cnamePrefix.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    if (launchConfigurations != null) __obj.updateDynamic("launchConfigurations")(launchConfigurations.asInstanceOf[js.Any])
    if (loadBalancers != null) __obj.updateDynamic("loadBalancers")(loadBalancers.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (platformArn != null) __obj.updateDynamic("platformArn")(platformArn.asInstanceOf[js.Any])
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (queues != null) __obj.updateDynamic("queues")(queues.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (solutionStackName != null) __obj.updateDynamic("solutionStackName")(solutionStackName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (templateName != null) __obj.updateDynamic("templateName")(templateName.asInstanceOf[js.Any])
    if (tier != null) __obj.updateDynamic("tier")(tier.asInstanceOf[js.Any])
    if (triggers != null) __obj.updateDynamic("triggers")(triggers.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (waitForReadyTimeout != null) __obj.updateDynamic("waitForReadyTimeout")(waitForReadyTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentState]
  }
}

