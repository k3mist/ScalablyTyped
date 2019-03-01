package typings
package atPulumiAwsLib.kinesisAnalyticsApplicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationArgs extends js.Object {
  /**
    * The CloudWatch log stream options to monitor application errors.
    * See CloudWatch Logging Options below for more details.
    */
  val cloudwatchLoggingOptions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_IdLogStreamArnRoleArn]] = js.undefined
  /**
    * SQL Code to transform input data, and generate output.
    */
  val code: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Description of the application.
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Input configuration of the application. See Inputs below for more details.
    */
  val inputs: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_IdKinesisFirehoseKinesisStreamNamePrefix]
  ] = js.undefined
  /**
    * Name of the Kinesis Analytics Application.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Output destination configuration of the application. See Outputs below for more details.
    */
  val outputs: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_IdKinesisFirehoseKinesisStreamLambda]
      ]
    ]
  ] = js.undefined
  /**
    * An S3 Reference Data Source for the application.
    * See Reference Data Sources below for more details.
    */
  val referenceDataSources: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_IdS3Schema]] = js.undefined
}

object AnalyticsApplicationArgs {
  @scala.inline
  def apply(
    cloudwatchLoggingOptions: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_IdLogStreamArnRoleArn] = null,
    code: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    inputs: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_IdKinesisFirehoseKinesisStreamNamePrefix] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    outputs: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_IdKinesisFirehoseKinesisStreamLambda]
      ]
    ] = null,
    referenceDataSources: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_IdS3Schema] = null
  ): AnalyticsApplicationArgs = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchLoggingOptions != null) __obj.updateDynamic("cloudwatchLoggingOptions")(cloudwatchLoggingOptions.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (referenceDataSources != null) __obj.updateDynamic("referenceDataSources")(referenceDataSources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationArgs]
  }
}

