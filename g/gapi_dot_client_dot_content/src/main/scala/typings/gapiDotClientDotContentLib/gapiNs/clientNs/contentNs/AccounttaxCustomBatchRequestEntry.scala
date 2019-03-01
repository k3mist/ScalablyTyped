package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccounttaxCustomBatchRequestEntry extends js.Object {
  /** The ID of the account for which to get/update account tax settings. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** The account tax settings to update. Only defined if the method is update. */
  var accountTax: js.UndefOr[AccountTax] = js.undefined
  /** An entry ID, unique within the batch request. */
  var batchId: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the managing account. */
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
}

object AccounttaxCustomBatchRequestEntry {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    accountTax: AccountTax = null,
    batchId: scala.Int | scala.Double = null,
    merchantId: java.lang.String = null,
    method: java.lang.String = null
  ): AccounttaxCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (accountTax != null) __obj.updateDynamic("accountTax")(accountTax)
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    if (method != null) __obj.updateDynamic("method")(method)
    __obj.asInstanceOf[AccounttaxCustomBatchRequestEntry]
  }
}

