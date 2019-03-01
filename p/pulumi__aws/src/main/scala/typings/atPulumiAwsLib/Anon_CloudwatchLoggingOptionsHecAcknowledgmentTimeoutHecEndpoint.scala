package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeoutHecEndpoint extends js.Object {
  var cloudwatchLoggingOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_EnabledLogGroupNameLogStreamName]] = js.undefined
  var hecAcknowledgmentTimeout: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var hecEndpoint: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var hecEndpointType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var hecToken: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var processingConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_EnabledProcessorsAnonParametersType]] = js.undefined
  var retryDuration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var s3BackupMode: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeoutHecEndpoint {
  @scala.inline
  def apply(
    hecEndpoint: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    hecToken: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    cloudwatchLoggingOptions: atPulumiPulumiLib.resourceMod.Input[Anon_EnabledLogGroupNameLogStreamName] = null,
    hecAcknowledgmentTimeout: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    hecEndpointType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    processingConfiguration: atPulumiPulumiLib.resourceMod.Input[Anon_EnabledProcessorsAnonParametersType] = null,
    retryDuration: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    s3BackupMode: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeoutHecEndpoint = {
    val __obj = js.Dynamic.literal(hecEndpoint = hecEndpoint.asInstanceOf[js.Any], hecToken = hecToken.asInstanceOf[js.Any])
    if (cloudwatchLoggingOptions != null) __obj.updateDynamic("cloudwatchLoggingOptions")(cloudwatchLoggingOptions.asInstanceOf[js.Any])
    if (hecAcknowledgmentTimeout != null) __obj.updateDynamic("hecAcknowledgmentTimeout")(hecAcknowledgmentTimeout.asInstanceOf[js.Any])
    if (hecEndpointType != null) __obj.updateDynamic("hecEndpointType")(hecEndpointType.asInstanceOf[js.Any])
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration.asInstanceOf[js.Any])
    if (retryDuration != null) __obj.updateDynamic("retryDuration")(retryDuration.asInstanceOf[js.Any])
    if (s3BackupMode != null) __obj.updateDynamic("s3BackupMode")(s3BackupMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CloudwatchLoggingOptionsHecAcknowledgmentTimeoutHecEndpoint]
  }
}

