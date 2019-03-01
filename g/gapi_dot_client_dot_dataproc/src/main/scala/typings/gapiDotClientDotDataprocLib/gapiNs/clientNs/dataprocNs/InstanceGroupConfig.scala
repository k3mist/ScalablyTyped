package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupConfig extends js.Object {
  /**
    * Optional. The Google Compute Engine accelerator configuration for these instances.Beta Feature: This feature is still under development. It may be
    * changed before final release.
    */
  var accelerators: js.UndefOr[js.Array[AcceleratorConfig]] = js.undefined
  /** Optional. Disk option config settings. */
  var diskConfig: js.UndefOr[DiskConfig] = js.undefined
  /** Output-only. The Google Compute Engine image resource used for cluster instances. Inferred from SoftwareConfig.image_version. */
  var imageUri: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional. The list of instance names. Cloud Dataproc derives the names from cluster_name, num_instances, and the instance group if not set by user
    * (recommended practice is to let Cloud Dataproc derive the name).
    */
  var instanceNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Optional. Specifies that this instance group contains preemptible instances. */
  var isPreemptible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Optional. The Google Compute Engine machine type used for cluster instances.A full URL, partial URI, or short name are valid. Examples:
    * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2
    * projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2
    * n1-standard-2
    */
  var machineTypeUri: js.UndefOr[java.lang.String] = js.undefined
  /** Output-only. The config for Google Compute Engine Instance Group Manager that manages this group. This is only used for preemptible instance groups. */
  var managedGroupConfig: js.UndefOr[ManagedGroupConfig] = js.undefined
  /** Optional. The number of VM instances in the instance group. For master instance groups, must be set to 1. */
  var numInstances: js.UndefOr[scala.Double] = js.undefined
}

object InstanceGroupConfig {
  @scala.inline
  def apply(
    accelerators: js.Array[AcceleratorConfig] = null,
    diskConfig: DiskConfig = null,
    imageUri: java.lang.String = null,
    instanceNames: js.Array[java.lang.String] = null,
    isPreemptible: js.UndefOr[scala.Boolean] = js.undefined,
    machineTypeUri: java.lang.String = null,
    managedGroupConfig: ManagedGroupConfig = null,
    numInstances: scala.Int | scala.Double = null
  ): InstanceGroupConfig = {
    val __obj = js.Dynamic.literal()
    if (accelerators != null) __obj.updateDynamic("accelerators")(accelerators)
    if (diskConfig != null) __obj.updateDynamic("diskConfig")(diskConfig)
    if (imageUri != null) __obj.updateDynamic("imageUri")(imageUri)
    if (instanceNames != null) __obj.updateDynamic("instanceNames")(instanceNames)
    if (!js.isUndefined(isPreemptible)) __obj.updateDynamic("isPreemptible")(isPreemptible)
    if (machineTypeUri != null) __obj.updateDynamic("machineTypeUri")(machineTypeUri)
    if (managedGroupConfig != null) __obj.updateDynamic("managedGroupConfig")(managedGroupConfig)
    if (numInstances != null) __obj.updateDynamic("numInstances")(numInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupConfig]
  }
}

