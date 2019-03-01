package typings
package stripeLib.stripeMod.StripeNs.applicationFeesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplicationFeeListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptionsCreated {
  /**
    * Only return application fees for the charge specified by this charge ID.
    */
  var charge: java.lang.String
}

object IApplicationFeeListOptions {
  @scala.inline
  def apply(
    charge: java.lang.String,
    created: java.lang.String | stripeLib.stripeMod.StripeNs.IDateFilter = null,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null
  ): IApplicationFeeListOptions = {
    val __obj = js.Dynamic.literal(charge = charge)
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[IApplicationFeeListOptions]
  }
}

