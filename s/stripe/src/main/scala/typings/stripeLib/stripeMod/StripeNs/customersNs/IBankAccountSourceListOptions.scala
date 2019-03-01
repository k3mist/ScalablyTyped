package typings
package stripeLib.stripeMod.StripeNs.customersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBankAccountSourceListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptions {
  var `object`: stripeLib.stripeLibStrings.bank_account
}

object IBankAccountSourceListOptions {
  @scala.inline
  def apply(
    `object`: stripeLib.stripeLibStrings.bank_account,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null
  ): IBankAccountSourceListOptions = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[IBankAccountSourceListOptions]
  }
}

