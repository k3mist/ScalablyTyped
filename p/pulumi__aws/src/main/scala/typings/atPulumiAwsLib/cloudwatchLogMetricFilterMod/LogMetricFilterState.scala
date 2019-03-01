package typings
package atPulumiAwsLib.cloudwatchLogMetricFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogMetricFilterState extends js.Object {
  /**
    * The name of the log group to associate the metric filter with.
    */
  val logGroupName: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A block defining collection of information
    * needed to define how metric data gets emitted. See below.
    */
  val metricTransformation: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DefaultValueName]] = js.undefined
  /**
    * A name for the metric filter.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A valid [CloudWatch Logs filter pattern](https://docs.aws.amazon.com/AmazonCloudWatch/latest/DeveloperGuide/FilterAndPatternSyntax.html)
    * for extracting metric data out of ingested log events.
    */
  val pattern: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object LogMetricFilterState {
  @scala.inline
  def apply(
    logGroupName: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    metricTransformation: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DefaultValueName] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    pattern: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): LogMetricFilterState = {
    val __obj = js.Dynamic.literal()
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName.asInstanceOf[js.Any])
    if (metricTransformation != null) __obj.updateDynamic("metricTransformation")(metricTransformation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogMetricFilterState]
  }
}

