package typings
package atPulumiAwsLib.storagegatewayUploadBufferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadBufferState extends js.Object {
  /**
    * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
    */
  val diskId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object UploadBufferState {
  @scala.inline
  def apply(
    diskId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    gatewayArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): UploadBufferState = {
    val __obj = js.Dynamic.literal()
    if (diskId != null) __obj.updateDynamic("diskId")(diskId.asInstanceOf[js.Any])
    if (gatewayArn != null) __obj.updateDynamic("gatewayArn")(gatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadBufferState]
  }
}

