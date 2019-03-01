package typings
package stripeLib.stripeMod.StripeNs.subscriptionItemsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionItemListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptionsCreated {
  /**
    * The ID of the subscription whose items will be retrieved.
    */
  var subscription: java.lang.String
}

object ISubscriptionItemListOptions {
  @scala.inline
  def apply(
    subscription: java.lang.String,
    created: java.lang.String | stripeLib.stripeMod.StripeNs.IDateFilter = null,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null
  ): ISubscriptionItemListOptions = {
    val __obj = js.Dynamic.literal(subscription = subscription)
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[ISubscriptionItemListOptions]
  }
}

