package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingList extends js.Object {
  /** Account ID of this remarketing list. This is a read-only, auto-generated field that is only returned in GET requests. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this remarketing list is active. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Dimension value for the advertiser ID that owns this remarketing list. This is a required field. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of the advertiser. This is a read-only, auto-generated field. */
  var advertiserIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /** Remarketing list description. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Remarketing list ID. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#remarketingList". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Number of days that a user should remain in the remarketing list without an impression. Acceptable values are 1 to 540, inclusive. */
  var lifeSpan: js.UndefOr[java.lang.String] = js.undefined
  /** Rule used to populate the remarketing list with users. */
  var listPopulationRule: js.UndefOr[ListPopulationRule] = js.undefined
  /** Number of users currently in the list. This is a read-only field. */
  var listSize: js.UndefOr[java.lang.String] = js.undefined
  /** Product from which this remarketing list was originated. */
  var listSource: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the remarketing list. This is a required field. Must be no greater than 128 characters long. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Subaccount ID of this remarketing list. This is a read-only, auto-generated field that is only returned in GET requests. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
}

object RemarketingList {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    active: js.UndefOr[scala.Boolean] = js.undefined,
    advertiserId: java.lang.String = null,
    advertiserIdDimensionValue: DimensionValue = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    lifeSpan: java.lang.String = null,
    listPopulationRule: ListPopulationRule = null,
    listSize: java.lang.String = null,
    listSource: java.lang.String = null,
    name: java.lang.String = null,
    subaccountId: java.lang.String = null
  ): RemarketingList = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (advertiserId != null) __obj.updateDynamic("advertiserId")(advertiserId)
    if (advertiserIdDimensionValue != null) __obj.updateDynamic("advertiserIdDimensionValue")(advertiserIdDimensionValue)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lifeSpan != null) __obj.updateDynamic("lifeSpan")(lifeSpan)
    if (listPopulationRule != null) __obj.updateDynamic("listPopulationRule")(listPopulationRule)
    if (listSize != null) __obj.updateDynamic("listSize")(listSize)
    if (listSource != null) __obj.updateDynamic("listSource")(listSource)
    if (name != null) __obj.updateDynamic("name")(name)
    if (subaccountId != null) __obj.updateDynamic("subaccountId")(subaccountId)
    __obj.asInstanceOf[RemarketingList]
  }
}

