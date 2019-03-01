package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingInfoResource extends js.Object {
  /** Returns the billing information for one account specified by account ID. */
  def get(request: gapiDotClientDotAdexchangebuyerLib.Anon_AccountId): gapiDotClientLib.gapiNs.clientNs.Request[BillingInfo]
  /** Retrieves a list of billing information for all accounts of the authenticated user. */
  def list(request: gapiDotClientDotAdexchangebuyerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[BillingInfoList]
}

object BillingInfoResource {
  @scala.inline
  def apply(
    get: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AccountId, 
      gapiDotClientLib.gapiNs.clientNs.Request[BillingInfo]
    ],
    list: js.Function1[
      gapiDotClientDotAdexchangebuyerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[BillingInfoList]
    ]
  ): BillingInfoResource = {
    val __obj = js.Dynamic.literal(get = get, list = list)
  
    __obj.asInstanceOf[BillingInfoResource]
  }
}

