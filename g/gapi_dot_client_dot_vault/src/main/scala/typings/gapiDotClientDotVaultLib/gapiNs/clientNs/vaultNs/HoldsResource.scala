package typings
package gapiDotClientDotVaultLib.gapiNs.clientNs.vaultNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoldsResource extends js.Object {
  var accounts: AccountsResource
  /** Creates a hold in the given matter. */
  def create(request: gapiDotClientDotVaultLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[Hold]
  /** Removes a hold by ID. This will release any HeldAccounts on this Hold. */
  def delete(request: gapiDotClientDotVaultLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /** Gets a hold by ID. */
  def get(request: gapiDotClientDotVaultLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Hold]
  /**
    * Lists holds within a matter. An empty page token in ListHoldsResponse
    * denotes no more holds to list.
    */
  def list(request: gapiDotClientDotVaultLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListHoldsResponse]
  /**
    * Updates the OU and/or query parameters of a hold. You cannot add accounts
    * to a hold that covers an OU, nor can you add OUs to a hold that covers
    * individual accounts. Accounts listed in the hold will be ignored.
    */
  def update(request: gapiDotClientDotVaultLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[Hold]
}

object HoldsResource {
  @scala.inline
  def apply(
    accounts: AccountsResource,
    create: gapiDotClientDotVaultLib.Anon_AccesstokenAlt => gapiDotClientLib.gapiNs.clientNs.Request[Hold],
    delete: gapiDotClientDotVaultLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    get: gapiDotClientDotVaultLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Hold],
    list: gapiDotClientDotVaultLib.Anon_AccesstokenAltBearertoken => gapiDotClientLib.gapiNs.clientNs.Request[ListHoldsResponse],
    update: gapiDotClientDotVaultLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[Hold]
  ): HoldsResource = {
    val __obj = js.Dynamic.literal(accounts = accounts, create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[HoldsResource]
  }
}

