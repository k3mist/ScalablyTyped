package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pricing extends js.Object {
  /** Cap cost type of this inventory item. */
  var capCostType: js.UndefOr[java.lang.String] = js.undefined
  /** End date of this inventory item. */
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  /** Flights of this inventory item. A flight (a.k.a. pricing period) represents the inventory item pricing information for a specific period of time. */
  var flights: js.UndefOr[js.Array[Flight]] = js.undefined
  /**
    * Group type of this inventory item if it represents a placement group. Is null otherwise. There are two type of placement groups:
    * PLANNING_PLACEMENT_GROUP_TYPE_PACKAGE is a simple group of inventory items that acts as a single pricing point for a group of tags.
    * PLANNING_PLACEMENT_GROUP_TYPE_ROADBLOCK is a group of inventory items that not only acts as a single pricing point, but also assumes that all the tags
    * in it will be served at the same time. A roadblock requires one of its assigned inventory items to be marked as primary.
    */
  var groupType: js.UndefOr[java.lang.String] = js.undefined
  /** Pricing type of this inventory item. */
  var pricingType: js.UndefOr[java.lang.String] = js.undefined
  /** Start date of this inventory item. */
  var startDate: js.UndefOr[java.lang.String] = js.undefined
}

object Pricing {
  @scala.inline
  def apply(
    capCostType: java.lang.String = null,
    endDate: java.lang.String = null,
    flights: js.Array[Flight] = null,
    groupType: java.lang.String = null,
    pricingType: java.lang.String = null,
    startDate: java.lang.String = null
  ): Pricing = {
    val __obj = js.Dynamic.literal()
    if (capCostType != null) __obj.updateDynamic("capCostType")(capCostType)
    if (endDate != null) __obj.updateDynamic("endDate")(endDate)
    if (flights != null) __obj.updateDynamic("flights")(flights)
    if (groupType != null) __obj.updateDynamic("groupType")(groupType)
    if (pricingType != null) __obj.updateDynamic("pricingType")(pricingType)
    if (startDate != null) __obj.updateDynamic("startDate")(startDate)
    __obj.asInstanceOf[Pricing]
  }
}

