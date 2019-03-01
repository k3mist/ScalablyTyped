package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLoggingOptionsClusterJdbcurl extends js.Object {
  var cloudwatchLoggingOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_EnabledLogGroupNameLogStreamName]] = js.undefined
  var clusterJdbcurl: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var copyOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var dataTableColumns: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var dataTableName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var password: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var processingConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_EnabledProcessorsAnonParametersType]] = js.undefined
  var retryDuration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var s3BackupConfiguration: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions]
  ] = js.undefined
  var s3BackupMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var username: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_CloudwatchLoggingOptionsClusterJdbcurl {
  @scala.inline
  def apply(
    clusterJdbcurl: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    dataTableName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    password: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    username: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    cloudwatchLoggingOptions: atPulumiPulumiLib.resourceMod.Input[Anon_EnabledLogGroupNameLogStreamName] = null,
    copyOptions: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    dataTableColumns: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    processingConfiguration: atPulumiPulumiLib.resourceMod.Input[Anon_EnabledProcessorsAnonParametersType] = null,
    retryDuration: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    s3BackupConfiguration: atPulumiPulumiLib.resourceMod.Input[Anon_BucketArnBufferIntervalBufferSizeCloudwatchLoggingOptions] = null,
    s3BackupMode: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_CloudwatchLoggingOptionsClusterJdbcurl = {
    val __obj = js.Dynamic.literal(clusterJdbcurl = clusterJdbcurl.asInstanceOf[js.Any], dataTableName = dataTableName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (cloudwatchLoggingOptions != null) __obj.updateDynamic("cloudwatchLoggingOptions")(cloudwatchLoggingOptions.asInstanceOf[js.Any])
    if (copyOptions != null) __obj.updateDynamic("copyOptions")(copyOptions.asInstanceOf[js.Any])
    if (dataTableColumns != null) __obj.updateDynamic("dataTableColumns")(dataTableColumns.asInstanceOf[js.Any])
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration.asInstanceOf[js.Any])
    if (retryDuration != null) __obj.updateDynamic("retryDuration")(retryDuration.asInstanceOf[js.Any])
    if (s3BackupConfiguration != null) __obj.updateDynamic("s3BackupConfiguration")(s3BackupConfiguration.asInstanceOf[js.Any])
    if (s3BackupMode != null) __obj.updateDynamic("s3BackupMode")(s3BackupMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CloudwatchLoggingOptionsClusterJdbcurl]
  }
}

