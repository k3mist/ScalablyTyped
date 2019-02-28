package typings
package atPulumiAwsLib.opsworksStaticWebLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/opsworks/staticWebLayer", "StaticWebLayer")
@js.native
class StaticWebLayer protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a StaticWebLayer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: StaticWebLayerArgs) = this()
  def this(name: java.lang.String, args: StaticWebLayerArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Whether to automatically assign an elastic IP address to the layer's instances.
    */
  val autoAssignElasticIps: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * For stacks belonging to a VPC, whether to automatically assign a public IP address to each of the layer's instances.
    */
  val autoAssignPublicIps: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Whether to enable auto-healing for the layer.
    */
  val autoHealing: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  val customConfigureRecipes: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  val customDeployRecipes: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * The ARN of an IAM profile that will be used for the layer's instances.
    */
  val customInstanceProfileArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  val customJson: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Ids for a set of security groups to apply to the layer's instances.
    */
  val customSecurityGroupIds: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  val customSetupRecipes: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  val customShutdownRecipes: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  val customUndeployRecipes: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * Whether to enable Elastic Load Balancing connection draining.
    */
  val drainElbOnShutdown: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * `ebs_volume` blocks, as described below, will each create an EBS volume and connect it to the layer's instances.
    */
  val ebsVolumes: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_IopsMountPoint]]] = js.native
  /**
    * Name of an Elastic Load Balancer to attach to this layer
    */
  val elasticLoadBalancer: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Whether to install OS and package updates on each instance when it boots.
    */
  val installUpdatesOnBoot: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The time, in seconds, that OpsWorks will wait for Chef to complete after triggering the Shutdown event.
    */
  val instanceShutdownTimeout: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * A human-readable name for the layer.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The id of the stack the layer will belong to.
    */
  val stackId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Names of a set of system packages to install on the layer's instances.
    */
  val systemPackages: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * Whether to use EBS-optimized instances.
    */
  val useEbsOptimizedInstances: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/opsworks/staticWebLayer", "StaticWebLayer")
@js.native
object StaticWebLayer extends js.Object {
  /**
    * Get an existing StaticWebLayer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayer = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayerState
  ): atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayer = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayerState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.opsworksStaticWebLayerMod.StaticWebLayer = js.native
}

