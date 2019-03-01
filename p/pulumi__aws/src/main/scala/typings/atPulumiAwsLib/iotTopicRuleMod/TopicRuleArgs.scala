package typings
package atPulumiAwsLib.iotTopicRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicRuleArgs extends js.Object {
  val cloudwatchAlarm: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AlarmNameRoleArn]] = js.undefined
  val cloudwatchMetric: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_MetricNameMetricNamespace]
  ] = js.undefined
  /**
    * The description of the rule.
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  val dynamodb: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_HashKeyFieldHashKeyType]] = js.undefined
  val elasticsearch: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EndpointIdIndex]] = js.undefined
  /**
    * Specifies whether the rule is enabled.
    */
  val enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
  val firehose: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DeliveryStreamNameRoleArn]
  ] = js.undefined
  val kinesis: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_PartitionKeyRoleArn]] = js.undefined
  val lambda: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_FunctionArnInput]] = js.undefined
  /**
    * The name of the rule.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  val republish: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_RoleArnTopic]] = js.undefined
  val s3: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BucketNameKey]] = js.undefined
  val sns: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_MessageFormatRoleArn]] = js.undefined
  /**
    * The SQL statement used to query the topic. For more information, see AWS IoT SQL Reference (http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference) in the AWS IoT Developer Guide.
    */
  val sql: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The version of the SQL rules engine to use when evaluating the rule.
    */
  val sqlVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  val sqs: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_QueueUrlRoleArn]] = js.undefined
}

object TopicRuleArgs {
  @scala.inline
  def apply(
    enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean],
    sql: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    sqlVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    cloudwatchAlarm: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AlarmNameRoleArn] = null,
    cloudwatchMetric: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_MetricNameMetricNamespace] = null,
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    dynamodb: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_HashKeyFieldHashKeyType] = null,
    elasticsearch: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_EndpointIdIndex] = null,
    firehose: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DeliveryStreamNameRoleArn] = null,
    kinesis: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_PartitionKeyRoleArn] = null,
    lambda: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_FunctionArnInput] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    republish: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_RoleArnTopic] = null,
    s3: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_BucketNameKey] = null,
    sns: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_MessageFormatRoleArn] = null,
    sqs: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_QueueUrlRoleArn] = null
  ): TopicRuleArgs = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any], sqlVersion = sqlVersion.asInstanceOf[js.Any])
    if (cloudwatchAlarm != null) __obj.updateDynamic("cloudwatchAlarm")(cloudwatchAlarm.asInstanceOf[js.Any])
    if (cloudwatchMetric != null) __obj.updateDynamic("cloudwatchMetric")(cloudwatchMetric.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dynamodb != null) __obj.updateDynamic("dynamodb")(dynamodb.asInstanceOf[js.Any])
    if (elasticsearch != null) __obj.updateDynamic("elasticsearch")(elasticsearch.asInstanceOf[js.Any])
    if (firehose != null) __obj.updateDynamic("firehose")(firehose.asInstanceOf[js.Any])
    if (kinesis != null) __obj.updateDynamic("kinesis")(kinesis.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (republish != null) __obj.updateDynamic("republish")(republish.asInstanceOf[js.Any])
    if (s3 != null) __obj.updateDynamic("s3")(s3.asInstanceOf[js.Any])
    if (sns != null) __obj.updateDynamic("sns")(sns.asInstanceOf[js.Any])
    if (sqs != null) __obj.updateDynamic("sqs")(sqs.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleArgs]
  }
}

