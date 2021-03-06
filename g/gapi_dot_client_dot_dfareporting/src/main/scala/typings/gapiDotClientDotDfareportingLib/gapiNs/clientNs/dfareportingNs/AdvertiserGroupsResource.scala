package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvertiserGroupsResource extends js.Object {
  /** Deletes an existing advertiser group. */
  def delete(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets one advertiser group by ID. */
  def get(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[AdvertiserGroup]
  /** Inserts a new advertiser group. */
  def insert(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[AdvertiserGroup]
  /** Retrieves a list of advertiser groups, possibly filtered. This method supports paging. */
  def list(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsIds): gapiDotClientLib.gapiNs.clientNs.Request[AdvertiserGroupsListResponse]
  /** Updates an existing advertiser group. This method supports patch semantics. */
  def patch(request: gapiDotClientDotDfareportingLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[AdvertiserGroup]
  /** Updates an existing advertiser group. */
  def update(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[AdvertiserGroup]
}

object AdvertiserGroupsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotDfareportingLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotDfareportingLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[AdvertiserGroup],
    insert: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[AdvertiserGroup],
    list: gapiDotClientDotDfareportingLib.Anon_AltFieldsIds => gapiDotClientLib.gapiNs.clientNs.Request[AdvertiserGroupsListResponse],
    patch: gapiDotClientDotDfareportingLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[AdvertiserGroup],
    update: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[AdvertiserGroup]
  ): AdvertiserGroupsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AdvertiserGroupsResource]
  }
}

