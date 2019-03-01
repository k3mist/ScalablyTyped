package typings
package atPulumiAwsLib.kinesisStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) specifying the Stream (same as `id`)
    */
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The encryption type to use. The only acceptable values are `NONE` or `KMS`. The default value is `NONE`.
    */
  val encryptionType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The GUID for the customer-managed KMS key to use for encryption. You can also use a Kinesis-owned master key by specifying the alias aws/kinesis.
    */
  val kmsKeyId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A name to identify the stream. This is unique to the
    * AWS account and region the Stream is created in.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Length of time data records are accessible after they are added to the stream. The maximum value of a stream's retention period is 168 hours. Minimum value is 24. Default is 24.
    */
  val retentionPeriod: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The number of shards that the stream will use.
    * Amazon has guidlines for specifying the Stream size that should be referenced
    * when creating a Kinesis stream. See [Amazon Kinesis Streams][2] for more.
    */
  val shardCount: atPulumiPulumiLib.resourceMod.Input[scala.Double]
  /**
    * A list of shard-level CloudWatch metrics which can be enabled for the stream. See [Monitoring with CloudWatch][3] for more. Note that the value ALL should not be used; instead you should provide an explicit list of metrics you wish to enable.
    */
  val shardLevelMetrics: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
}

object StreamArgs {
  @scala.inline
  def apply(
    shardCount: atPulumiPulumiLib.resourceMod.Input[scala.Double],
    arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    encryptionType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    kmsKeyId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    retentionPeriod: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    shardLevelMetrics: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): StreamArgs = {
    val __obj = js.Dynamic.literal(shardCount = shardCount.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (encryptionType != null) __obj.updateDynamic("encryptionType")(encryptionType.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (retentionPeriod != null) __obj.updateDynamic("retentionPeriod")(retentionPeriod.asInstanceOf[js.Any])
    if (shardLevelMetrics != null) __obj.updateDynamic("shardLevelMetrics")(shardLevelMetrics.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamArgs]
  }
}

