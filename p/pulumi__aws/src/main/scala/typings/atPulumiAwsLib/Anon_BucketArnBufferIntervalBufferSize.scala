package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BucketArnBufferIntervalBufferSize extends js.Object {
  var bucketArn: java.lang.String
  var bufferInterval: js.UndefOr[scala.Double] = js.undefined
  var bufferSize: js.UndefOr[scala.Double] = js.undefined
  var cloudwatchLoggingOptions: Anon_EnabledLogGroupName
  var compressionFormat: js.UndefOr[java.lang.String] = js.undefined
  var dataFormatConversionConfiguration: js.UndefOr[Anon_EnabledInputFormatConfiguration] = js.undefined
  var errorOutputPrefix: js.UndefOr[java.lang.String] = js.undefined
  var kmsKeyArn: js.UndefOr[java.lang.String] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var processingConfiguration: js.UndefOr[Anon_EnabledProcessors] = js.undefined
  var roleArn: java.lang.String
  var s3BackupConfiguration: js.UndefOr[Anon_BucketArnBufferInterval] = js.undefined
  var s3BackupMode: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BucketArnBufferIntervalBufferSize {
  @scala.inline
  def apply(
    bucketArn: java.lang.String,
    cloudwatchLoggingOptions: Anon_EnabledLogGroupName,
    roleArn: java.lang.String,
    bufferInterval: scala.Int | scala.Double = null,
    bufferSize: scala.Int | scala.Double = null,
    compressionFormat: java.lang.String = null,
    dataFormatConversionConfiguration: Anon_EnabledInputFormatConfiguration = null,
    errorOutputPrefix: java.lang.String = null,
    kmsKeyArn: java.lang.String = null,
    prefix: java.lang.String = null,
    processingConfiguration: Anon_EnabledProcessors = null,
    s3BackupConfiguration: Anon_BucketArnBufferInterval = null,
    s3BackupMode: java.lang.String = null
  ): Anon_BucketArnBufferIntervalBufferSize = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn, cloudwatchLoggingOptions = cloudwatchLoggingOptions, roleArn = roleArn)
    if (bufferInterval != null) __obj.updateDynamic("bufferInterval")(bufferInterval.asInstanceOf[js.Any])
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (compressionFormat != null) __obj.updateDynamic("compressionFormat")(compressionFormat)
    if (dataFormatConversionConfiguration != null) __obj.updateDynamic("dataFormatConversionConfiguration")(dataFormatConversionConfiguration)
    if (errorOutputPrefix != null) __obj.updateDynamic("errorOutputPrefix")(errorOutputPrefix)
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration)
    if (s3BackupConfiguration != null) __obj.updateDynamic("s3BackupConfiguration")(s3BackupConfiguration)
    if (s3BackupMode != null) __obj.updateDynamic("s3BackupMode")(s3BackupMode)
    __obj.asInstanceOf[Anon_BucketArnBufferIntervalBufferSize]
  }
}

