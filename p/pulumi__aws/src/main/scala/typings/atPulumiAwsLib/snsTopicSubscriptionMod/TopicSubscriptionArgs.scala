package typings
package atPulumiAwsLib.snsTopicSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicSubscriptionArgs extends js.Object {
  /**
    * Integer indicating number of minutes to wait in retying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols (default is 1 minute).
    */
  val confirmationTimeoutInMinutes: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  /**
    * JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
    */
  val deliveryPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The endpoint to send data to, the contents will vary with the protocol. (see below for more information)
    */
  val endpoint: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Boolean indicating whether the end point is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) e.g., PagerDuty (default is false)
    */
  val endpointAutoConfirms: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
    */
  val filterPolicy: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The protocol to use. The possible values for this are: `sqs`, `sms`, `lambda`, `application`. (`http` or `https` are partially supported, see below) (`email` is option but unsupported, see below).
    */
  val protocol: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Boolean indicating whether or not to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property) (default is false).
    */
  val rawMessageDelivery: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The ARN of the SNS topic to subscribe to
    */
  val topic: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.snsTopicMod.Topic]
}

object TopicSubscriptionArgs {
  @scala.inline
  def apply(
    endpoint: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    protocol: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    topic: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.snsTopicMod.Topic],
    confirmationTimeoutInMinutes: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null,
    deliveryPolicy: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    endpointAutoConfirms: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    filterPolicy: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    rawMessageDelivery: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null
  ): TopicSubscriptionArgs = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (confirmationTimeoutInMinutes != null) __obj.updateDynamic("confirmationTimeoutInMinutes")(confirmationTimeoutInMinutes.asInstanceOf[js.Any])
    if (deliveryPolicy != null) __obj.updateDynamic("deliveryPolicy")(deliveryPolicy.asInstanceOf[js.Any])
    if (endpointAutoConfirms != null) __obj.updateDynamic("endpointAutoConfirms")(endpointAutoConfirms.asInstanceOf[js.Any])
    if (filterPolicy != null) __obj.updateDynamic("filterPolicy")(filterPolicy.asInstanceOf[js.Any])
    if (rawMessageDelivery != null) __obj.updateDynamic("rawMessageDelivery")(rawMessageDelivery.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicSubscriptionArgs]
  }
}

