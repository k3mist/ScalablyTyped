package typings
package atPulumiAwsLib.emrInstanceGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupArgs extends js.Object {
  /**
    * ID of the EMR Cluster to attach to. Changing this forces a new resource to be created.
    */
  val clusterId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * One or more `ebs_config` blocks as defined below. Changing this forces a new resource to be created.
    */
  val ebsConfigs: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_IopsSize]]]
  ] = js.undefined
  /**
    * Indicates whether an Amazon EBS volume is EBS-optimized. Changing this forces a new resource to be created.
    */
  val ebsOptimized: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Target number of instances for the instance group. Defaults to 0.
    */
  val instanceCount: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The EC2 instance type for all instances in the instance group. Changing this forces a new resource to be created.
    */
  val instanceType: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Human friendly name given to the instance group. Changing this forces a new resource to be created.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object InstanceGroupArgs {
  @scala.inline
  def apply(
    clusterId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    instanceType: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    ebsConfigs: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_IopsSize]]] = null,
    ebsOptimized: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    instanceCount: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): InstanceGroupArgs = {
    val __obj = js.Dynamic.literal(clusterId = clusterId.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    if (ebsConfigs != null) __obj.updateDynamic("ebsConfigs")(ebsConfigs.asInstanceOf[js.Any])
    if (ebsOptimized != null) __obj.updateDynamic("ebsOptimized")(ebsOptimized.asInstanceOf[js.Any])
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupArgs]
  }
}

