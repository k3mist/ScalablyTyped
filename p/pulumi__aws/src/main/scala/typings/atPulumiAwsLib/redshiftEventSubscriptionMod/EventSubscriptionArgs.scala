package typings
package atPulumiAwsLib.redshiftEventSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSubscriptionArgs extends js.Object {
  /**
    * A boolean flag to enable/disable the subscription. Defaults to true.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * A list of event categories for a SourceType that you want to subscribe to. See https://docs.aws.amazon.com/redshift/latest/mgmt/working-with-event-notifications.html or run `aws redshift describe-event-categories`.
    */
  val eventCategories: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The name of the Redshift event subscription.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The event severity to be published by the notification subscription. Valid options are `INFO` or `ERROR`.
    */
  val severity: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the SNS topic to send events to.
    */
  val snsTopicArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * A list of identifiers of the event sources for which events will be returned. If not specified, then all sources are included in the response. If specified, a source_type must also be specified.
    */
  val sourceIds: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The type of source that will be generating the events. Valid options are `cluster`, `cluster-parameter-group`, `cluster-security-group`, or `cluster-snapshot`. If not set, all sources will be subscribed to.
    */
  val sourceType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
}

object EventSubscriptionArgs {
  @scala.inline
  def apply(
    snsTopicArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    enabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    eventCategories: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    severity: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    sourceIds: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    sourceType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): EventSubscriptionArgs = {
    val __obj = js.Dynamic.literal(snsTopicArn = snsTopicArn.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (eventCategories != null) __obj.updateDynamic("eventCategories")(eventCategories.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (sourceIds != null) __obj.updateDynamic("sourceIds")(sourceIds.asInstanceOf[js.Any])
    if (sourceType != null) __obj.updateDynamic("sourceType")(sourceType.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSubscriptionArgs]
  }
}

