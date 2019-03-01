package typings
package stripeLib.stripeMod.StripeNs.subscriptionItemsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISubscriptionItemDeleteOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptions {
  /**
    * Flag indicating whether to prorate switching plans during a billing cycle.
    */
  var prorate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set, the proration will be calculated as though the subscription was updated at the given time. This can be used to apply the same
    * proration that was previewed with the upcoming invoice endpoint.
    */
  var proration_date: js.UndefOr[scala.Double] = js.undefined
}

object ISubscriptionItemDeleteOptions {
  @scala.inline
  def apply(
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    prorate: js.UndefOr[scala.Boolean] = js.undefined,
    proration_date: scala.Int | scala.Double = null
  ): ISubscriptionItemDeleteOptions = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (!js.isUndefined(prorate)) __obj.updateDynamic("prorate")(prorate)
    if (proration_date != null) __obj.updateDynamic("proration_date")(proration_date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISubscriptionItemDeleteOptions]
  }
}

