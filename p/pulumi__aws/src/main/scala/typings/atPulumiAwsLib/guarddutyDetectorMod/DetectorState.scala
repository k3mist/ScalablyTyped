package typings
package atPulumiAwsLib.guarddutyDetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectorState extends js.Object {
  /**
    * The AWS account ID of the GuardDuty detector
    */
  val accountId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Enable monitoring and feedback reporting. Setting to `false` is equivalent to "suspending" GuardDuty. Defaults to `true`.
    */
  val enable: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Specifies the frequency of notifications sent for subsequent finding occurrences. Valid values: `FIFTEEN_MINUTES, ONE_HOUR, SIX_HOURS`. Default: `SIX_HOURS`. See [AWS Documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_findings_cloudwatch.html#guardduty_findings_cloudwatch_notification_frequency) for more information.
    */
  val findingPublishingFrequency: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object DetectorState {
  @scala.inline
  def apply(
    accountId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    enable: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    findingPublishingFrequency: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): DetectorState = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(enable.asInstanceOf[js.Any])
    if (findingPublishingFrequency != null) __obj.updateDynamic("findingPublishingFrequency")(findingPublishingFrequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectorState]
  }
}

