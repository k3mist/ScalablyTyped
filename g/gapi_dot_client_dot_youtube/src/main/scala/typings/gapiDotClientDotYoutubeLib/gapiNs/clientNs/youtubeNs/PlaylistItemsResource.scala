package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItemsResource extends js.Object {
  /** Deletes a playlist item. */
  def delete(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Adds a resource to a playlist. */
  def insert(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner): gapiDotClientLib.gapiNs.clientNs.Request[PlaylistItem]
  /**
    * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or
    * retrieve one or more playlist items by their unique IDs.
    */
  def list(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyMaxResultsOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[PlaylistItemListResponse]
  /** Modifies a playlist item. For example, you could update the item's position in the playlist. */
  def update(request: gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner): gapiDotClientLib.gapiNs.clientNs.Request[PlaylistItem]
}

object PlaylistItemsResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    insert: gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner => gapiDotClientLib.gapiNs.clientNs.Request[PlaylistItem],
    list: gapiDotClientDotYoutubeLib.Anon_AltFieldsIdKeyMaxResultsOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[PlaylistItemListResponse],
    update: gapiDotClientDotYoutubeLib.Anon_AltFieldsKeyOauthtokenOnBehalfOfContentOwner => gapiDotClientLib.gapiNs.clientNs.Request[PlaylistItem]
  ): PlaylistItemsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[PlaylistItemsResource]
  }
}

