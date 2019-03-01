package typings
package atPulumiAwsLib.cloudwatchMetricAlarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricAlarmState extends js.Object {
  /**
    * Indicates whether or not actions should be executed during any changes to the alarm's state. Defaults to `true`.
    */
  val actionsEnabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The list of actions to execute when this alarm transitions into an ALARM state from any other state. Each action is specified as an Amazon Resource Number (ARN).
    */
  val alarmActions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[java.lang.String | atPulumiAwsLib.snsTopicMod.Topic]
      ]
    ]
  ] = js.undefined
  /**
    * The description for the alarm.
    */
  val alarmDescription: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the cloudwatch metric alarm.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The arithmetic operation to use when comparing the specified Statistic and Threshold. The specified Statistic value is used as the first operand. Either of the following is supported: `GreaterThanOrEqualToThreshold`, `GreaterThanThreshold`, `LessThanThreshold`, `LessThanOrEqualToThreshold`.
    */
  val comparisonOperator: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The number of datapoints that must be breaching to trigger the alarm.
    */
  val datapointsToAlarm: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The dimensions for the alarm's associated metric.  For the list of available dimensions see the AWS documentation [here](http://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val dimensions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  /**
    * Used only for alarms
    * based on percentiles. If you specify `ignore`, the alarm state will not
    * change during periods with too few data points to be statistically significant.
    * If you specify `evaluate` or omit this parameter, the alarm will always be
    * evaluated and possibly change state no matter how many data points are available.
    * The following values are supported: `ignore`, and `evaluate`.
    */
  val evaluateLowSampleCountPercentiles: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The number of periods over which data is compared to the specified threshold.
    */
  val evaluationPeriods: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
    */
  val extendedStatistic: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The list of actions to execute when this alarm transitions into an INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Number (ARN).
    */
  val insufficientDataActions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[java.lang.String | atPulumiAwsLib.snsTopicMod.Topic]
      ]
    ]
  ] = js.undefined
  /**
    * The name for the alarm's associated metric.
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val metricName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The descriptive name for the alarm. This name must be unique within the user's AWS account
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The namespace for the alarm's associated metric. See docs for the [list of namespaces](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/aws-namespaces.html).
    * See docs for [supported metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/CW_Support_For_AWS.html).
    */
  val namespace: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The list of actions to execute when this alarm transitions into an OK state from any other state. Each action is specified as an Amazon Resource Number (ARN).
    */
  val okActions: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[java.lang.String | atPulumiAwsLib.snsTopicMod.Topic]
      ]
    ]
  ] = js.undefined
  /**
    * The period in seconds over which the specified `statistic` is applied.
    */
  val period: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * The statistic to apply to the alarm's associated metric.
    * Either of the following is supported: `SampleCount`, `Average`, `Sum`, `Minimum`, `Maximum`
    */
  val statistic: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The value against which the specified statistic is compared.
    */
  val threshold: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * Sets how this alarm is to handle missing data points. The following values are supported: `missing`, `ignore`, `breaching` and `notBreaching`. Defaults to `missing`.
    */
  val treatMissingData: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The unit for the alarm's associated metric.
    */
  val unit: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object MetricAlarmState {
  @scala.inline
  def apply(
    actionsEnabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    alarmActions: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[java.lang.String | atPulumiAwsLib.snsTopicMod.Topic]
      ]
    ] = null,
    alarmDescription: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    comparisonOperator: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    datapointsToAlarm: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    dimensions: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    evaluateLowSampleCountPercentiles: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    evaluationPeriods: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    extendedStatistic: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    insufficientDataActions: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[java.lang.String | atPulumiAwsLib.snsTopicMod.Topic]
      ]
    ] = null,
    metricName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    namespace: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    okActions: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[java.lang.String | atPulumiAwsLib.snsTopicMod.Topic]
      ]
    ] = null,
    period: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    statistic: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    threshold: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    treatMissingData: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    unit: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): MetricAlarmState = {
    val __obj = js.Dynamic.literal()
    if (actionsEnabled != null) __obj.updateDynamic("actionsEnabled")(actionsEnabled.asInstanceOf[js.Any])
    if (alarmActions != null) __obj.updateDynamic("alarmActions")(alarmActions.asInstanceOf[js.Any])
    if (alarmDescription != null) __obj.updateDynamic("alarmDescription")(alarmDescription.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (comparisonOperator != null) __obj.updateDynamic("comparisonOperator")(comparisonOperator.asInstanceOf[js.Any])
    if (datapointsToAlarm != null) __obj.updateDynamic("datapointsToAlarm")(datapointsToAlarm.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (evaluateLowSampleCountPercentiles != null) __obj.updateDynamic("evaluateLowSampleCountPercentiles")(evaluateLowSampleCountPercentiles.asInstanceOf[js.Any])
    if (evaluationPeriods != null) __obj.updateDynamic("evaluationPeriods")(evaluationPeriods.asInstanceOf[js.Any])
    if (extendedStatistic != null) __obj.updateDynamic("extendedStatistic")(extendedStatistic.asInstanceOf[js.Any])
    if (insufficientDataActions != null) __obj.updateDynamic("insufficientDataActions")(insufficientDataActions.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (okActions != null) __obj.updateDynamic("okActions")(okActions.asInstanceOf[js.Any])
    if (period != null) __obj.updateDynamic("period")(period.asInstanceOf[js.Any])
    if (statistic != null) __obj.updateDynamic("statistic")(statistic.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (treatMissingData != null) __obj.updateDynamic("treatMissingData")(treatMissingData.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricAlarmState]
  }
}

