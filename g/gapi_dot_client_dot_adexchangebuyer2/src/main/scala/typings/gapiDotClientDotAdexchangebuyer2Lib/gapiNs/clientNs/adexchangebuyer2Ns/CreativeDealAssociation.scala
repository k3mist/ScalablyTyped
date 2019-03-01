package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeDealAssociation extends js.Object {
  /** The account the creative belongs to. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the creative associated with the deal. */
  var creativeId: js.UndefOr[java.lang.String] = js.undefined
  /** The externalDealId for the deal associated with the creative. */
  var dealsId: js.UndefOr[java.lang.String] = js.undefined
}

object CreativeDealAssociation {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    creativeId: java.lang.String = null,
    dealsId: java.lang.String = null
  ): CreativeDealAssociation = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId)
    if (dealsId != null) __obj.updateDynamic("dealsId")(dealsId)
    __obj.asInstanceOf[CreativeDealAssociation]
  }
}

