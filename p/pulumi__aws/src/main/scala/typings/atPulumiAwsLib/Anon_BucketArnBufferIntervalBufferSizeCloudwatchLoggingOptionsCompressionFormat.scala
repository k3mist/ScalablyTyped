package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptionsCompressionFormat extends js.Object {
  var bucketArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var bufferInterval: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var bufferSize: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var cloudwatchLoggingOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_EnabledLogGroupNameLogStreamName]] = js.undefined
  var compressionFormat: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var dataFormatConversionConfiguration: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[Anon_EnabledInputFormatConfigurationOutputFormatConfiguration]
  ] = js.undefined
  var errorOutputPrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var kmsKeyArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var prefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var processingConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_EnabledProcessorsAnonParametersType]] = js.undefined
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var s3BackupConfiguration: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions]
  ] = js.undefined
  var s3BackupMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptionsCompressionFormat {
  @scala.inline
  def apply(
    bucketArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    bufferInterval: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    bufferSize: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    cloudwatchLoggingOptions: atPulumiPulumiLib.resourceMod.Input[Anon_EnabledLogGroupNameLogStreamName] = null,
    compressionFormat: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    dataFormatConversionConfiguration: atPulumiPulumiLib.resourceMod.Input[Anon_EnabledInputFormatConfigurationOutputFormatConfiguration] = null,
    errorOutputPrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    kmsKeyArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    prefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    processingConfiguration: atPulumiPulumiLib.resourceMod.Input[Anon_EnabledProcessorsAnonParametersType] = null,
    s3BackupConfiguration: atPulumiPulumiLib.resourceMod.Input[Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions] = null,
    s3BackupMode: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptionsCompressionFormat = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (bufferInterval != null) __obj.updateDynamic("bufferInterval")(bufferInterval.asInstanceOf[js.Any])
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (cloudwatchLoggingOptions != null) __obj.updateDynamic("cloudwatchLoggingOptions")(cloudwatchLoggingOptions.asInstanceOf[js.Any])
    if (compressionFormat != null) __obj.updateDynamic("compressionFormat")(compressionFormat.asInstanceOf[js.Any])
    if (dataFormatConversionConfiguration != null) __obj.updateDynamic("dataFormatConversionConfiguration")(dataFormatConversionConfiguration.asInstanceOf[js.Any])
    if (errorOutputPrefix != null) __obj.updateDynamic("errorOutputPrefix")(errorOutputPrefix.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration.asInstanceOf[js.Any])
    if (s3BackupConfiguration != null) __obj.updateDynamic("s3BackupConfiguration")(s3BackupConfiguration.asInstanceOf[js.Any])
    if (s3BackupMode != null) __obj.updateDynamic("s3BackupMode")(s3BackupMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptionsCompressionFormat]
  }
}

