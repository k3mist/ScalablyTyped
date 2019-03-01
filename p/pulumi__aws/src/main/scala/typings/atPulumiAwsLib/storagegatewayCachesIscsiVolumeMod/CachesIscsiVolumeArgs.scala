package typings
package atPulumiAwsLib.storagegatewayCachesIscsiVolumeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CachesIscsiVolumeArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
    */
  val networkInterfaceId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The snapshot ID of the snapshot to restore as the new cached volume. e.g. `snap-1122aabb`.
    */
  val snapshotId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified existing volume's latest recovery point. The `volume_size_in_bytes` value for this new volume must be equal to or larger than the size of the existing volume, in bytes.
    */
  val sourceVolumeArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
    */
  val targetName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The size of the volume in bytes.
    */
  val volumeSizeInBytes: atPulumiPulumiLib.resourceMod.Input[scala.Double]
}

object CachesIscsiVolumeArgs {
  @scala.inline
  def apply(
    gatewayArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    networkInterfaceId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    targetName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    volumeSizeInBytes: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    snapshotId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    sourceVolumeArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): CachesIscsiVolumeArgs = {
    val __obj = js.Dynamic.literal(gatewayArn = gatewayArn.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any], volumeSizeInBytes = volumeSizeInBytes.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (sourceVolumeArn != null) __obj.updateDynamic("sourceVolumeArn")(sourceVolumeArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachesIscsiVolumeArgs]
  }
}

