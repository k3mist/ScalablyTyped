package typings
package atPulumiAwsLib.ssmResourceDataSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceDataSyncArgs extends js.Object {
  /**
    * Name for the configuration.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Amazon S3 configuration details for the sync.
    */
  val s3Destination: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BucketNameKmsKeyArnPrefixRegion]
}

object ResourceDataSyncArgs {
  @scala.inline
  def apply(
    s3Destination: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BucketNameKmsKeyArnPrefixRegion],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): ResourceDataSyncArgs = {
    val __obj = js.Dynamic.literal(s3Destination = s3Destination.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncArgs]
  }
}

