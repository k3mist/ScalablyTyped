package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketNameEnableS3KeyPrefix extends js.Object {
  var bucketName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var enable: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
  var s3KeyPrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_BucketNameEnableS3KeyPrefix {
  @scala.inline
  def apply(
    enable: atPulumiPulumiLib.resourceMod.Input[scala.Boolean],
    bucketName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    s3KeyPrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_BucketNameEnableS3KeyPrefix = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName.asInstanceOf[js.Any])
    if (s3KeyPrefix != null) __obj.updateDynamic("s3KeyPrefix")(s3KeyPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketNameEnableS3KeyPrefix]
  }
}

