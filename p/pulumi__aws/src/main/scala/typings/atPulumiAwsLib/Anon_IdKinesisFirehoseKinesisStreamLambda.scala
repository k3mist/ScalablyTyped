package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdKinesisFirehoseKinesisStreamLambda extends js.Object {
  var id: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var kinesisFirehose: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_ResourceArnRoleArn]] = js.undefined
  var kinesisStream: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_ResourceArnRoleArn]] = js.undefined
  var lambda: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[Anon_ResourceArnRoleArn]] = js.undefined
  var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var schema: atPulumiPulumiLib.resourceMod.Input[Anon_RecordFormatTypeInput]
}

object Anon_IdKinesisFirehoseKinesisStreamLambda {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    schema: atPulumiPulumiLib.resourceMod.Input[Anon_RecordFormatTypeInput],
    id: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    kinesisFirehose: atPulumiPulumiLib.resourceMod.Input[Anon_ResourceArnRoleArn] = null,
    kinesisStream: atPulumiPulumiLib.resourceMod.Input[Anon_ResourceArnRoleArn] = null,
    lambda: atPulumiPulumiLib.resourceMod.Input[Anon_ResourceArnRoleArn] = null
  ): Anon_IdKinesisFirehoseKinesisStreamLambda = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kinesisFirehose != null) __obj.updateDynamic("kinesisFirehose")(kinesisFirehose.asInstanceOf[js.Any])
    if (kinesisStream != null) __obj.updateDynamic("kinesisStream")(kinesisStream.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IdKinesisFirehoseKinesisStreamLambda]
  }
}

