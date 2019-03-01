package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Full Track Object
  * [track object (full)](https://developer.spotify.com/web-api/object-model/#track-object-full)
  */
trait TrackObjectFull extends TrackObjectSimplified {
  var album: AlbumObjectSimplified
  var external_ids: ExternalIdObject
  var popularity: scala.Double
}

object TrackObjectFull {
  @scala.inline
  def apply(
    album: AlbumObjectSimplified,
    artists: js.Array[ArtistObjectSimplified],
    disc_number: scala.Double,
    duration_ms: scala.Double,
    explicit: scala.Boolean,
    external_ids: ExternalIdObject,
    external_urls: ExternalUrlObject,
    href: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    popularity: scala.Double,
    preview_url: java.lang.String,
    track_number: scala.Double,
    `type`: spotifyDashApiLib.spotifyDashApiLibStrings.track,
    uri: java.lang.String,
    available_markets: js.Array[java.lang.String] = null,
    is_playable: js.UndefOr[scala.Boolean] = js.undefined,
    linked_from: TrackLinkObject = null
  ): TrackObjectFull = {
    val __obj = js.Dynamic.literal(album = album, artists = artists, disc_number = disc_number, duration_ms = duration_ms, explicit = explicit, external_ids = external_ids, external_urls = external_urls, href = href, id = id, name = name, popularity = popularity, preview_url = preview_url, track_number = track_number, `type` = `type`, uri = uri)
    if (available_markets != null) __obj.updateDynamic("available_markets")(available_markets)
    if (!js.isUndefined(is_playable)) __obj.updateDynamic("is_playable")(is_playable)
    if (linked_from != null) __obj.updateDynamic("linked_from")(linked_from)
    __obj.asInstanceOf[TrackObjectFull]
  }
}

