package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BufferingIntervalBufferingSize extends js.Object {
  var bufferingInterval: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var bufferingSize: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var cloudwatchLoggingOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_EnabledLogGroupNameLogStreamName]] = js.undefined
  var domainArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var indexName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var indexRotationPeriod: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var processingConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_EnabledProcessorsAnonParametersType]] = js.undefined
  var retryDuration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var s3BackupMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var typeName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_BufferingIntervalBufferingSize {
  @scala.inline
  def apply(
    domainArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    indexName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    bufferingInterval: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    bufferingSize: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    cloudwatchLoggingOptions: atPulumiPulumiLib.resourceMod.Input[Anon_EnabledLogGroupNameLogStreamName] = null,
    indexRotationPeriod: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    processingConfiguration: atPulumiPulumiLib.resourceMod.Input[Anon_EnabledProcessorsAnonParametersType] = null,
    retryDuration: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    s3BackupMode: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    typeName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_BufferingIntervalBufferingSize = {
    val __obj = js.Dynamic.literal(domainArn = domainArn.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (bufferingInterval != null) __obj.updateDynamic("bufferingInterval")(bufferingInterval.asInstanceOf[js.Any])
    if (bufferingSize != null) __obj.updateDynamic("bufferingSize")(bufferingSize.asInstanceOf[js.Any])
    if (cloudwatchLoggingOptions != null) __obj.updateDynamic("cloudwatchLoggingOptions")(cloudwatchLoggingOptions.asInstanceOf[js.Any])
    if (indexRotationPeriod != null) __obj.updateDynamic("indexRotationPeriod")(indexRotationPeriod.asInstanceOf[js.Any])
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration.asInstanceOf[js.Any])
    if (retryDuration != null) __obj.updateDynamic("retryDuration")(retryDuration.asInstanceOf[js.Any])
    if (s3BackupMode != null) __obj.updateDynamic("s3BackupMode")(s3BackupMode.asInstanceOf[js.Any])
    if (typeName != null) __obj.updateDynamic("typeName")(typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BufferingIntervalBufferingSize]
  }
}

