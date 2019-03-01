package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions extends js.Object {
  var bucketArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var bufferInterval: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var bufferSize: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var cloudwatchLoggingOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_EnabledLogGroupNameLogStreamName]] = js.undefined
  var compressionFormat: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var kmsKeyArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var prefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions {
  @scala.inline
  def apply(
    bucketArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    bufferInterval: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    bufferSize: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    cloudwatchLoggingOptions: atPulumiPulumiLib.resourceMod.Input[Anon_EnabledLogGroupNameLogStreamName] = null,
    compressionFormat: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    kmsKeyArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    prefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (bufferInterval != null) __obj.updateDynamic("bufferInterval")(bufferInterval.asInstanceOf[js.Any])
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (cloudwatchLoggingOptions != null) __obj.updateDynamic("cloudwatchLoggingOptions")(cloudwatchLoggingOptions.asInstanceOf[js.Any])
    if (compressionFormat != null) __obj.updateDynamic("compressionFormat")(compressionFormat.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions]
  }
}

