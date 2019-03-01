package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdKinesisFirehoseKinesisStreamNamePrefix extends js.Object {
  var id: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var kinesisFirehose: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_ResourceArnRoleArn]] = js.undefined
  var kinesisStream: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_ResourceArnRoleArn]] = js.undefined
  var namePrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var parallelism: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_CountInput]] = js.undefined
  var processingConfiguration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_LambdaAnonResourceArnRoleArn]] = js.undefined
  var schema: atPulumiPulumiLib.resourceMod.Input[Anon_RecordColumnsRecordEncoding]
  var startingPositionConfigurations: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_StartingPositionInput]]]
  ] = js.undefined
  var streamNames: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
}

object Anon_IdKinesisFirehoseKinesisStreamNamePrefix {
  @scala.inline
  def apply(
    namePrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    schema: atPulumiPulumiLib.resourceMod.Input[Anon_RecordColumnsRecordEncoding],
    id: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    kinesisFirehose: atPulumiPulumiLib.resourceMod.Input[Anon_ResourceArnRoleArn] = null,
    kinesisStream: atPulumiPulumiLib.resourceMod.Input[Anon_ResourceArnRoleArn] = null,
    parallelism: atPulumiPulumiLib.resourceMod.Input[Anon_CountInput] = null,
    processingConfiguration: atPulumiPulumiLib.resourceMod.Input[Anon_LambdaAnonResourceArnRoleArn] = null,
    startingPositionConfigurations: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[Anon_StartingPositionInput]]] = null,
    streamNames: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): Anon_IdKinesisFirehoseKinesisStreamNamePrefix = {
    val __obj = js.Dynamic.literal(namePrefix = namePrefix.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kinesisFirehose != null) __obj.updateDynamic("kinesisFirehose")(kinesisFirehose.asInstanceOf[js.Any])
    if (kinesisStream != null) __obj.updateDynamic("kinesisStream")(kinesisStream.asInstanceOf[js.Any])
    if (parallelism != null) __obj.updateDynamic("parallelism")(parallelism.asInstanceOf[js.Any])
    if (processingConfiguration != null) __obj.updateDynamic("processingConfiguration")(processingConfiguration.asInstanceOf[js.Any])
    if (startingPositionConfigurations != null) __obj.updateDynamic("startingPositionConfigurations")(startingPositionConfigurations.asInstanceOf[js.Any])
    if (streamNames != null) __obj.updateDynamic("streamNames")(streamNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdKinesisFirehoseKinesisStreamNamePrefix]
  }
}

