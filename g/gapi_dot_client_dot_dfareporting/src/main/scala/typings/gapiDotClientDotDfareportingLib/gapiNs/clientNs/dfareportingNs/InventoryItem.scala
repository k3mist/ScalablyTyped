package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryItem extends js.Object {
  /** Account ID of this inventory item. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Ad slots of this inventory item. If this inventory item represents a standalone placement, there will be exactly one ad slot. If this inventory item
    * represents a placement group, there will be more than one ad slot, each representing one child placement in that placement group.
    */
  var adSlots: js.UndefOr[js.Array[AdSlot]] = js.undefined
  /** Advertiser ID of this inventory item. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** Content category ID of this inventory item. */
  var contentCategoryId: js.UndefOr[java.lang.String] = js.undefined
  /** Estimated click-through rate of this inventory item. */
  var estimatedClickThroughRate: js.UndefOr[java.lang.String] = js.undefined
  /** Estimated conversion rate of this inventory item. */
  var estimatedConversionRate: js.UndefOr[java.lang.String] = js.undefined
  /** ID of this inventory item. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this inventory item is in plan. */
  var inPlan: js.UndefOr[scala.Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#inventoryItem". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Information about the most recent modification of this inventory item. */
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /**
    * Name of this inventory item. For standalone inventory items, this is the same name as that of its only ad slot. For group inventory items, this can
    * differ from the name of any of its ad slots.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Negotiation channel ID of this inventory item. */
  var negotiationChannelId: js.UndefOr[java.lang.String] = js.undefined
  /** Order ID of this inventory item. */
  var orderId: js.UndefOr[java.lang.String] = js.undefined
  /** Placement strategy ID of this inventory item. */
  var placementStrategyId: js.UndefOr[java.lang.String] = js.undefined
  /** Pricing of this inventory item. */
  var pricing: js.UndefOr[Pricing] = js.undefined
  /** Project ID of this inventory item. */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /** RFP ID of this inventory item. */
  var rfpId: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the site this inventory item is associated with. */
  var siteId: js.UndefOr[java.lang.String] = js.undefined
  /** Subaccount ID of this inventory item. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  /** Type of inventory item. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object InventoryItem {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    adSlots: js.Array[AdSlot] = null,
    advertiserId: java.lang.String = null,
    contentCategoryId: java.lang.String = null,
    estimatedClickThroughRate: java.lang.String = null,
    estimatedConversionRate: java.lang.String = null,
    id: java.lang.String = null,
    inPlan: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    lastModifiedInfo: LastModifiedInfo = null,
    name: java.lang.String = null,
    negotiationChannelId: java.lang.String = null,
    orderId: java.lang.String = null,
    placementStrategyId: java.lang.String = null,
    pricing: Pricing = null,
    projectId: java.lang.String = null,
    rfpId: java.lang.String = null,
    siteId: java.lang.String = null,
    subaccountId: java.lang.String = null,
    `type`: java.lang.String = null
  ): InventoryItem = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (adSlots != null) __obj.updateDynamic("adSlots")(adSlots)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (contentCategoryId != null) __obj.updateDynamic("contentCategoryId")(contentCategoryId)
    if (estimatedClickThroughRate != null) __obj.updateDynamic("estimatedClickThroughRate")(estimatedClickThroughRate)
    if (estimatedConversionRate != null) __obj.updateDynamic("estimatedConversionRate")(estimatedConversionRate)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(inPlan)) __obj.updateDynamic("inPlan")(inPlan)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastModifiedInfo != null) __obj.updateDynamic("lastModifiedInfo")(lastModifiedInfo)
    if (name != null) __obj.updateDynamic("name")(name)
    if (negotiationChannelId != null) __obj.updateDynamic("negotiationChannelId")(negotiationChannelId)
    if (orderId != null) __obj.updateDynamic("orderId")(orderId)
    if (placementStrategyId != null) __obj.updateDynamic("placementStrategyId")(placementStrategyId)
    if (pricing != null) __obj.updateDynamic("pricing")(pricing)
    if (projectId != null) __obj.updateDynamic("projectId")(projectId)
    if (rfpId != null) __obj.updateDynamic("rfpId")(rfpId)
    if (siteId != null) __obj.updateDynamic("siteId")(siteId)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InventoryItem]
  }
}

