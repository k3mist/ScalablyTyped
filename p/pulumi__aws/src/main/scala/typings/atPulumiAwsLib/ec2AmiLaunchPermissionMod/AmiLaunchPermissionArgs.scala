package typings
package atPulumiAwsLib.ec2AmiLaunchPermissionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmiLaunchPermissionArgs extends js.Object {
  /**
    * An AWS Account ID to add launch permissions.
    */
  val accountId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * A region-unique name for the AMI.
    */
  val imageId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object AmiLaunchPermissionArgs {
  @scala.inline
  def apply(
    accountId: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    imageId: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  ): AmiLaunchPermissionArgs = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AmiLaunchPermissionArgs]
  }
}

