package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Playlist Object Simplified
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait PlaylistObjectSimplified extends PlaylistBaseObject {
  var tracks: spotifyDashApiLib.Anon_Href
}

object PlaylistObjectSimplified {
  @scala.inline
  def apply(
    collaborative: scala.Boolean,
    external_urls: ExternalUrlObject,
    href: java.lang.String,
    id: java.lang.String,
    images: js.Array[ImageObject],
    name: java.lang.String,
    owner: UserObjectPublic,
    public: scala.Boolean,
    snapshot_id: java.lang.String,
    tracks: spotifyDashApiLib.Anon_Href,
    `type`: spotifyDashApiLib.spotifyDashApiLibStrings.playlist,
    uri: java.lang.String
  ): PlaylistObjectSimplified = {
    val __obj = js.Dynamic.literal(collaborative = collaborative, external_urls = external_urls, href = href, id = id, images = images, name = name, owner = owner, public = public, snapshot_id = snapshot_id, tracks = tracks, `type` = `type`, uri = uri)
  
    __obj.asInstanceOf[PlaylistObjectSimplified]
  }
}

