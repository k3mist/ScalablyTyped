package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkedForeignAccount extends js.Object {
  /** Account ID to which this linked foreign account belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Boolean indicating whether this is eligible for search. */
  var eligibleForSearch: js.UndefOr[scala.Boolean] = js.undefined
  /** Entity ad account link ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Internal ID for the web property to which this linked foreign account belongs. */
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for linked foreign account. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The foreign account ID. For example the an AdWords `linkedAccountId` has the following format XXX-XXX-XXXX. */
  var linkedAccountId: js.UndefOr[java.lang.String] = js.undefined
  /** Remarketing audience ID to which this linked foreign account belongs. */
  var remarketingAudienceId: js.UndefOr[java.lang.String] = js.undefined
  /** The status of this foreign account link. */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** The type of the foreign account. For example, `ADWORDS_LINKS`, `DBM_LINKS`, `MCC_LINKS` or `OPTIMIZE`. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Web property ID of the form UA-XXXXX-YY to which this linked foreign account belongs. */
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

object LinkedForeignAccount {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    eligibleForSearch: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    internalWebPropertyId: java.lang.String = null,
    kind: java.lang.String = null,
    linkedAccountId: java.lang.String = null,
    remarketingAudienceId: java.lang.String = null,
    status: java.lang.String = null,
    `type`: java.lang.String = null,
    webPropertyId: java.lang.String = null
  ): LinkedForeignAccount = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (!js.isUndefined(eligibleForSearch)) __obj.updateDynamic("eligibleForSearch")(eligibleForSearch)
    if (id != null) __obj.updateDynamic("id")(id)
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (linkedAccountId != null) __obj.updateDynamic("linkedAccountId")(linkedAccountId)
    if (remarketingAudienceId != null) __obj.updateDynamic("remarketingAudienceId")(remarketingAudienceId)
    if (status != null) __obj.updateDynamic("status")(status)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    __obj.asInstanceOf[LinkedForeignAccount]
  }
}

